package tw.nicesport.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "work_messages")
public class WorkMessages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	//在元素上寫標籤  可以用些預設的驗證方法
	// 搭配 controller @Valid, BindingResult
	// https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#section-builtin-constraints
	@Size(min = 2, max = 199, message = "請輸入 2 到 199 個字串")
//	@Email(message = "請輸入 Email")
	@Column(name = "text", columnDefinition = "nvarchar(200)")	// 指定對應欄位 並且指定SQL內的資料型別
	private String text;

	// 指定時間格式
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	// 指定時間
	@Temporal(TemporalType.TIMESTAMP)
	// 指定對應欄位 並且指定SQL內的資料型別
	@Column(name = "added", columnDefinition = "datetime")
	private Date added;
	
	
	// @PrePersist表示轉換到 Persist 狀態以前去做以下方法 (做之前先檢查有沒有值 沒有就自動產生給)
	@PrePersist
	public void onCreate() {
		if (added == null) {
			added = new Date();
		}
	}
	//toString???
	@Override
	public String toString() {
		return "WorkMessages [id=" + id + ", text=" + text + ", added=" + added + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	//在上方增加標籤可以設定一些判斷判斷是否符合規範
	// 搭配 controller @Valid, BindingResult
	// https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#section-builtin-constraints
	@Size(min = 2, max = 199, message = "請輸入 2 到 199 個字串")
//	@Email(message = "請輸入 Email")
	@Column(name="text", columnDefinition = "nvarchar(200)")
	public String getText() {
	return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public WorkMessages() {
	}

}
