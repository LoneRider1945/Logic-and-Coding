//Iteration_Explore.java

/**
 * Lab that explores for loops.
 *
 * @author Roy Chancellor
 * @version 2/7/2019
 */
public class Iteration_Explore
{
    public static void main( String[] args) {
        int sumInt, square, factorial;
        
        System.out.println();  //blank line for separation in terminal
        System.out.println("i\tsumInt\tsquare i");  //table header
        
        sumInt = 20350;
        for(int i = 1; i <= 10; i = i + 1) {
            sumInt = sumInt + i;
            square = i * i;
            System.out.println(i + "\t" + sumInt + "\t" + square);
        }  //end for
        
        System.out.println();
        System.out.println("j\tsumInt\tfactorial j");
        
        for(int j = 10; j >= 0; j = j - 1) {
            sumInt = sumInt + j;
            factorial = j * (j-1);
            System.out.println(j + "\t" + sumInt + "\t" + factorial);
        }
    } //end main
}  //end Iteration_Explore