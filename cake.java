import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class cake {
    public static void main (String[] args) throws InterruptedException // this allows the application to delay and interrupt the execution based on the parameters added
    {

        //baking time formula is = (diameter)^2 *0.5

        //data types
        String firstname =  "Micaela";
        String lastname = "Barin";
        int CupSmall = 1;
        int CupReg = 2;
        double CupLrg = 2.5;
        int Cake1 = 5;
        int Cake2 = 6;
        int Cake3 = 7;
        int Cake4 = 8;
        int Cake5 = 9;
        int Cake6 = 10;
        int Cake7 = 11;
        int Cake8 = 12;
        int Cake9 = 13;
        int Cake10 = 14;
        int PizzaPersonal = 10;
        int PizzaSmall = 12;
        int PizzaMedium = 14;
        int PizzaLarge = 16;
        int PizzaXlarge = 18;
        Scanner User = new Scanner(System.in);


        //Checks current cycle
        long start = System.currentTimeMillis();

        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*                     Hello!                    *");        
        System.out.println("*                  "+ firstname + " " + lastname +"                *");
        System.out.println("*                                               *");
        System.out.println("*     Welcome to the Time Baking Calculator!    *");                
        System.out.println("*                                               *");
        System.out.println("*************************************************");

        //Banner show and remove 
        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");  //Special code that removes the banner above
        System.out.flush();

        System.out.println("*************************************************");
        System.out.println("*         What do you want to calculate?        *");
        System.out.println("*                                               *");        
        System.out.println("*                    1.Cupcake                  *");
        System.out.println("*                    2.Cake                     *");
        System.out.println("*                    3.Pizza                    *");
        System.out.println("*                                               *");
        System.out.println("*         Enter Your Choice using Numbers       *");                
        System.out.println("*                                               *");
        System.out.println("*************************************************");
        int Menu = User.nextInt(); 

        if (Menu == 1) {

                            System.out.print("\033[H\033[2J");  //Special code that removes the banner above
                            System.out.flush();

                            System.out.println("*************************************************");
                            System.out.println("*             What size do you want?            *");
                            System.out.println("*                                               *");        
                            System.out.println("*                    1.Small                    *");
                            System.out.println("*                    2.Regular                  *");
                            System.out.println("*                    3.Large                    *");
                            System.out.println("*                                               *");
                            System.out.println("*         Enter Your Choice using Numbers       *");                
                            System.out.println("*                                               *");
                            System.out.println("*************************************************");
                            int CupSize = User.nextInt(); 

                                        if (CupSize == 1) {

                                            System.out.print("\033[H\033[2J");  //Special code that removes the banner above
                                            System.out.flush();

                                            double bakingTimeSmall = Math.pow(CupSmall, 2) * 0.5;

                                            System.out.println("*************************************************");
                                            System.out.println("*                                               *");        
                                            System.out.println("*     The baking time is around " + bakingTimeSmall +" Mins        *");                
                                            System.out.println("*                                               *");
                                            System.out.println("*************************************************");

                                        } else if (CupSize == 2) {
                                            
                                            System.out.print("\033[H\033[2J");  //Special code that removes the banner above
                                            System.out.flush();

                                            //(diameter)^2 *0.5
                                            double bakingTimeReg = Math.pow(CupReg, 2) * 0.5;

                                            System.out.println("*************************************************");
                                            System.out.println("*                                               *");        
                                            System.out.println("*     The baking time is around " + bakingTimeReg +" Mins        *");                
                                            System.out.println("*                                               *");
                                            System.out.println("*************************************************");;


                                        } else if (CupSize == 3) {

                                            //(diameter)^2 *0.5

                                            System.out.print("\033[H\033[2J");  //Special code that removes the banner above
                                            System.out.flush();

                                            double bakingTimeLarge = Math.pow(CupLrg, 2) * 0.5;

                                            System.out.println("*************************************************");
                                            System.out.println("*                                               *");        
                                            System.out.println("*     The baking time is around " + bakingTimeLarge +" Mins      *");                
                                            System.out.println("*                                               *");
                                            System.out.println("*************************************************");

                                        } else {
                                            System.out.print("\033[H\033[2J");  //Special code that removes the banner above
                                            System.out.flush();

                                            System.out.println("*************************************************");
                                            System.out.println("*                                               *");        
                                            System.out.println("*             The Program will Close.           *");                
                                            System.out.println("*                                               *");
                                            System.out.println("*************************************************");

                                        }

        } else if (Menu == 2) {

                            System.out.print("\033[H\033[2J");  //Special code that removes the banner above
                            System.out.flush();

                            System.out.println("*************************************************");
                            System.out.println("*             What size do you want?            *");
                            System.out.println("*                                               *");        
                            System.out.println("*                    1. 5 Inches                *");
                            System.out.println("*                    2. 6 Inches                *");
                            System.out.println("*                    3. 7 Inches                *");
                            System.out.println("*                    4. 8 Inches                *");
                            System.out.println("*                    5. 9 Inches                *");
                            System.out.println("*                    6. 10 Inches               *");
                            System.out.println("*                    7. 11 Inches               *");
                            System.out.println("*                    8. 12 Inches               *");   
                            System.out.println("*                    9. 13 Inches               *");
                            System.out.println("*                    10. 18 Inches              *");                                                    
                            System.out.println("*                                               *");
                            System.out.println("*         Enter Your Choice using Numbers       *");                
                            System.out.println("*                                               *");
                            System.out.println("*************************************************");
                            int CakeSize = User.nextInt(); 

                            if (CakeSize == 1) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 1
                                double bakingTime1 = Math.pow(Cake1, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime1 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 2) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 2
                                double bakingTime2 = Math.pow(Cake2, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime2 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 3) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 3
                                double bakingTime3 = Math.pow(Cake3, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime3 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 4) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 4
                                double bakingTime4 = Math.pow(Cake4, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime4 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 5) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 5
                                double bakingTime5 = Math.pow(Cake5, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime5 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 6) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 6
                                double bakingTime6 = Math.pow(Cake6, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime6 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 7) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 7
                                double bakingTime7 = Math.pow(Cake7, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime7 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 8) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 8
                                double bakingTime8 = Math.pow(Cake8, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime8 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 9) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 9
                                double bakingTime9 = Math.pow(Cake9, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime9 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (CakeSize == 10) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate baking time for cake size 10
                                double bakingTime10 = Math.pow(Cake10, 2) * 0.5;

                                // Display baking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The baking time is around " + bakingTime10 + " Mins        *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Display error message
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*             The Program will Close.           *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");
                            }

        } else if (Menu == 3) {

                            System.out.print("\033[H\033[2J");  //Special code that removes the banner above
                            System.out.flush();

                            System.out.println("*************************************************");
                            System.out.println("*             What size do you want?            *");
                            System.out.println("*                                               *");        
                            System.out.println("*                    1. Personal                *");
                            System.out.println("*                    2. Small                   *");
                            System.out.println("*                    3. Medium                  *");
                            System.out.println("*                    4. Large                   *");
                            System.out.println("*                    5. XLarge                  *");                                                   
                            System.out.println("*                                               *");
                            System.out.println("*         Enter Your Choice using Numbers       *");                
                            System.out.println("*                                               *");
                            System.out.println("*************************************************");
                            int PizzaSize = User.nextInt(); 

                            if (PizzaSize == 1) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate cooking time for personal pizza
                                double cookingTimePersonal = Math.pow(PizzaPersonal, 2) * 0.5;

                                // Display cooking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The cooking time is around " + cookingTimePersonal + " Mins      *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (PizzaSize == 2) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate cooking time for small pizza
                                double cookingTimeSmall = Math.pow(PizzaSmall, 2) * 0.5;

                                // Display cooking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The cooking time is around " + cookingTimeSmall + " Mins      *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (PizzaSize == 3) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate cooking time for medium pizza
                                double cookingTimeMedium = Math.pow(PizzaMedium, 2) * 0.5;

                                // Display cooking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The cooking time is around " + cookingTimeMedium + " Mins     *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (PizzaSize == 4) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate cooking time for large pizza
                                double cookingTimeLarge = Math.pow(PizzaLarge, 2) * 0.5;

                                // Display cooking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The cooking time is around " + cookingTimeLarge + " Mins     *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else if (PizzaSize == 5) {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Calculate cooking time for extra large pizza
                                double cookingTimeXlarge = Math.pow(PizzaXlarge, 2) * 0.5;

                                // Display cooking time
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*     The cooking time is around " + cookingTimeXlarge + " Mins     *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

                            } else {
                                // Clear the screen
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Display error message
                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*             The Program will Close.           *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");
                            }                            

        } else {

                                System.out.println("*************************************************");
                                System.out.println("*                                               *");
                                System.out.println("*             The Program will Close.           *");
                                System.out.println("*                                               *");
                                System.out.println("*************************************************");

        }
    }
}