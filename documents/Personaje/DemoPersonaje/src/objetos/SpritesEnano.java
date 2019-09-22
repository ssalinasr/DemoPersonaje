/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public class SpritesEnano extends Sprites {

    @Override
    public ImageIcon[] getSpritesMove() {
        ImageIcon[] k = new ImageIcon[7];
        k[0] = new ImageIcon(getClass().getResource("/moveE/MoveE1.png"));
        k[1] = new ImageIcon(getClass().getResource("/moveE/MoveE2.png"));
        k[2] = new ImageIcon(getClass().getResource("/moveE/MoveE3.png"));
        k[3] = new ImageIcon(getClass().getResource("/moveE/MoveE4.png"));
        k[4] = new ImageIcon(getClass().getResource("/moveE/MoveE5.png"));
        k[5] = new ImageIcon(getClass().getResource("/moveE/MoveE6.png"));
        k[6] = new ImageIcon(getClass().getResource("/moveE/MoveE7.png"));
        return k;
    }

    @Override
    public ImageIcon[] getSpritesWalk() {
       ImageIcon[] k = new ImageIcon[9];
        k[0] = new ImageIcon(getClass().getResource("/WalkE/WalkE1.png"));
        k[1] = new ImageIcon(getClass().getResource("/WalkE/WalkE2.png"));
        k[2] = new ImageIcon(getClass().getResource("/WalkE/WalkE3.png"));
        k[3] = new ImageIcon(getClass().getResource("/WalkE/WalkE4.png"));
        k[4] = new ImageIcon(getClass().getResource("/WalkE/WalkE5.png"));
        k[5] = new ImageIcon(getClass().getResource("/WalkE/WalkE6.png"));
        k[6] = new ImageIcon(getClass().getResource("/WalkE/WalkE7.png"));
        k[7] = new ImageIcon(getClass().getResource("/WalkE/WalkE8.png"));
        k[8] = new ImageIcon(getClass().getResource("/WalkE/WalkE9.png"));
        return k;
        
    }

    @Override
    public ImageIcon[] getSpritesAttack() {
        ImageIcon[] k = new ImageIcon[14];
            k[0] = new ImageIcon(getClass().getResource("/attackE/AttackE1.png"));
            k[1] = new ImageIcon(getClass().getResource("/attackE/AttackE2.png"));
            k[2] = new ImageIcon(getClass().getResource("/attackE/AttackE3.png"));
            k[3] = new ImageIcon(getClass().getResource("/attackE/AttackE4.png"));
            k[4] = new ImageIcon(getClass().getResource("/attackE/AttackE5.png"));
            k[5] = new ImageIcon(getClass().getResource("/attackE/AttackE6.png"));
            k[6] = new ImageIcon(getClass().getResource("/attackE/AttackE7.png"));
            k[7] = new ImageIcon(getClass().getResource("/attackE/AttackE8.png"));
            k[8] = new ImageIcon(getClass().getResource("/attackE/AttackE7.png"));
            k[9] = new ImageIcon(getClass().getResource("/attackE/AttackE8.png"));
            k[10] = new ImageIcon(getClass().getResource("/attackE/AttackE7.png"));
            k[11] = new ImageIcon(getClass().getResource("/attackE/AttackE8.png"));
            k[12] = new ImageIcon(getClass().getResource("/attackE/AttackE7.png"));
            k[13] = new ImageIcon(getClass().getResource("/attackE/AttackE8.png"));
        return k;
        
    }

    @Override
    public ImageIcon[] getSpritesDead() {
        ImageIcon[] k = new ImageIcon[6];
            k[0] = new ImageIcon(getClass().getResource("/deadE/DeadE1.png"));
            k[1] = new ImageIcon(getClass().getResource("/deadE/DeadE2.png"));
            k[2] = new ImageIcon(getClass().getResource("/deadE/DeadE3.png"));
            k[3] = new ImageIcon(getClass().getResource("/deadE/DeadE4.png"));
            k[4] = new ImageIcon(getClass().getResource("/deadE/DeadE5.png"));
            k[5] = new ImageIcon(getClass().getResource("/deadE/DeadE6.png"));
        return k;
        
    }

    
    
}
