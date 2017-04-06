package hw2;

/**
 *
 * @author Brian
 */
import java.lang.Math;
public class MathVector {
  
    private int elementCount; //dimension of the vector
    private double[] elementContent; //variable holding components of vector
    
    
    public MathVector(int elementCount){
        this.elementCount=elementCount;
        this.elementContent = new double[elementCount];
        for (int i=0; i < elementCount; i++){
            elementContent[i] = 0;
        }
    }
    
//    public MathVector (int iterator, double value){
//        elementContent[iterator-1]=value;
//    }
    
    public MathVector (double...val){
        //double[] input = value;
        elementCount = val.length;
        //double[] newVector;
        //double[] newVector = new double [elementCount];
        elementContent = val;
    }
    
    public double getEl(int index){
       return elementContent[index-1]; //index-1 since not 0 indexed 
    }
    
    public MathVector neg(){
        double[] negVector;
        negVector = new double[elementCount];
        
        MathVector returnNeg;
       
        for (int i = 0; i<elementCount; i++){
            negVector[i] = -1* elementContent[i];
        }
        
        returnNeg = new MathVector(negVector);
//        return negVector;   //returns double array of MathVector that is negative of original. may change later to return mathVector
        return returnNeg;
    }
    
    public double mag(){
        double magnitude;
        double squaredSums = 0;
        for (int i = 0; i< elementCount; i++){
            squaredSums += elementContent[i]*elementContent[i];
        }
      
        magnitude = Math.sqrt(squaredSums);
        return magnitude;
    }
    
    public double dot(MathVector v){
        double[] productVal = new double[elementCount];
        double dotResult=0;
        for (int i = 1; i <= elementCount; i++){
            dotResult += elementContent[i-1]*v.getEl(i); //elementcontent iterators set to i-1 since mathvector iterator is 1-index
        }
        
        MathVector returnDot = new MathVector(productVal);
        return dotResult;
    }
    
    public MathVector plus(MathVector v){
        double[] plusVal = new double[elementCount];
        
        for (int i = 1; i <= elementCount; i++){
            plusVal[i-1] = elementContent[i-1] + v.getEl(i);
        }
        
        MathVector returnPlus = new MathVector(plusVal);
        return returnPlus;
    }
    
    public MathVector sp(double n){
        double[] spVal = new double[elementCount];
        
        for (int i = 0; i <elementCount; i++){
            spVal[i] = elementContent[i] * n;
        }
        
        MathVector returnSP = new MathVector(spVal);
        return returnSP;
    }
    
    public void printMe(){
        System.out.print("[");
        for (int i = 0; i<elementCount-1; i++){
            System.out.print(elementContent[i] +",");
        }
        System.out.print(elementContent[elementCount-1]);
        System.out.println("]");
    }
    
}
