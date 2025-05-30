import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Integer> studentGrades = new HashMap<>();


    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println(name + " added with grade: " + grade);
    }


    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name + " removed from the records.");
        } else {
            System.out.println(name + " not found in the records.");
        }
    }


    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            Integer grade = studentGrades.get(name);
            System.out.println("Grade for " + name + ": " + grade);
        } else {
            System.out.println(name + " not found in the records.");
        }
        }
public static void main(String[] args) {
    StudentGrades sg = new StudentGrades();

    sg.addStudent("Sri", 95);
    sg.addStudent("Ram", 88);
    sg.addStudent("Mani", 76);

    sg.displayStudentGrade("Sri");
    sg.displayStudentGrade("gd"); 

    sg.removeStudent("Ram");
    sg.displayStudentGrade("Ram"); 

}
    }
    
