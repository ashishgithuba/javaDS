
    class Student {
        static String college = "The Oxford  College OF Enginnering"; 
        String name;
    
        Student(String name) {
            this.name = name;
        }
    
        void showDetails() {
            System.out.println(name + " studies at " + college);
        }
    }
    public class StaticMember {
        public static void main(String[] args) {
            Student s1 = new Student("Ashish");
            Student s2 = new Student("Ravi");
    
            s1.showDetails();  
            s2.showDetails();  
        }
    }
    

