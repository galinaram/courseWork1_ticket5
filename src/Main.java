import java.util.Arrays;

public class Main {
    public static int[] method (int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                massiv[i] ++;
            }
        }
        System.out.println(Arrays.toString(massiv));
        return Arrays.copyOfRange(massiv, 3, 7);
    }

    public static void main(String[] args) {
        int[] massiv = new int[]{2, 6, 9 ,4 , 18, 67, 13, 5, 9, 10};
        System.out.println(Arrays.toString(method(massiv)));
    }
}