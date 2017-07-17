package com.kgfsl.app;
import java.util.*;
import java.util.stream.*;
class stringg
{
    public static void main(String args[])
    {
       // Integer[] stringArr = { 1, 2, 3, 4 };
Stream<Integer> stream = Stream.of(1,2,3,4);
Integer[] arr = stream.toArray(Integer[]::new);
System.out.println(Arrays.toString(arr));
    }
}