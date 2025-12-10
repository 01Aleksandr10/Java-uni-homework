public class ExtendExample {
    // Практика #1
    class Parent {
        public final void finalMethod() {
            System.out.println("This is a final method in Parent.");
        }
    }

    class Child extends Parent {
        // Следующая строка вызовет ошибку компиляции:
        // public void finalMethod() { }
    }

    // Практика #2
    final class FinalClass {
        public void someMethod() {
            System.out.println("This is a method in a final class.");
        }
    }

// Следующая строка вызовет ошибку компиляции:
// class SubClass extends FinalClass { }
}
