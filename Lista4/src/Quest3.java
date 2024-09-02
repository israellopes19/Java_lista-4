public class Quest3 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transporta = new int[colunas][linhas];

        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                transporta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz transporta:");
         for(int i = 0; i < colunas; i++){
             for(int j = 0;j < linhas; j++){
                 System.out.println(transporta[i][j]+ " ");
             }
             System.out.println();
         }
    }
}