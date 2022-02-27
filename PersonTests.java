import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTests {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @Test
  public void TesttoString() {
    Person person = new Person("Paul");
    String actual = person.toString();
    String expected = "Name: Paul Class: Person";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetEmail() {
    Person person = new Person("Paul");
    person.setEmail("email.com");
    String actual = person.getEmail();
    String expected = "email.com";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetphoneNum() {
    Person person = new Person("Paul");
    person.setPhoneNum("123456789");
    String actual = person.getPhoneNum();
    String expected = "123456789";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetAddress() {
    Person person = new Person("Paul");
    person.setAddress("null");
    String actual = person.getAddress();
    String expected = "null";
    assertEquals(actual, expected);
  }

  @Test
  void TestsetName() {
    Person person = new Person("Paul");
    person.setName("Bob");
    String actual = person.getName();
    String expected = "Bob";
    assertEquals(actual, expected);
  }

  @Test
  void TestgetName() {
    Person person = new Person("Paul");
    String actual = person.getName();
    String expected = "Paul";
    assertEquals(actual, expected);
  }

}
