import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][2];

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Número : ");
                matriz[i][j] = s.nextInt();
            }
        }
        System.out.println("Digite o número a ser buscado:");
        int numero = s.nextInt();

        int linha = -1;
        int coluna = -1;
        for (int i = 0; i < 5 ; i++){
            for(int j=0; j < 5;j++){
                if(matriz [i][j] == numero){
                    linha = i;
                    break;
                }
            }
        }
        if(linha > 0 & coluna > 0) {
            System.out.println("Númeri " + numero + "encontrado na posição linha " + linha + "posição coluna:" + coluna);
        }else{
            System.out.println("número " + numero + "nâo encontrado no vetor.");
        }
    }
}