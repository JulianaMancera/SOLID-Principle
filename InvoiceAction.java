//Implementing the interface Invoice

public class InvoiceAction implements Invoice{
    
    @Override
    public void generateInvoice(String fileName){

        // Simulate generating invoice file
        System.out.println("Invoice generated: "+fileName);
    }
}
