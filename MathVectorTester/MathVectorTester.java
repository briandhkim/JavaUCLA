
package mathvectortester;

/**
 * @author Brian
 */
public class MathVectorTester {


    public static void main(String[] args) {
        MathVector test0s;
        test0s = new MathVector(10);
        test0s.printMe(); // will print vector with all components zero
        
        MathVector tester;
        tester = new MathVector(2,3,6); //constructor with values input
        tester.printMe(); 
        
        MathVector tester2;
        tester2 = new MathVector(3,4.1,7.5);
        tester2.printMe();
        
        System.out.println(tester2.getEl(3)); //3rd element of tester2 
        
        MathVector negVec = tester.neg(); //negative of original vector
        negVec.printMe(); 
        
        System.out.println("Magnitude of first vector is: "+ tester.mag());
        
        System.out.println("dot result of two vectors are: "+ tester.dot(tester2)); //testing dot fuction
       
        
        MathVector plusVec = tester.plus(tester2);
        plusVec.printMe();
        
        MathVector spVec = tester2.sp(2);
        spVec.printMe();
    }
    
}
