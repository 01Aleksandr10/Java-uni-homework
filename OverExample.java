class Practice {
    // Практика #1: Пример перегруженных методов
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    // Практика #2: Пример переопределенного метода
    static class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Если тип возвращаемого значения не совпадает, компилятор выдаст ошибку.
    // Например, если бы в классе Dog метод makeSound возвращал int, это было бы ошибкой.

    // Практика #3: Пример использования аннотации @Override для обнаружения ошибки
    static class Parent {
        public void display() {
            System.out.println("Parent display");
        }
    }

    static class Child extends Parent {
        // Аннотация @Override помогает обнаружить ошибку, если метод не переопределяет родительский.
        // Например, если бы мы случайно написали "displai" вместо "display", компилятор выдал бы ошибку.
        @Override
        public void display() {
            System.out.println("Child display");
        }
    }

    public static void main(String[] args) {
        // Примеры вызова перегруженных методов
        System.out.println(add(5, 3));           // int
        System.out.println(add(5.5, 3.3));       // double
        System.out.println(add("Hello ", "World")); // String

        // Пример переопределенного метода
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound(); // Animal makes a sound
        dog.makeSound();    // Dog barks

        // Демонстрация полиморфизма
        Animal polymorphicAnimal = new Dog();
        polymorphicAnimal.makeSound(); // Dog barks (динамическое связывание)

        // Пример использования @Override
        Parent parent = new Parent();
        Child child = new Child();
        parent.display(); // Parent display
        child.display();  // Child display
    }
}