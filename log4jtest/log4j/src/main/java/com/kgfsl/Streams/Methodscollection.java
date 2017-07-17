package com.kgfsl.Streams;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.kgfsl.Streams.Allmethodscollections.Dept;

import java.util.*;

class Allmethodscollections
{
public static enum Dept{
    ECE,MCA;
}

    int id;
    String name;
    Dept dept;
    LocalDate dob;
    double income;
public Allmethodscollections(int id,String name,Dept dept,LocalDate dob,double income)
{
    this.id=id;
    this.name=name;
    this.dept=dept;
    this.dob=dob;
    this.income=income;
}
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setIncome(double income)
    {
        this.income=income;
    }
    public double getIncome()
    {
        return income;
    }
    public boolean isECE() {
    return this.dept == Dept.ECE;
  }

  public boolean isMCA() {
    return this.dept == Dept.MCA;
  }
    public Dept getDept()
    {
        return dept;
    }
    public static List<Allmethodscollections> person(){
        Allmethodscollections p1=new Allmethodscollections(1,"brighty",Dept.MCA,LocalDate.of(1996,Month.FEBRUARY, 25),70000);
         Allmethodscollections p2=new Allmethodscollections(2,"deeps",Dept.ECE,LocalDate.of(1993,Month.DECEMBER, 20),80000);
          Allmethodscollections p3=new Allmethodscollections(3,"kumar",Dept.MCA,LocalDate.of(1997,Month.MARCH, 27),90000);
           Allmethodscollections p4=new Allmethodscollections(4,"tiny",Dept.ECE,LocalDate.of(1992,Month.JANUARY, 11),60000);
            Allmethodscollections p5=new Allmethodscollections(5,"sathish",Dept.MCA,LocalDate.of(1993,Month.AUGUST, 13),100000);
            List<Allmethodscollections> person=Arrays.asList(p1,p2,p3,p4,p5);
            return person;
    }
    

}
class Methodscollection 
{
    public static void main(String args[])
    {
 Map<String,Dept> sa=Allmethodscollections.person()
            .stream().filter(Allmethodscollections::isMCA).collect(Collectors.toMap(Allmethodscollections::getName,Allmethodscollections::getDept)); 
            System.out.println(sa);
          
                                             
    }
}


    

