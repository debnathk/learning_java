public class Arrays {
    public static void main (String[] args) {
        int[] numbers = {2, 1, 3, 5, 4};
        System.out.println(java.util.Arrays.toString(numbers));
        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));

//        Multi-dimensional arrays
        int[][] numbers2D = {{1,0,2}, {3,0,4}};
        System.out.println(java.util.Arrays.deepToString(numbers2D));
    }
}
