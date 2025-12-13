class ExceptionExample {
    // Практика #1: Объяснение целей использования основных классов исключений
    // Класс java.lang.Throwable — базовый класс для всех исключений и ошибок. Он используется для того,
    // чтобы обозначить, что объект может быть выброшен как исключение с помощью оператора throw.
    // Класс java.lang.Error — предназначен для представления серьезных проблем, которые обычно не следует перехватывать
    // в программе (например, OutOfMemoryError, StackOverflowError). Это ошибки, указывающие на критические сбои JVM.
    // Класс java.lang.Exception — базовый класс для всех проверяемых (checked) исключений, которые программа должна
    // ожидать и обрабатывать. Они представляют собой условия, которые могут возникнуть во время выполнения программы
    // и которые можно предвидеть и исправить (например, IOException, SQLException).
    // Класс java.lang.RuntimeException — подкласс Exception, который представляет непроверяемые (unchecked) исключения.
    // Эти исключения не требуют обязательного обработки (не нужно объявлять в throws), так как они обычно указывают
    // на программные ошибки (например, NullPointerException, IllegalArgumentException).

    // Практика #2: Примеры генерации и обработки исключений
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Генерирует ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            int[] arr = new int[3];
            int value = arr[5]; // Генерирует ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            Integer.parseInt("abc"); // Генерирует NumberFormatException (подкласс IllegalArgumentException)
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            Object obj = "string";
            Integer num = (Integer) obj; // Генерирует ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        try {
            String str = null;
            int len = str.length(); // Генерирует NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}