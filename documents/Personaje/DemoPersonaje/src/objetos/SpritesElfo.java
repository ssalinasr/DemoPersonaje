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
public class SpritesElfo extends Sprites {

    @Override
    public ImageIcon[] getSpritesMove() {
        ImageIcon[] k = new ImageIcon[8];
        k[0] = new ImageIcon(getClass().getResource("/moveF/MoveF1.png"));
        k[1] = new ImageIcon(getClass().getResource("/moveF/MoveF2.png"));
        k[2] = new ImageIcon(getClass().getResource("/moveF/MoveF3.png"));
        k[3] = new ImageIcon(getClass().getResource("/moveF/MoveF4.png"));
        k[4] = new ImageIcon(getClass().getResource("/moveF/MoveF5.png"));
        k[5] = new ImageIcon(getClass().getResource("/moveF/MoveF6.png"));
        k[6] = new ImageIcon(getClass().getResource("/moveF/MoveF7.png"));
        k[7] = new ImageIcon(getClass().getResource("/moveF/MoveF8.png"));
        return k;
    }

    @Override
    public ImageIcon[] getSpritesWalk() {
        ImageIcon[] k = new ImageIcon[9];
        k[0] = new ImageIcon(getClass().getResource("/WalkF/WalkF1.png"));
        k[1] = new ImageIcon(getClass().getResource("/WalkF/WalkF2.png"));
        k[2] = new ImageIcon(getClass().getResource("/WalkF/WalkF3.png"));
        k[3] = new ImageIcon(getClass().getResource("/WalkF/WalkF4.png"));
        k[4] = new ImageIcon(getClass().getResource("/WalkF/WalkF5.png"));
        k[5] = new ImageIcon(getClass().getResource("/WalkF/WalkF6.png"));
        k[6] = new ImageIcon(getClass().getResource("/WalkF/WalkF7.png"));
        k[7] = new ImageIcon(getClass().getResource("/WalkF/WalkF8.png"));
        k[8] = new ImageIcon(getClass().getResource("/WalkF/WalkF9.png"));
        return k;
    }

    @Override
    public ImageIcon[] getSpritesAttack() {
        ImageIcon[] k = new ImageIcon[14];
        k[0] = new ImageIcon(getClass().getResource("/attackF/AttackF1.png"));
        k[1] = new ImageIcon(getClass().getResource("/attackF/AttackF2.png"));
        k[2] = new ImageIcon(getClass().getResource("/attackF/AttackF3.png"));
        k[3] = new ImageIcon(getClass().getResource("/attackF/AttackF4.png"));
        k[4] = new ImageIcon(getClass().getResource("/attackF/AttackF5.png"));
        k[5] = new ImageIcon(getClass().getResource("/attackF/AttackF6.png"));
        k[6] = new ImageIcon(getClass().getResource("/attackF/AttackF5.png"));
        k[7] = new ImageIcon(getClass().getResource("/attackF/AttackF6.png"));
        k[8] = new ImageIcon(getClass().getResource("/attackF/AttackF5.png"));
        k[9] = new ImageIcon(getClass().getResource("/attackF/AttackF6.png"));
        k[10] = new ImageIcon(getClass().getResource("/attackF/AttackF5.png"));
        k[11] = new ImageIcon(getClass().getResource("/attackF/AttackF6.png"));
        k[12] = new ImageIcon(getClass().getResource("/attackF/AttackF5.png"));
        k[13] = new ImageIcon(getClass().getResource("/attackF/AttackF6.png"));
        return k;
        
    }

    @Override
    public ImageIcon[] getSpritesDead() {
        ImageIcon[] k = new ImageIcon[6];
        k[0] = new ImageIcon(getClass().getResource("/deadF/DeadF1.png"));
        k[1] = new ImageIcon(getClass().getResource("/deadF/DeadF2.png"));
        k[2] = new ImageIcon(getClass().getResource("/deadF/DeadF3.png"));
        k[3] = new ImageIcon(getClass().getResource("/deadF/DeadF4.png"));
        k[4] = new ImageIcon(getClass().getResource("/deadF/DeadF5.png"));
        k[5] = new ImageIcon(getClass().getResource("/deadF/DeadF6.png"));
       return k;
    }

    
    
}
