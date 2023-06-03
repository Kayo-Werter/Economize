package poo.economize;

import java.util.Date;

public class Cupom {
    private String codigo;
    private Date dataValidade;
    private double desconto;

    public Cupom(String codigo, Date dataValidade, double desconto) {
        this.codigo = codigo;
        this.dataValidade = dataValidade;
        this.desconto = desconto;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}