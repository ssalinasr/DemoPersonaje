/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


import fabricas.FabricaElfo;
import fabricas.FabricaPersonajes;
import objetos.Sprites;

/**
 *
 * @author USUARIO
 */
public class ConstructorPersonajeElfo extends BuilderPersonaje {

    Sprites sprites;
    
    public void usarSprites(FabricaPersonajes personaje){
        sprites = personaje.crearSprites();
    }
    
    @Override
    public void construirSpritesMove() {
        usarSprites(new FabricaElfo());
        personaje.setMove(sprites.getSpritesMove());
    }

    @Override
    public void construirSpritesWalk() {
        usarSprites(new FabricaElfo());
        personaje.setWalk(sprites.getSpritesWalk());
    }

    @Override
    public void construirSpritesAttack() {
        usarSprites(new FabricaElfo());
        personaje.setAttack(sprites.getSpritesAttack());
    }

    @Override
    public void construirSpritesDead() {
        usarSprites(new FabricaElfo());
        personaje.setDead(sprites.getSpritesDead());
    }

}
