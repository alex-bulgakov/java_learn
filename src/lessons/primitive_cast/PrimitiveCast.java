package lessons.primitive_cast;

public class PrimitiveCast {

    public static void main(String[] args) {
        float f = 12.3f;
        byte i = 10;

        int size = (int) Math.pow(2.0, 16.0);
        for (int j = 0; j < size; j++) {
            System.out.print((char) j + " ");
            if (j % 100 == 0) {
                System.out.println();
            }
            if (j % 1000 == 0) {
                System.out.println(".........................................");
            }
        }

    }



}
