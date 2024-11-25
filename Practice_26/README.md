# Практика 1

Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.

- `PrivateInner`: доступен только внутри `Main`.
- `ProtectedInner`: доступен внутри `Main`, а также в подклассах и классах в том же пакете.
- `PublicInner`: доступен из любого места, где доступен `Main`.
- `PackagePrivateInner`: доступен только в пределах одного пакета.

# Практика 2: 

Имеет ли внутренний класс доступ к полям и методам внешнего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.

Внутренний класс имеет доступ к полям и методам внешнего класса. Это не зависит от спецификаторов доступа

# Практика 3: 

Имеет ли внешний класс доступ к полям и методам внутреннего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.

Внешний класс имеет доступ только к публичным и защищённым методам и полям внутреннего класса

```java
public class Main {
    // Приватное поле внешнего класса
    private String outerField = "Outer Field";

    // Приватный внутренний класс
    private class PrivateInner {
        void accessOuter() {
            System.out.println("PrivateInner accessing: " + outerField);
        }
    }

    // Защищенный внутренний класс
    protected class ProtectedInner {
        void accessOuter() {
            System.out.println("ProtectedInner accessing: " + outerField);
        }
    }

    // Публичный внутренний класс
    public class PublicInner {
        void accessOuter() {
            System.out.println("PublicInner accessing: " + outerField);
        }
    }

    // Пакетный (по умолчанию) внутренний класс
    class PackagePrivateInner {
        void accessOuter() {
            System.out.println("PackagePrivateInner accessing: " + outerField);
        }
    }

    public void testInnerClasses() {
        // Создание экземпляров внутренних классов
        PrivateInner privateInner = new PrivateInner();
        ProtectedInner protectedInner = new ProtectedInner();
        PublicInner publicInner = new PublicInner();
        PackagePrivateInner packagePrivateInner = new PackagePrivateInner();

        // Доступ к методам внутренних классов
        privateInner.accessOuter();
        protectedInner.accessOuter();
        publicInner.accessOuter();
        packagePrivateInner.accessOuter();
    }

    public void accessInner() {
        InnerClass inner = new InnerClass();
        // System.out.println(inner.innerField); // Ошибка: innerField имеет private доступ
        inner.innerMethod(); // Доступен, так как метод public
    }

    public class InnerClass {
        private String innerField = "Inner Field";

        public void innerMethod() {
            System.out.println("Inner Method");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.testInnerClasses();
        
        // Доступ к внутреннему классу
        InnerClass inner = main.new InnerClass();
        inner.innerMethod(); // Доступ к публичному методу
        // System.out.println(inner.innerField); // Ошибка: innerField имеет private доступ
    }
}
```