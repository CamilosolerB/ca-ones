/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canhones;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author camilo
 */
public class Canon {
    protected float angulo;
    protected float velInicial;
    float gravedad = 9.8f;
    Vista view = new Vista();

    public Canon(float angulo, float velInicial) {
        this.angulo = angulo;
        this.velInicial = velInicial;
    }
    protected boolean tocaLinea(double x, double y, int[] linea) {
        return (Math.abs(x - linea[0]) <= 10) && (y < linea[1]) && (y > linea[2]);
    }

}
