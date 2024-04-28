package functionalTest;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Function<Integer, Integer> incrementByOne = number -> number+1;
        Function<Integer, Integer> multiplyBy10 = number -> number * 10;

        System.out.println(incrementByOne.apply(1));

       //chained function
        System.out.println(incrementByOne.andThen(multiplyBy10).apply(1));

        //Bi function
        BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByNumber =
                (number, multiplyBy) -> (number + 1 ) * multiplyBy;

        System.out.println(incrementByOneAndMultiplyByNumber.apply(2,3)); //expected is 9
    }


}
