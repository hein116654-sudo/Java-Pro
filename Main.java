
class Student {
    String name; // (A) Class 's Variable

    Student(String name) {
        name = name;
    }

    void showName() {
        System.out.println("Name is: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mg Mg");
        s1.showName();
    }
}