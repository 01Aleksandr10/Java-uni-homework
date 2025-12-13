class MyFirstException extends Exception {
    public MyFirstException() {
        super();
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

class MyException {
    public static void main(String[] args) {
        // Пример использования собственного исключения
        try {
            throw new MyFirstException("БЭУМ");
        } catch (MyFirstException e) {
            System.out.println(e.getMessage());
        }
    }
}