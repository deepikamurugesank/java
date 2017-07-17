import java.util.function.Predicate;  
public class Hello {  
    static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
   
    public static void main(String[] args){  
      
        Predicate<Integer> predicate =  Hello::checkAge;  
        
        boolean result = predicate.test(25);  
        boolean result1 = predicate.test(2);  
        System.out.println(result); 
           System.out.println(result1);
    }  
}  