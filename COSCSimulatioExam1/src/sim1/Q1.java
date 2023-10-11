package sim1;
/*
 * Compute the result of the following series
 * 1/3 + 3/5 + 5/7 + 7/9 + ... + 97/99
 *
 * The result should be expresses in FIVE significant decimal places
 * using printf statement
 * */

public class Q1 {

    public static void main(String []args) {
        //1.Show the equation being done
        //2.create 2 variables x and y
        //3. increase each varaibles by two for each edition
        //4. add the divison to the previous one
        //5. stop when y is == 99

        double upper = 1;
        double lower = 3;
        double solution = 0;
        double prevSolution = (upper / lower);
        while(lower < 99){
            upper = upper + 2;
            lower = lower + 2;
            solution = solution + prevSolution;
           System.out.print("(" + upper + "/" + lower + ")"+ " + ");
        }
        System.out.println();
        System.out.printf("%.5f\n", solution);
    }

}
