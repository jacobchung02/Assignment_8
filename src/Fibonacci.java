public class Fibonacci 
{
    public static void main(String[] args) throws Exception 
    {
        if (args.length > 0) 
        {
            try 
            {
                int fibArg = Integer.parseInt(args[0]);  // Target Fibonacci number based on argument user gives.
                
                if (fibArg < 0)  // Fibonacci only works for non-negative integers. Handle as an error.
                {
                    System.err.println("Argument '" + args[0] + "' must be a positive integer.");
                    System.exit(1);
                }
                else
                {
                    // Initialize the first two terms and the variable that will store their sum.
                    int num1 = 0, num2 = 1, sum = 0;
                    
                    for (int i = 0; i < fibArg; i++)
                    {
                        num1 = num2;  // Swap the two terms.
                        num2 = sum;  // Set second term to sum from earlier.
                        sum = num1 + num2;  // Update the sum to the next value.
                    }
                
                    System.out.println(sum);  // Print final Fibonacci sum.
                }
            }       
            catch (NumberFormatException e)  // Handle non-integer arguments given by the user.
            {
            System.err.println("Argument '" + args[0] + "' must be an integer type.");
            System.exit(1);
            }
        }
    }
}
