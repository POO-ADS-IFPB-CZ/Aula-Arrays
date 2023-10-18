import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int array[] = {2,4,5,68};

//        for(int i=0; i<array.length; i++){
//            System.out.println(array[i]);
//        }

//        for(int i: array){
//            System.out.println(i);
//            //Não funciona pois o i é somente iterador
//            i++;
//        }

//        String array2[] = new String[10];
//
//        for(String i: array2){
//            System.out.println(i);
//        }

        int matriz[][] = new int[3][];
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];

        for(int i[]: matriz){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}