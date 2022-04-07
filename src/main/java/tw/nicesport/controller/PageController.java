package tw.nicesport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tw.nicesport.model.OrdersBean;
import tw.nicesport.service.WorkOrderService;
//管分頁的連線的物件
@Controller
public class PageController {
	
	@Autowired
	private WorkOrderService OrderService;
	
	@GetMapping("/")
	public String welcomIndex() {
		return "index";
	}
	//宣告進入路徑
	//@RequestParam 去取得值 沒有的話預設"1"
	@GetMapping("/message/viewAllOrders")
	public ModelAndView viewMessages(ModelAndView mav, @RequestParam(name="p", defaultValue = "1") Integer pageNumber) {
		//import springframework 的Page 分頁物件  
		//OrderService內的.findByPage()方法
		Page<OrdersBean> page = OrderService.findByPage(pageNumber);
		
		//ModelAndView準備傳到前端
		mav.getModel().put("page", page);
		mav.setViewName("selectAllOrder");
		
		return mav;
	}
	
		
}
