package com.lambton;


public class LambtonStringTools {

    public void reverse(String s)
    {
        char[] s1= s.toCharArray();
        int j= s1.length;

        for(int i =j-1; i>=0; i--)
        {
            System.out.print(s1[i]);

        }

    }

    public int binarytoDecimal(String s)
    {
        int i = Integer.parseInt(s,2);
        return i;

    }




}
