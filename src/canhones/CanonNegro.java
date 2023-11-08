/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canhones;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author caans
 */
public class CanonNegro extends Canon{

    public CanonNegro(float angulo, float velInicial) {
        super(angulo, velInicial);
    }
        public int graphTiro(JPanel panel, int x0, int y0){
        int score = 0;
        Graphics g = panel.getGraphics();
        int grosor = 5;
        int numPuntos = 100;
        double deltaT = 0.1;

        for (int i = 0; i < numPuntos; i++) {
            double t = i * deltaT;
            double x = x0 + velInicial * Math.cos(Math.toRadians(180-angulo)) * t;
            double y = y0 + velInicial * Math.sin(Math.toRadians(180-angulo)) * t - (gravedad * t * t)/2;
            if(x <= 0 || y <=0){
                break;
            }
            if(x <= 185 && y <= 75){
                score++;
                break;
            }
            System.out.println("Posicion en el tiempo: "+t+" s: "+x+"m I + "+y+"m J");

            int pixelX = (int) x;
            int pixelY = panel.getHeight() - (int) y; // Invierte la coordenada Y

            g.setColor(Color.BLACK);
            g.drawLine(pixelX, pixelY, pixelX, pixelY);
            int radio = grosor / 2; // Calcula el radio a partir del grosor
            g.fillOval(pixelX - radio, pixelY - radio, grosor, grosor);
        }
        return score;
    }
}
