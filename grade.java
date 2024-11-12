public class Grade 
{
  private String course;
  private double score;
  private String letterGrade;

  public Grade(String newCourse, double newScore)
  {
    this.course = newCourse;
    this.score = newScore;
    setLetterGrade(newScore);

    if (newScore <= 100 && newScore >= 90)
    {
      letterGrade = "A";
    }
    else if (newScore < 90 && newScore >= 80)
    {
      letterGrade = "B";
    }
    else if (newScore < 80 && newScore >= 70)
    {
      letterGrade = "C";
    }
    else if (newScore < 70 && newScore >= 60)
    {
      letterGrade = "D";
    }
    else if (newScore < 60 && newScore >= 0)
    {
      letterGrade = "F";
    }
    else
    {
      //added just in case the score is invalid/outside of range
      letterGrade = null;
    }
  }

  public Grade(String newCourse, double newScore, String newLetterGrade)
  {
    //implemented this w additional parameter in case grade already pre-calculated
    course = newCourse;
    score = newScore;
    letterGrade = newLetterGrade;
  }

  public double getScore()
  {
    return score;
  }

  public String getLetterGrade()
  {
    return letterGrade;
  }

}
