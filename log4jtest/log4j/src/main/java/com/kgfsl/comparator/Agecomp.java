package com.kgfsl.comparator;
import java.util.Comparator;
public class Agecomp implements Comparator<Studentpojo>
{

public int compare(Studentpojo s1,Studentpojo s2)
{   if(s1.age==s2.age)
    {
        return 0;
    }
    else if(s1.age>s2.age)
    {
        return 1;
    }
    else
    {
        return -1;
    }
    }
}
