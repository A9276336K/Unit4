package Sprint2.Day1;

public class Student {

    int age;
    String name;

    String gender;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age=25;
        s1.name="Arshad";
        s1.gender="Male";
        System.out.println(s1.name+" "+s1.gender+" "+s1.age);
    }
}
