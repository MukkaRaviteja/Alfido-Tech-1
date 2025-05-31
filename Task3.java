

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    String major;
    Student(String name, int age, String major) {
        super(name, age); 
        this.major = major;
    }

    
    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    @Override
    void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}


public class Task3 {
    public static void main(String[] args) {
        Person p = new Person("Alex", 40);
        Student s = new Student("Brian", 20, "Computer Science");
        Teacher t = new Teacher("Ms. Smith", 35, "Mathematics");

        System.out.println("== Person Info ==");
        p.displayInfo();

        System.out.println("\n== Student Info ==");
        s.displayInfo();

        System.out.println("\n== Teacher Info ==");
        t.displayInfo();
    }
}

