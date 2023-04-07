package lessons.polymorph;

public class Dog extends Animal{
  public Dog(int id) {
    super(id);
  }

  public Dog() {

  }

  @Override
  public void eat() {
    System.out.println("Dog eating");
  }
}
