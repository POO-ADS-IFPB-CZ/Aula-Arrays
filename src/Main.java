import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de jogos:");
        int jogos = scanner.nextInt();

        int matriz[][] = new int[jogos][];

        if(jogos>0){
            for(int i=0; i<jogos;i++){
                //TODO: Verificar se a quantidade está entre 6 e 16
                System.out.print("Informe a quantidade de números do jogo "+(i+1)+":");
                int tamanho = scanner.nextInt();
                matriz[i] = new int[tamanho];
                for(int j=0; j<tamanho; j++){
                    //TODO: Verificar se o número não é repetido e está entre 1 e 60
                    System.out.print("Informe o número "+(j+1)+":");
                    int numero = scanner.nextInt();
                    matriz[i][j] = numero;
                }
            }
        }

        System.out.println("Resumo dos jogos:");
        for(int array[]: matriz){
            for (int j: array){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}