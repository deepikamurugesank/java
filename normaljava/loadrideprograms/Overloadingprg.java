class prg
{
    String name,collage;
    int age;
    void person()
    {
        System.out.println("person name");
    }
    void person(int age,String collage)

    {
        System.out.println("age"+age+"collage"+collage);
    }
   
}
class Overloadingprg extends prg
{   void base()
    {
        super.person();
    }
    void person()
    {   
        System.out.println("overriding method");
    }
     public static void main(String arg[])
    {
     Overloadingprg ob=new  Overloadingprg();
        ob. person();
        ob.person(23,"sona");
        //ob.person("brightz");
        ob.base();
    }

    
} 