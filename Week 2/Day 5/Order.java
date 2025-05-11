class Order {
String orderId;
String orderDate;
Order(String id, String date) {
this.orderId = id;
this.orderDate = date;
}
String getOrderStatus() {
return "Order placed";
}
}
class ShippedOrder extends Order {
String trackingNumber;
ShippedOrder(String id, String date, String tracking) {
super(id, date);
this.trackingNumber = tracking;
}
String getOrderStatus() {
return "Shipped - Tracking #: " + trackingNumber;
}
}
class DeliveredOrder extends ShippedOrder {
String deliveryDate;
DeliveredOrder(String id, String date, String tracking, String
deliveryDate) {
super(id, date, tracking);
this.deliveryDate = deliveryDate;
}
String getOrderStatus() {
return "Delivered on " + deliveryDate;
}
}
