package poo.economize.cadastro;

public record Endereco(String logradouro, String cep, String localidade, String bairro, String uf) {

    @Override
    public String toString() {
        return "CEP " + this.cep +
                " - " + this.logradouro +
                ", " + this.bairro +
                ", " + this.localidade +
                ", " + this.uf;
    }
}
