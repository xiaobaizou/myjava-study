package lei_and_duixiang_01;
/*
   学生类
 */
public class Student {

    //    成员变量
    private String name;
    private int age;

//    提供get/set方法


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //    成员方法
    public void show(){
        System.out.println(name+","+age);
    }


}
