import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno(123456, "111.111.111-01",
                "João", "ADS");
        alunos[1] = new Aluno(654321, "222.222.222-02",
                "Maria", "ADS");
        alunos[2] = new Aluno(999888, "333.333.333-03",
                "Túlio", "Eng. Controle");

        System.out.println(alunos[0]);

        System.out.println(alunos[0].getNome());


    }
}