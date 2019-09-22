/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class Personaje {

    private ImageIcon[] Move;
    private ImageIcon[] Walk;
    private ImageIcon[] Attack;
    private ImageIcon[] Dead;

    public void setMove(ImageIcon[] up) {
        this.Move = up;
    }

    public void setWalk(ImageIcon[] down) {
        this.Walk = down;
    }

    public void setAttack(ImageIcon[] left) {
        this.Attack = left;
    }

    public void setDead(ImageIcon[] right) {
        this.Dead = right;
    }

    public ImageIcon[] getMove() {
        return Move;
    }

    public ImageIcon[] getWalk() {
        return Walk;
    }

    public ImageIcon[] getAttack() {
        return Attack;
    }

    public ImageIcon[] getDead() {
        return Dead;
    }

}
