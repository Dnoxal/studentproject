public class Department
{
  private String departmentName;
  private ArrayList<Student> students = new ArrayList<Student>();

  public Department(String newDepartmentName)
  {
    departmentName = newDepartmentName;
  }
  public void addStudent(Student student)
  {
    students.add(student);
  }
  public double getDepartmentAverageGPA()
  {
    double total = 0;

    for (int i = 0; i < students.size(); i++)
      {
        total += students.get(i).calculateGPA();
      }

    return total / students.size();
  }
}