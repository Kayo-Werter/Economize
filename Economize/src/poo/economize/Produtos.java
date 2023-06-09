package poo.economize;

public class Produtos {
    private String nome;
    private String marca;
    private double valor;
    private String categoria;

    public Produtos(String nome, String marca, double valor, String categoria) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
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


    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "\nproduto = " + nome +
                "\nMarca = " + marca +
                "\nvalor = " + valor;
    }


}
