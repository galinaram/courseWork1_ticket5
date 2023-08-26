import java.util.Arrays;

public class Main {
    public static int[] method (int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                massiv[i] ++;
            }
        }
        return Arrays.copyOfRange(massiv, 3, 7);
    }
    public static void main(String[] args) {
        int [] massiv = new int[]{2, 3, 1, 6, 4, 8, 9, 5, 13, 7};
        System.out.println(Arrays.toString(method(massiv)));
    }
}