
public class UKL_PERULANGAN_2 {
    
    public static void main(String[] args) {
        
        System.out.println("=======================================");
        System.out.println("ARITMATIKA SUKU KE-18 SAMPAI DENGAN 32");
        System.out.println("=======================================");
        
        int[][] aritmatika18 = {
            {149, 157, 165}, 
            {173, 181, 189}, 
            {197, 205, 213}, 
            {221, 229, 237}, 
            {245, 253, 261}
        };
        for(int i = 0; i < 5  ; i++){
            for(int j = 0; j < 3 ; j++){
                System.out.print(aritmatika18 [i][j]+"\t");
            }
            System.out.println();
    }
}
}      