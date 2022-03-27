package temp;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<>();

        Student s1=new Student("邹旭",21);
        Student s2=new Student("邹正",22);
        Student s3=new Student("邹飞翔",23);
        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }


    }

}
