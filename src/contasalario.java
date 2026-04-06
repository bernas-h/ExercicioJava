public class contasalario extends conta {
    private String empresa;

    public contasalario(int id, String titular, double saldoInicial, String empresa) {
        super(id, titular, saldoInicial);
        this.empresa = empresa;
    }

    public void receberSalario(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Salário: R$ " + valor);
            System.out.println("Empresa: " + empresa);
            System.out.println("Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
