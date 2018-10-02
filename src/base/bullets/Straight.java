package base.bullets;

import base.GameObject;
import base.PlayerBullet;
import base.Settings;
import base.Vector2D;
import base.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Straight extends PlayerBullet {
    public Straight () {
        BufferedImage image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        this.renderer = new SingleImageRenderer(image);
        this.position = new Vector2D(Settings.START_PLAYER_POSITION_X,Settings.START_PLAYER_POSITION_Y);
    }
    public void run() {
        this.position.addThis(0,-3);
    }
}
