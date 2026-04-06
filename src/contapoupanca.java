public class contapoupanca extends conta {
    private double taxaRendimento;

    public contapoupanca(int id, String titular, double saldoInicial, double taxaRendimento) {
        super(id, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento aplicado: R$ " + rendimento);
        System.out.println("Novo saldo: R$ " + saldo);
    }
}

