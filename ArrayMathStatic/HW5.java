/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author Brian
 */

import static hw5.ArrayMath.*;
import java.awt.*;
import javax.swing.*;

public class HW5 {

    
    public static void main(String[] args) {
        
        System.out.println("**Testing Basic Array Math**");
 
        System.out.println("--Testing println() and array generation--");
        double[] a = zeros(3);
        double[] b = ones(5);
        double[] c = linspace(0.0, 1.0, 5);
        double[] d = {.1, .1, .1, .1, .1};
        double[] e = {1, 2, 3, 4, 5};
        println(a);
        println(b);
        println(c);
        println(d);
        println(e);
        
        System.out.println("--Testing element-wise operations--");
        println(add(c, e));
        println(subtract(c, e));
        println(multiply(c, e));
        println(divide(c, e));
        println(pow(c, e));
        
        System.out.println("--Testing min/max operations--");
        System.out.println(min(new double[]{5, 2.2, 7, -1.2, -3.5, 6}));
        System.out.println(imin(new double[]{5, 2.2, 7, -1.2, -3.5, 6}));
        System.out.println(max(new double[]{5, 2.2, 7, -1.2, -3.5, 6}));
        System.out.println(imax(new double[]{5, 2.2, 7, -1.2, -3.5, 6}));
        
        
        System.out.println("**Testing Additional Array Math**");
 
        System.out.println("--Testing overloads--");
        println(add(2.5, b));
        println(subtract(2.5, b));
        println(multiply(2.5, b));
        println(divide(2.5, d));
        println(pow(2, new double[]{1, 2, 3, 4, 5}));
        
        System.out.println("--Testing other overloads--");
        println(add(b, 2.5));
        println(subtract(b, 2.5));
        println(multiply(b, 2.5));
        println(divide(d, 2.5));
        println(pow(new double[]{1, 2, 3, 4, 5}, 2));
        
        System.out.println("--Testing formatting--");
        setDisplayFormat("%10.5f");
        println(d);
        
        
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Plot p = new Plot();
//        frame.add(p);
//        p.setPreferredSize(new Dimension(800,600));
//        p.setDisplaySize(800,600);
//        p.setAxis(new double[] {0,1,0,1});
//        
//        Plottable2D myFun = new MyFunction();
//        p.setFunction(myFun);
//        p.setLineColor(Color.BLUE);
//        //p.setLineColor(Color.red);
//        frame.pack();
//        frame.setVisible(true);

        System.out.println("**Testing basic plotting**");
        Plot myPlot = new Plot();
        Plottable2D myFun = new MyFunction();
        myPlot.setAxis(new double[]{-1, 1, -.5, 1}); // axis limits specified {xmin, xmax, ymin, ymax}
        myPlot.setFunction(myFun);                 // class MyFunction implements interface Plottable2D

        System.out.println("**Testing plotting with options**");
        Plot myPlot2 = new Plot();
        myPlot2.setDisplaySize(1000, 500);
        myPlot2.setFunction(myFun);
        myPlot2.setAxis(new double[]{0, 1, 0, 1});
        myPlot2.setXLabel("X Label");
        myPlot2.setYLabel("Y Label");
        myPlot2.setTitle("The Title");
        myPlot2.setLineColor(Color.BLUE);
        
        
    } 
}
