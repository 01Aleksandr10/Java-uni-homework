public class SuperThisExample {
    // Практика #1
    class Parent {
        protected int parentField = 10;

        protected void parentMethod() {
            System.out.println("Parent method called.");
        }

        public Parent(String message) {
            System.out.println("Parent constructor: " + message);
        }
    }

    class Child extends Parent {
        private int childField = 20;

        public Child() {
            super("from Child"); // Вызов конструктора родителя
            System.out.println("Child constructor called.");
        }

        public void accessParentMembers() {
            System.out.println("Parent field value: " + super.parentField); // Доступ к полю родителя
            super.parentMethod(); // Вызов метода родителя
        }

        @Override
        public void parentMethod() {
            super.parentMethod(); // Вызов переопределенного метода родителя
            System.out.println("Child method called.");
        }
    }

// Практика #2
// При вызове метода method() объекта класса C, переменная a и метод method() будут доступны,
// так как они наследуются от класса A через класс B. Наследование передает все члены,
// объявленные в суперклассе, в подкласс, даже если промежуточный класс (B) их не переопределяет.
// Поэтому строка 'int a = super.a;' и вызов 'super.method();' в классе C будут корректными.

    // Практика #3
    class A {
        int a;
        int b;
        int c;
        int z;

        public A() {
            this(0);
        }

        public A(int a) {
            this(a, 0);
        }

        public A(int a, int b) {
            this(a, b, 0);
        }

        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            z = 1;
        }
    }
}
