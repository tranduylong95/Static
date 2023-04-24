package refactoring;
import java.util.ArrayList;
import java.util.LinkedList;

public class A {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        LinkedList<String> studentList=new LinkedList<String>();
        studentList.add("Long");
        studentList.add("Hồng");

        System.out.println(studentList.lastIndexOf("Long"));
        list.add("Sơn");
        list.add("Long");
        list.add("Long");
        list1.add("Long");
        list.get(1);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println("Danh sách sinh viên:");
        for (String name : list) {
            System.out.println(name);
        }
    }
}
