public class Recibo {

    private String responsavelPagamento;
    private int numeroMatricula;
    private double valorMensalidade;

    public Recibo(String responsavelPagamento, int numeroMatricula, double valorMensalidade) {
        this.responsavelPagamento = responsavelPagamento;
        this.numeroMatricula = numeroMatricula;
        this.valorMensalidade = valorMensalidade;
    }

    public String getResponsavelPagamento() {
        return responsavelPagamento;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }
}
