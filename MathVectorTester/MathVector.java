
package mathvectortester;

/**
 * @author Brian
 * 
 * creating and testing a class for
 * N-dimensional mathematical (Euclidean) vectors
 * 
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
    /*
    This constructor accepts only the dimension of the vector as input
        and constructs initial vector with all components that are zeroes 
    */

    
    public MathVector (double...val){
        elementCount = val.length;
        elementContent = val;
    }
    /*
    this constructor accepts components of the vector as input
    */
    
    public double getEl(int index){
       return elementContent[index-1]; //index-1 since not 0 indexed 
    }
    /*
    Returns the i-th component of the vector;
    this vector will be 1-indexed, not 0-indexed like arrays
    */
    
    public MathVector neg(){    //returns the negative of the original vector(leaves the original unchanged)
        double[] negVector;
        negVector = new double[elementCount];
        
        MathVector returnNeg;
       
        for (int i = 0; i<elementCount; i++){
            negVector[i] = -1* elementContent[i];
        }
        
        returnNeg = new MathVector(negVector);
        return returnNeg;
    }
    
    public double mag(){    //returns the magnitude of the vector
        double magnitude;
        double squaredSums = 0;
        for (int i = 0; i< elementCount; i++){
            squaredSums += elementContent[i]*elementContent[i];
        }
      
        magnitude = Math.sqrt(squaredSums);
        return magnitude;
    }
    
    public double dot(MathVector v){    //returns the dot product of the vector and another vector
        double[] productVal = new double[elementCount];
        double dotResult=0;
        for (int i = 1; i <= elementCount; i++){
            dotResult += elementContent[i-1]*v.getEl(i); //elementcontent iterators set to i-1 since mathvector iterator is 1-index
        }
        
        MathVector returnDot = new MathVector(productVal);
        return dotResult;
    }
    
    public MathVector plus(MathVector v){   //returns the sum of the vector and another vector; leaves the original unchanged
        double[] plusVal = new double[elementCount];
        
        for (int i = 1; i <= elementCount; i++){
            plusVal[i-1] = elementContent[i-1] + v.getEl(i);
        }
        
        MathVector returnPlus = new MathVector(plusVal);
        return returnPlus;
    }
    
    public MathVector sp(double n){ //returns the product of the vector and a scalar
        double[] spVal = new double[elementCount];
        
        for (int i = 0; i <elementCount; i++){
            spVal[i] = elementContent[i] * n;
        }
        
        MathVector returnSP = new MathVector(spVal);
        return returnSP;
    }
    
    public void printMe(){  //prints the elements of the vector
        System.out.print("[");
        for (int i = 0; i<elementCount-1; i++){
            System.out.print(elementContent[i] +",");
        }
        System.out.print(elementContent[elementCount-1]);
        System.out.println("]");
    }
}
