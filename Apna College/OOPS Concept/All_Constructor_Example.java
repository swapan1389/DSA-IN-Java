class Student{
    private String name;
    private String age;

    // Default Constructor
    public Student() {
        name="A";
        age="10";
    }

    // Parameterized Constructor
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo(){
        System.out.println("The student details are  "+"name: "+name+" age: "+age);
    }

}


public class All_Constructor_Example {

    public static void main(String[] args) {
        // Creating an object using default constructor
        Student s1 = new Student();
        s1.printInfo();
        // Creating an object using parameterized constructor
        Student s2 = new Student("Rahul", "20");
        s2.printInfo();
        // Creating an object using copy constructor
        Student s3 = new Student(s2);
        s3.printInfo();        }
}