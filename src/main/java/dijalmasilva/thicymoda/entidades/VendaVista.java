/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.entidades;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class VendaVista extends Venda{
    
    private final double descontoEmEspecie = 0.15;
    private final double descontoEmDebito = 0.12;

    public VendaVista() {
    }

    public VendaVista(double total, List<ItemDeVenda> itens, int qtdeParcelas, double entrada, LocalDate dataDaVenda) {
        super(total, itens, qtdeParcelas, entrada, dataDaVenda);
    }
    
    public double getTotalEmEspecie(){
        setTotal(getTotal() * descontoEmEspecie);
        return getTotal();
    }
    
    public double getTotalEmDebito(){
        setTotal(getTotal() * descontoEmDebito);
        return getTotal();
    }
}
