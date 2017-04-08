/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Brian
 * 
 * Dong Hyun Kim
 * 304498589
 * PIC20A
 */
public class tester {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Plot p = new Plot();
        frame.add(p);
        p.setPreferredSize(new Dimension(800,600));
        p.setDisplaySize(800,600);
        p.setAxis(new double[] {0,1,0,1});
        p.setLineColor(Color.BLUE);
        Plottable2D myFun = new MyFunction();
        p.setFunction(myFun);
        
        p.setLineColor(Color.red);
        frame.pack();
        frame.setVisible(true);
    }
}
