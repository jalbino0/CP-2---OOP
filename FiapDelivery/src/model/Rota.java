package model;
public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        setPacote(pacote);
        setVeiculo(veiculo);
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        if (pacote == null) {
            throw new IllegalArgumentException("O pacote não pode ser nulo.");
        }
        this.pacote = pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        pacote.alterarStatus("Em transporte");
        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veículo " + veiculo.getPlaca()
                + " (" + veiculo.getTipoVeiculo() + ")");
    }
}