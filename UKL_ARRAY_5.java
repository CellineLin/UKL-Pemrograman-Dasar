
public class UKL_ARRAY_5 {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {6, 7, 8, 9},
  };
        int[][] b = {
            {2, 3, 4, 5},
            {7, 8, 9, 10},
};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
