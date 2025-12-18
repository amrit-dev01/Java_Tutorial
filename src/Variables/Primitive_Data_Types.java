package Variables;

public class Primitive_Data_Types {
    public static void main(String[] args) {
//  Integer data types: Used to store integer types values
//      Types: byte, int, short, long
        byte a = 10;    //1 byte size
        int b = 20;     //4 byte size
        short c = 30;   //2 byte size
        long d = 40;    //8 byte size

//  Float: Stores decimal type values
//      Types: float, double
        float e = 12.2f;
        double f = 124.43;

//  Character data type: Stores only one character value at a time. Generally stores as ASCII value.
        char g = 'A';

//  Boolean: Returns output as only true or false or 0,1.
        boolean isJavaFun = true;
        int x = 10;
        int y = 9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println((int)g);
        System.out.println(isJavaFun);
//  As boolean expression
        System.out.println(x>y);
    }
}
