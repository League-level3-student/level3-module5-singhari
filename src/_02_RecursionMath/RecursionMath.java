package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
    	int n = 1;
        // If times is 1 
            // Return number 
    	if(times  ==1) {
    		n = number;
    	}
        // Else return number + recursiveMultiplication(number, times-1)
    	else {
    		n = number+recursiveMultiplication(number, times-1);
    	}
        return n;
    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDivideBy) {
    	int n =1;
    	if(numberToDivideBy > number) {
    		n = 0;
    	}
    	else {
    		//6/2 = 6-2-2-2 = 3
    		n = 1+recursiveDivision(number-numberToDivideBy, numberToDivideBy);
    	}
    	
        return n;
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
        int n = number;
    	if(power  == 0) {
        	return 1;
        }
        else {
        	n *= recursivePower(number,power-1);
        }
        return n;
    }
}
