package OOPs;

class Student {
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    Student(String name) { // parameterized constructor
        this.name = name;
    }

    // Student(Student s1) { // shaloow copy constructor
    // marks[] = new int[3];
    // this.name = name;
    // this.roll = roll;
    // this.marks = s1.marks;
    // }

    Student(Student s1) { // deep copy constructor
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}

public class Coustructor {
    public static void main(String[] args) {
        Student s1 = new Student("jagjeet");
        s1.name = "jagjeet";
        s1.roll = 121;
        s1.password = "abcdsre";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "abcd";
        s1.marks[2] = 46;
        System.out.println(s1.marks[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
