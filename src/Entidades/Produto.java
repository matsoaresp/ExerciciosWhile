package Entidades;


public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

public double ValorTotalEstoque(){
    return preco*quantidade;
}
public void AdicionarProduto (int quantidade){
    this.quantidade += quantidade;
}
public void RemoverProduto (int quantidade){
    this.quantidade -= quantidade;
}

public String toString () {
    return "Dados do produto: R$ "+nome+", R$"+preco+","+quantidade+" unidades, Total: R$"+ValorTotalEstoque();
}
}