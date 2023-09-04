public class MathClass {
    public static void main (String[] args) {
        int x = Math.round(1.1F);
        System.out.println(x);

        int y = (int)Math.ceil(1.1F);
        System.out.println(y);

        int z = (int)Math.floor(1.1F);
        System.out.println(z);

        System.out.println(Math.max(1, 2));

        System.out.println(Math.min(1, 3));

        System.out.println((int)(Math.random()*100)); // prints random numbers between 0 and 100
    }
}
