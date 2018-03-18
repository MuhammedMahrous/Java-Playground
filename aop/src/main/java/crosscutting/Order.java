package crosscutting;

public class Order {
    public void putOrder(Customer customer) {
        System.out.println("Putting Order to customer" + customer);
    }
}
