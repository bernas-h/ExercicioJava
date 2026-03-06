import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = ent.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        ent.close();
    }
}
