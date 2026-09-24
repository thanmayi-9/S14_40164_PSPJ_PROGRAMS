public class Student {
    String name;
    int id;
    String branch;
    Student(String name,int id,String branch){
        this.name = name;
        this.id = id;
        this.branch = branch;

    }
    void display(){
        System.out.println("Student name = "+name);
        System.out.println("ID number = "+id);
        System.out.println("Branch = "+branch);
    }
  
    public static void main(String[] args){
        Student s1 = new Student(
            "Rahul",
            101,
            "CSE"
        );
        Student s2 = new Student(
            "Anjali",
            102,
            "ECE"
        );
        s1.display();
        System.out.println();
        s2.display();
    
    }
}


    

