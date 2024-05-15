package optionalTest;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

        //simple test
        Optional.ofNullable("eugene.baniaga@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to: " + email) ,
                        () -> System.out.println("No email address found.")
                );

    }


}
