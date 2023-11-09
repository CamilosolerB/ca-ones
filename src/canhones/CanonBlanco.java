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
public class CanonBlanco extends Canon{

    public CanonBlanco(float angulo, float velInicial) {
        super(angulo, velInicial);
    }
    public int graphTiro(JPanel panel, int x0, int y0){
        int score = 0;
        Graphics g = panel.getGraphics();
        int grosor = 5;
        int numPuntos = 100;
        double deltaT = 0.1;
        System.out.println("primera linea "+view.primeraLinea[0]+" "+view.primeraLinea[1]+" "+view.primeraLinea[2]);
        for (int i = 0; i < numPuntos; i++) {
            double t = i * deltaT;
            int x = (int)(x0 + velInicial * Math.cos(Math.toRadians(angulo)) * t);
            int y = (int)(y0 + velInicial * Math.sin(Math.toRadians(angulo)) * t - (gravedad * t * t)/2);
            if(x <= 0 || y <=0){
                break;
            }
            if(x > 620 && x < 750 && y < 80){
                score++;
                break;
            }
            System.out.print("Posicion en el tiempo: "+t+" s: "+x+"m I + "+y+"m J");
            if (tocaLinea(x, y, view.primeraLinea) || tocaLinea(x, y, view.segundaLinea) || tocaLinea(x, y, view.terceraLinea)) {
                break;
            }
            int pixelX = (int) x;
            int pixelY = panel.getHeight() - (int) y;
            g.setColor(Color.BLACK);
            g.drawLine(pixelX, pixelY, pixelX, pixelY);
            int radio = grosor / 2;
            g.fillOval(pixelX - radio, pixelY - radio, grosor, grosor);
        }
        return score;
    }
}
