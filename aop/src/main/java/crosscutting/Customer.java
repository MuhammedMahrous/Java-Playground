package crosscutting;

public class Customer {

    public void deleteCustomer() {
        /*
         * Before deleting customer we need to ensure if he/she
         * has orders and delete them before deleting the customer him/herself
         *
         * This is not related to deleteCustomer() business, neither to putOrder()
         * */
        System.out.println("Checking if customer has orders");
        System.out.println("Deleting customer");
    }
}
