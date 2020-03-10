
package calpack;


public class AppMain {


    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        try
        {
        System.out.println(c.multiply(10, 10));
        System.out.println(c.divide(10, 0));
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        finally
        {
            System.out.println("System.out.println");
        }
    }
}

