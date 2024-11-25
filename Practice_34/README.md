# Практика 1

Объясните для каких целей используются основные классы исключений.

В Java классы исключений используются для обработки ошибок:


- **Throwable**: Корневой класс для всех исключений и ошибок.
  - **Error**: Серьезные проблемы (например, `OutOfMemoryError`).
  - **Exception**: Исключительные ситуации, которые могут быть обработаны.
    - **Checked Exceptions**: Должны обрабатываться (например, `IOException`).
    - **RuntimeException**: Необязательная обработка, ошибки программирования (например, `NullPointerException`).


# Практика 2

Приведите примеры кода, в которых генерируются и обрабатываются следующие исключения.

* ArithmeticException
* ArrayIndexOutOfBoundsException
* IllegalArgumentException
* ClassCastException
* NullPointerException


1. **ArithmeticException**:

```java
try {
    int result = 10 / 0; // Деление на ноль
} catch (ArithmeticException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```

2. **ArrayIndexOutOfBoundsException**:

```java
int[] array = {1, 2, 3};
try {
    int value = array[5]; // Выход за пределы массива
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```

3. **IllegalArgumentException**:

```java
try {
    throw new IllegalArgumentException("Неверный аргумент");
} catch (IllegalArgumentException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```

4. **ClassCastException**:

```java
Object obj = "Hello";
try {
    Integer num = (Integer) obj; // Неверное приведение
} catch (ClassCastException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```

5. **NullPointerException**:

```java
String str = null;
try {
    int length = str.length(); // Доступ к null
} catch (NullPointerException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```