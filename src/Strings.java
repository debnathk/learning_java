public class Strings {
    public static void main(String[] args) {
        String message = "Hello, World" + "!"; // Even though String is a reference type in Java, it is declared as a primitive
//        type as a shortcut, due to limited usage
        System.out.println(message.endsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", ":)"));
        System.out.println(message.toLowerCase());

//        Note: Strings are immutable in Java
    }
}
