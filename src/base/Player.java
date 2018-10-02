package base;

import base.bullets.Left;
import base.bullets.Right;
import base.bullets.Straight;
import base.counter.FrameCounter;
import base.renderer.AnimationRenderer;
import base.renderer.SingleImageRenderer;
import game.GameCanvas;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.security.Key;
import java.util.ArrayList;

public class Player extends GameObject {
    FrameCounter fireCounter;
    public Player() {
       ArrayList<BufferedImage> images = SpriteUtils.LoadImages(
               "assets/images/players/straight/0.png",
               "assets/images/players/straight/1.png",
               "assets/images/players/straight/2.png",
               "assets/images/players/straight/3.png",
               "assets/images/players/straight/4.png",
               "assets/images/players/straight/5.png",
               "assets/images/players/straight/6.png"
       );
        this.renderer = new AnimationRenderer(images);
        this.position = new Vector2D(Settings.START_PLAYER_POSITION_X
                , Settings.START_PLAYER_POSITION_Y);
        this.fireCounter = new FrameCounter(10);
    }

    @Override
    public void run() {
        if(KeyEventPress.isUpPress) {
            this.move(0, -1);
        }
        if(KeyEventPress.isDownPress) {
            this.move(0, 1);
        }
        if(KeyEventPress.isRightPress) {
            this.move(1, 0);
        }
        if(KeyEventPress.isLeftPress) {
            this.move(-1, 0);
        }
        //fire
        boolean fireCounterRun = this.fireCounter.run();
        if(KeyEventPress.isSpace && fireCounterRun)
        {
            this.fire();
        }
    }
    public void fire () {
      //  PlayerBullet bullet = GameObject.create(PlayerBullet.class);
        PlayerBullet left = GameObject.create(Left.class);
        PlayerBullet right = GameObject.create(Right.class);
        PlayerBullet straight = GameObject.create(Straight.class);
       // bullet.position.set(this.position.x,this.position.y);
        left.position.set(this.position.x,this.position.y);
        right.position.set(this.position.x,this.position.y);
        straight.position.set(this.position.x,this.position.y);
            this.fireCounter.reset();
        }

    public void move(int translateX, int translateY) {
        this.position.addThis(translateX, translateY);
    }
}
