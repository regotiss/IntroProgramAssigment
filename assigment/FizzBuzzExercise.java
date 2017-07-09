package assigment;

/**
 * Created by Sujata on 08/07/2017.
 */
public class FizzBuzzExercise {

    private int startOfRange,endOfRange;

    public static void printFizzBuzzResult(int startOfRange,int endOfRange){
        String ans = "";
        for(int counter=startOfRange;counter <= endOfRange; counter++){
            if(counter % 15 ==0 ){
                ans = "Fizz Buzz";
            }
            else if(counter % 3 == 0){
                ans= "Fizz";
            }
            else if(counter % 5 == 0){
                ans= "Buzz";
            }
            else
                ans = ""+counter;
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        int startOfRange= 1;
        int endOfRange = 100;
        System.out.println("numbers with Fizz Buzz rule from "+startOfRange+" to "+endOfRange+":");
        printFizzBuzzResult(startOfRange,endOfRange);

    }
}
