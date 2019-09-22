/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public abstract class Sprites {
    
    public abstract ImageIcon[] getSpritesMove();
    public abstract ImageIcon[] getSpritesWalk();
    public abstract ImageIcon[] getSpritesAttack();
    public abstract ImageIcon[] getSpritesDead();
}
