public class Instructor extends Person{
  private int salary;
  
  public Instructor(String fName, String lName,int theYear, int theSalary){
    super(fName, lName, theYear);
    salary=theSalary;
  }

  //getters and setters
  public void setSalary(int theSalary){
    salary=theSalary;
  }
  public int salary(){
    return salary;
  }
  
  //other methods
  @Override
  public String toString(){
    return "First Name: "+this.firstName()+"; Last Name: "+this.lastName()+"; Year: "+this.year()+"; Salary: "+salary+";";
  }
  
  public boolean equals(Instructor that){
    if (this.firstName()==that.firstName()&&this.lastName()==that.lastName()&&this.year()==that.year()&&this.salary==that.salary()){
      return true;
    }else{
      return false;
    }
  }

  public int compareTo(Instructor that){
    if (this.equals(that)){
      return 0;
    }else if(this.firstName()==that.firstName()&&this.lastName()==that.lastName()&&this.year()==that.year()){
    //if first name and last name  and number equal compare subject
      return this.salary-that.salary();
    }else if(this.firstName()==that.firstName()&&this.lastName()==that.lastName()){
    //if first name and last name equal, check number
      return this.year()-that.year();
    }else if(this.firstName()==that.firstName()){
    //if first name equal, check last name
      return this.lastName().compareTo(that.lastName());
    }else{
    //if nothing equal, check first name
      return this.firstName().compareTo(that.firstName());
    }
  }
}