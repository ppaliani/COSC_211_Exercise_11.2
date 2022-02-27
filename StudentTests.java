import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentTests {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @Test
  public void TesttoString() {
    Student s = new Student("Paul");
    String actual = s.toString();
    String expected = "Name: Paul Class: Student";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetStatus() {
    Student s = new Student("Paul");
    s.setStatus("Sophomore");
    String actual = s.getStatus();
    String expected = "Sophomore";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetStatus() {
    Student s = new Student("Paul");
    s.setStatus("Sophomore");
    String actual = s.getStatus();
    String expected = "Sophomore";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetStatus_Complex() {
    Student s = new Student("Paul", "Freshman");
    s.setStatus("Sophomore");
    String actual = s.getStatus();
    String expected = "Sophomore";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetStatus_Complex() {
    Student s = new Student("Paul", "Freshman");
    String actual = s.getStatus();
    String expected = "Freshman";
    assertEquals(actual, expected);
  }

}
