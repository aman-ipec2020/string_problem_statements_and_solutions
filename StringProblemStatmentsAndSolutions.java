public class StringProblemStatementsAndSolutions
{
    public static void main(String []args)
    {
/*
//      Question-1 : Java Program to Reverse a String in Place
        String input = "Kanupriya";
        System.out.println("Input : " + input);
        
        String output = inPlaceStringReverse(input);
        System.out.println("Output : " + output);
*/

//      Question-2 : Java Program to Print duplicate characters from a String
        String input = "How many duplicates are there?";
        System.out.println("Input : " + input);
        
        String output = printDuplicateCharactersFromString(input);
        System.out.println("Output : " + output);
    }
     
    public static String printDuplicateCharactersFromString(final String input)
    {
        int length = input.length();
        
        String characters = "";
        String duplicates = "";

        for(int i = 0; i<length-1; i++)
        {
            String current = Character.toString(input.charAt(i));
            if(characters.contains(current))
                if(!duplicates.contains(current))
                    duplicates += current + ","; 
            
           characters += current;
        }
        return duplicates;
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