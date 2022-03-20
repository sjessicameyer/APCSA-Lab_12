public class Student extends Person{
  private String subject;
  
  public Student(String fName, String lName,int theYear, String theSubject){
    super(fName, lName, theYear);
    subject=theSubject;
  }

  //getters and setters
  public void setSubject(String theSubject){
    subject=theSubject;
  }
  public String subject(){
    return subject;
  }
  
  //other methods
  @Override
  public String toString(){
    return "First Name: "+this.firstName()+"; Last Name: "+this.lastName()+"; Year: "+this.year()+"; Subject: "+subject+";";
  }

  public boolean equals(Student that){
    if (this.firstName()==that.firstName()&&this.lastName()==that.lastName()&&this.year()==that.year()&&this.subject==that.subject()){
      return true;
    }else{
      return false;
    }
  }

  public int compareTo(Student that){
    if (this.equals(that)){
      return 0;
    }else if(this.firstName()==that.firstName()&&this.lastName()==that.lastName()&&this.year()==that.year()){
    //if first name and last name  and number equal compare subject
      return this.subject.compareTo(that.subject());
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
