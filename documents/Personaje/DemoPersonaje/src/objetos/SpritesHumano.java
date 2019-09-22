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
public class SpritesHumano extends Sprites {

    @Override
    public ImageIcon[] getSpritesMove() {
        ImageIcon[] k = new ImageIcon[6];
        k[0] = new ImageIcon(getClass().getResource("/move/Move1.png"));
        k[1] = new ImageIcon(getClass().getResource("/move/Move2.png"));
        k[2] = new ImageIcon(getClass().getResource("/move/Move3.png"));
        k[3] = new ImageIcon(getClass().getResource("/move/Move4.png"));
        k[4] = new ImageIcon(getClass().getResource("/move/Move5.png"));
        k[5] = new ImageIcon(getClass().getResource("/move/Move6.png"));
        return k;
    }

    @Override
    public ImageIcon[] getSpritesWalk() {
        ImageIcon[] k = new ImageIcon[8];
        k[0] = new ImageIcon(getClass().getResource("/walk/Walk1.png"));
        k[1] = new ImageIcon(getClass().getResource("/walk/Walk2.png"));
        k[2] = new ImageIcon(getClass().getResource("/walk/Walk3.png"));
        k[3] = new ImageIcon(getClass().getResource("/walk/Walk4.png"));
        k[4] = new ImageIcon(getClass().getResource("/walk/Walk5.png"));
        k[5] = new ImageIcon(getClass().getResource("/walk/Walk6.png"));
        k[6] = new ImageIcon(getClass().getResource("/walk/Walk7.png"));
        k[7] = new ImageIcon(getClass().getResource("/walk/Walk8.png"));
        return k;
    }

    @Override
    public ImageIcon[] getSpritesAttack() {
        ImageIcon[] k = new ImageIcon[14];
            k[0] = new ImageIcon(getClass().getResource("/attack/Attack1.png"));
            k[1] = new ImageIcon(getClass().getResource("/attack/Attack2.png"));
            k[2] = new ImageIcon(getClass().getResource("/attack/Attack3.png"));
            k[3] = new ImageIcon(getClass().getResource("/attack/Attack4.png"));
            k[4] = new ImageIcon(getClass().getResource("/attack/Attack5.png"));
            k[5] = new ImageIcon(getClass().getResource("/attack/Attack6.png"));
            k[6] = new ImageIcon(getClass().getResource("/attack/Attack7.png"));
            k[7] = new ImageIcon(getClass().getResource("/attack/Attack8.png"));
            k[8] = new ImageIcon(getClass().getResource("/attack/Attack9.png"));
            k[9] = new ImageIcon(getClass().getResource("/attack/Attack10.png"));
            k[10] = new ImageIcon(getClass().getResource("/attack/Attack11.png"));
            k[11] = new ImageIcon(getClass().getResource("/attack/Attack12.png"));
            k[12] = new ImageIcon(getClass().getResource("/attack/Attack13.png"));
            return k;
    }

    @Override
    public ImageIcon[] getSpritesDead() {
        ImageIcon[] k = new ImageIcon[6];
            k[0] = new ImageIcon(getClass().getResource("/dead/Dead1.png"));
            k[1] = new ImageIcon(getClass().getResource("/dead/Dead2.png"));
            k[2] = new ImageIcon(getClass().getResource("/dead/Dead3.png"));
            k[3] = new ImageIcon(getClass().getResource("/dead/Dead4.png"));
            k[4] = new ImageIcon(getClass().getResource("/dead/Dead5.png"));
            k[5] = new ImageIcon(getClass().getResource("/dead/Dead6.png"));
            return k;
    }

}
