package com.kgfsl.app;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;
import java.lang.String.*;
public class EmployeePredicates
{
    public static Predicate<Employee> isAdultMale()
    {
        return p-> p.getAge() >30 && p.getGender().equalsIgnoreCase("M");
    }
      public static Predicate<Employee> isAdultFemale()
    {
        return p-> p.getAge() > 40&& p.getGender().equalsIgnoreCase("F");
    }
      public static Predicate<Employee> isAgeMoreThan(Integer age)
    {
        return p-> p.getAge() >age;
    }
public static List<Employee> FilterEmployee(List<Employee> Employees,Predicate<Employee> predicate)
{
    return Employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
}
}
