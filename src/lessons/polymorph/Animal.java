package lessons.polymorph;

public class Animal {
  private int id;
  public Animal(int id) {
    this.id = id;
  }

  public Animal() {
    this.id = 0;
  }

  public void eat() {
    System.out.println("I'm eating");
  }

  @Override
  public String toString() {
    return String.valueOf(id);
  }

  class otherAnimal extends Animal {
    @Override
    public void eat() {
      System.out.println("Other animal eating");
    }
  }
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
  }

}
