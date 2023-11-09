/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canhones;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author camilo
 */
public class Wall {
    private int x1;
    private int y1;
    private int y2;

    public Wall(int x1, int y1, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.y2 = y2;
    }
    public int[] graphLinea(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(x1, y1, x1, y2);
        int[] coordenadas = {x1,y1,y2};
        return coordenadas;
    }
}
