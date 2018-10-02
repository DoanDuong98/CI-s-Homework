package base;

import base.renderer.AnimationRenderer;
import game.GameCanvas;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PlayerBullet extends GameObject {
   /* public PlayerBullet(){
         ArrayList<BufferedImage> images = SpriteUtils.LoadImages(
                "assets/images/player-bullets/a/0.png",
                 "assets/images/player-bullets/a/1.png",
                 "assets/images/player-bullets/a/2.png",
                 "assets/images/player-bullets/a/3.png"
        );
        this.renderer = new AnimationRenderer(images);
        this.position = new Vector2D(Settings.START_PLAYER_POSITION_X,Settings.START_PLAYER_POSITION_Y);
    }

    @Override
    public void run() {
        this.position.addThis(0,-3);
    }
    */
}
