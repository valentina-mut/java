# Практика 1

Приведите пример кода с генерацией двух исключений, одно из которых будет "перхвачено", а другое приведет к аварийной остановке.

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; /
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
        String str = null;
        System.out.println(str.length()); 
    }
}

```