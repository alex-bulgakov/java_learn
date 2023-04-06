import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Person ps1 = new Person("Alex", 20);
    Person ps2 = new Person("Bob", 30);
    Person ps3 = new Person("John", 40);
    Person ps4 = new Person();

    System.out.println(ps1.getName());
    System.out.println(ps1.getAge());
    System.out.println(ps2.getName());
    System.out.println(ps2.getAge());
    System.out.println(ps3.getName());
    System.out.println(ps3.getAge());


  }
}


class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
    System.out.println("Empty person");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}


