package student_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
//        创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();

        while (true) {
//主界面编写
            System.out.println("========欢迎来到学生管理系统========");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

//        用scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

//        用switch语句完成操作的选择
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//JVM退出
            }
        }
    }

//    定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String adress = sc.nextLine();

//        创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(adress);

//        将学生对象添加到集合中
        array.add(s);

//        给出添加成功提示
        System.out.println("添加学生成功");

    }

//    定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array){
//        显示表头信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t\t"+s.getAddress());
        }

    }

//    定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生的学号");
        String sid = sc.nextLine();

        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                array.remove(i);
                break;
            }
        }

        System.out.println("删除学生成功");

    }

//    定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生的学号");
        String sid = sc.nextLine();

        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String adress = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(adress);

        for(int i=0;i<array.size();i++){
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改学生成功");
    }


}
