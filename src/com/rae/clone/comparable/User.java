package com.rae.clone.comparable;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class User implements Comparable<User>{
    private String name;
    private int age;
    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(User o) {
        // TODO Auto-generated method stub
        int i=	Integer.valueOf(this.age);
        int	j=Integer.valueOf(o.age);
        if(i<j){
            return -1;
        }else if(i>j){
            return 1;
        }else{
            return 0;
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
