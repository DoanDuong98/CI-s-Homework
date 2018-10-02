package base;

import base.renderer.AnimationRenderer;
import game.GameCanvas;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Enemy extends GameObject {
    public Enemy() {
        ArrayList<BufferedImage> images = SpriteUtils.LoadImages(
           "assets/images/enemies/level0/pink/0.png",
                "assets/images/enemies/level0/pink/1.png",
                "assets/images/enemies/level0/pink/2.png",
                "assets/images/enemies/level0/pink/3.png"
        );
        this.renderer = new AnimationRenderer(images);
        this.position = new Vector2D(Settings.START_ENEMY_POSITION_X, Settings.START_ENEMY_POSITION_Y);
    }

    @Override
    public void run() {
        this.move();
    }
    public void move(){
        this.position.y +=0;
    }

}
