public class Employee extends Person {

  protected double sal;
  protected String office;
  protected MyDate dateHired;

  public Employee(String name) {
    this(name, 0, "none", new MyDate());
  }

  public Employee(String name, double sal, String office, MyDate dateHired) {
    super(name);
    this.sal = sal;
    this.office = office;
    this.dateHired = dateHired;
  }

  public double getSalary() {
    return sal;
  }

  public void setSalary(double sal) {
    this.sal = sal;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public MyDate getDateHired() {
    return dateHired;
  }

  public void setDateHired(MyDate dateHired) {
    this.dateHired = dateHired;
  }

  @Override
  public String toString() {
    return "Name: " + getName() + " Class: " + this.getClass().getName();
  }

}
