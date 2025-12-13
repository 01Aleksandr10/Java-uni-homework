import java.io.*;

class StreamExample {
    public static void main(String[] args) {
        // Практика 1
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Практика 2
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Hello, World!";
            for (int i = 0; i < text.length(); i++) {
                fos.write(text.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Практика 3
        // Иерархии Reader и Writer предназначены для работы с текстовыми данными (символами), а не с байтами.
        // В отличие от InputStream/OutputStream, которые оперируют байтами, Reader/Writer работают с символами Unicode,
        // что позволяет корректно обрабатывать текст в различных кодировках. Это особенно важно при работе с многоязычными
        // текстами, где один символ может занимать несколько байт.

        // Практика 4
        // Интерфейс AutoCloseable нужен для автоматического закрытия ресурсов (например, файлов, сетевых соединений).
        // Он используется вместе с конструкцией try-with-resources, которая гарантирует, что метод close() будет вызван
        // автоматически, даже если в блоке try произойдет исключение. Это предотвращает утечки ресурсов.
        // Пример: в коде выше использованы FileInputStream и FileOutputStream, которые реализуют AutoCloseable.
        // Блок try (try (FileInputStream fis = ...) { ... }) автоматически закроет потоки при выходе из блока.

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            // reader.close() вызывается автоматически здесь
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}