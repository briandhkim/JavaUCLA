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

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Formatter;

public class ArrayMath {
    private static double[] data;
    private static String fmt;
    
    public static void println(double[] n){
       if (fmt == null){
          fmt = "%.3f";
       }
        
        System.out.print("[");
        System.out.format(fmt, n[0]);
        for (int i = 1; i < n.length; i++){
            System.out.format(", " + fmt, n[i]);
        }
        System.out.println("]");
    }
    
    public static double[] zeros(int n){
        data = new double[n];
        for (int i = 0; i < n; i++){
            data[i] = 0.0;
        }
        return data;
    }
    
    public static double[] ones(int n){
        data = new double[n];
        for(int i = 0; i < n; i++){
            data[i] = 1;
        }
        return data;
    }

    public static double[] linspace(double x, double y, int n){
        data = new double[n];
        double divNum = (y-x)/(n-1);
        data[0] = x;
        for (int i = 1; i< n; i++){
            x += divNum;
            data[i] = x;
        }
        return data;
    }
    
    public static double[] add(double[] x, double[] y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data [i] = x[i] +y[i];
        }
        return data;
    }
    
    public static double[] subtract(double[] x, double[] y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = x[i] -y[i];
        }
        return data;
    }
    
    public static double[] multiply(double[] x, double[] y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = x[i] * y[i];
        }
        return data;
    }
    
    public static double[] divide(double[] x, double[] y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = x[i] / y[i];
        }
        return data;
    }
    
    public static double[] pow(double[] x, double[] y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = Math.pow(x[i],  y[i]);
        }
        return data;
    }
    
    public static double min(double[] nums){
        double min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
    
    public static double max(double[] nums){
        double max = nums[0];
        for (int i = 0; i< nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    
    public static int imax(double[] nums){
        int index = 0;
        double max = nums[0];
        for (int i = 0; i< nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int imin(double[] nums){
        int index = 0;
        double min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
                index = i;
            }
        }
        return index;
    }
    
    public static double[] add(double x, double[] y){
        data = new double[y.length];
        for (int i = 0; i < y.length; i++){
            data [i] = x +y[i];
        }
        return data;
    }
    
    public static double[] subtract(double x, double[] y){
        data = new double[y.length];
        for (int i = 0; i < y.length; i++){
            data[i] = x -y[i];
        }
        return data;
    }
    
    public static double[] multiply(double x, double[] y){
        data = new double[y.length];
        for (int i = 0; i < y.length; i++){
            data[i] = x * y[i];
        }
        return data;
    }
    
    public static double[] divide(double x, double[] y){
        data = new double[y.length];
        for (int i = 0; i < y.length; i++){
            data[i] = x / y[i];
        }
        return data;
    }
    
    public static double[] pow(double x, double[] y){
        data = new double[y.length];
        for (int i = 0; i < y.length; i++){
            data[i] = Math.pow(x,  y[i]);
        }
        return data;
    }
    
    public static double[] add(double[] x, double y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data [i] = x[i] +y;
        }
        return data;
    }
    
    public static double[] subtract(double[] x, double y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = x[i] -y;
        }
        return data;
    }
    
    public static double[] multiply(double[] x, double y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = x[i] * y;
        }
        return data;
    }
    
    public static double[] divide(double[] x, double y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = x[i] / y;
        }
        return data;
    }
    
    public static double[] pow(double[] x, double y){
        data = new double[x.length];
        for (int i = 0; i < x.length; i++){
            data[i] = Math.pow(x[i],  y);
        }
        return data;
    }
    
    public static void setDisplayFormat(String format){
        fmt = format;
    }
}
