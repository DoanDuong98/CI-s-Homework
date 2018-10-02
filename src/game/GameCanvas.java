package game;

import base.*;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.security.Key;
import java.util.ArrayList;
import java.util.Random;

public class GameCanvas extends JPanel {
    Background background;
    Player player;
    public GameCanvas() {
        this.background = GameObject.create(Background.class);
        this.player = GameObject.create(Player.class);
       Enemy enemy = GameObject.create(Enemy.class);
    }

    public void run() {
      GameObject.runALl();
    }

    public void render(Graphics g) {
        GameObject.renderAll(g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.render(g);
    }
}
