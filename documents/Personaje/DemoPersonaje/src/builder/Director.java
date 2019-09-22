/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author USUARIO
 */
public class Director {
    
   private BuilderPersonaje builderPersonaje;

    public void setBuilderPersonaje(BuilderPersonaje bp) {
        builderPersonaje = bp;
    }
    
    public Personaje getPersonaje(){
        return builderPersonaje.getPersonaje();
    }
   
   
   //----------
   
   public void construirPersonaje(){
       builderPersonaje.crearNuevoPersonaje();
       builderPersonaje.construirSpritesMove();
       builderPersonaje.construirSpritesWalk();
       builderPersonaje.construirSpritesAttack();
       builderPersonaje.construirSpritesDead();
   }
   
}
