
    public class Voter {
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    
    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter("V001", "Sri", 20);
            System.out.println(" ID: " + voter1.getVoterId() +",Voter created: " + voter1.getName()  + ", Age: " + voter1.getAge());
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating voter: " + e.getMessage());

            Voter voter2 = new Voter("V002", "Bob", 16); 
            System.out.println("Voter created: " + voter2.getName() + ", Age: " + voter2.getAge());
        } catch (Exception e) {
            System.err.println("Error creating voter: " + e.getMessage());

        } 
        }
    }
        
    

