/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.interfacesDao;

import dijalmasilva.thicymoda.entidades.Marca;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface MarcaDAO {

    public boolean addMarca(Marca m) throws ClassNotFoundException;
    
    public List<Marca> retornaMarcas() throws ClassNotFoundException;
    
    public int idPeloNome(String nome) throws ClassNotFoundException;
}
