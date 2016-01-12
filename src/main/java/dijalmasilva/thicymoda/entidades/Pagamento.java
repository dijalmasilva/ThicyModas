package dijalmasilva.thicymoda.entidades;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Pagamento {
    
    private double quantiaRecebida;
    private double troco;
    private double quantiaParaPagar;

    public Pagamento() {
    }

    public Pagamento(double quantiaRecebida, double troco, double quantiaParaPagar) {
        this.quantiaRecebida = quantiaRecebida;
        this.troco = troco;
        this.quantiaParaPagar = quantiaParaPagar;
    }

    public double getQuantiaRecebida() {
        return quantiaRecebida;
    }

    public void setQuantiaRecebida(double quantiaRecebida) {
        this.quantiaRecebida = quantiaRecebida;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double getQuantiaParaPagar() {
        return quantiaParaPagar;
    }

    public void setQuantiaParaPagar(double quantiaParaPagar) {
        this.quantiaParaPagar = quantiaParaPagar;
    }
    
    
}
