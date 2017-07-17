package com.kgfsl.app;
import java.util.*;

import java.util.function.Predicate;
public class TestEmployeePredicates
{
    public static void main(String args[])
    {
        Employee e1=new Employee(1,23,"deepika","SE level1","F");
         Employee e2=new Employee(2,22,"Brighty","SE level2","F");
          Employee e3=new Employee(3,25,"sheba","SE","F");
           Employee e4=new Employee(4,67,"tiny","SE","F");
            Employee e5=new Employee(5,34,"franklin","SE","M");
             Employee e6=new Employee(6,54,"murugesan","SE","M"); 
             Employee e7=new Employee(7,35,"Tamilarasi","SE","F");
             List<Employee> employeelist=new ArrayList<Employee> ();
              employeelist.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7}));
              EmployeePredicates ep=new EmployeePredicates();
                
        System.out.println(ep.FilterEmployee(employeelist,ep.isAdultMale()));
         
        System.out.println(ep.FilterEmployee(employeelist,ep. isAdultFemale()));
         
        System.out.println(ep.FilterEmployee(employeelist, ep.isAgeMoreThan(35)));
         
        
        System.out.println(ep.FilterEmployee(employeelist, ep.isAgeMoreThan(10).negate()));


    }
}