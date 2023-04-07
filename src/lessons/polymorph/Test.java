package lessons.polymorph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
  public static void main(String[] args) {
    List<Animal> animalList = new ArrayList<>();
    animalList.add(new Animal(1));
    animalList.add(new Animal(2));

    List<Dog> dogList = new ArrayList<>();
    dogList.add(new Dog());
    dogList.add(new Dog());
    test(animalList);
    test(dogList);
  }

  private static void test(List<? extends Animal> list) {
    for (Animal animal: list) {
      System.out.println(animal);
    }
  }
}
