package dijalmasilva.thicymoda.entidades;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Parcela {
    
    private int id;
    private int idVenda;
    private double valor;
    private boolean pago;

    public Parcela() {
    }

    public Parcela(int id, int idVenda, double valor, boolean pago) {
        this.id = id;
        this.idVenda = idVenda;
        this.valor = valor;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    
}
