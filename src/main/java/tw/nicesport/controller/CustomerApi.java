package tw.nicesport.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tw.nicesport.model.Customer;
import tw.nicesport.model.CustomerRepository;

@RestController // 讓這個控制器所有的方法都回傳JSON
public class CustomerApi {

	@Autowired // 叫他自己去找CustomerRepository
	private CustomerRepository dao;

	// 宣告進到這個方法的路徑
	@PostMapping(value = "customer/insert")
	// 宣告一個回傳Customer的方法
	public Customer insertCustomer() {
		// 給值(寫死)
		Customer cus = new Customer("Will", 5);
		// 用CustomerRepository繼承過來的.save()方法去存取資料庫
		Customer resCus = dao.save(cus);
		// 回傳
		return resCus;
	}

	// 宣告進到這個方法的路徑
	@PostMapping(value = "customer/insert2")

	// 宣告一個回傳Customer的方法 並且用@RequestBody去取得JSON物件的值
	public Customer insertCustomer(@RequestBody Customer cus) {
		Customer resCus = dao.save(cus);
		return resCus;
	}

	// 前端傳JSON
//	@ResponseBody //讓回傳值轉為POJO物件  因為上方寫了@RestController 故這裡不用再寫
	@PostMapping(value = "customer/insertAll")
	// 宣告一個會回傳List的方法 並用 @RequestBody 去接前端傳過來的List
	public List<Customer> insertCustomer(@RequestBody List<Customer> cus) {
		// 用saveAll去將取得的List內的值全部存入資料庫 並回傳一個List
		List<Customer> responseList = dao.saveAll(cus);
		return responseList;
	}

	// 前端使用get方法
	@GetMapping(value = "customer/get/{id}")
	// 宣告一個會回傳Customer的方法 並用 @PathVariable 去接前端傳過來的網址上的 id
	public Customer getCustomerById(@PathVariable Integer id) {
		// Optional見P89頁 功能為將null的兩種狀況(沒有值/找不到)區分開
		// 利用findById()去資料庫找資料
		Optional<Customer> responseCus = dao.findById(id);

		if (responseCus.isPresent()) {
			return responseCus.get();
		}

		return null;
	}

	// 接前端Form表單
	@GetMapping(value = "customer/get")
	public Customer getCustomerById2(@RequestParam Integer id) {
		Optional<Customer> responseCus = dao.findById(id);

		if (responseCus.isPresent()) {
			return responseCus.get();
		}

		return null;
	}

	// 分頁物件 page
	@GetMapping(value = "customer/page/{pageNumber}")
	public List<Customer> findByPage(@PathVariable Integer pageNumber) {
		// 從第幾頁開始(註標值0) , 一頁幾筆 排序方式 (.ASC升/.DESC降) , 根據哪個屬性
		Pageable pgb = PageRequest.of(pageNumber - 1, 3, Sort.Direction.ASC, "id");
		Page<Customer> page = dao.findAll(pgb);
		List<Customer> list = page.getContent();
		return list;
	}

	// 用HQL
	@GetMapping(value = "customer/findByName")
	// findCustomerByName()方法 找到指定的name
	public List<Customer> findByName(@RequestParam String name) {
		return dao.findCustomerByName(name);
	}

	// 用原生SQL查詢
	@GetMapping(value = "customer/findByName2")
	public List<Customer> findByName2(@RequestParam String name) {
		return dao.findCustomerByName2(name);
	}

	// 刪除
	@GetMapping(value = "customer/delete/{id}")
	public boolean deleteCustomer(@PathVariable Integer id) {
		dao.deleteById(id);
		return true;
	}
	//JpaRepository
	@GetMapping(value = "customer/level/{level}")
	public List<Customer> findByLevel(@PathVariable Integer level) {
		return dao.findByLevelOrderByName(level);
	}
}
