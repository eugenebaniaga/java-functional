package functionalTest;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        Predicate<String> isPhoneValid = p -> p.startsWith("63");

        System.out.println(isPhoneValid.test("63"));
    }
}
