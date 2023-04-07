package lessons;

public class StringBuilderTest {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("Hello");
    s.append(" hello").append(" 123");
    System.out.println(s);

  }
}
