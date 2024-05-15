package combinatorPattern;

import java.util.function.Function;

public interface CustomerValidatorService extends Function<Customer, CustomerValidatorService.ValidationResult> {

    static CustomerValidatorService isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerValidatorService isPhoneValid() {
        return customer -> customer.getPhone().contains("+63") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NOT_VALID;
    }

    default CustomerValidatorService and(CustomerValidatorService other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NOT_VALID,
        EMAIL_NOT_VALID
    }
}
