public class third {
    //First practice
        // Целочисленные типы
        byte myByteZero;        // 0
        byte myByteNonZero = 42;

        short myShortZero;      // 0
        short myShortNonZero = 1000;

        int myIntZero;          // 0
        int myIntNonZero = 123456;

        long myLongZero;        // 0L
        long myLongNonZero = 9876543210L;

        // Типы с плавающей точкой
        float myFloatZero;      // 0.0f
        float myFloatNonZero = 3.14f;

        double myDoubleZero;    // 0.0
        double myDoubleNonZero = 2.71828;

        // Символьный тип
        char myCharZero;        // '\u0000'
        char myCharNonZero = 'A';

        // Булевский тип
        boolean myBoolZero;     // false
        boolean myBoolNonZero = true;

        public void printValues() {
            System.out.println("byte: " + myByteZero + ", " + myByteNonZero);
            System.out.println("short: " + myShortZero + ", " + myShortNonZero);
            System.out.println("int: " + myIntZero + ", " + myIntNonZero);
            System.out.println("long: " + myLongZero + ", " + myLongNonZero);
            System.out.println("float: " + myFloatZero + ", " + myFloatNonZero);
            System.out.println("double: " + myDoubleZero + ", " + myDoubleNonZero);
            System.out.println("char: '" + myCharZero + "', '" + myCharNonZero + "'");
            System.out.println("boolean: " + myBoolZero + ", " + myBoolNonZero);
        }

    /*
     *Third practice
     * В данном случае нам выдаст ошибку компиляции, так как a объявлена в основном блоке и c вызывается в нем же,
     * но b вызывается внутри {...}, то есть у нее область видимости ограничена этим блоком, из-за чего
     * при подсчете c переменная b просто не может быть использована
     */

    //Fourth practice + в main
    //Вспомогательный класс
    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Имя: " + name + ", Возраст: " + age;
        }
    }

        //Седьмая практика + main

    interface Drawable {
        void draw();
        void erase();
    }

    // Класс, реализующий интерфейс
    static class Circle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Рисую круг");
        }

        @Override
        public void erase() {
            System.out.println("Стираю круг");
        }
    }






        public static void main(String[] args) {
            // Second practice
            // Александр в формате Unicode
            System.out.println("\u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u0440");

            //Fourth practice
            int age = 30;
            String message1 = "Мне " + age + " лет.";
            System.out.println(message1); // Вывод: Мне 30 лет.

            // Пример 2: String + базовый тип (double)
            double price = 19.99;
            String message2 = "Цена: " + price + " руб.";
            System.out.println(message2); // Вывод: Цена: 19.99 руб.

            // Пример 3: String + объект (с вызовом toString())
            Object obj = new Object();
            String message3 = "Объект: " + obj;
            System.out.println(message3); // Вывод: Объект: java.lang.Object@<хеш-код>

            // Пример 4: String + объект (собственный класс, переопределяющий toString())
            Person person = new Person("Иван", 25);
            String message4 = "Персона: " + person;
            System.out.println(message4); // Вывод: Персона: Имя: Иван, Возраст: 25

            // Пример 5: String + null
            String name = null;
            String message5 = "Имя: " + name;
            System.out.println(message5); // Вывод: Имя: null

            //Пятая практика
            /*
            Если в операции участвуют операции разных типаов, то Java автоматически пытается сделать
            неявное преобразование типов, если это возможно, чтобы привести все операнды к более широкому типу
             */
            // Пример 1: int + double -> результат double (неявное приведение)
            int intValue = 5;
            double doubleValue = 3.14;
            double result1 = intValue + doubleValue; // 5.0 + 3.14 = 8.14
            System.out.println("int + double: " + result1); // Вывод: 8.14

            // Пример 2: byte + short -> результат int (расширение до int)
            byte byteValue = 10;
            short shortValue = 20;
            int result2 = byteValue + shortValue; // 10 + 20 = 30
            System.out.println("byte + short: " + result2); // Вывод: 30

            // Пример 3: float * long -> результат float (неявное приведение long к float)
            float floatValue = 2.5f;
            long longValue = 1000L;
            float result3 = floatValue * longValue; // 2.5 * 1000 = 2500.0
            System.out.println("float * long: " + result3); // Вывод: 2500.0

            // Пример 4: int / int -> результат int (целочисленное деление), но при приведении к double
            int numerator = 7;
            int denominator = 3;
            double result4 = (double) numerator / denominator; // 7.0 / 3 = 2.333...
            System.out.println("int / int (с приведением): " + result4); // Вывод: 2.333...

            // Пример 5: char + int -> результат int (char неявно приводится к int)
            char charValue = 'A'; // Unicode 'A' = 65
            int addValue = 1;
            int result5 = charValue + addValue; // 65 + 1 = 66
            System.out.println("char + int: " + result5); // Вывод: 66
            System.out.println("char + int (как символ): " + (char) result5); // Вывод: B

            //Шестая практика

            // Пример 1: double -> int (потеря дробной части)
            double bigDouble = 123.99;
            int smallInt = (int) bigDouble;
            System.out.println("double -> int: " + bigDouble + " -> " + smallInt);

            // Пример 2: long -> int (возможна потеря данных при переполнении)
            long bigLong = 10000000000L;
            int smallInt2 = (int) bigLong;
            System.out.println("long -> int: " + bigLong + " -> " + smallInt2);

            //Седьмая практика
            // Компилятор выведет тип как Drawable (тип интерфейса)
            var shape = new Circle(); // var позволяет не писать явно тип, компилятор сам его определяет

            // Вызов методов через интерфейс
            shape.draw(); // Вывод: Рисую круг
            shape.erase(); // Вывод: Стираю круг

            // Можно также явно указать тип интерфейса
            Drawable anotherShape = new Circle();
            anotherShape.draw(); // Вывод: Рисую круг
        }
}



