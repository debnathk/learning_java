import java.awt.*;
import java.util.Date;

public class Types {
    public static void main(String[] args) {
//      # Types
//      ## Primitive Types - Doesn't need memory allocation
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

//      ## Reference Types - Does need memory allocation
        Date now = new Date();
        System.out.println(now);

//      ## Reference Types vs Primitive Types
//      ### Primitive types
        byte x = 1;
        byte y = 2;
        y = 1;
        System.out.println(y); // As primitive types, change of value for y doesn't affect the value of x

//      ### Reference Types
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); // As reference types, point1 and point2 are referring to the same memory address,
//        // Thus, changing the values stored in the point1 is equal to changing the values stored in the point2
    }
}
