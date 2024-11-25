# Практика 1

Приведите пример кода для чтение данных из текстового файла с помощью Scanner.

```java
try {
    File file = new File("example.txt"); 
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
        String line = scanner.nextLine(); 
        System.out.println(line); 
    }

    scanner.close();
} catch (FileNotFoundException e) {
    System.out.println(e.getMessage());
}
```