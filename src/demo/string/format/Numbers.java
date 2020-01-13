package demo.string.format;

import java.util.Locale;

public class Numbers {
    // %[parameter_index$][flags][width][.precision]conversion_target
    public static void main(String[] args) {
        Integer age=42;
        System.out.println(String.format("I am %+-,40d years old", age));
        System.out.println(String.format("I am %+-,40d years old", -1234123));
        System.out.println( String.format("I am %+-,40d years old", 556556));
        System.out.println(String.format(Locale.ITALY, "I am %+-,40d years old", 9342343));


        System.out.println(String.format(Locale.ITALY, "I have a magic number %+-,40.3f",
                235345.23545f));

        System.out.println(String.format(Locale.ITALY, "I have a magic number %+-,40.3f",
                11115.23545122d));



    }
}
