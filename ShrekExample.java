class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

class ShrekExample {
    // Практика 1
    public static void main(String[] args) {
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Обработано как Ex3");
        } catch (Ex2 e) {
            System.out.println("Обработано как Ex2"); // Этот блок никогда не будет достигнут, если есть catch(Ex3)
        } catch (Ex1 e) {
            System.out.println("Обработано как Ex1"); // Этот блок никогда не будет достигнут, если есть catch(Ex2) или catch(Ex3)
        }

        // Пример обработки нескольких исключений идентичным образом (с использованием оператора |)
        try {
            int choice = 1;
            if (choice == 1) throw new Ex1();
            else if (choice == 2) throw new Ex2();
            else throw new Ex3();
        } catch (Ex1 | Ex2 | Ex3 e) { // Обработка всех трех исключений одним блоком
            System.out.println("Исключение обработано одинаково: " + e.getClass().getSimpleName());
        }
    }

    // Практика 2
    // Использование ключевого слова 'final' перед параметром исключения в блоке catch означает,
    // что переменная 'e' является финальной и ее значение (ссылка на объект исключения) нельзя изменить внутри блока catch.
    // Это гарантирует, что ссылка на исключение останется неизменной и не будет случайно перезаписана.
    // Например, следующая попытка приведет к ошибке компиляции:
    // catch (final Exception e) {
    //     e = new Exception(); // Ошибка: нельзя изменять final переменную
    // }
}