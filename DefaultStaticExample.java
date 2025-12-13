public class DefaultStaticExample {

    //Практика
    public interface Java8Interface {

        static void staticMethod() {
            System.out.println("Статический метод интерфейса вызван.");
        }

        default void defaultMethod() {
            System.out.println("Default метод интерфейса вызван.");
        }

        void abstractMethod();
    }

    public static class Implementer implements Java8Interface {

        @Override
        public void abstractMethod() {
            System.out.println("Абстрактный метод реализован в классе.");
        }
    }

    /*
     * Практика 2
     *
     *
     *  Если класс реализует два интерфейса с одинаковыми default методами,
     * возникнет конфликт наследования. Компилятор не сможет решить, какой из двух
     * методов default вызвать. Чтобы решить эту проблему, класс-реализатор обязан
     * явно переопределить конфликтный метод. Внутри переопределенного метода можно
     * вызвать нужную реализацию default с помощью синтаксиса: InterfaceName.super.conflictedMethod().
     */
    public interface InterfaceA {
        default void conflictedMethod() {
            System.out.println("Default метод из InterfaceA.");
        }
    }

    public interface InterfaceB {
        default void conflictedMethod() {
            System.out.println("Default метод из InterfaceB.");
        }
    }

    public static class ConflictResolver implements InterfaceA, InterfaceB {
        // Обязательное переопределение для разрешения конфликта
        @Override
        public void conflictedMethod() {
            InterfaceA.super.conflictedMethod();
            InterfaceB.super.conflictedMethod();
        }
    }


    public static void main(String[] args) {
        Implementer impl = new Implementer();
        Java8Interface.staticMethod();
        impl.defaultMethod();
        impl.abstractMethod();

        
        ConflictResolver resolver = new ConflictResolver();
        resolver.conflictedMethod();
    }
}