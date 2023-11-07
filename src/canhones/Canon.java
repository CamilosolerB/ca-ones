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

/**
 *
 * @author camilo
 */
public class Canon {
    private float angulo;
    private float velInicial;
    float gravedad = 9.8f;

    public Canon(float angulo, float velInicial) {
        this.angulo = angulo;
        this.velInicial = velInicial;
    }
    public void graphTiro(Graphics g, int x0, int y0){
        Graphics2D g2d = (Graphics2D) g;

        int numPuntos = 100; // Número de puntos a calcular
        double deltaT = 0.1; // Intervalo de tiempo

        for (int i = 0; i < numPuntos; i++) {
            double t = i * deltaT;
            double x = x0 + velInicial * Math.cos(angulo) * t;
            double y = y0 + velInicial * Math.sin(angulo) * t - 0.5 * gravedad * t * t;

            Point2D punto = new Point2D.Double(x, y);
            g2d.draw(new Line2D.Double(punto, punto)); // Dibuja un punto en la posición (x, y)
        }
    }
}
