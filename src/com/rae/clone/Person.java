package com.rae.clone;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/10/31
 * @since 1.0.0
 */
public class Person  implements Cloneable{
    private int age;
    private String name;

    public Person(){}
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int  get()
    {
        try
        {
            return 1 ;
        }
        finally
        {
            return 2 ;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
