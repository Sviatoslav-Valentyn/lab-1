public class Task5 {
    public static void main(final String[] args) {
        final int n = 4;
        System.out.println("Before");
        final int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = n * i + j;
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                final int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println("After");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}