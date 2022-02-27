import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StaffTests {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @Test
  public void TesttoString() {
    Staff s = new Staff("Paul");
    String actual = s.toString();
    String expected = "Name: Paul Class: Staff";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetTitle_Complex() {
    Staff s = new Staff("Paul", "Manager");
    s.setTitle("none");
    String actual = s.getTitle();
    String expected = "none";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetTitle_Complex() {
    Staff s = new Staff("Paul", "Manager");
    String actual = s.getTitle();
    String expected = "Manager";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetTitle() {
    Staff s = new Staff("Paul");
    s.setTitle("Manager");
    String actual = s.getTitle();
    String expected = "Manager";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetTitle() {
    Staff s = new Staff("Paul");
    String actual = s.getTitle();
    String expected = "none";
    assertEquals(actual, expected);
  }

}
