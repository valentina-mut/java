# Практика 1

Приведите пример кода, демонстрирующего все три варианта использования ключевого слова super.

```java
class A {
    int a;

    A(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("display A: " + a);
    }
}

class B extends A {
    B(int a) {
        super(a); // Вызов конструктора суперкласса A
    }

    void displayB() {
        super.display(); // Доступ к методу суперкласса A
        System.out.println("display B: " +  super.a); // Доступ к полю a
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B(1); 
        obj.displayB();
        obj.show();
    }
}

```
# Практика #2

Что случится при вызове метода method() объекта класса C, если переменная a и метод method() не будут определены в классе B, а будут определены только в классе A?

```java
class A {
  int a;
  void method() {
    ...
  }

}

class B extends A {
  ...
}

class C extends B {
  ...
  void method() {
    ...
    int a = super.a;
    super.method();
  }
  ...
}
```

При вызове метода `method()` объекта класса C:

1. `super.a` будет ссылаться на переменную `a` из класса A.
2. `super.method()` вызовет метод `method()` из класса A.

Все будет работать корректно, так как класс C наследует от B, который, в свою очередь, наследует от A.


# Практика #3

Перепешите следующий код с использованием конструкции this(). Помните, что в каждом конструкторе вызов this() должен быть единственным и первым среди всех операций.


```java
class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0); 
    }

    public A(int a) {
        this(a, 0, 0); 
    }

    public A(int a, int b) {
        this(a, b, 0); 
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}
```