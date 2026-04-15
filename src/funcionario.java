public class funcionario {
    String nome;
    double salario;

    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return this.salario * 12;
    }
}

