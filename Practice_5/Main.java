public class Main {
    public static void main() {
        // Практика 1
        practice1();

        // Практика 2
        practice2();
    }


    private  static void practice1() {

        int a = 5;
        int b = 10;

        // Арифметические операторы
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("b / a = " + (b / a)); 
        System.out.println("b % a = " + (b % a)); 

        // Операторы инкремента и декремента
        System.out.println("++a: " + (++a));
        System.out.println("b++: " + (b++));
        System.out.println("b = " + b);

        // Операторы сравнения
        System.out.println("a == b: " + (a == b)); 
        System.out.println("a != b: " + (a != b)); 
        System.out.println("a > b: " + (a > b)); 
        System.out.println("a < b: " + (a < b)); 

        // Операторы логического && и ||
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); 
        System.out.println("x || y: " + (x || y)); 

        // Операторы типа String
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1 + str2 = " + (str1 + " " + str2));
    }

    private static void practice2() {
        Object obj1 = "Hello, World!";
        Object obj2 = null;

        // Применение оператора instanceof
        System.out.println("obj1 instanceof String: " + (obj1 instanceof String)); // true
        System.out.println("obj2 instanceof String: " + (obj2 instanceof String)); // false
        System.out.println("obj2 instanceof Object: " + (obj2 instanceof Object)); // false
    }
}

