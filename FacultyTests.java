import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FacultyTests {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @Test
  public void TesttoString() {
    Faculty f = new Faculty("Paul");
    String actual = f.toString();
    String expected = "Name: Paul Class: Faculty";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetRank_Complex() {
    Faculty f = new Faculty("Paul", "9-5", "Employee");
    f.setRank("Professor");
    String actual = f.getRank();
    String expected = "Professor";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetRank_Complex() {
    Faculty f = new Faculty("Paul", "9-5", "Professor");
    String actual = f.getRank();
    String expected = "Professor";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetRank() {
    Faculty f = new Faculty("Paul");
    f.setRank("Professor");
    String actual = f.getRank();
    String expected = "Professor";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetRank() {
    Faculty f = new Faculty("Paul");
    String actual = f.getRank();
    String expected = "Employee";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetOfficeHours_Complex() {
    Faculty f = new Faculty("Paul", "8-4", "guy");
    String actual = f.getOfficeHours();
    String expected = "8-4";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetOfficeHours_Complex() {
    Faculty f = new Faculty("Paul", "8-4", "guy");
    f.setOfficeHours("7-3");
    String actual = f.getOfficeHours();
    String expected = "7-3";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetOfficeHours() {
    Faculty f = new Faculty("Paul");
    f.setOfficeHours("8-4");
    String actual = f.getOfficeHours();
    String expected = "8-4";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetOfficeHours() {
    Faculty f = new Faculty("Paul");
    String actual = f.getOfficeHours();
    String expected = "9-5PM";
    assertEquals(actual, expected);
  }

}
