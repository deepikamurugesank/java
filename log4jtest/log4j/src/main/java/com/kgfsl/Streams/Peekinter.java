package com.kgfsl.Streams;
import java.util.stream.Stream;
import java.util.*;
//ww w  . j a v a 2  s  .co  m
public class Peekinter {
  public static void main(String[] args) {
    int sum = Stream.of(1, 2, 3, 4, 5)
        .peek(e -> System.out.println("Taking integer: " + e))
        .filter(n -> n % 2 == 1)
        .peek(e -> System.out.println("Filtered integer: " + e))
        .map(n -> n * n).peek(e -> System.out.println("Mapped integer: " + e))
        .reduce(0, Integer::sum);
    System.out.println("Sum = " + sum);

  }
}