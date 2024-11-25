# Практика 1

Приведите пример интерфейса, в котором определен один неабстрактный метод и один статический метод, а также класс, реализующий этот интерфейс. Покажите все способы вызова методов интерфейса.

```java
// Определение интерфейса
interface MyInterface {
    // Неабстрактный метод
    default void display() {
    }

    // Статический метод
    static void staticMethod() {
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    // Переопределение неабстрактного метода
    @Override
    public void display() {
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        
        myClass.display();
        MyInterface.staticMethod();
    }
}
```

# Практика 2

Что произойдет, если класс реализует два интерфейса с одинаковыми неабстрактными методами? Как выйти из такого положения? Приведите пример.

```java
// Первый интерфейс
interface InterfaceA {
    default void show() {
    }
}

// Второй интерфейс
interface InterfaceB {
    default void show() {
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // Переопределение метода show для разрешения конфликта
    @Override
    public void show() {
        InterfaceA.super.show();
        // Или
        // InterfaceB.super.show(); 
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show(); 
    }
}
```

