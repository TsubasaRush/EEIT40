package tw.nicesport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import tw.nicesport.model.OrdersBean;
import tw.nicesport.model.WorkOedersRepository;
@Service
public class WorkOrderService {

	@Autowired
	private WorkOedersRepository workOrdersDao;

	// insert資料
	public void insert(OrdersBean ordersBean) {
		workOrdersDao.save(ordersBean);
	}

	//用id搜尋
	public OrdersBean findById(Integer order_id) {
		//Optional前面有  等等註解
		Optional<OrdersBean> option = workOrdersDao.findById(order_id);
		// option.isPresent() 判斷是否有東西 
		if (option.isPresent()) {
			return option.get();
		}
		return null;
	}
	//用ID刪除
	public void deleteById(Integer order_id) {
		workOrdersDao.deleteById(order_id);
	}
	//搜尋全部
	public List<OrdersBean> findAllOrders(){
		return workOrdersDao.findAll();
	}
	
	//分頁物件page
	public Page<OrdersBean> findByPage(Integer pageNumber){
		Pageable pgb = PageRequest.of(pageNumber-1,10, Sort.Direction.DESC, "createdAt");
		
		Page<OrdersBean> page = workOrdersDao.findAll(pgb);
		
		return page;
	}
	
	//
	
	//取得最新資料
//	public OrdersBean getLastest() {
//		return workOrdersDao.findFirstByOrderByAddedDesc();
//	}
}