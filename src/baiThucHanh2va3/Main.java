package baiThucHanh2va3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // CHECK CIRCLE
        Circle[] arrCircle = new Circle[3];
        arrCircle[0] = new Circle(10.02);
        arrCircle[1] = new Circle(5.7);
        arrCircle[2] = new Circle(8);

        Arrays.sort(arrCircle, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return (int) (o1.getRadius()-o2.getRadius());
            }
        });
        System.out.println("Sort Circle by Radius ACS: ");
        for (int i = 0; i < arrCircle.length; i++) {
            System.out.printf("Circle %d: %f\n",i+1,arrCircle[i].getRadius());
        }

        //CHECK RECTANGLE
        Rectangle[] arrRectangle = new Rectangle[3];
        arrRectangle[0] = new Rectangle(6.3,15);
        arrRectangle[1] = new Rectangle(2.1,9.8);
        arrRectangle[2] = new Rectangle(4,16);

        Arrays.sort(arrRectangle, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return (int) (o1.getWidth()-o2.getWidth());
            }
        });

        System.out.println("\nSort Rectangle by Width ACS: ");
        for (int i = 0; i < arrRectangle.length; i++) {
            System.out.printf("Rectangle %d: width: %f, length: %f\n",i+1,arrRectangle[i].getWidth(),arrRectangle[i].getLength());
        }

        //CHECK SQUARE
        Square[] arrSquare = new Square[3];
        arrSquare[0] = new Square(6);
        arrSquare[1] = new Square(2);
        arrSquare[2] = new Square(10);

        Arrays.sort(arrSquare, new Comparator<Square>() {
            @Override
            public int compare(Square o1, Square o2) {
                return (int) (o2.getSide()-o1.getSide());
            }
        });

        System.out.println("\nSort Square by Side DES: ");
        for (int i = 0; i < arrRectangle.length; i++) {
            System.out.printf("Square %d: side: %f\n",i+1,arrSquare[i].getSide());
        }
    }
}
