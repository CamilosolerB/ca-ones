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
    private float angulo;
    private float velInicial;
    float gravedad = 9.8f;

    public Canon(float angulo, float velInicial) {
        this.angulo = angulo;
        this.velInicial = velInicial;
    }
    public void graphTiro(JPanel panel, int x0, int y0){
        Graphics g = panel.getGraphics();
        g.clearRect(0, 0, panel.getWidth(), panel.getHeight());
        int numPuntos = 100; // Número de puntos a calcular
        double deltaT = 0.1; // Intervalo de tiempo

        for (int i = 0; i < numPuntos; i++) {
            double t = i * deltaT;
            double x = x0 + velInicial * Math.cos(angulo) * t;
            double y = y0 + velInicial * Math.sin(angulo) * t - 0.5 * gravedad * t * t;

            int pixelX = (int) x;
            int pixelY = panel.getHeight() - (int) y; // Invierte la coordenada Y

            g.setColor(Color.BLACK);
            g.drawLine(pixelX, pixelY, pixelX, pixelY);
        }
    }
}
