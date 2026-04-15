public class coordenador extends professor {
    String setor;

    public coordenador(String nome, String disciplina, String setor) {
        super(nome, disciplina); 
        this.setor = setor;
    }

    public void exibirDadosCompletos() {
        System.out.println("--- Dados do Coordenador ---");
        System.out.println("Nome: " + nome);              
        System.out.println("Disciplina: " + disciplina);   
        System.out.println("Setor: " + setor);             
    }
}
