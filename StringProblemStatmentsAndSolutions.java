import java.util.Arrays;

public class HelloWorld
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

/*
//      Question-2 : Java Program to Print duplicate characters from a String
        String input = "How many duplicates are there?";
        System.out.println("Input : " + input);
        
        String output = printDuplicateCharactersFromString(input);
        System.out.println("Output : " + output);
*/

/*
//      Question-3 : Java Program to check if two String are anagram or not
        String input1 = "silent";
        String input2 = "listen";
        checkStringsAreAnagramOrNot(input1, input2);
*/

/*
//      Question-4 : Java Program to reverse a String by using recursion
        String input = "listen";
        System.out.println("INPUT : " + input);

        String output = reverseString(input);
        System.out.println("OUTPUT : " + output);
*/


//      Question-5 : Java Program to check if a String contains only digits
        String input = "Abc1233";
        System.out.println("INPUT : " + input);

        if(onlyDigits(input))
            System.out.println("ONLY digit present");
        else
            System.out.println("NOT ONLY digit present");
    }
     
    public static boolean onlyDigits(String input)
    {
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57)
                return true; 
            else
                return false; 
        } 

        return false; 
    } 
    
    public static String reverseString(String input)
    {
        if (input.isEmpty())
         return input;

        //Calling function recursively
        return reverseString(input.substring(1)) + input.charAt(0);
    } 
    
    public static String inPlaceStringReverse(final String input)
    {
        int length = input.length();
        String output = "";

        for(int i = length-1; i>=0; --i)
            output = output + input.charAt(i);

        return output;
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
    
    public static void checkStringsAreAnagramOrNot(final String input1, final String input2)
    {
/*
        approach-1 : sorting both the String and comparing each element of the String | complexity O(N LongN)

        approach-2 : using 2 hash function | Time complexity O(N)
        
        approach-3 : using single hash function | Time complexity O(N) , Space Complexity O(size of alphabates)
*/
        if(input1.length() == input2.length())
        {
            char c1[] = input1.toCharArray();
            char c2[] = input2.toCharArray();
            
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            if(Arrays.equals(c1,c2))
                System.out.println("\nStrings are Anagram");
		    else
			    System.out.println("\nStrings are not Anagram");
        }
    }
}