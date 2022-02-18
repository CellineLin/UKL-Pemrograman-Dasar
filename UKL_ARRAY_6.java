
public class UKL_ARRAY_6 {

    public static void main(String[] args) {

        // Array A1 x A2
        int[][] a = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
        };

        // Array B1 x B2
        int[][] b = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20},
        };
        // Deklarasi Array Untuk Hasil Perkalian
        int[][] hasil = new int[a.length][b[0].length];

        // Mengalikan Array A dan B
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    hasil[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(hasil[i][j] + " "+"\t");

            }
            System.out.println();
        }

    }
}
