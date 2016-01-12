package dijalmasilva.thicymoda.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Venda {
    
    private double total;
    private List<ItemDeVenda> itens;
    private int qtdeParcelas;
    private double entrada;
    private LocalDate dataDaVenda;

    public Venda() {
    }

    public Venda(double total, List<ItemDeVenda> itens, int qtdeParcelas, double entrada, LocalDate dataDaVenda) {
        this.total = total;
        this.itens = itens;
        this.qtdeParcelas = qtdeParcelas;
        this.entrada = entrada;
        this.dataDaVenda = dataDaVenda;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<ItemDeVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemDeVenda> itens) {
        this.itens = itens;
    }

    public int getQtdeParcelas() {
        return qtdeParcelas;
    }

    public void setQtdeParcelas(int qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public String getDataDaVendaFormatado(){
        return dataDaVenda.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public void setDataDaVenda(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

}
