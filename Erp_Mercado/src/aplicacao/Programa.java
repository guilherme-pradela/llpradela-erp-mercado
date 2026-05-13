package aplicacao;

import java.util.Scanner;

import Mercado.Produto;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto();
		
		System.out.println("Qual o nome do produto? ");
	    String nome = sc.nextLine();
	    System.out.println("Qual a Marca? ");
	    String marca = sc.nextLine();
	    System.out.println("Qual o preço? ");
	    double preco = sc.nextDouble();
	    Produto produto = new Produto(nome, preco, marca);
	    
	    System.out.println("Quantos seram colocados no estoque? ");
		int quantidade = sc.nextInt();
	    produto.addProduto(quantidade);
	    
	    System.out.println("Produto adicionado: " + produto);
	    
	    sc.close();
	}

}
