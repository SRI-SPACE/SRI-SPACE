public class Main {
    private String name;
    private int age;

    
    public Main() {
        this.age = 18;
    }

    
    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void displayPerson() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args){
        Main person1 = new Main("sri",18); 
         

        person1.displayPerson();
        
    }
}