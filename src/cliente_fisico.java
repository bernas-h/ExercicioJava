public class cliente_fisico extends cliente {
  private String nome;
    private String cpf;

    public cliente_fisico(int codigo, String endereco, String nome, String cpf) {
        super(codigo, endereco);
        this.nome = nome;
        this.cpf = cpf;
    }

    // Versão simples: só verifica tamanho
    public boolean verificarCPF() {
        if (cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CPF válido? " + verificarCPF());
    }
}

