import java.util.function.Consumer;
interface Sayable{  
    void say();  
    //public  void saySomething();
}  
public class instance {
    public static void main(String[] args) {  
       instance methodReference = new instance();   
        
            Sayable sayable =new Sayable(){
               public void say(){
                    System.out.println("helloo guys");
                }
                public  void saySomething(){  
                    System.out.println("Hello, this is non-static method.");  
                    }  
            };
          
            sayable.saySomething();  
            
           // Sayable sayable2 = new instance()::saySomething;  
           
           // sayable2.say();  
    }  
}  