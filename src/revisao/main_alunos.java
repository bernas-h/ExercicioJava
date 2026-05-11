package revisao;

public class main_alunos {
    public static void main(String[] args) {
        alunos aluno1 = new alunos();
        aluno1.nome = "João";
        aluno1.datanascimento = 2000;
        aluno1.matricula = 12345;
        aluno1.nota1 = 7.5;
        aluno1.nota2 = 4.0;

        aluno1.dados();
        aluno1.aprovado();
    }
}
