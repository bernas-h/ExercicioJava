package revisao;

public class alunos {
    String nome;
    int datanascimento;
    int matricula;
    double nota1;
    double nota2;

    void dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + datanascimento);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }

    void aprovado(){
        double media = (nota1 + nota2) / 2;
        if(media >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
    
}
