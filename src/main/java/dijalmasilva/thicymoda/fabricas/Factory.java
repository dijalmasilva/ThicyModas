/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.fabricas;

/**
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Factory {
    
    public static FactoryBD newFactoryBD(){
        return new  FactoryBDImpl();
    }
}
