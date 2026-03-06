import java.util.Scanner;
public class negativopositivo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = ent.nextInt();
        if (n1 < 0) {
            System.out.println("O número " + n1 + " é negativo.");
        } else if (n1 > 0) {
            System.out.println("O número " + n1 + " é positivo.");
        } else {
            System.out.println("O número é zero.");
        }
        ent.close();
    } 
 }
