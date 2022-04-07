package tw.nicesport.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tw.nicesport.model.OrderDetailBean;
import tw.nicesport.model.OrdersBean;
import tw.nicesport.service.WorkOrderService;
import tw.nicesport.service.WorkOrderdDetailService;
//管分頁的連線的物件
@Controller
public class OrderDetailController {
	
	@Autowired
	private WorkOrderdDetailService OrderDetailService;
	@Autowired
	private WorkOrderService OrderService ;

	//宣告進入路徑
	//@RequestParam 去取得值 沒有的話預設"1"
	@GetMapping("/message/OrderDetail")
	public String editMessage(Model model, @RequestParam(name = "id") Integer id) {
//		用messageService的findById()方法去資料庫找id
		OrdersBean order = OrderService.findById(id);
		Set<OrderDetailBean> orderDetails = order.getOrderDetail();
		model.addAttribute("OrderDetailSet", orderDetails);

		return "viewOrderDetail";
	}

}
