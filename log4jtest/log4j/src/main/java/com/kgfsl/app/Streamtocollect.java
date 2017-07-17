package com.kgfsl.app;
import java .util.stream.*;
import java .util.*;
//import java.lang.*;
public class Streamtocollect
{
    public static void main(String args[])
    {
        Stream<String> numbers = Stream.of("1", "22", "33", "44", "55","12","14");
         ArrayList list = numbers.filter(s->s.startsWith("1")).limit(2). collect(Collectors.toCollection(ArrayList::new));
         
          System.out.println(list);


    }
}





/*Stream numbers = Stream.of(11, 22, 33, 44, 55); 
ArrayList list = numbers.collect(Collectors.toCollection(ArrayList::new));
Integer[] iArray = list.toArray(new Integer[list.size()]);


Read more: http://javarevisited.blogspot.com/2017/01/3-ways-to-convert-java-8-stream-to-array.html#ixzz4mbwYfETH*/