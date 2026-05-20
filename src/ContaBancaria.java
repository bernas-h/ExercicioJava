public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {

        saldo += valor;

        System.out.println("Depósito realizado!");
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor)
            throws SaldoInsuficienteException {

        if (valor > saldo) {

            throw new SaldoInsuficienteException(
                "Saldo insuficiente!"
            );
        }

        saldo -= valor;

        System.out.println("Saque realizado!");
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
