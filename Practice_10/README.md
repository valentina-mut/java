# Практика 1

Что произойдет в результате выполнения следующего кода?

```java
int a1[] = {1,2,3,4,5};
int a2[] = {6,7,8,9,10};
a1 = a2;
```

`a1` теперь ссылается на массив `{6, 7, 8, 9, 10}`. Массив `{1, 2, 3, 4, 5}` становится недоступным.


# Практика 2

Самостоятельно изучите класс java.util.Array и приведите пример использования следующих методов:

```java
    String toString(...)
    int binarySearch(...)
    boolean equals(...)
    boolean compare(...)
    void sort(...)
```

## `String toString(...)`

```java
int[] array = {1, 2, 3};
System.out.println(Arrays.toString(array)); // [1, 2, 3]
```

## `int binarySearch(...)`

```java
int[] array = {1, 2, 3, 4, 5};
System.out.println(Arrays.binarySearch(array, 3)); // 2
```

## `boolean equals(...)`

```java
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};
System.out.println(Arrays.equals(array1, array2)); // true
```

## `int compare(...)`

```java
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 4};
System.out.println(Arrays.compare(array1, array2)); // -1
```

## `void sort(...)`

```java
int[] array = {5, 3, 1, 4, 2};
Arrays.sort(array);
System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5]
```

