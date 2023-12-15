package Calculator;

/**
 * The class contains methods of arithmetic operators
 * Addition, Subtraction, Multiplication, Division
 *  */

public class NCArOperations {
    /**
     * Variables double a,b
     * a first input from the user
     * b second input from the user
     */
    public double a;
    public double b;

    //The variable options stores the selected number from the user which represent the method of calculation
    public int options;


    //Setting up the calculation methods
    /**
     * The command add
     * Addition of variable a,b
     * @return The sum/total of a,b
     */
    public double add()
    {
        return a + b;
    }

    /** The command subtract
     * Subtraction of variable a,b
     * @return The difference of a,b
     */
    public double subtract()
    {
        return a - b;
    }

    /**
     * The command multiply
     * Multiplication of variables a,b
     * @return The product of a,b
     */
    public double multiply()
    {
        return a * b;
    }

    /** The command divide
     * Division of variables a,b
     * @return The quotient of a,b
     */
    public double divide()
    {
        return a / b;

        }
    }











