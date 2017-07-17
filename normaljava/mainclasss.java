//package com.kgfsl.app;
class A{
    final void foo(){ System.out.println("foo ver 1 from class A"); }
    final void foo(int a){ 
         a=10;
        System.out.println("foo ver 2 from class A"+a); }
    }


class B extends  A{
    void foo(long l){ System.out.println("foo ver 3 from class B"); }
    // final void foo(){ System.out.println("foo ver 1 from class A"); } NOT ALLOWED
}

public class mainclasss {    
    public static void main(String [] args){
        B obj = new B();

        obj.foo();
        obj.foo(1);
        obj.foo(1L);
    }   
}