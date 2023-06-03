package poo.economize;

public class Produtos {
    private String nome;
    private String marca;
    private double valor;
    private int quantidade;

    public Produtos(String nome, String marca, double valor, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.quantidade = quantidade;
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


    @Override
    public String toString() {
        return "\nproduto = " + nome +
                "\nMarca = " + marca +
                "\nvalor = " + valor +
                "\nQuantidade = " + quantidade + "\n";
    }

}
