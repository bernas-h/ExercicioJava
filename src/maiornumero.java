import java.util.Scanner;
public class maiornumero {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = ent.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = ent.nextInt();
        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
        ent.close();
    }
}
