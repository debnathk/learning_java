public class EscapeSequences {
    public static void main (String[] args) {
        String message = "Hello \"Kusal!\""; // Using backslash, we are making the internal quotes to dodge the compiler
        String path = "c:\\windows\\...\n"; // Similarly, we have used backslash and \n here
        System.out.println(message);
        System.out.println(path);
    }
}
