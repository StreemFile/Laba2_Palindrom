package com.company;

public class Main {

    public static void main(String[] args) {
        String sentence = "«Мило, — Галина до Данила, — голим!»";
        String palindrome="";
        for (int i = 0; i < sentence.length(); i++)
        {
            if(Character.isLetter(sentence.charAt(i)))
            {
                palindrome +=sentence.charAt(i);
            }
        }
        palindrome = palindrome.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i<palindrome.length()/2; i++)
        {

            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1))
            {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
        {
            System.out.println(sentence + " - паліндром.");
        }
        else
        {
            System.out.println(sentence + " - не паліндром");
        }
    }
}
