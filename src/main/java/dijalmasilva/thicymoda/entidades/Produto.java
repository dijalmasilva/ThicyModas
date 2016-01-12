package dijalmasilva.thicymoda.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Produto {

    private int codigo;
    private String imagem;
    private double valorEntrada;
    private double valorSaida;
    private String genero;
    private String tipo;
    private int idMarca;
    private String nomeDaMarca;
    private List<Estoque> estoque;

    public Produto() {
        this.estoque = new ArrayList<>();
    }

    public Produto(int codigo, String imagem, double valorEntrada, double valorSaida, String genero, String tipo, int idMarca, String nomeDaMarca, List<Estoque> estoque) {
        this.codigo = codigo;
        this.imagem = imagem;
        this.valorEntrada = valorEntrada;
        this.valorSaida = valorSaida;
        this.genero = genero;
        this.tipo = tipo;
        this.idMarca = idMarca;
        this.nomeDaMarca = nomeDaMarca;
        this.estoque = estoque;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public List<Estoque> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Estoque> estoque) {
        this.estoque = estoque;
    }
    
    public boolean removeDoEstoque(Estoque e){
        return this.estoque.remove(e);
    }
    
    public boolean addAoEstoque(Estoque e){
        return this.estoque.add(e);
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNomeDaMarca() {
        return nomeDaMarca;
    }

    public void setNomeDaMarca(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }
    
    
}