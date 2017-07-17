import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.*;
import java.util.function.Consumer;
import java.util.*;

class ConsumerDemo
{
public static void main(String[] args) {
List<Integer> list=new ArrayList<Integer>();

list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);


list.forEach(new Consumer<Integer>()
{
public void accept(Integer t)
{
System.out.println("list value"+t);
if(t==5)
list.add(11);
}
}
);
 /*Iterator<Integer> iterator=list.iterator();
 while(iterator.hasNext())
 {
 int l=iterator.next();
 System.out.println(l);
 if(l==5)

 list.add(11);
 }*/




}



}