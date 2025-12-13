class BomExample {
    public static void main(String[] args) {
        try {
            // Это исключение будет перехвачено.
            int a = 10 / 2;
            if (a == 5) {
                throw new IllegalArgumentException("Первое исключение, будет перехвачено");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }

        // Это исключение в аварйку
        throw new RuntimeException("Второе исключение, приведет к аварийной остановке");
    }
}