
public class exercise_112_main {

  public static void main(String[] args) {

    Person p = new Person("Paul");
    Student s = new Student("Bill");
    Employee e = new Employee("Sarah");
    Faculty f = new Faculty("Nancy");
    Staff st = new Staff("Craig");

    System.out.println(p.toString());
    System.out.println(s.toString());
    System.out.println(e.toString());
    System.out.println(f.toString());
    System.out.println(st.toString());

  }
}
