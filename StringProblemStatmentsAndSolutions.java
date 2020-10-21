public class StringProblemStatementsAndSolutions
{
    public static void main(String []args)
    {
//      Question-1 : Java Program to Reverse a String in Place
        String input = "Kanupriya";
        System.out.println("Input : " + input);
        
        String output = inPlaceStringReverse(input);
        System.out.println("Output : " + output);
    }
     
    public static String inPlaceStringReverse(final String input)
    {
        int length = input.length();
        String output = "";

        for(int i = length-1; i>=0; --i)
            output = output + input.charAt(i);

        return output;
    }
}