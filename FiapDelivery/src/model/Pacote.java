package model;
public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        setCodigo(codigo);
        setPeso(peso);
        setStatus(status);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código do pacote não pode ser vazio.");
        }
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso do pacote deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("O status não pode ser vazio.");
        }
        this.status = status;
    }

    public void alterarStatus(String novoStatus) {
        setStatus(novoStatus);
    }
}