# Практика 1

Какого типа может быть переменная в switch? Приведите примеры для всех возможных случаев.

В `switch` могут использоваться следующие типы переменных:

1. **Целочисленные**: `byte`, `short`, `int`, `char`
   ```java
   switch (intValue) {
       case 1: // ...
       case 2: // ...
   }
   ```

2. **Строки** (`String`):
   ```java
   switch (stringValue) {
       case "A": // ...
       case "B": // ...
   }
   ```

3. **Перечисления** (`enum`):
   ```java
   switch (Color.RED) {
       case RED: // ...
       case GREEN: // ...
   }
   ```

# Практика 2

Что произойдет, если в некоторых частях case будет отсутствовать break, как в следующем примере?

```java
switch (value) {
    case 1:
        i = 1; // Если value == 1
        break;
    case 2:
        i = 2; // Если value == 2
    case 3:
        i = 3; // Выполнится также, если value == 2
        break;
}
```