public class contacorrente extends conta {
  private double limite;

    public contacorrente(int id, String titular, double saldoInicial, double limite) {
        super(id, titular, saldoInicial);
        this.limite = limite;
    }

    public boolean usarLimite(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque com limite realizado.");
            System.out.println("Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Limite insuficiente.");
            return false;
        }
    }
}
