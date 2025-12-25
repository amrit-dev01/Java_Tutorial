package Variables;

public class Operators {
    public static void main(String[] args) {
//  Arithmetic Operators: +, _, *, /, %
        int a = 100;
        int b = 20;
        int c = 40;
        int sum = a + b;
        int sub = a - b;
        int mul = a*b;
        float div = (float)a/b;
        int mod = a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

//  Unary operators -, +, ++, --, !
        boolean isJavaFun = true;

        System.out.println("--- Unary Operator Demo ---");

        // 1. Unary Plus (+) and Minus (-)
        int positive = +a;  // Stays 10
        int negative = -a;  // Becomes -10
        System.out.println("Unary Plus: " + positive);
        System.out.println("Unary Minus: " + negative);

        // 2. Logical NOT (!)
        System.out.println("Original Boolean: " + isJavaFun);
        System.out.println("After Logical NOT: " + !isJavaFun);

        // 3. Increment (++)
        System.out.println("\n--- Increment Section ---");
        System.out.println("Starting x: " + a);

        // Post-increment: Use 10, then x becomes 11
        System.out.println("Post-increment (x++): " + a++);

        // Pre-increment: x becomes 12, then use 12
        System.out.println("Pre-increment (++x): " + ++a);

        // 4. Decrement (--)
        System.out.println("\n--- Decrement Section ---");

        // Post-decrement: Use 12, then x becomes 11
        System.out.println("Post-decrement (x--): " + a--);

        // Pre-decrement: x becomes 10, then use 10
        System.out.println("Pre-decrement (--x): " + --a);

        System.out.println("\nFinal value of x: " + a);

//  Assignment Operators: '=' is used to assign the value
//            they proceed from right to left,means it first assigns the value and then does the operation
        a+=b;  //120
        System.out.println(a);
        a-=b;  //80
        System.out.println(a);
        a*=2;  //200;
        System.out.println(a);
        a/=20; //5
        System.out.println(a);

//  Relational Operators: used to compare the values and give results in boolean.
//          Types: <, >, <=, >=, ==, !=
        System.out.println("'a' is greater than b: " + (a>b));
        System.out.println("'a' is less than b: " + (a<b));
        System.out.println("'a' is greater than equal to b: " + (a>=b));
        System.out.println("'a' is less than equal to b: " + (a<=b));
        System.out.println("'a' is equal to b: " + (a==b));
        System.out.println("'a' is not equal to b: " + (a!=b));

//  Logical Operators: used to perform logical 'AND' and logical 'OR' operations
//          Types: &&, ||, !
        boolean x = true;
        boolean y = false;
        System.out.println("Using logical AND: " + (x && y));  //Shows true only if both are same.
        System.out.println("Using local 'OR': " + (x || y));  //Result is false only if both are false, otherwise if is always true.
        System.out.println("Using NOT: " + (!x));  //It acts as an inverter and inverts the value like true to false and vice versa.

//  Ternary Operators: It is shorthand version pf if else conditional statements. It uses three operands.

  int result;
  result = ((a>b) ? (a>c) ? a : c : (b>c) ? b : c );
 System.out.println("The greatest of the three numbers is: " + result);
/*
    Understand it with this demonstration using nested if else statements below:
        if (a > b) {
            if(a>c) {
                result = a;
            }else {
                result = c;
            }
        }else {
            if(b>c) {
                result = b;
            }else {
                result = c;
            }
        }
*/

//  Bitwise Operators:  
//      Bitwise operators are operators that manipulate data at the level of individual binary bits (0 and 1) of integer values.
//      where logical bitwise operators (&, |, ^, ~) perform bit-by-bit logical operations and
//      shift operators (<<, >>, >>>) move bits left or right to achieve fast multiplication, division, or bit manipulation.

        int d = 0b1010;
        int e = 0b1100;
        int A = (d & e);
        int B = (d | e);
        int C = (d ^ e);
        int D = ~d;
        int E = (d << 2);
        int F = (e >> 1);
        int G = (e >>> 1);
        System.out.println("d & e : " + Integer.toBinaryString(A));
        System.out.println("d | e : " + Integer.toBinaryString(B));
        System.out.println("d ^ e : " + Integer.toBinaryString(C));
        System.out.println("~d : " + Integer.toBinaryString(D));
        System.out.println("d << 2 : " + Integer.toBinaryString(E));
        System.out.println("e >> 1 : " + Integer.toBinaryString(F));
        System.out.println("e >>> 1 : " + Integer.toBinaryString(G));

//  instanceOf Operator: is used for type checking.
//        it can be used to check if an object is an instance of a class, a subclass or an interface.
        Object str = "Hello";
        System.out.println(str instanceof String);

        Object obj = 10;
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}