public class AnnotationExample {

    /**
     * @Override
     *
     * /** Аннотация @Override используется для маркировки метода в подклассе,
     * который переопределяет метод суперкласса или реализует метод из интерфейса.
     * Она заставляет компилятор проверить, что родительский метод с такой же сигнатурой
     * действительно существует. Если метод не найден, компилятор выдаст ошибку.
     */
    public static class ParentClass {
        public void displayInfo() {
            System.out.println("Метод родительского класса.");
        }
    }

    public static class ChildClass extends ParentClass {
        @Override
        public void displayInfo() {
            System.out.println("Метод переопределен в дочернем классе.");
        }
    }

    /**
     * @Deprecated
     *
     * Аннотация @Deprecated используется для маркировки классов, методов, полей или
     * других элементов программы, которые являются устаревшими и не рекомендуются к использованию.
     * Она сигнализирует разработчикам, что этот элемент может быть удален в будущих версиях.
     * Компилятор выдает предупреждение, когда такой элемент используется.
     */
    public static class OldCode {
        @Deprecated
        public void oldMethod() {
            // Этот метод устарел и скоро будет удален
            System.out.println("Используется устаревший метод.");
        }

        public void newMethod() {
            System.out.println("Используется новый метод.");
        }
    }

    /**
     * @SuppressWarnings
     * /** Аннотация @SuppressWarnings используется для подавления предупреждений компилятора
     * для определенного элемента кода (класса, метода, поля). Она позволяет программисту
     * явно указать, что он знает о потенциальной проблеме (например, неиспользуемом коде или
     * небезопасных операциях), но считает ее безопасной или неизбежной в данном контексте,
     * избегая засорения вывода компилятора.
     */

    @SuppressWarnings("unchecked") // Подавляем предупреждение о небезопасном (unchecked) преобразовании для всего класса
    public static class WarningSuppressor {

        // Пример, где часто возникает предупреждение о необработанном типе (raw type)
        public java.util.List list;

        @SuppressWarnings("rawtypes") // Подавляем предупреждение только для этого метода
        public void processList() {
            list = new java.util.ArrayList();
            list.add("Element");
            System.out.println("Предупреждение о 'raw type' подавлено в этом методе.");
        }
    }

    public static void main(String[] args) {
        // Пример использования @Override
        ChildClass child = new ChildClass();
        child.displayInfo();

        // Пример использования @Deprecated (компилятор выдаст предупреждение, но код будет работать)
        OldCode old = new OldCode();
        old.oldMethod(); // В IDE или при компиляции здесь будет предупреждение

        // Пример использования @SuppressWarnings
        WarningSuppressor suppressor = new WarningSuppressor();
        suppressor.processList();
    }
}