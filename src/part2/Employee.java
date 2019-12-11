package part2;

public class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
  
    private void setName(String name){
      this.name = name;
    }
    
    public String getName(){
        return name; 
    }
    
    private void setID(String id){
      this.id = id;
    }
    
    public String getID(){
        return id; 
    }
}
   
