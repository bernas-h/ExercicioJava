public class main_luta {
public static void main(String[] args) {
        lutador l[] = new lutador[6];
       l[0] = new lutador ("Bernardo", "Brasil", 31, 1.85f, 76.8f, 12, 8, 3 );
       l[1] = new lutador ("Lucas", "Italia", 20, 1.72f, 69.7f, 10, 1, 1 );
       l[2] = new lutador ("Arthur", "Franca", 25, 1.70f, 75.9f, 7, 2, 5 );
       l[3] = new lutador ("Marcos", "Belgica", 31, 1.76f, 77.9f, 3, 2, 3 );
       l[4] = new lutador ("Felipe", "Suiça", 25, 1.72f, 70.4f, 4, 4, 2 );
       l[5] = new lutador ("João", "Canada", 30, 1.87f, 68.2f, 11, 4, 5 );


       luta UEC01 = new luta();
       UEC01.marcarLuta(l[3], l[1]);
       UEC01.lutar();
       
}
    }