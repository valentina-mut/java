# Практика 1

Приведите примеры класса, в котором используется инициализация элементов перечисления.
```java
public class Week {
    public Week() {
        days = new Day[] {
            Day.MONDAY,
            Day.TUESDAY,
            Day.WEDNESDAY,
            Day.THURSDAY,
            Day.FRIDAY,
            Day.SATURDAY,
            Day.SUNDAY
        };
    }
}
```

# Практика 2

Приведите примеры реализации собственного перечисления c любым дополнительным методом.


```java
public enum Day {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(false),
    SUNDAY(false);
}
```
