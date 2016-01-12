package dijalmasilva.thicymoda.gerenciadores;

import dijalmasilva.thicymoda.entidades.Marca;
import dijalmasilva.thicymoda.fabricas.Factory;
import dijalmasilva.thicymoda.fabricas.FactoryBD;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaMarca {
    
    public boolean addMarca(Marca m) throws ClassNotFoundException{
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.marcaDAO().addMarca(m);
    }
    
    public List<Marca> retornaMarcas() throws ClassNotFoundException{
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.marcaDAO().retornaMarcas();
    }
    
    public int idPeloNome(String nome) throws ClassNotFoundException{
        FactoryBD fabrica = Factory.newFactoryBD();
        return fabrica.marcaDAO().idPeloNome(nome);
    }
}
