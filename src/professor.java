public class professor extends pessoa {
    String disciplina;

    public professor(String nome, String disciplina) {
        super(nome); 
        this.disciplina = disciplina;
    }

    public void exibirDisciplina() {
        System.out.println("Disciplina: " + disciplina);
    }
}
