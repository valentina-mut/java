# Практика #1

Приведите примеры класса, в котором перегружен метод с переменным числом параметров.

```java

public int add(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
}

public double add(double... numbers) {
    double sum = 0.0;
    for (double number : numbers) {
        sum += number;
    }
    return sum;
}
```