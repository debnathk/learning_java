public class Casting {
    public static void main (String[] args) {
//        Implicit Casting (automatic)
//        byte > short > int > long
        short x = 1;
        int y = x + 2; // casted short to int
        System.out.println(y);

//        Explicit casting (manual)
        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);

//        Parsing
        String s = "1";
        int t = Integer.parseInt(s) + 2;
        System.out.println(t);
    }
}
