package standard_class;

public class StudentDeno {
    public static void main(String[] args) {
//        无参构造方法创建对象后使用setxxx（）赋值
        Student s1=new Student();
        s1.setName("邹正");
        s1.setAge(21);
        s1.show();

//        使用带参构造方法直接创建带有属性值的对象
        Student s2=new Student("邹正",21);
        s2.show();
    }
}
