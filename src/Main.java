import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Faculdade faculdade = new Faculdade(9062, "IFPB");

        faculdade.addAluno(new Aluno(123456, "111.111.111-01",
                "Túlio", "ADS"));
        faculdade.addAluno(new Aluno(654321, "222.222.222-02",
                "Messyas", "ADS"));

        System.out.println(Arrays.toString(faculdade.getAlunos()));

    }
}