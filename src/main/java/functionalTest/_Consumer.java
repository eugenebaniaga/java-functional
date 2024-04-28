package functionalTest;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Eugene", "2349999");
        Consumer<Customer> greetCustomer = c -> System.out.println("Hello " + c.customerName + " #" + c.customerPhoneNumber);
        greetCustomer.accept(customer);
    }
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;
        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}

