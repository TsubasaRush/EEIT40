package tw.nicesport.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Member")
public class MemberBean {

	// 對應欄位
	// 會員編號, 主鍵
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private int member_id;
	// 帳號
	@Column(name = "username")
	private String username;
	// 密碼
	@Column(name = "password")
	private String password;
	// 名
	@Column(name = "firstName")
	private String firstName;
	// 姓
	@Column(name = "lastName")
	private String lastName;
	// 生日, YYYY-MM-DD
	@Column(name = "birthDate")
	private String birthDate;
	// 性別
	@Column(name = "gender")
	private String gender;
	// 電話
	@Column(name = "phone")
	private String phone;
	// 電子信箱
	@Column(name = "email")
	private String email;
	// 住址
	@Column(name = "address")
	private String address;
	// 建立日期
	@Column(name = "createdAt")
	private String createdAt;
	// 修改日期
	@Column(name = "modifiedAt")
	private String modifiedAt;

  	// 關聯 table
	@OneToMany(mappedBy = "memberBean")
	private Set<OrdersBean> member = new HashSet<OrdersBean>();

	// 建構子
	public MemberBean() {
	}
	// GetSet

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Set<OrdersBean> getMember() {
		return member;
	}

	public void setMember(Set<OrdersBean> member) {
		this.member = member;
	}
	
}
