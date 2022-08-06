package review;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Practice {

    public static void main(String[] args) {


        //one parameter , return boolean value
        Predicate<Integer> greaterThan10 = num -> num>10;
        System.out.println(greaterThan10.test(5));

        //two input - return boolean
        BiPredicate<Integer,Integer> greaterThan = (num1,num2) -> num1>num2;
        System.out.println(greaterThan.test(20, 125));

        //one parameter , no return
        Consumer<String> printStar = str -> System.out.println("*** "+str+" ***");
        printStar.accept("Harold");

        BiConsumer<String,String> combine = (str1,str2) -> System.out.println(str1+" "+str2);
        combine.accept("Harold","Finch");

        //create a method that takes string and integer, print he string given number of times


    }
}
