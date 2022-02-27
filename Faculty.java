
public class Faculty extends Employee {

  public static String PROFESSOR = "Professor";
  public static String TECH_ASSISSTANT = "Tech Assisstant";
  public static String ASSISSTANT = "Assisstant";
  public static String DEPARTMENT_HEAD = "Department Head";

  protected String offHr;
  protected String rank;

  public Faculty(String name) {
    this(name, "9-5PM", "Employee");
  }

  public Faculty(String name, String offHr, String rank) {
    super(name);
    this.offHr = offHr;
    this.rank = rank;
  }

  public String getOfficeHours() {
    return offHr;
  }

  public void setOfficeHours(String offHr) {
    this.offHr = offHr;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  @Override
  public String toString() {
    return "Name: " + getName() + " Class: " + this.getClass().getName();
  }

}
