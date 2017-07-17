package com.kgfsl.Streams;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Streamex {
  public static void main(String[] args) {
    Stream<Integer> s = Stream.of(3,4);
    //s.Stream().mapToInt(n->n);
//int[] a=s.mapToInt(n->n).toArray();
  Double o =  s.collect(Collectors.averagingInt(n->(n)));
//int[] a=s.mapToInt(n->n).toArray();
    System.out.println(o);
  }
}