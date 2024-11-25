#  Практика 1

Приведите пример кода, в котором продемонстрированы следующие ситуации:

*    несколько исключений обрабатываются абсолютно идентичным образом;
*    исключения, которые обрабатываются, образуют иерархию Ex1 <|-- Ex2 <|-- Ex3, т.е. Ex3 - подкласс Ex2, а Ex2 - подкласс Ex1.

```java
class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
    public static void main(String[] args) {
        try {
            throw new Ex3();
        } catch (Ex1 e) {
            // Обработка всех исключений Ex1, Ex2 и Ex3
            System.out.println(e);
        }
    }
}
```
#  Практика 2

Что означает использование final при в данном объявлении?

```java
try {
   ...
} catch (final Exception e) {
   ...
}
```

Использование final в объявлении переменной в блоке catch означает, что после того, как переменной присвоено значение (в данном случае — объект исключения), вы не сможете изменить это значение.

```java
try {
   ...
} catch (final Exception e) {
   e = new Exception(); // Ошибка
}
```