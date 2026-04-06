public class cliente_juridico extends cliente {
    private String razaoSocial;
    private String cnpj;

    public cliente_juridico(int codigo, String endereco, String razaoSocial, String cnpj) {
        super(codigo, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    // Versão simples: só verifica tamanho
    public boolean verificarCNPJ() {
        if (cnpj.length() == 14) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirDados() {
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("CNPJ válido? " + verificarCNPJ());
    }
}
