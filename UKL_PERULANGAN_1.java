
public class UKL_PERULANGAN_1 {

    public static void main(String[] args) {
        int a = 22;
        int b = 3;
        int n1 = 20;
        int n2 = 31;
        int s = 0;

        for (int i = n1; i <= n2; i++) {
            int jmlAritmatika = a + b * (i - 1);
            System.out.println("Deret suku ke " + i + " adalah " + jmlAritmatika + "\n");
            s += jmlAritmatika;
        }
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
    }
}
