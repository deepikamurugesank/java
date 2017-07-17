interface Messageable{  
    void getMessage(); 
    // Message gett();
}  
class Message{  
    public Message(){  
        System.out.print("hii");  
    }  
    static void msg(){
        System.out.println("this works");
    }
}  
public class constructorr {  
    static void msg1(){
        System.out.println("hello1");
    }
    public static void main(String[] args) {  
        Messageable hello =Message::msg; 
        //new Message().msg();
        Messageable hello1=constructorr::msg1; 
        hello.getMessage(); 
        hello1.getMessage(); 
      //  hello1.gett(); 
    }  
}  