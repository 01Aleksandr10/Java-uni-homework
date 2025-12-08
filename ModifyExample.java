public class ModifyExample {
    // Публичное поле (доступно везде)
    public String publicField = "Публичное поле";

    // Защищенное поле (доступно в том же пакете(типа папка) и в подклассах(наследник))
    protected String protectedField = "Защищенное поле";

    // Приватное поле (доступно только внутри этого класса)
    private String privateField = "Приватное поле";

    // Поле с отсутствующим спецификатором (package-private - он ставится по умолчанию) - доступно только в этом пакете
    String defaultField = "Поле по умолчанию (package-private)";

    //С методами по факту аналогично, но вот примеры

    // Публичный метод
    public void publicMethod() {
        System.out.println("Вызван публичный метод");
    }

    // Защищенный метод
    protected void protectedMethod() {
        System.out.println("Вызван защищенный метод");
    }

    // Приватный метод
    private void privateMethod() {
        System.out.println("Вызван приватный метод");
    }

    // Метод с отсутствующим спецификатором (package-private)
    void defaultMethod() {
        System.out.println("Вызван метод по умолчанию");
    }
    
}