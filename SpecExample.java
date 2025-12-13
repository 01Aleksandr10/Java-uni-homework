class SpecExample {
    public static void main(String[] args) {
        // Практика 1
        boolean bool = true;
        char ch = 'A';
        int num = 42;
        double dbl = 3.14159;
        String str = "Hello";

        System.out.printf("Логическое значение: %b%n", bool); // %b - логическое значение
        System.out.printf("Символьное представление: %c%n", ch); // %c - символ
        System.out.printf("Десятичное целое: %d%n", num); // %d - десятичное целое
        System.out.printf("Десятичное с плавающей точкой: %f%n", dbl); // %f - число с плавающей точкой
        System.out.printf("Строковое представление: %s%n", str); // %s - строка

        // Практика 2
        // Метод flush() используется для принудительной записи всех данных, накопленных в буфере вывода,
        // на физическое устройство (например, на диск или в консоль). Это гарантирует, что данные не останутся
        // в буфере и будут немедленно доступны. Без вызова flush() данные могут быть записаны с задержкой,
        // что может привести к потере информации, если программа завершится до того, как буфер будет очищен.

        // Практика 3
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2025, java.util.Calendar.DECEMBER, 14, 15, 30, 45);

        System.out.printf("Час (00-23): %tH%n", cal); // %tH - час в 24-часовом формате
        System.out.printf("Минуты: %tM%n", cal); // %tM - минуты
        System.out.printf("Секунды: %tS%n", cal); // %tS - секунды
        System.out.printf("Год (четырехзначный): %tY%n", cal); // %tY - год
        System.out.printf("Полное название месяца: %tB%n", cal); // %tB - полное название месяца
    }
}