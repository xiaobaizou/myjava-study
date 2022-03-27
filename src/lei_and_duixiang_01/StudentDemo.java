package lei_and_duixiang_01;

public class StudentDemo {
    public static void main(String[] args) {
//        创建对象
        Student s = new Student();

//        给变量赋值
        s.setName("zouzheng");
        s.setAge(21);

//        调用show方法
        s.show();
        System.out.println(s.getAge()+"---"+s.getName());
    }
}
