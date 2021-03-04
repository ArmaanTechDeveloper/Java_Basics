public class RowToColumn {
    public static void main(String[] args) {

        // Itna easy program mat dijiya kariye mam please :pray: 
        
        int k[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" The array after switching is ");
        for(int i = 0 ; i<k.length;i++){
            for(int j = 0 ; j<k.length;j++){
                System.out.print(k[j][i]+" ");
            }
            System.out.println();
        }
    }
}
