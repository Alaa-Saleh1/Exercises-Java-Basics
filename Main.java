import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        /* Ex1. Develop a program that takes the weight (in kilograms) and height (in meters)
           as input and calculates the BMI, then prints it. */


//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
//        System.out.print("Welcome "+name+" enter your Weight (kg) and Height (m)" +
//                " to calculate your BMI. \nWeight: ");
//        double weight = input.nextDouble();
//        System.out.print("Height: ");
//        double height = input.nextDouble();
//
//        double calBMI = weight /(height * height) ;
//
//        System.out.printf("%s your BMI is : %.2f",name,calBMI);
//
//


       /* Ex2. Write a program that takes the obtained marks and total marks as input and
          calculates the percentage, then prints it.*/


//        System.out.println("Please enter the obtained marks: ");
//        double mark = input.nextDouble();
//        System.out.println("Enter total grades: ");
//        double total = input.nextDouble();
//
//        double obtMark = (mark / total) * 100;
//
//        System.out.printf("Percentage = %.1f%%", obtMark);



        /* Ex3.Create a program that takes an amount in one currency and an exchange rate
           as input, then converts and prints the amount in another currency.*/

//        System.out.println("Please enter the amount in USD= ");
//        double amountUSD = input.nextDouble();
//        System.out.println("Enter Exchange Rate (USD to EUR)= ");
//        double exRate = input.nextDouble();
//        double amountEUR = amountUSD * exRate ;
//
//        System.out.printf("Amount in EUR = %.1f",amountEUR);


        /* Ex4. Create a program that takes a string as input, calculates its length, and then
           reverses the string using the StringBuilder class, finally printing both the length and
                reversed string. */

//        System.out.println("Please, enter string: ");
//        String theString = input.nextLine();
//
//        StringBuilder reverseString= new StringBuilder(theString);
//
//        System.out.printf("Length of the string: %d And Reversed string: %s" ,theString.length(),reverseString.reverse());
//

        /* Ex5. Develop a program that takes a sentence as input and extracts a substring from
           it, then prints the extracted substring.*/

//        System.out.println("Please, write a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println("Enter start index: ");
//        int startIndex = input.nextInt();
//        System.out.println("Enter end index: ");
//        int endIndex = input.nextInt();
//
//        System.out.printf("%s", sentence.substring(startIndex,endIndex));



       /* Ex6 Write a program that takes a sentence and a keyword as input, then check if
          the keyword is present in the sentence and prints the result.*/

//        System.out.println("Please, write a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println("Enter Keyword: ");
//        String keyword = input.nextLine();
//
//        boolean isPresent = sentence.contains(keyword);
//        System.out.printf("keyword \" %s \" is %s in the sentence.", keyword,(isPresent ? "present":"not present"));




        /*Ex7. Develop a program that takes a sentence and a word to replace as input, then
          replace all occurrences of the word with another word and prints the modified
               sentence.*/

//        System.out.println("Please, write a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println("Word to replace? ");
//        String wordReplase = input.nextLine();
//        System.out.println("Word to Replacement? ");
//        String replacement = input.nextLine();
//
//        String reSentence = sentence.replace(wordReplase, replacement);
//
//        System.out.println("\""+reSentence+"\"");


        /* Ex8. Write a program that takes two strings as input and check if they are equal,
           ignoring the case, then prints whether they are equal or not.*/

//        System.out.println("Please, write a first String: ");
//        String firstString = input.nextLine();
//        System.out.println("Write a second String: ");
//        String secondString = input.nextLine();
//
//        boolean isEqual = firstString.equalsIgnoreCase(secondString);
//        System.out.printf("Strings are %s .",(isEqual ? "equal" : "not equal"));



    }
}