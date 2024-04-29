package entities;

public class Conta {
    private Integer numero;
    private String agencia;
    private Cliente cliente;
    private Double saldo = 0.0;

    public Conta(Integer numero, String agencia, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgenrcia() {
        return agencia;
    }

    public void setAgenrcia(String agenrcia) {
        this.agencia = agenrcia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{ " +
                "numero = " + numero +
                ", agenrcia = '" + agencia + '\'' +
                ", cliente = " + cliente.getNome() + " " + cliente.getSobrenome() +
                ", saldo = R$" + saldo +
                '}';
    }
}
