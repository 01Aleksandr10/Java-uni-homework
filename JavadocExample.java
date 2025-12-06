

/**
 @author Александр Андреев
 * @version 1.0
 * @since 2025-12-07
 */
public class JavadocExample {

    /**
     * Поле для хранения имени пользователя.
     * Используется в методах класса для персонализации вывода.
     */
    private String userName;

    /**
     * Конструктор класса, инициализирующий имя пользователя.
     *
     * @param name Имя пользователя, которое будет использоваться в дальнейшем.
     */
    public JavadocExample(String name) {
        this.userName = name;
    }

    /**
     * Метод для приветствия пользователя.
     * Выводит приветственное сообщение в консоль.
     *
     * @return Строка с приветствием, содержащая имя пользователя.
     */
    public String greetUser() {
        return "Привет, " + userName + "!";
    }

    /**
     * Метод для вычисления суммы двух целых чисел.
     * Если одно из чисел отрицательное, метод выбрасывает исключение.
     *
     * @param a Первое число (должно быть неотрицательным).
     * @param b Второе число (должно быть неотрицательным).
     * @return Сумма чисел a и b.
     * @throws IllegalArgumentException если a или b меньше нуля.
     * @see #greetUser()
     */
    public int addPositiveNumbers(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Оба числа должны быть неотрицательными.");
        }
        return a + b;
    }

    /**
     * Главный метод программы.
     * Создает экземпляр класса и вызывает его методы для демонстрации.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        // Создаем объект
        JavadocExample example = new JavadocExample("Александр");

        // Вызываем методы
        System.out.println(example.greetUser());
        System.out.println("Сумма: " + example.addPositiveNumbers(5, 3));
    }
}