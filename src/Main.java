import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de jogos:");
        int jogos = scanner.nextInt();

        int matriz[][] = new int[jogos][];

        if(jogos>0){
            for(int i=0; i<jogos;i++){
                System.out.println("Informe a quantidade de números do jogo "+(i+1)+":");
                int tamanho = scanner.nextInt();
                matriz[i] = new int[tamanho];
            }
        }

    }
}