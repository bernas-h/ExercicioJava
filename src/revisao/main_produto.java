package revisao;

public class main_produto {
    public static void main(String[] args) {
        produto p1 = new produto();
        produto p2 = new produto();
        produto p3 = new produto();

        p1.nome = "Camiseta";
        p1.preco = 29.99;
        p1.quantidade = 3;

        p2.nome = "Calça";
        p2.preco = 49.99;
        p2.quantidade = 2;

        p3.nome = "Tênis";
        p3.preco = 89.99;
        p3.quantidade = 1;

        System.out.println("Valor Total: " + p1.valorTotal());
        System.out.println("Valor Total: " + p2.valorTotal());
        System.out.println("Valor Total: " + p3.valorTotal());
    }
}
