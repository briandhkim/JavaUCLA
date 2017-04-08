/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Brian
 */
public class Plot extends JPanel {
    private int x = 0;
    private int y = 0;
    private int displayWidth = 500;
    private int displayHeight = 500;
    private double[] axis = new double[4]; //axis input as {x1,x2,y1,y2}
//    private int horizontalXBeg = this.displayWidth - (this.displayWidth - 75);
//    private int horizontalxEnd = this.displayWidth -75;
//    private int horizontalYBeg = this.displayHeight - 75;
//    private int horizontalYEnd = this.displayHeight - 75;
//    
//    private int vertXBeg = this.displayWidth - (this.displayWidth - 75);
//    private int vertXEnd = this.displayWidth - (this.displayWidth - 75);
//    private int vertYBeg = this.displayHeight - 75;
//    private int vertYEnd = this.displayHeight - (this.displayHeight -75);
   String xLabel = "X Axis";
   String yLabel = "Y Axis";
   String tLabel = "The Title";
   
   private double[] xValues;
   private double[] yValues;
   
   private int xBeg = this.displayWidth - (this.displayWidth - 75);
   private int yEnd = this.displayHeight - (this.displayHeight -75);
   Plottable2D funct; 
   
   private Color col = Color.black;
   private JFrame frame;
   
    public Plot() {
        frame = new JFrame();
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(displayWidth,displayHeight));
        frame.pack();
        frame.setVisible(true);
        frame.repaint();
    }
    
    public void paintComponent(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, this.displayWidth, this.displayHeight);
        g.setColor(Color.black);
        g.drawLine(this.displayWidth - (this.displayWidth - 75), this.displayHeight - 75, this.displayWidth - (this.displayWidth - 75), this.displayHeight - (this.displayHeight -75)); //y axis line
        g.drawLine(this.displayWidth - (this.displayWidth - 75),this.displayHeight - 75,this.displayWidth - 75,this.displayHeight - 75); //x axis line
        
        
        g.drawString(this.tLabel, this.displayWidth/2-25, this.displayHeight - (this.displayHeight -25));
        
        g.drawString(this.xLabel, this.displayWidth/2 -25,this.displayHeight- 50);
        g.drawString(String.valueOf(this.axis[0]), this.displayWidth - (this.displayWidth - 80), this.displayHeight - 60); //sets x axis numerical values
        g.drawString(String.valueOf(this.axis[1]),this.displayWidth - 100, this.displayHeight -60);
        
        Graphics2D g2d = (Graphics2D) g;        //sets y axis label vertically
        AffineTransform fontAT = new AffineTransform();
        Font theFont = g2d.getFont();
        fontAT.rotate(270*Math.PI/180);
        Font theDerivedFont = theFont.deriveFont(fontAT);
        g2d.setFont(theDerivedFont);
        g2d.drawString(this.yLabel, this.displayWidth - (this.displayWidth - 50), this.displayHeight/2);
        g2d.setFont(theFont);
        
        g.drawString(String.valueOf(this.axis[2]), this.displayWidth - (this.displayWidth - 55), this.displayHeight - 80); //sets y axis numerical values
        g.drawString(String.valueOf(this.axis[3]), this.displayWidth - (this.displayWidth - 55), this.displayHeight - (this.displayHeight - 90));
        
        g.setColor(this.col);
//        Graphics2D g2 = (Graphics2D) g;
//        for (int i = 0; i < this.xValues.length-1; i++){
//            g2.draw(new Line2D.Double(  this.xBeg + this.xValues[i],this.yEnd - this.yValues[i],this.xBeg + this.xValues[i+1], this.yEnd + this.yValues[i+1] ));
//        }
        
        for (int i = 0; i < this.xValues.length-2; i++){
            g.drawLine((int)Math.round(this.xValues[i]), (int)Math.round(this.yValues[i]), (int)Math.round(this.xValues[i+1]), (int)Math.round(this.yValues[i+1]));
        }
        
    }
    
    public void setDisplaySize(int width, int height){
        this.displayWidth = width;
        this.displayHeight = height;
    }
    
    public void setAxis(double[] axis){
        this.axis = axis;
        
        
        //x-axis 0 point: this.displayWidth - (this.displayWidth - 75) ; end: this.displayWidth - 75
        //y-axis 0 point: this.displayHeight - 75 ; end: this.displayHeight - (this.displayHeight -75)
    }
    
    public void setXLabel(String xLabel){
        this.xLabel = xLabel;
    }
    
    public void setYLabel(String yLabel){
        this.yLabel = yLabel;
    }
    
    public void setTitle(String tLabel){
        this.tLabel = tLabel;
    }
    
    public void setLineColor(Color col){
        this.col = col;
    }
    
    public void setFunction(Plottable2D funct){
        this.funct = funct;
        
//        this.xValues[0] = this.axis[0];
//        double incrementor = (this.axis[1] - this.axis[0])/10;
//        for (int i = 0; i < 10; i++){
//            this.xValues[i] += incrementor;
//        }

//        double div =  ((this.axis[1] - this.axis[0]) / 10);
//        int its = (int) Math.round(this.axis[1] / div);
//        
//        this.xValues = new double[its];
//        for (int i = 0; i< its; i++){
//            this.xValues[i] += div;
//        }
//        
//        
//        
//        this.yValues = this.funct.evaluate(this.xValues);
        
        this.xValues = ArrayMath.linspace(this.axis[0], this.axis[1], 100 );
        
        this.yValues = this.funct.evaluate(xValues);
        
        frame.repaint();
    }
}
