package com.oip;

public class Palindrome {

    public static void main(String[] args){
        System.out.println("Executing");

        System.out.println("Palendronme " + isPalindrome("12321"));

        System.out.println("Palendronme " + isPalindromeOne("12321"));
    }

    //Using StringBuilder or String Buffer
    static boolean isPalindrome(String orginalString){

        String reverseString = "";

        StringBuilder str = new StringBuilder();
        str.append(orginalString);
        reverseString = str.reverse().toString();

        if(orginalString.equals(reverseString)){
            return true;
        }

        return false;
    }

    //Without Using StringBuilder or String Buffer
    static boolean isPalindromeOne(String originalString){

        int length = originalString.length();

        int begin = 0;
        int i;
        int end = length -1;
        int middle = (begin+end)/2;

        for(i= begin;i<=middle;i++){
            if( originalString.charAt(begin)==originalString.charAt(end)){
                begin ++;
                end --;
            }
            else{
                break;
            }
        }

        if(i == middle +1){
            return true;
        }

        return false;
    }
}
