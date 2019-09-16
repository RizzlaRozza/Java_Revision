package javaapplication1;
import java.util.Random;
import java.util.*;

/**
 *
 * @author 18005152
 */
public class JavaApplication1 {

    public static void main(String[] args) 
    {
        String choice = "test";
       
        int card2;
        int card3;
        int total;
        
        double card1 = getRandomNumber();
        
        System.out.println(card1);
        
    }
    
    
    public static double getRandomNumber(double min, double max)
    {
        double x = (int)(Math.random()*((10-1)+1))+1;
        return x;
    }
    
}
