public class StringExample {
    //Практика 1
    public static void demonstrateStringMethods() {
        String original = "  Hello Java String! Java is Great.  ";
        String substring = "Java";
        String emptyString = "";
        String s1 = "Apple";
        String s2 = "apple";

        // 1. length()
        int len = original.length(); /* Возвращает длину строки. */
        System.out.println("1. Длина строки: " + len);

        // 2. trim()
        String trimmed = original.trim(); /* Удаляет пробелы в начале и в конце строки. */
        System.out.println("2. Обрезанная строка: '" + trimmed + "'");

        // 3. toUpperCase()
        String upper = trimmed.toUpperCase(); /* Преобразует все символы строки в верхний регистр. */
        System.out.println("3. В верхнем регистре: " + upper);

        // 4. indexOf(String str)
        int index = trimmed.indexOf(substring); /* Возвращает индекс первого вхождения подстроки. */
        System.out.println("4. Индекс подстроки 'Java': " + index);

        // 5. contains(CharSequence s)
        boolean contains = original.contains("String"); /* Проверяет, содержит ли строка указанную последовательность символов. */
        System.out.println("5. Содержит ли 'String': " + contains);

        // 6. replace(CharSequence target, CharSequence replacement)
        String replaced = original.replace("Java", "Kotlin"); /* Заменяет все вхождения целевой подстроки на заменяющую. */
        System.out.println("6. После замены: " + replaced.trim());

        // 7. equalsIgnoreCase(String anotherString)
        boolean equalsIgnore = s1.equalsIgnoreCase(s2); /* Сравнивает две строки без учета регистра символов. */
        System.out.println("7. 'Apple' равно 'apple' (без учета регистра): " + equalsIgnore);

        // 8. startsWith(String prefix)
        boolean starts = trimmed.startsWith("Hello"); /* Проверяет, начинается ли строка с указанного префикса. */
        System.out.println("8. Начинается ли с 'Hello': " + starts);

        // 9. substring(int beginIndex)
        String sub = trimmed.substring(6); /* Возвращает новую строку, которая является подстрокой, начиная с указанного индекса. */
        System.out.println("9. Подстрока с индекса 6: " + sub);

        // 10. isEmpty()
        boolean empty = emptyString.isEmpty(); /* Проверяет, является ли строка пустой (длина равна 0). */
        System.out.println("10. Пустая строка пуста: " + empty);
    }

    //Практика 2
    public static void demonstrateStringJoiner() {

        java.util.StringJoiner joiner1 = new java.util.StringJoiner(", ");
        joiner1.add("Apple").add("Banana").add("Cherry");
        System.out.println("StringJoiner 1 (разделитель): " + joiner1.toString());

        java.util.StringJoiner joiner2 = new java.util.StringJoiner(" / ", "[", "]");
        joiner2.add("Red").add("Green").add("Blue");
        System.out.println("StringJoiner 2 (полный): " + joiner2.toString());
    }

    /*
     * Практика 3
     *
     * Зачем нужны три двойные кавычки?
     *
     * /* Три двойные кавычки (""") используются для создания текстовых блоков (Text Blocks).
     * Их назначение — упростить создание многострочных строк без использования символов новой строки (\n)
     * или конкатенации, а также избежать экранирования специальных символов.
     * Идеально подходят для встраивания фрагментов HTML, JSON или SQL. */
    
}