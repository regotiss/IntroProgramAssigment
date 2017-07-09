package assigment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sujata on 09/07/2017.
 */
public class PrimeFactorsExercise {


    public static List<Integer> generate(int n){

        List<Integer> factors= new ArrayList<>();
        while(n%2 == 0){
            factors.add(2);
            n/=2;
        }
        for(int divider= 3; divider <= Math.sqrt(n);divider += 2){
            if(n%divider == 0){
                factors.add(divider);
                n/=divider;
            }
        }
        if(n>2)
            factors.add(n);
        return factors;
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println("Factors of "+n);
        System.out.println(generate(n));

        n=30;
        System.out.println("Factors of "+n);
        System.out.println(generate(n));
    }
}
