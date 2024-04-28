public class OrderList implements Order, Invoice, Email {

    @Override
    public void calculateTotal(double price, int quantity){
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        // Generates the order
        System.out.println("Order placed for " + customerName + " at " + address);
    }
  
    @Override
    public void generateInvoice(String fileName) {
        // Generates the invoice
        System.out.println("Invoice generated: " + fileName);
    }
  
    @Override
    public void sendEmailNotification(String email) {
        // Generates the email
        System.out.println("Email notification sent to: " + email);
    }
}
