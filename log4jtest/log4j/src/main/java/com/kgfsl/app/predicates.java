package com.kgfsl.app;
import java.util.function.Predicate;
public class predicates
{
    public static void main(String args[])
    {
        Predicate<Integer> p= s ->(s>18);
        System.out.println(p.test(10));
    }
}