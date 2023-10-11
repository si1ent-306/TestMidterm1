package sim1;
/*
* Write a program that simulates rolling a dice 1000 times.
* Print out the count for the times that each face of the dice occurs.
*
* Sample output might look like:
    Face 1: 162
    Face 2: 170
    Face 3: 167
    Face 4: 169
    Face 5: 169
    Face 6: 163
*
* */
public class Q2 {


    public static void main(String []args) {
        int one = 0;
        int two= 0;
        int three= 0;
        int four= 0;
        int five= 0;
        int six= 0;
        for(int i = 0; i < 1000; i++){
            int roll = (int)(1 + Math.random() * 6);
            if(roll == 1){
                one++;
            }
            if(roll == 2){
                two++;
            }
            if(roll == 3){
                three++;
            }
            if(roll == 4){
                four++;
            }
            if(roll == 5){
                five++;
            }
            if(roll == 6){
                six++;

            }
        }
        System.out.println("One has been rolled: "+ one);
        System.out.println("Two has been rolled: "+ two);
        System.out.println("Three has been rolled: "+ three);
        System.out.println("Four has been rolled: "+ four);
        System.out.println("Five has been rolled: "+ five);
        System.out.println("Six has been rolled: "+ six);
    }

}

