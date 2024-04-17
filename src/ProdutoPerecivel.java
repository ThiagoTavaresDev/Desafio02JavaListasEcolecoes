//Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.
public class ProdutoPerecivel extends Produto{
    private String dataValidade;
    public ProdutoPerecivel(String nome, int preco, int quantidade,String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto em questão " + getNome() + " preco " + getPreco() + " quantidade "+ getQuantidade();
    }
}
