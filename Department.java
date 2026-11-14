public class Department {
    private String name;
    private Professor [] professor;   // Fixed-size array 
    private int professorCount;
    
    //Department Constructor
    //Aggregation relationship between Department and Professor
    public Department(String name, int capacity) {
        this.name = name;
        this.professor = new Professor[capacity];
        this.professorCount=0;
    }
    
    //Setter and Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Add Professor Method
  /* The relationship between Professor and Departtment is Aggregation because we itialize the Professor objects 
  separately not inside Department constructor . That means that they have a weak relationship and any other
  object from another class can use the professor objects.So, if we destroyed the Department class, the professor 
  objects will not be affected by this step and will continue working. */
    public boolean addProfessor(Professor prof){
         if(professorCount<professor.length){
                    professor[professorCount]= prof;
                    System.out.println("Professor is added successfully");
                    professorCount++;
                    return true;
            } else if (professorCount==professor.length){
                System.out.println("Sorry the Department is full");
        }
        return false;
    }
    
    // Remove Professor Method
    public boolean removeProfessor(int professorId){
        for(int i= 0; i<professor.length; i++){
            if(professor[i]!=null&& professor[i].getId()==professorId){
                for(int a=i; a<professorCount-1;a++){
                    professor[a]=professor[a+1];
                }
                professor[professorCount -1] = null;
                professorCount--;
                System.out.println("The Professor is removed successfully");
                return true;
            }
        }
                System.out.println("The Professor you want to remove is not founded in the list");
                return false;
    }
    
    // DisplayDepartmentInfo
    public void displayDepartmentInfo(){
        System.out.println("Department{"+ " name: "+this.getName()+", Professor count: "+this.professorCount+" }");
        if(professorCount==0){
            System.out.println(" No Professor added.");
        }
        for(int i=0; i<professorCount;i++){
            professor[i].displayProfessorInfo();
            System.out.println(" ");
        }
            System.out.println(" ");
    } 
}