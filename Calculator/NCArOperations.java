package Calculator;

/** The NumberCruncherEncapsulation class encapsulates the calculator's state (operands)
 * and behavior (addition, subtraction, multiplication, and division).
 * NumberCruncher Arithmetic Operations
 * Setting up the (arithmetic) Objects  and their methods
 *  */

public class NCArOperations {

    //Variables of the first/second input (number) from the user
    public double a;
    public double b;

    //Arithmetic calculation option number
    public int options;

    //Setting up the Object addition
    public double addition()
    {
        return a + b;
    }
    //Setting up the Object subtraction
    public double subtraction()
    {
        return a - b;
    }

    //Setting up the Object multiplication
    public double multiplication()
    {
        return a * b;
    }
    //Setting up the Object division
    public double division()
    {
        return a / b;
    }









}
