package com.ak.learning.codechef;

import java.util.Scanner;

public class PlayPiano {
    public  static  void main(String args[])
    {
        Scanner read= new Scanner(System.in);
        String input= read.nextLine();
        boolean isvalid = isvalidInput(input);

        if (isvalid)
        {
            System.out.println("PlayPiano is proper way");
        }
        else
        {
            System.out.println("PlayPiano is  not proper way");
        }
    }

    private static boolean isvalidInput(String inputString) {
        if(inputString.length()%2!=0)
        {
            return false;
        }
            for (int i = 0; i < inputString.length(); i += 2) {
                if (inputString.charAt(i) == inputString.charAt(i + 1))
                   return  false;
                    }
            return  true;
    }

}
