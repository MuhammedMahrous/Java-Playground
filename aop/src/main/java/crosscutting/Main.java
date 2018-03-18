package crosscutting;

public class Main {
    public static void main(String[] args) {


        Customer customer = new Customer();
        Order order = new Order();
        order.putOrder(customer);
        customer.deleteCustomer();


    }
}
