package assigment;

/**
 * Created by Sujata on 08/07/2017.
 */
public class DiamondExercise {
    final static char ASTERISK = '*';
    final static char SPACE = ' ';
    public static void printAsterisksAsIsoscelesTriangle(int sizeOfTriangle){
        for(int row=0;  row < sizeOfTriangle; row++) {
            for (int column = sizeOfTriangle-row-1; column > 0 ; column--) {
                System.out.print(SPACE);
            }
            for (int column = 0; column <= 2*row; column++) {
                System.out.print(ASTERISK);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printAsterisksCenteredDiamond(int sizeOfDiamond){
        int counter = 0;
        for(int row=0;  row < 2*sizeOfDiamond-1; row++) {

            for (int column = 0; column < sizeOfDiamond+counter; column++) {

                if(column < sizeOfDiamond-counter-1)
                    System.out.print(SPACE);
                else
                    System.out.print(ASTERISK);
            }
            System.out.println();
            counter= row < sizeOfDiamond-1 ? counter+1 : counter-1;
        }
        System.out.println();
    }
    public static void printAsterisksCenteredDiamondWithName(int sizeOfDiamond,String name){
        int counter = 0;
        for(int row=0;  row < 2*sizeOfDiamond-1; row++) {

            if(row != sizeOfDiamond-1) {

                for (int column = 0; column < sizeOfDiamond + counter; column++) {

                    if (column < sizeOfDiamond - counter - 1)
                        System.out.print(SPACE);
                    else
                        System.out.print(ASTERISK);
                }
            }
            else
                System.out.print(name);
            System.out.println();
            counter= row < sizeOfDiamond-1 ? counter+1 : counter-1;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int sizeOfTriangle = 3;
        System.out.println(sizeOfTriangle+" size Asterisks Isosceles Triangle: ");
        printAsterisksAsIsoscelesTriangle(sizeOfTriangle);

        System.out.println(sizeOfTriangle+" size Asterisks Diamond: ");
        printAsterisksCenteredDiamond(sizeOfTriangle);

        String name="Sujata";
        System.out.println(sizeOfTriangle+" size Asterisks Diamond with name "+name+" centered:");
        printAsterisksCenteredDiamondWithName(sizeOfTriangle,name);
    }
}
