public class desenvolvedor extends funcionario {
    String linguagemPrincipal;
    public desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public void exibirInformacoes() {
        System.out.println("Desenvolvedor: " + nome);
        System.out.println("Linguagem: " + linguagemPrincipal);
        System.out.println("Salário Mensal: R$ " + salario);
    }
}

