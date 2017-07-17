![alt](http://javadeveloperzone.com/wp-content/uploads/2017/06/JAVA-8-STREAM-COLLECT-EXAMPLE-600x400.jpg)
# Java 8 feature #
## Stream to arrayList Example:Using Stream Interface Methods
## _Description_

### This is one of the way to convert a Stream to array in Java 8.We first convert Stream to ArrayList and then convert that ArrayList to an array.

## Syntax
```
<R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
<R,A> R collect(Collector<?  super T,A,R> collector)
```
## Program
```sh
package com.kgfsl.app;
import java .util.stream.*;
import java .util.*;
//import java.lang.*;
public class Streamtocollect
{
    public static void main(String args[])
    {
        Stream<String> numbers = Stream.of("1", "22", "33", "44", "55","12","14");
         ArrayList<String> list =   numbers
                            .filter(s->s.startsWith("1"))
                            .limit(2)
                            .collect(Collectors.toCollection(ArrayList::new));
         
        System.out.println(list);


    }
}
```
## Output:
```
[ 1 , 12 , 14 ]
```
### The _collect()_ method is used to accumulate all elements of Stream into a Collection e.g. a list. Though, there is a method called _Collectors.toList()_ which converts Stream to List, it doesn't provide any guarantee about the type of list returned by this method. Instead, by using _Collectors.toCollection()_ you can convert it into any specific Collection e.g. ArrayList. 


