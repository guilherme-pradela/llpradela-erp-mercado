package Mercado;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
    private String marca;
    

	public Produto() {
	}

	public Produto(String nome, double preco, int quantidade, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.marca = marca;
	}
	
	public Produto(String nome, double preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}	
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		if (quantidade <= this.quantidade) {
	        this.quantidade -= quantidade;
	    } 
		else {
	        System.out.println("Estoque insuficiente!");
	    }	
		
	}

	@Override
	public String toString() {
		return nome + ", " + 
		       marca + ", $ " +
	           String.format("%.2f", preco) + ", "
	           + "Quantidade " + quantidade;
               	      
	}

	
	
	
	
}
