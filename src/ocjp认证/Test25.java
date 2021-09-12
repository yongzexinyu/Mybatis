package ocjp认证;

import com.hp.util.Person;

public class Test25 {
    String name;
    int age = 25;

    public Test25(String name) {
       // this();                                  //line n1
        setName(name);
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

    public Test25(String name, int age) {
        this(name);                            //line n2
        setAge(age);
    }

    //setter and getter methods go here

    public String show() {
        return name + " " + age;
    }
    public static void main(String[] args) {
        Test25 p1 = new Test25("Jesse");
        Test25 p2 = new Test25("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }

}
