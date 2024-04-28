package functionalTest;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        Supplier<String> getDBConnectionURL = () -> "jdbc://localhost:5432/test";

        System.out.println(getDBConnectionURL.get());
    }
}
