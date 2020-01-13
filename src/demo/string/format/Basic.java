package demo.string.format;

public class Basic {
    // %[parameter_index$][flags][width][.precision]conversion_target
    public static void main(String[] args) {
        String firstName = "Mike";
        String middleName = "Møller";
        String lastName = "Nielsen";

        String str = String.format("My name is %3$s %1$S %2$s %n %1$s is my first name",
                firstName, middleName, lastName);
        System.out.println(str);
    }
}
