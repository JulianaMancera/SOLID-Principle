public class OrderTest {
    
    public static void main(String []args){

        OrderPrize orderPrize = new OrderAction();
        OrderPlace orderPlace = new OrderAction();
        Invoice invoice = new InvoiceAction();
        Notification notificaiton = new NotificationAction();

        OrderProcessor orderProcessor = new OrderProcessor(orderPrize, orderPlace, invoice, notificaiton);
        orderProcessor.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");

    }
}
