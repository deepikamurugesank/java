package com.kgfsl.app;
import java.lang.*;
interface MathOperation {
      int operation(int a, int b);
   }
   public class Sample1 {
   public static void main(String args[]){
      //Java8Tester tester = new Java8Tester();
		
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
   }
   }