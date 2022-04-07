package tw.nicesport.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tw.nicesport.model.WorkMessages;
import tw.nicesport.service.WorkMessagesService;

@Controller
public class MessageController {

	@Autowired
	private WorkMessagesService messageService;
	
	//新增
	@PostMapping("/message/add")
	public ModelAndView addMessage(ModelAndView mav, @Valid @ModelAttribute(name = "workMessages") WorkMessages msg,
			BindingResult br) {
		// 如果沒有錯誤訊息
		if (!br.hasErrors()) {
			messageService.insert(msg); // 新增資料
			// 給新的視窗去清掉使用者的輸入
			WorkMessages newMsg = new WorkMessages();
			//
			mav.getModel().put("workMessages", newMsg);
		}
		// 用預先寫的getLastest()方法去得最新值
		WorkMessages latestMsg = messageService.getLastest();

		mav.getModel().put("lastMessage", latestMsg);

		mav.setViewName("addMessage");

		return mav;
	}
	//修改頁面
	@GetMapping("/message/editMessage")
	public String editMessage(Model model, @RequestParam(name = "id") Integer id) {
//		用messageService的findById()方法去資料庫找id
		WorkMessages msg = messageService.findById(id);
		model.addAttribute("workMessage", msg);

		return "editMessage";
	}
	
	//修改功能
	@PostMapping("message/editMessage")
	//@ModelAttribute 會去接來自message/editMessage的modelAttribute
	public ModelAndView editMessage(ModelAndView mav, @Valid @ModelAttribute(name="workMessage") WorkMessages msg, BindingResult br) {
		mav.setViewName("editMessage");//設定路徑  (用在有錯誤的話回到編輯的頁面)
		//判斷是否有錯誤  沒錯的話執行 insert
		if(!br.hasErrors()) {
			messageService.insert(msg);
			//沒錯的話 將路徑改成viewMessages這頁
			mav.setViewName("redirect:/message/viewMessages");
		}
		return mav;
	}
	//刪除
	@GetMapping("message/deleteMessage")
	public ModelAndView deleteMessage(ModelAndView mav, @RequestParam(name="id") Integer id) {
		messageService.deleteById(id);
		
		mav.setViewName("redirect:/message/viewMessages");
		
		return mav;
	}
}
