public class WrapperExample {

    public static void main(String[] args) {
        // Практика 1
        // Для Integer
        Integer intDec1 = Integer.decode("123");
        Integer intDec2 = Integer.decode("0123");
        Integer intDec3 = Integer.decode("0x1A");

        System.out.println("Integer.decode(\"123\"): " + intDec1);
        System.out.println("Integer.decode(\"0123\"): " + intDec2);
        System.out.println("Integer.decode(\"0x1A\"): " + intDec3);

        // Для Long
        Long longDec = Long.decode("-0xFF");
        System.out.println("Long.decode(\"-0xFF\"): " + longDec);


        //Практика 2
        System.out.println("\n=== Практика #2: Создание Boolean ===");

        // Способ 1: Использование статического метода valueOf(boolean)
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(false);

        // Способ 2: Использование статического метода valueOf(String)
        // Если строка равна "true" (игнорируя регистр), возвращается true.
        // В любом другом случае возвращается false.
        Boolean bool3 = Boolean.valueOf("True");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("any other string"); // -> false

        // Способ 3: Автоупаковка (boxing) - неявное создание объекта из примитива
        boolean primitiveBool = true;
        Boolean bool6 = primitiveBool; // Auto-boxing

        // Способ 4: Явная автоупаковка (можно считать вариантом способа 3)
        Boolean bool7 = Boolean.TRUE; // Статическая константа
        Boolean bool8 = Boolean.FALSE; // Статическая константа

        System.out.println("Boolean.valueOf(true): " + bool1);
        System.out.println("Boolean.valueOf(\"True\"): " + bool3);
        System.out.println("Boolean.valueOf(\"any other string\"): " + bool5);
        System.out.println("Auto-boxing: " + bool6);
        System.out.println("Constant TRUE: " + bool7);

        // Практика 3

        Integer nullableInt = null;
        try {
            int unboxedValue = nullableInt; // Попытка unboxing -> NullPointerException
            System.out.println("Unboxed value: " + unboxedValue);
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение при unboxing: " + e.getMessage());
        }

        // Практика 4

        /* Объяснение:
         Класс Integer использует внутренний кэш (IntegerCache) для значений от -128 до 127.
         Когда вы выполняете auto-boxing для чисел в этом диапазоне (например, `Integer a2 = 127`),
         Java возвращает уже существующий объект из кэша, а не создает новый.
         Поэтому `a2` и `b2` указывают на один и тот же объект, и операция `==` (сравнение ссылок) возвращает true.

         Для чисел вне этого диапазона (например, 128) создаются новые объекты каждый раз.
         Поэтому `a1` и `b1` указывают на разные объекты, и `a1 == b1` возвращает false.

         Метод `equals()` всегда сравнивает значения, поэтому он возвращает true во всех случаях,
         где значения равны, независимо от того, являются ли это ссылки на один или разные объекты.
        */
    }

}