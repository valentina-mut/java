# Практика 1

Что выведет данный код и почему?

```java
public class A {
   {
      System.out.println("logic (1) id= " + this.id);
   }

   static {
      System.out.println("static logic");
   }

   private int id = 1;

   public A(int id) {
      this.id = id;
      System.out.println("ctor id= " + id);
   }

   {
      System.out.println("logic (2) id= " + id);
   }
}

public class Main {
    public static void main(String[] args) {
        new A(100);
    }
}
```
Вывод:
```
static logic
logic (1) id= 0
logic (2) id= 1
ctor id= 100
```

1. Статический блок: выводит `"static logic"`.
2. Первый логический блок: `id` еще не инициализирован, выводит `0`.
3. Инициализация `id`: присваивается `1`.
4. Второй логический блок: теперь `id` равен `1`, выводит `1`.
5. Конструктор: `id` устанавливается на `100`, выводит `100`.
