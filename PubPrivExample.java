public class PubPrivExample {

    /**
     * Практика 1
     *
     * Внутренние классы (нестатические вложенные классы) могут иметь спецификаторы доступа:
     * public, protected, private и package-private (по умолчанию).
     *
     * * private: Доступен только внутри внешнего класса (PubPrivExample).
     * Его нельзя создать или использовать извне.
     * *package-private (по умолчанию): Доступен внутри внешнего класса
     * и любым классам в том же пакете. Его нельзя создать из других пакетов.
     * *protected: Доступен внутри внешнего класса, классам в том же пакете,
     * а также подклассам внешнего класса, даже если они находятся в другом пакете.
     * *public: Доступен везде, где доступен внешний класс.
     *
     * Поведение:
     * - private InnerClassA: Доступен только внутри PubPrivExample.
     * - InnerClassB (package-private): Доступен внутри PubPrivExample и из других классов в этом же пакете.
     * - protected InnerClassC: Доступен внутри PubPrivExamlpe, в пакете, и в его подклассах .
     * - public InnerClassD: Доступен всем.
     */
    private class InnerClassA {
        public void printA() {
            System.out.println("InnerClassA (private) - Доступен только извне через внешний класс.");
        }
    }

    class InnerClassB { // package-private (по умолчанию)
        public void printB() {
            System.out.println("InnerClassB (package-private) - Доступен внутри пакета.");
        }
    }

    protected class InnerClassC {
        public void printC() {
            System.out.println("InnerClassC (protected) - Доступен в пакете и в подклассах.");
        }
    }

    public class InnerClassD {
        public void printD() {
            System.out.println("InnerClassD (public) - Доступен всем.");
        }
    }

    // Пример использования private InnerClassA внутри внешнего класса
    public void usePrivateInnerClass() {
        InnerClassA a = new InnerClassA();
        a.printA();
    }

    /**
     *  Практика 2
     *
     * Имеет ли внутренний класс доступ к полям и методам внешнего класса?
     * Да, автоматически имеет доступ ко всем полям и методам внешнего класса,
     * включая private члены, благодаря неявной ссылке на объект внешнего класса (enclosing object).
     *
     * * Как возможность доступа зависит от спецификаторов доступа?
     * Она не зависит от спецификаторов доступа (private, public и т.д.) членов внешнего класса.
     * Внутренний класс всегда имеет полный доступ ко всем членам внешнего класса (как если бы они были объявлены
     * в самом внутреннем классе).
     */
    private int privateOuterField = 10;
    protected String protectedOuterMethod() {
        return "Protected Outer Method";
    }

    public class InnerClassAccessOuter {
        public void accessOuterMembers() {
            // Доступ к private полю внешнего класса
            System.out.println("Внутренний класс имеет доступ к private полю внешнего класса: " + privateOuterField);

            // Доступ к protected методу внешнего класса
            System.out.println("Внутренний класс имеет доступ к protected методу внешнего класса: " + protectedOuterMethod());

            // Изменение private поля внешнего класса
            privateOuterField = 20;
            System.out.println("Private поле внешнего класса изменено на: " + privateOuterField);
        }
    }

    /**
     * Практика 3
     *
     * Имеет ли внешний класс доступ к полям и методам внутреннего класса?
     * Да, имеет, при условии, что у него есть объект этого внутреннего класса, и доступ
     * разрешен спецификаторами доступа внутреннего класса.
     *
     * Как возможность доступа зависит от спецификаторов доступа внутреннего класса?
     * Зависит от спецификаторов доступа членов внутреннего класса точно так же, как и для
     * любых других классов.
     * - private член внутреннего класса доступен только внутри самого внутреннего класса.
     * - package-private член внутреннего класса доступен внутри пакета (включая внешний класс).
     * - protected член внутреннего класса доступен внутри пакета (включая внешний класс) и в подклассах.
     * - public член внутреннего класса доступен всем.
     *
     * Однако, если внешний класс объявляет внутренний класс как `private`,
     * то внешний класс может получить доступ к его private членам,
     * поскольку вложенные классы и их внешние классы считаются членами одной
     * единицы компиляции и имеют доступ к private членам друг друга
     */
    private class InnerClassAccessInner {
        private int privateInnerField = 50;
        public String publicInnerMethod() {
            return "Public Inner Method";
        }
    }

    public void accessInnerMembers() {
        InnerClassAccessInner inner = new InnerClassAccessInner();

        System.out.println("Внешний класс имеет доступ к public методу внутреннего класса: " + inner.publicInnerMethod());

        /** Доступ к private члену внутреннего класса
        * Здесь это возможно, потому что InnerClassAccessInner является private
        * членом PubPrivExample и они являются частью одного "единого" класса
         */
        System.out.println("Внешний класс имеет доступ к private полю внутреннего класса: " + inner.privateInnerField);
    }

    public static void main(String[] args) {
        PubPrivExample outer = new PubPrivExample();
        System.out.println("Прак 1");
        // Использование private-класса возможно только через метод внешнего класса
        outer.usePrivateInnerClass();

        // Создание package-private класса (доступно, так как в том же классе/пакете)
        InnerClassB b = outer.new InnerClassB();
        b.printB();

        // Создание protected класса (доступно, так как в том же классе/пакете)
        InnerClassC c = outer.new InnerClassC();
        c.printC();

        // Создание public класса (доступно)
        InnerClassD d = outer.new InnerClassD();
        d.printD();

        System.out.println("\nПрак 2");
        PubPrivExample.InnerClassAccessOuter innerAccessOuter = outer.new InnerClassAccessOuter();
        innerAccessOuter.accessOuterMembers();

        System.out.println("\nПрак 3");
        outer.accessInnerMembers();
    }
}