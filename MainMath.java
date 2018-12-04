
/**
 * Class MainMath, Main class for the Math class
 *
 * @author Mert Bekdemir
 * @version 1409
 */
public class MainMath
{
    
    public static void main(String[] args) {

        
        
        Math firstInstance = new Math(5,6);
        Math secondInstance = new Math(2,0);
        
        
        firstInstance.divide(10,2);
        firstInstance.max(5,8);
        firstInstance.remainder(10,3);
        firstInstance.triple(3);
        firstInstance.isValidOperation("%");
        
        secondInstance.divide(10,0);
        secondInstance.max(4,3);
        secondInstance.remainder(9,3);
        secondInstance.triple(4);
        secondInstance.isValidOperation("5");
        
        
        
    }
    
    
    
    
    
    
    
    
}




