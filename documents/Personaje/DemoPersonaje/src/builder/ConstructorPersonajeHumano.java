/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


import fabricas.FabricaHumano;
import fabricas.FabricaPersonajes;
import objetos.Sprites;

/**
 *
 * @author USUARIO
 */
public class ConstructorPersonajeHumano extends BuilderPersonaje {

    Sprites sprites;
    
    public void usarSprites(FabricaPersonajes personaje){
        sprites = personaje.crearSprites();
    }
    
    @Override
    public void construirSpritesMove() {
        usarSprites(new FabricaHumano());
        personaje.setMove(sprites.getSpritesMove());
    }

    @Override
    public void construirSpritesWalk() {
        usarSprites(new FabricaHumano());
        personaje.setWalk(sprites.getSpritesWalk());
    }

    @Override
    public void construirSpritesAttack() {
        usarSprites(new FabricaHumano());
        personaje.setAttack(sprites.getSpritesAttack());
    }

    @Override
    public void construirSpritesDead() {
        usarSprites(new FabricaHumano());
        personaje.setDead(sprites.getSpritesDead());
    }

}
