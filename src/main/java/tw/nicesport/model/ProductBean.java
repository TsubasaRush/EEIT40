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
@Table(name = "Product")
public class ProductBean {
	// 對應欄位
	// 產品編號, 主鍵
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int product_id;
	// 產品名
	@Column(name = "productName")
	private String productName;
	// 廠商
	@Column(name = "supplier")
	private String supplier;
	// 顏色
	@Column(name = "color")
	private String color;
	// 尺寸
	@Column(name = "size")
	private String size;
	// 重量
	@Column(name = "weight")
	private String weight;
	// 圖片
	@Column(name = "img")
	private String img;
	// 價格
	@Column(name = "price")
	private String price;
	// 庫存ID
	@Column(name = "stock_id")
	private String stock_id;
	// 子類別?
	@Column(name = "subcategory_id")
	private String subcategory_id;
	// 建立日期
	@Column(name = "createdAt")
	private String createdAt;
	// 修改日期
	@Column(name = "modifiedAt")
	private String modifiedAt;
	
	// 關聯 table
	                                                                                                                
	@OneToMany(mappedBy = "productBean")
	private Set<OrderDetailBean> orderDetails = new HashSet<OrderDetailBean>();
	// 建構子
		public ProductBean() {
		}
	//GetSet
		public int getProduct_id() {
			return product_id;
		}
		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getSupplier() {
			return supplier;
		}
		public void setSupplier(String supplier) {
			this.supplier = supplier;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getStock_id() {
			return stock_id;
		}
		public void setStock_id(String stock_id) {
			this.stock_id = stock_id;
		}
		public String getSubcategory_id() {
			return subcategory_id;
		}
		public void setSubcategory_id(String subcategory_id) {
			this.subcategory_id = subcategory_id;
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
		public Set<OrderDetailBean> getOrderDetails() {
			return orderDetails;
		}
		public void setOrderDetails(Set<OrderDetailBean> orderDetails) {
			this.orderDetails = orderDetails;
		}
		
}