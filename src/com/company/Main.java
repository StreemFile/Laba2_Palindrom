package com.company;

public class Main {

    public static String removeAndLower(String sentence){
        String palindrome="";
        for (int i = 0; i < sentence.length(); i++)
        {
            if(Character.isLetter(sentence.charAt(i)))
            {
                palindrome +=sentence.charAt(i);
            }
        }
        palindrome = palindrome.toLowerCase();
        return palindrome;
    }
    public static void main(String[] args) {
        String sentence = "«Мило, — Галина до Данила, — голим!»";
        String palindrome=removeAndLower(sentence);
        boolean isPalindrome = true;
        for (int i = 0; i<palindrome.length()/2; i++)
        {

            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1))
            {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? sentence + " - паліндром." : sentence + " - не паліндром");

        //2 спосіб
        sentence = "Ущипне — та шатен: пищу!";
        palindrome=removeAndLower(sentence);
        String reversedPalindrome = "";
        for (int i = palindrome.length()-1; i >=0; i--)
        {
            reversedPalindrome += palindrome.charAt(i);
        }
        System.out.println(palindrome.equals(reversedPalindrome) ? sentence + " - паліндром" : sentence + " - не паліндром");

        //3 спосіб
        sentence = "Dammit I'm Mad";
        palindrome=removeAndLower(sentence);
        StringBuilder reversedBuilderPalindrome = new StringBuilder();
        reversedBuilderPalindrome.append(palindrome);
        reversedBuilderPalindrome = reversedBuilderPalindrome.reverse();
        reversedPalindrome = reversedBuilderPalindrome.toString();
        System.out.println(palindrome.equals(reversedPalindrome) ? sentence + " - паліндром" : sentence + " - не паліндром");
    }
}
