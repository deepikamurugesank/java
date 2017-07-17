package com.kgfsl.app;
import java .util.stream.*;
import java .util.*;
class Objectarray
{
    public static void main(String args[] )
    {
        
        

Stream<String> loans = Stream.of("Car Loan", "Home Loan", "Personal Loan"); 
Object[] objectArray = loans.toArray(); 
System.out.println(Arrays.toString(objectArray));
    }

}