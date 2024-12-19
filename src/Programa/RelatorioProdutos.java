package Programa;
import Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class RelatorioProdutos {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    Produto produto = new Produto();

    System.out.println("Informe os dados do produto: ");
    System.out.println("Nome");
    produto.nome = sc.nextLine();
    System.out.println("Preço");
    produto.preco = sc.nextDouble();
    System.out.println("Quantidade");
    produto.quantidade = sc.nextInt();

    System.out.println(produto);
    System.out.println("Informe um número para adicionar nos produtos de estoque:");

    produto.AdicionarProduto(sc.nextInt());
    System.out.println(produto);

    System.out.println("Informe um número para remover os produtos do estoque:");
    produto.RemoverProduto(sc.nextInt());
    System.out.println(produto);


    }
}
