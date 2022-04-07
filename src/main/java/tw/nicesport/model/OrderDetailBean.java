package tw.nicesport.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "OrderDetail")
public class  OrderDetailBean implements Serializable {

	private static final long serialVersionUID = 1L;
	// 訂單明細編號
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderDetail_id")
	private int orderDetail_id;
	// 訂單編號, 外來鍵, 關聯 Orders table (訂單table) 的主鍵
	@Transient  //不給值的話 這個空值不會被存入資料庫
	@Column(name = "order_id")
	private int order_id;
	// 商品編號, 外來鍵, 關聯 Product table (商品table) 的主鍵
	@Transient 
	@Column(name = "product_id")
	private int product_id;
	// 數量
	@Column(name = "quantity")
	private int quantity;
	// 實價
	@Column(name = "realPrice")
	private int realPrice;
	// 建立日期
	@Column(name = "createdAt")
	private String createdAt;
	// 修改日期
	@Column(name = "modifiedAt")
	private String modifiedAt;

	// 關聯 table
	// 對應訂單
	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrdersBean ordersBean;

	// 對應產品
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductBean productBean;

	// 建構子
	public OrderDetailBean() {
	}
	// GetSet

	public int getOrderDetail_id() {
		return orderDetail_id;
	}

	public void setOrderDetail_id(int orderDetail_id) {
		this.orderDetail_id = orderDetail_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(int realPrice) {
		this.realPrice = realPrice;
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

	public OrdersBean getOrdersBean() {
		return ordersBean;
	}

	public void setOrdersBean(OrdersBean ordersBean) {
		this.ordersBean = ordersBean;
	}

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

}
