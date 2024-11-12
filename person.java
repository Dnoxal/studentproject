public class Person {
  private String name;
  private int age;
  private String address;

  public Person(String personName, int personAge, String personAddress)
  {
    this.name = personName;
    this.age = personAge;
    this.address = personAddress;
  }
  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public String getAddress()
  {
    return address;
  }

  public String toString()
  {
    return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
  }

}

public class Student extends Person {
  private String studentID;
  private ArrayList<Grade> grades = new ArrayList<Grade>();
  private String major;

  public Student(String personName, int personAge, String personAddress, String newStudentID, String newMajor)
  {
    super(personName, personAge, personAddress); //intialize the person superclass parameters
    this.studentID = newStudentID;
    this.major = newMajor;
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public double calculateGPA()
  {
    double total = 0;
    for(int i = 0; i < grades.size(); i++)
    {
      total += (grades.get(i)).getScore();
    }
    return (total / grades.size());
  }

  public String toString()
  {
    
    return "Name: " + getName() + "\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nStudent ID: " + studentID + "\nMajor: " + major; //used the getter methods because name age etc are encapsulated and are private variables
  }

}