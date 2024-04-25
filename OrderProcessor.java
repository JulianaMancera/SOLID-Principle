
public class OrderProcessor {
    private final OrderPrize orderPrize;
    private final OrderPlace orderPlace;
    private final Invoice invoice;
    private final Notification notificaiton;

    public OrderProcessor(OrderPrize orderPrize, OrderPlace orderPlace, Invoice invoice, Notification notificaiton){

        this.orderPrize = orderPrize;
        this.orderPlace = orderPlace;
        this.invoice = invoice;
        this.notificaiton = notificaiton;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email){
        orderPrize.calculateTotal(price, quantity);
        orderPlace.placeOrder(customerName, address);
        invoice.generateInvoice(fileName);
        notificaiton.sendEmailNotification(email);
    }
}
