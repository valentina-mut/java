#  Практика 1

Самостоятельно придумайте класс и переопределите для него метод equals(). Каким соглашениям должна следовать реализация этого метода?

```java
public class A {
    private String val;

    public A(String val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, ссылается ли объект на себя
        if (this == obj) {
            return true;
        }

        // Проверяем, является ли объект экземпляром класса
        if (!(obj instanceof A)) {
            return false;
        }

        A other = (A) obj;
        return this.val.equals(other.val);
    }

    @Override
    public int hashCode() {
        // Генерируем хэш-код
        return val.hashCode();
    }

    @Override
    public String toString() {
        return "val=" + val;
    }

    @Override
    protected Object clone() {
        // Создаем и возвращаем копию объекта
        return new A(this.val);
    }

    // Метод для получения класса
    public Class<? extends Object> getClassType() {
        return this.getClass();
    }
}
```