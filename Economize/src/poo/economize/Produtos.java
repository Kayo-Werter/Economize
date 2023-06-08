package poo.economize;

public class Produtos {
    private String nome;
    private String marca;
    private double valor;
    private int quantidade;
    private String categoria;

    public Produtos(String nome, String marca, double valor, int quantidade, String categoria) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }



    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCategoria() {
        return categoria;
    }



    @Override
    public String toString() {
        return "\nproduto = " + nome +
                "\nMarca = " + marca +
                "\nvalor = " + valor +
                "\nQuantidade = " + quantidade + "\n";
    }


}
