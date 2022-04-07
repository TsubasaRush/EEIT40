package tw.nicesport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import tw.nicesport.model.WorkMessages;
import tw.nicesport.model.WorkMessagesRepository;
@Service
public class WorkOrderService_inclass {

	@Autowired
	private WorkMessagesRepository workMessagesDao;

	// insert資料
	public void insert(WorkMessages messages) {
		workMessagesDao.save(messages);
	}

	//用id搜尋
	public WorkMessages findById(Integer id) {
		//Optional前面有  等等註解
		Optional<WorkMessages> option = workMessagesDao.findById(id);
		// option.isPresent() 判斷是否有東西 
		if (option.isPresent()) {
			return option.get();
		}
		return null;
	}
	//用ID刪除
	public void deleteById(Integer id) {
		workMessagesDao.deleteById(id);
	}
	//搜尋全部
	public List<WorkMessages> findAllMessages(){
		return workMessagesDao.findAll();
	}
	
	//分頁物件page
	public Page<WorkMessages> findByPage(Integer pageNumber){
		Pageable pgb = PageRequest.of(pageNumber-1, 3, Sort.Direction.DESC, "added");
		
		Page<WorkMessages> page = workMessagesDao.findAll(pgb);
		
		return page;
	}
	
	
	//取得最新資料
	public WorkMessages getLastest() {
		return workMessagesDao.findFirstByOrderByAddedDesc();
	}
}