// Java program to reverse a string using For loop

import java.lang.*;

import java.io.*;

import java.util.*;

class strReverse {

    public static void main(String[] args)

    {

    String stringInput = "My New String";  

    //Get the String length

    int iStrLength=stringInput.length();    

    //Using For loop

for(iStrLength=stringInput.length();iStrLength >0;-- iStrLength)

{

System.out.print(stringInput.charAt(iStrLength -1)); 

}

    }

}

