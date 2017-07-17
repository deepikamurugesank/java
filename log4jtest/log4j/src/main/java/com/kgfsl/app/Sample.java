package com.kgfsl.app;
interface customer
{ 
    public String  getname(String n,String m);
}
 
 

class Sample
{
    public static String methodname(String name1,String name2)
    {
        String d=name1+name2;
        return d;
    } 
    public static void main(String args[])
    {
        String a="deepbrightZ";
        String b="dd";
       // customer i=(String s)->Sample.methodname(a);
          customer i=Sample::methodname;
       System.out.println( i.getname(a,b));
    }
}
 