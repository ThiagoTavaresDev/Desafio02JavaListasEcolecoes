import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtosLista = new ArrayList<>();
        Produto p1 = new Produto("Mamao",10,20);
        Produto p2 = new Produto("Abacaxi",14,10);
        Produto p3 = new Produto("Uva",13,22);
        produtosLista.add(p1);
        produtosLista.add(p2);
        produtosLista.add(p3);
        for (Produto produto : produtosLista) {
            System.out.println(produto);
        }
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("tomate",10,20,"10/11/2023");
        System.out.println(produtoPerecivel.toString());
    }
}