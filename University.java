public class University{
    private String name;
    private Department[] dep;
    
    //University Constructor
  /* The relationship between Departtment and University is Composition because we itialize the Department objects 
  inside University constructor not sparately.That means that they have a strong relationship and any other
  object from another class can not use the Departments objects.So, if we destroyed the University class, the Department 
  objects will be affected by this step and wont continue to exist. */  
    public University(String nameUni, String[] nameDep, int capacityProf) {
        this.name = nameUni;
        this.dep = new Department[nameDep.length];
        for(int i = 0; i<nameDep.length; i++){
            this.dep[i]= new Department(nameDep[i], capacityProf);
        }
    }
    // Setter and Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //GetDepartment Method
    public Department getDepartment(int index){
        if(index>=0&&index<dep.length){
            return dep[index];
        }
        return null;
    }
    
    //DisplayUniversityInfo Method
    public void displayUniversityInfo() {
        System.out.println("University{" + " name: " + name+"}");
        for(int i=0; i<dep.length; i++){
            dep[i].displayDepartmentInfo();
            System.out.println(" ");
        }
   
    }
}