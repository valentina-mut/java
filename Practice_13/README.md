# Практика 1

Приведите все варианты вызова метода `printVars()`

```java
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
```

## Варианты вызова метода `printVars()`

Вызов из статического метода:
```java
public class Main {
    public static void main(String[] args) {
        A.printVars();
    }
}
```

Вызов из другого статического метода в классе `A`:
```java
public static void anotherMethod() {
    printVars();
}
```

Вызов из статического блока:
```java
static {
    printVars();
}
```

