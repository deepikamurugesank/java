package com.kgfsl.app;
import java .util.stream.*;
import java .util.*;
class Stream2array
{
    public static void main(String args[] )
    {
Stream<Integer> powerOfTen = Stream.of(1, 10, 100, 1000, 10000); 
Integer[] array = powerOfTen.toArray(size -> new Integer[size]);
 System.out.println(Arrays.toString(array));

    }

}