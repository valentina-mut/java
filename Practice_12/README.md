# Практика #1

Приведите примеры использования перегрузки и переопределения методов.

```java
public int add(int a, int b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a + b + c;
}

public double add(double a, double b) {
    return a + b;
}
```

```java
class A {
    public void foo() { 
        ...
     }
}

class B1 extends A {
    @Override
    public void sound() { 
        ...
    }
}

class B2 extends A {
    @Override
    public void sound() { 
        ...
     }
}

```