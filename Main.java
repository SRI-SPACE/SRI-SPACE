

public class Main {class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}


class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}


class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        this.age = age;

        
        if (!name.matches("[a-zA-Z\\s]+")) { // Checks if name contains only letters and spaces
            throw new NameNotValidException("Name cannot contain numbers or special symbols.");
        }
        this.name = name;

        this.rollNo = rollNo;
        this.course = course;
    }

   
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
    }
}


public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Valid student
            Student student1 = new Student(101, "Alice Smith", 18, "Computer Science");
            System.out.println("Student created: " + student1);

            // Invalid age
            Student student2 = new Student(102, "Bob Johnson", 14, "Mathematics");
            System.out.println("Student created: " + student2); // This line will not be reached

        } catch (AgeNotWithinRangeException e) {
            System.err.println("Error creating student: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.err.println("Error creating student: " + e.getMessage());
        }

        try {
            // Invalid name
            Student student3 = new Student(103, "Charlie123", 20, "Physics");
            System.out.println("Student created: " + student3); // This line will not be reached

        } catch (AgeNotWithinRangeException e) {
            System.err.println("Error creating student: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.err.println("Error creating student: " + e.getMessage());
        }
    }
}
    
}
