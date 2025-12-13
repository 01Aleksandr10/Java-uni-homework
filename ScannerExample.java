import java.io.*;
import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        // Практика #1: Пример чтения данных из текстового файла с помощью Scanner
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}