package com.lambton;


public class LambtonStringTools {

    public String reverse(String s)
    {
        char[] s1= s.toCharArray();
        int j= s1.length;
        String reverse="";


        for(int i =j-1; i>=0; i--)
        {
           reverse+=s.charAt(i);
        }
        return reverse;
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




    public String replaceSubString(String s1, String s2, String s3)
    {
        String str = s1.toLowerCase();
        String second = s2.toLowerCase();
        String third =s3.toLowerCase();


     String[] arr = str.split(second);
        StringBuilder output = new StringBuilder();
        int i = 0;
        for (i=0; i < arr.length - 1; i++)
            output.append(arr[i]).append(third);
        output.append(arr[i]);
        if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + second))
            output.append(third);
        return output.toString();
    }







}
