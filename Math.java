
/**
 * Write a description of class Math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Math
{
    //Constants
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String REMAINDER = "%";
    private static final String PLUS = "+";
    private static final String MINUS = "-";

    /**
     * @param x this parameter is the value of x
     * @param y 
     * @return returns x divided by y but if y==0, print error and return zero
     */
    public int divide(int x, int y)
    {

        if(y == 0){
            System.out.println("ERROR");

            return 0;
        }

        int answer = x / y;
        return answer;

    }

    /**
     * @param x 
     * @param y
     * @return returns the bigger number: x or y 
     */
    public int max(int x, int y)
    {
        if(x > y ){

            return x;
        }else if
        (y > x){

            return y;
        }else{
            throw new IllegalArgumentException(" x and y cant be equal");
        }
    }

    /**
     * @param x
     * @param y
     * @return returns the remainder when x is divided by y but if y == 0 print error and return zero
     */
    public int remainder(int x, int y) 
    {
        if(y != 0){

            return x % y ;
        }else{

            System.out.println("ERROR");

            return 0; 

        }
    }

    /**
     * @param x
     * @return returns x times 3
     */
    public int triple(int x){

        return x*3;
    }

    /**
     * @param operation
     * @return returns true if the operation is any of "*","/","%","+","-"; otherwise false.
     */
    public boolean isValidOperation(String operation) 
    {
        boolean answer;
        switch(operation) {

            case MULTIPLICATION:
            case DIVISION:
            case REMAINDER:
            case PLUS:
            case MINUS:
            answer = true;
            break;
            default:
            answer = false;

        }
        return answer;
    }

}


