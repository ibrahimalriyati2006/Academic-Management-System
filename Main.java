import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //Assign University Name
        System.out.println("Write the name of the university: ");
        String uniName = scanner.nextLine();
        
        //Assign Number of Department
        System.out.println("Enter the number Departments: ");
        int n= scanner.nextInt();
            while(n<2){
            System.out.println("Please Change the number of department to be at least 2 or above");
            n=scanner.nextInt();
        }
            scanner.nextLine();
            
        //Assign Names of the Departments
        String[] depNames = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of department "+(i+1)+": ");
            depNames[i]=scanner.nextLine();
        }
        
        //Assign number of professor for each department
        System.out.println("Enter the professor capacity for each department: ");
        int m= scanner.nextInt();
        while(m<3){
            System.out.println("Please enter another number to be at least 3 or more");
            m=scanner.nextInt();
        }
        
        //Initializ an object from University claa
        University university = new University(uniName, depNames,m);
  
        Department IT = university.getDepartment(0);
        Department Mathemathices = university.getDepartment(1);
        
        // Inialize five professores 
        Professor f1= new Professor(100,"Ahmad", "AI");
        Professor f2= new Professor(200,"Sami", "FrontEnd");
        Professor f3= new Professor(300,"Ali", "BackEnd");
        Professor f4= new Professor(400,"Alaa", "Algebra");
        Professor f5= new Professor(500,"Fares", "Calculas");
        
        // Add professors to IT
        IT.addProfessor(f1);
        IT.addProfessor(f2);
        IT.addProfessor(f3);
        
        //Add professor to Mathemathics
        Mathemathices.addProfessor(f4);
        Mathemathices.addProfessor(f5);
  
        university.displayUniversityInfo();
        
        // Add a professor in a full department
        IT.addProfessor(f5);
        System.out.println();
        
        //Remove a professor from the IT department
        IT.removeProfessor(200);
        IT.displayDepartmentInfo();
        
        //Invaild Removal
        Mathemathices.removeProfessor(600);
        scanner.close();
    }
}