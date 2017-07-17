package com.kgfsl.comparator;

import java.util.ArrayList;
import java.util.*;

class Maincomp
{
    public static void main(String args[])
    {
        List<Studentpojo> stud=new ArrayList<Studentpojo>();
        stud.add(new Studentpojo("Deepika",18,23));
            stud.add(new Studentpojo("brights",183,21));
                stud.add(new Studentpojo("tiny",185,25));
                    stud.add(new Studentpojo("sheba",234,23));
                        stud.add(new Studentpojo("shanthi",24,25));
                        System.out.println("Sorting by name");
                        Collections.sort(stud,new Namecomp());
                        for(Studentpojo n:stud)
                        {
                            System.out.println(n.name+" "+n.rollno+" "+n.age);
                        }
                         System.out.println("Sorting by age");
                        Collections.sort(stud,new Agecomp());
                        for(Studentpojo m:stud)
                        {
                            System.out.println(m.name+" "+m.rollno+" "+m.age);
                        }
    }
}