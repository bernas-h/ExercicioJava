import java.util.Scanner;
public class somaNnumeros {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = ent.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a " + n + " é: " + soma);
        ent.close();
    }
}
