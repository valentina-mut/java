# Практика 1

Приведите пример использования пяти любых спецификаторов из таблицы.

```java
import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        boolean isJavaFun = true;
        char grade = 'A';
        int num = 25;
        double pi = 3.14159;
        String Hello = "Hello";

        formatter.format("%b", isJavaFun);
        formatter.format("%c", grade);
        formatter.format("%d", num);
        formatter.format("%.2f", pi);
        formatter.format("%s", name);

        System.out.println(formatter);
        formatter.close();
    }
}

```
# Практика 2

Зачем нужен метод flush()?

Метод `flush()` записывает данные из буфера в выходной поток, гарантируя их вывод. Это полезно перед завершением программы или изменением состояния потока.


```java
import java.util.Formatter;

public class FlushExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Hello, %s!\n", "World");
        formatter.flush(); // Принудительная запись
        System.out.println(formatter);
        formatter.close();
    }
}
```

# Практика 3

Приведите пример использования пяти любых спецификаторов из таблицы

```java
import java.util.Formatter;
import java.util.Date;

public class DateFormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Date date = new Date();

        formatter.format("%tH:%tM:%tS\n", date, date, date);
        formatter.format("%tY-%tm-%td\n", date, date, date);
        formatter.format("%tA, %tB %td, %tY\n", date, date, date, date);

        System.out.println(formatter);
        formatter.close();
    }
}
```