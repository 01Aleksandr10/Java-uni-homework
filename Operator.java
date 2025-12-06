public class Operator {
    public static void main(String[] args) {
        // --- Практика #1: Примеры всех операторов ---

        // 1. Операторы инкремента/декремента (префиксная и постфиксная форма)
        int a = 5;
        int b = 5;
        System.out.println("Префиксный ++a: " + (++a)); // Вывод: 6 (сначала увеличивает, потом возвращает)
        System.out.println("Постфиксный b++: " + (b++)); // Вывод: 5 (сначала возвращает, потом увеличивает)
        System.out.println("Значение b после постфикса: " + b); // Вывод: 6

        // 2. Арифметические операторы (*, /, %, +, -)
        int x = 10, y = 3;
        System.out.println("x * y = " + (x * y)); // 30
        System.out.println("x / y = " + (x / y)); // 3 (целочисленное деление)
        System.out.println("x % y = " + (x % y)); // 1 (остаток от деления)
        System.out.println("x + y = " + (x + y)); // 13
        System.out.println("x - y = " + (x - y)); // 7

        // 3. Операторы сдвига (<<, >>, >>>)
        int num = 8; // Бинарно: 1000
        System.out.println("num << 1 = " + (num << 1)); // 16 (Бинарно: 10000)
        System.out.println("num >> 1 = " + (num >> 1)); // 4 (Бинарно: 100)
        System.out.println("num >>> 1 = " + (num >>> 1)); // 4 (Бинарно: 100)

        // 4. Операторы сравнения (> , >= , < , <= , == , !=)
        boolean comp1 = (x > y);
        boolean comp2 = (x == y);
        boolean comp3 = (x != y);
        System.out.println("x > y: " + comp1); // true
        System.out.println("x == y: " + comp2); // false
        System.out.println("x != y: " + comp3); // true

        // 5. Побитовые операторы (&, |, ^, ~)
        int p = 5; // Бинарно: 101
        int q = 3; // Бинарно: 011
        System.out.println("p & q = " + (p & q)); // 1 (Бинарно: 001)
        System.out.println("p | q = " + (p | q)); // 7 (Бинарно: 111)
        System.out.println("p ^ q = " + (p ^ q)); // 6 (Бинарно: 110)
        System.out.println("~p = " + (~p)); // -6 (Инверсия битов)

        // 6. Логические операторы (&&, ||, !)
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // false
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // true
        System.out.println("!cond1: " + (!cond1)); // false

        // 7. Тернарный оператор (? :)
        int max = (x > y) ? x : y;
        System.out.println("Максимум из x и y: " + max); // 10

        // 8. Оператор присваивания (=) и составные операторы (+=, -=, *=, /=, %=)
        int z = 10;
        z += 5; // z = z + 5
        System.out.println("z после +=: " + z); // 15
        z *= 2; // z = z * 2
        System.out.println("z после *=: " + z); // 30

        // 9. Операторы конкатенации строк (+ и +=)
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2; // Конкатенация
        System.out.println("Конкатенация: " + result); // Hello World

        String greeting = "Hi";
        greeting += " there!"; // Составное присваивание для строк
        System.out.println("Составное присваивание: " + greeting); // Hi there!

        // 10. Операторы сравнения объектов (==, !=) и присваивания (=)
        String s1 = new String("Test");
        String s2 = new String("Test");
        String s3 = s1;

        System.out.println("s1 == s2: " + (s1 == s2)); // false (сравнение ссылок)
        System.out.println("s1 == s3: " + (s1 == s3)); // true (одинаковые ссылки)
        System.out.println("s1 != s2: " + (s1 != s2)); // true

        // --- Практика #2: Примеры оператора instanceof ---

        Object obj1 = "Привет"; // Ссылка на String
        Object obj2 = 42;       // Ссылка на Integer (автоупаковка)
        Object obj3 = null;     // null-объект

        // Проверка типа объекта
        if (obj1 instanceof String) {
            System.out.println("obj1 является экземпляром String");
        }

        if (obj2 instanceof Integer) {
            System.out.println("obj2 является экземпляром Integer");
        }

        // Случай с null-объектом
        // Оператор instanceof возвращает false, если левый операнд равен null.
        // Это безопасно и не вызывает исключений.
        if (obj3 instanceof String) {
            System.out.println("obj3 является экземпляром String"); // Этот код НЕ выполнится
        } else {
            System.out.println("obj3 не является экземпляром String (или это null)");
        }

        // Пример с подклассами
        class Parent {}
        class Child extends Parent {}

        Parent parentObj = new Parent();
        Parent childObj = new Child(); // Полиморфизм

        System.out.println("parentObj instanceof Parent: " + (parentObj instanceof Parent)); // true
        System.out.println("childObj instanceof Parent: " + (childObj instanceof Parent)); // true (Child - подкласс Parent)
        System.out.println("childObj instanceof Child: " + (childObj instanceof Child)); // true
        System.out.println("parentObj instanceof Child: " + (parentObj instanceof Child)); // false
    }
}

