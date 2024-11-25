# Практика 1

Приведите примеры "вложение" класса в интерфейс и покажите способ вызова методе такого вложенного класса.

```java
interface MyInterface {
    // Вложенный статический класс
    class MyClass {
        public void func() {
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса
        MyInterface.MyClass myClass = new MyInterface.MyClass();
        
        // Вызов метода вложенного класса
        myClass.func(); 
    }
}
```
