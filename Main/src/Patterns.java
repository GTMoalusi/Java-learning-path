public class Patterns {
    public static void main(String[] args) {
        //Let's solve some Pattern problems basic ones only....nothing hectic lets go.
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
    }

    public static void pattern1(){
        /*
        *
        * *
        * * *
        * * * *
        * * * * *

        In this pattern we have 5 rows and columns... we always have to know the relationship between row and column always...
        */

        for(int row = 1; row <= 5; row++){ //This is the outer part...
            //inner loop....
            for(int column = 1; column <= row; column++){ //When row is @row = 3, we have column = 3, this shows that row = column...
                System.out.print("*" + " "); //Take note that there are spaces in between...
            }
            System.out.println(); //This is to create the next line after every inner loop
        }
    }

    public static void pattern2(){
        /*
        1. * * * * *
        2. * * * *
        3. * * *
        4. * *
        5. *

         */

        for(int row = 1; row <= 5; row++){
            for(int column = 1; column <= (5 - row + 1);column++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3(){
        /*
        1. * * * * *
        2. * * * * *
        3. * * * * *
        4. * * * * *
        5. * * * * *

         */

        for(int row = 1; row <= 5; row++){
            for(int column = 1; column <= 5; column++){ //Hope it's obvious to you also that row = column here....
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(){
        /*
        1. 1
        2. 1 2
        3. 1 2 3
        4. 1 2 3 4
        5. 1 2 3 4 5
         */

        for(int row = 1; row <= 5; row++){
            for(int column = 1; column <= row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
