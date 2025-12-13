public class InterfaceExample {

    public interface MyInterface {

        class NestedClass {
            public void nestedMethod() {
                System.out.println("Boom");
            }
        }
    }

    public static void main(String[] args) {
        MyInterface.NestedClass nestedObject = new MyInterface.NestedClass();
        nestedObject.nestedMethod();
    }
}