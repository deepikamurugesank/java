package com.kgfsl.app;
class Employee
{
    Integer id,age;
    String name;
    String des;
    String gender;
    public Employee(Integer id,Integer age,String name,String des,String gender)
    {
        this.id=id;
        this.age=age;
        this.name=name;
        this.des=des;
        this.gender=gender;

    }
    public void setId(Integer id)
    {
        this.id=id;
    }
    public Integer getId()
    {
        return id;
    }
     public void setAge(Integer age)
    {
        this.age=age;
    }
    public Integer getAge()
    {
        return age;
    }
     public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
     public void setDes(String des)
    {
        this.des=des;
    }
    public String getDes()
    {
        return des;
    }
     public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getGender()
    {
        return gender;
    }

    public String toString()
    {
        return "id"+this.id.toString()+"age"+this.age.toString() ;//+"name"+this.name.toString()+"gender"+this.gender.toString();
    }
    

}