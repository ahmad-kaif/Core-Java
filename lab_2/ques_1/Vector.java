
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
}