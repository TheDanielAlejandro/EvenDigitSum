public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if(number >= 0){                                                                                                //1. check if the number is postive and higher than 0
            int calc;
            int sum = 0;

            while(number > 0){                                                                                          //2. Creating a loop to go trough the whole number.
                calc = number % 10;
                if((calc % 2) == 0){                                                                                    //3. For every number checked we verify if the module 2 of each is equal to zero, if yes is EVEN (22 /2 = 11 module= 0 || 23 /22 =11 module = 1).
                    sum += calc;
                }
                number /= 10;                                                                                           //4. Decrese the number dividing it by 10 each loop.
            }

            return sum;                                                                                                 //5. Return the result.
        }else{
            return -1;
        }
    }



}
