<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="OrderDetail" items="${OrderDetailSet}">
orderDetail_id = ${OrderDetail.orderDetail_id}
<p/>
order_id = ${OrderDetail.ordersBean.order_id}
<p/>
${OrderDetail.productBean.productName}
<p/>
${OrderDetail.quantity}
<p/>
${OrderDetail.realPrice}
<p/>
${OrderDetail.createdAt}
<p/>
<p/>
${OrderDetail.createdAt}
<p/>
${OrderDetail.createdAt}
<p/>
${OrderDetail.createdAt}
<p/>
${OrderDetail.createdAt}

</c:forEach>
</body>
</html>