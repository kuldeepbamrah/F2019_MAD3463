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



    public String getInitials(String s) {
        String initials="";
        String[] parts = s.split(" ");
        char initial;

        if(parts.length<3)
            return null;
        else
            for (int i=0; i<parts.length-1; i++){
                    initial=parts[i].charAt(0);
                    initials+=initial+".";

            }
        String s1= initials.toString();
        s1+=parts[parts.length-1].toString();
        return(s1);
    }






}
