public class Person{
  private String firstName;
  private String lastName;
  private int year;

  //constructors
  public Person(String fName, String lName,int theYear){
    firstName=fName;
    lastName=lName;
    year=theYear;
  }

  //getters and setters
  public void setYear(int theYear){
    year=theYear;
  }
  public void setFirstName(String fName){
    firstName=fName;
  }
  public void setLastName(String lName){
    lastName=lName;
  }
  public int year(){
    return year;
  }
  public String firstName(){
    return firstName;
  }
  public String lastName(){
    return lastName;
  }

  //other methods
  public String toString(){
    return "First Name: "+firstName+"; Last Name: "+lastName+"; Year: "+year+";";
  }

  public boolean equals(Person that){
    if (this.firstName==that.firstName()&&this.lastName==that.lastName()&&this.year==that.year()){
      return true;
    }else{
      return false;
    }
  }

  public int compareTo(Person that){
    if (this.equals(that)){
      return 0;
    }else if(this.firstName==that.firstName()&&this.lastName==that.lastName()){
    //if first name and last name equal, check number
      return this.year-that.year();
    }else if(this.firstName==that.firstName()){
    //if first name equal, check last name
      return this.lastName.compareTo(that.lastName());
    }else{
    //if nothing equal, check first name
      return this.firstName.compareTo(that.firstName());
    }
  }
}
