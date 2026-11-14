public class Professor{
    private int id;
    private String name;
    private String specialization;
    
    //Professor Constructor
    public Professor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;    
    }
    
    // Setter and Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    // DisplayProfessor Method
    public void displayProfessorInfo() {
        System.out.print("Professor{" + "ID: " + id + ", Name: " + name + ", Specialization: " + specialization + '}');
    }
     
}