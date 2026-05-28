package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import Mercado.Produto;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> lista = new ArrayList<>();

        System.out.print("Quantos produtos deseja cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Produto " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade no estoque: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            Produto produto = new Produto(nome, preco, quantidade, marca);

            lista.add(produto);
        }

        System.out.println("Produtos Cadastrados:");
        for (Produto p : lista) {
            System.out.println(p);
        }
        
        System.out.println("Quantos produtos foram Vendidos");
        int pv = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < pv; i++) {

            System.out.print("Digite a Marca do produto vendido: ");
            String marcaBusca = sc.nextLine();

            System.out.print("Quantidade vendida: ");
            int quantidadeVendida = sc.nextInt();
            sc.nextLine();

            Produto produtoEncontrado = lista.stream()
                .filter(p -> p.getMarca().equalsIgnoreCase(marcaBusca))
                .findFirst()
                .orElse(null);

            if (produtoEncontrado != null) {

                produtoEncontrado.removeProduto(quantidadeVendida);

                System.out.println("Estoque atualizado:");
                System.out.println(produtoEncontrado);

            } else {

                System.out.println("Produto não encontrado.");
            }
        }
        

        sc.close();
    }
}
