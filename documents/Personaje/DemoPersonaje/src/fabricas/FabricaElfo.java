/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import objetos.Sprites;
import objetos.SpritesElfo;


/**
 *
 * @author USUARIO
 */
public class FabricaElfo implements FabricaPersonajes{

    @Override
    public Sprites crearSprites() {
        return new SpritesElfo();
    }


    
}
