package tw.nicesport.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import tw.nicesport.model.WorkMessages;
//import tw.nicesport.service.WorkOrderService;
//管分頁的連線的物件
//@Controller
public class PageController_inclass {
	
//	@Autowired
//	private WorkOrderService OrderService;
//	
//	@GetMapping("/")
//	public String welcomIndex() {
//		return "index";
//	}
//	
//	
//	@GetMapping("/message/add")
//	public ModelAndView addMessagePage(ModelAndView mav) {
//		//先給空的
//		WorkMessages message = new WorkMessages();
//		
//		mav.getModel().put("workMessages", message);
//		
//		//進來就取得最新資料
//		WorkMessages lastMag = OrderService.getLastest();
//		mav.getModel().put("lastMessage", lastMag);
//		
//        mav.setViewName("addMessage");
//		return mav;
//	}
//	
//	
//	//宣告進入路徑
//	//@RequestParam 去取得值 沒有的話預設"1"
//	@GetMapping("/message/viewMessages")
//	public ModelAndView viewMessages(ModelAndView mav, @RequestParam(name="p", defaultValue = "1") Integer pageNumber) {
//		//import springframework 的Page 分頁物件  
//		//messageService內的.findByPage()方法
//		Page<WorkMessages> page = OrderService.findByPage(pageNumber);
//		
//		//ModelAndView準備傳到前端
//		mav.getModel().put("page", page);
//		mav.setViewName("viewMessages");
//		
//		return mav;
//	}
//	
//	//宣告進入路徑
//	//@RequestParam 去取得值 沒有的話預設"1"
//	@GetMapping("/message/viewAllOrders")
//	public ModelAndView viewAllOrders(ModelAndView mav, @RequestParam(name="p", defaultValue = "1") Integer pageNumber) {
//		//import springframework 的Page 分頁物件  
//		//messageService內的.findByPage()方法
//		Page<WorkMessages> page = OrderService.findByPage(pageNumber);
//		
//		//ModelAndView準備傳到前端
//		mav.getModel().put("page", page);
//		mav.setViewName("viewMessages");
//		
//		return mav;
//	}
//	
}
