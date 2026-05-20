
public class Vetor {

    private int[] vetor;

    public Vetor() {
        vetor = new int[5];
    }

    public void adicionarNumero(int posicao, int numero) {

        try {

            vetor[posicao] = numero;

            System.out.println("Número adicionado com sucesso!");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: posição inválida!");
        }
    }

    public void mostrarNumero(int posicao) {

        try {

            System.out.println("Valor: " + vetor[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: posição inexistente!");
        }
    }
}
