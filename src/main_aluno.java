public class main_aluno {
    public static void main(String[] args) {
        aluno aluno = new aluno();
        aluno.setNome("Maria");
        aluno.setNota(8.5);

        String nome = aluno.getNome();
        double nota = aluno.getNota();

        String situacao;
        if (nota >= 6) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.println("Aluno: " + nome + 
                           " Nota: " + nota + 
                           " Situação: " + situacao);
    }
}