package part1;

public class Person {

  private String name;
  
  private Telephone myphone = new Telephone();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String mydetails(){
      return myphone.getTelephoneNumber();
  }

}
