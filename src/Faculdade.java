public class Faculdade {

    private int codigo;
    private String nome;
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Faculdade(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        alunos = new Aluno[100];
        quantidadeAlunos = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public boolean addAluno(Aluno aluno){
        alunos[quantidadeAlunos++] = aluno;
        return true;
    }

}
