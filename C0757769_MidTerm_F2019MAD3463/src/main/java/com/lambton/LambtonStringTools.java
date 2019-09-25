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
        initials+=parts[parts.length-1];
        return(initials);
    }


    public char mostFrequent(String s)
    {
        char[] s1= s.toCharArray();
        int count=0;
        int max=0;
        char ctmp = 0;

        for (int i=0;i<= s1.length-1;i++)
        {
    
            char ch= s.charAt(i);
            for(int j=i+1;j<=s1.length-1;j++)
            {
                char ch1= s.charAt(j);
                if (ch==ch1)
                {
                    count++;
                }
            }
            int temp;
            if (count > max)
            {
               max=count;
               ctmp=ch;
            }
        }
        return ctmp;
    }



    public String replaceSubstring(String s, String s1, String s2)
    {
        String[] parts = s.toLowerCase().split(" ");
        String s1t= s1.toLowerCase();
        String s2t= s2.toLowerCase();

        for(int i =0; i<parts.length;i++)
        {
            
           // if(s1t.equals(parts[i]))
           // {
             //   parts[i]=s2t;
           // }
        }
        String st = parts.toString();
        return st;
    }







}
