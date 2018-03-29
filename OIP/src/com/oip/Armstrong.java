package com.oip;

public class Armstrong {

    public static void main(String[] args) {

        int number = 153;
        System.out.println("The Given Number is Armstrong : " + isArmstrong(number));
    }

    static boolean isArmstrong(int number){

        int n = numberOfDigits(number);
        int temp = number, sum=0;

        while(temp!=0){
            int r = temp%10;
            sum = sum + power(r,n);
            temp = temp/10;
        }
        return (sum ==  number);
    }

    //Function to Calculate X Raised to the Power
    static int power(int x, int y){
        if(y==0)
            return 1;
        if(y%2==0)
            return power(x,y/2)*power (x, y/2);
        return x * power(x,y/2)*power (x, y/2);
    }

    static int numberOfDigits(int number){
        int n = 0;

        while(number !=0){
            n ++;
            number = number/10;
        }
        return n;
    }
}
