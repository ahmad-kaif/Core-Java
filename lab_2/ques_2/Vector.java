
import java.util.*;

class Vector{
    double[] elements;

    Vector(double[] arr){
        elements = Arrays.copyOf(arr, arr.length);
    }   
    
    //copy contructor
    Vector(Vector v){
        elements = Arrays.copyOf(v.elements, v.elements.length);
    }

    void set(int index, double value){
        elements[index] = value;
    }

    double get(int index){
        return elements[index];
    }

    void multiply(double scalar){
        System.out.println("Multiplication by a scalar  "+scalar);
        for(int i = 0 ;i<elements.length ; i++){
            elements[i] *= scalar;
        }
        for(int i = 0 ;i<elements.length ; i++){
            System.out.println(elements[i]);
        }
        
    }

    double multiply(Vector v){
        double sumOfProduct = 0;
        for(int i = 0; i<elements.length ; i++){
            sumOfProduct = sumOfProduct + (this.elements[i] * v.elements[i]);
        }
        return sumOfProduct;
    }


}