package assigment;

/**
 * Created by Sujata on 08/07/2017.
 */
public class TriangleExercise {

    final static char ASTERISK = '*';
    public static void printAsterisksInHorizontal(int noOfAsterisks){
        for(int counter=0; counter < noOfAsterisks; counter++){
            System.out.print(ASTERISK);
        }
        System.out.println();
    }
    public static void printAsterisksInVertical(int noOfAsterisks){
        for(int counter=0; counter < noOfAsterisks; counter++){
            System.out.println(ASTERISK);
        }
        System.out.println();
    }
    public static void printAsterisksRightTrigled(int sizeOfTringle){
        for(int counter=1;  counter <= sizeOfTringle; counter++) {
            printAsterisksInHorizontal(counter);
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Single Asterisk: ");
        printAsterisksInHorizontal(1);

        int noOfAsterisks= 8;
        System.out.println(noOfAsterisks+" Asterisks in horizontal: ");
        printAsterisksInHorizontal(noOfAsterisks);

        noOfAsterisks = 3;
        System.out.println(noOfAsterisks+" Asterisks in vertical: ");
        printAsterisksInVertical(noOfAsterisks);

        System.out.println("Size "+noOfAsterisks+" Right Triengled Asterisks: ");
        printAsterisksRightTrigled(noOfAsterisks);
    }
}
