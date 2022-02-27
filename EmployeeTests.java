import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeTests {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @Test
  public void TesttoString() {
    Employee e = new Employee("Paul");
    String actual = e.toString();
    String expected = "Name: Paul Class: Employee";
    assertEquals(actual, expected);
  }

  @Test
  void TestEmployeeDateHired_Complex() {
    MyDate md = new MyDate(1, 1, 1);
    Employee e = new Employee("Paul", 5, "corner", md);
    MyDate actual = e.getDateHired();
    MyDate expected = new MyDate(1, 1, 1);
    equals(actual == expected);
  }

  @Test
  void TestEmployeeOffice_Complex() {
    Employee e = new Employee("Paul", 5, "corner", null);
    String actual = e.getOffice();
    String expected = "corner";
    assertEquals(actual, expected);
  }

  @Test
  void TestEmployeeSalary_Complex() {
    Employee e = new Employee("Paul", 5, "corner", null);
    double actual = e.getSalary();
    double expected = 5.0;
    assertEquals(actual, expected);
  }

  @Test
  void TestEmployeeName_Complex() {
    Employee e = new Employee("Paul", 5, "corner", null);
    String actual = e.getName();
    String expected = "Paul";
    assertEquals(actual, expected);
  }

  @Test
  void TestEmployee_Simple() {
    Employee e = new Employee("Paul");
    String actual = e.getName();
    String expected = "Paul";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetDateHired() {
    Employee e = new Employee("Paul");
    e.setSalary(5);
    double actual = e.getSalary();
    double expected = 5.0;
    equals(actual == expected);
  }

  @Test
  void TestgetDateHired() {
    Employee e = new Employee("Paul");
    MyDate actual = new MyDate(1, 1, 1);
    actual = e.getDateHired();
    MyDate expected = new MyDate(1, 1, 1);
    equals(actual == expected);
  }

  @Test
  void TestsetOffice() {
    Employee e = new Employee("Paul");
    e.setOffice("corner");
    String actual = e.getOffice();
    String expected = "corner";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetOffice() {
    Employee e = new Employee("Paul");
    String actual = e.getOffice();
    String expected = "none";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetSalary() {
    Employee e = new Employee("Paul");
    e.setSalary(5);
    double actual = e.getSalary();
    double expected = 5.0;
    assertEquals(actual, expected);
  }

  @Test
  void TestgetSalary() {
    Employee e = new Employee("Paul");
    double actual = e.getSalary();
    double expected = 0.0;
    assertEquals(actual, expected);
  }

}
