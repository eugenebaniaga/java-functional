package combinatorPattern;

public class CombinatorTest {
    public static void main(String[] args) {
        Customer c = new Customer("Eugene", "baniaga@gmail.com", "+6");

        CustomerValidatorService.ValidationResult result = CustomerValidatorService
                .isEmailValid()
                .and(CustomerValidatorService.isPhoneValid())
                .apply(c);

        System.out.println(result);

    }
}
