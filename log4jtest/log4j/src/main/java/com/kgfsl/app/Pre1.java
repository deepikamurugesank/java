package com.kgfsl.app;
import java.util.function.Predicate;
public class Pre1
{
static boolean checkage(int a)
{
if(a>17)
return true;
else
return false;
} 
public static void main(String ar[])
{
    Predicate<Integer> pr=Pre1::checkage;
    boolean r=pr.test(45);
    System.out.println(r);
}
}