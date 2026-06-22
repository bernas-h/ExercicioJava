package revisao;
import java.util.Scanner;

public class excecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[5];

        System.out.println("Digite um valor inteiro:");
        v[0] = sc.nextInt();

        try {
            System.out.print("Qual posição deseja acessar? ");
            int posicao = sc.nextInt();

            System.out.println("Valor: " + v[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inexistente no vetor!");
        }

        sc.close();
    }
}


