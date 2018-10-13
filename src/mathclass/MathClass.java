
package mathclass;
import java.util.Scanner;
/**
 *
 * @author Talha Zubaer
 */
public class MathClass {

    double a,b;
    
    public static void main(String[] args) {
        
        System.out.println("Enter two Input");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        
        double max=Math.max(a, b);
        System.out.println("The max value is "+max);
        
        double min=Math.min(a, b);
        System.out.println("The min value is "+min);
        
        
        double round=Math.round(a);
        System.out.println("The round value of Input 1 is "+round);
        
        double rou=Math.round(b);
        System.out.println("The round value of Input 1 is "+rou);
        
    }
    
}
