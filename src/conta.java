public class conta {
    protected int id;
    protected String titular;
    protected double saldo;

    public conta(int id, String titular, double saldoInicial) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void exibirInfo() {
        System.out.println("ID: " + id);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}

