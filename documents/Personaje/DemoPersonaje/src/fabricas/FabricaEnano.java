/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import objetos.Sprites;
import objetos.SpritesEnano;



/**
 *
 * @author USUARIO
 */
public class FabricaEnano implements FabricaPersonajes{

    @Override
    public Sprites crearSprites() {
        return new SpritesEnano();
    }


    
    
}
