public class LoopsExample {
    public static void main(String[] args) {
        //1 практика

        //while
        System.out.println("Бесконечный цикл с while:");
        while (true) {
            System.out.println("Этот цикл никогда не закончится!");
            try {
                Thread.sleep(1000); // пауза 1 секунда
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        // do-while
        System.out.println("\nБесконечный цикл с do-while:");
        do {
            System.out.println("Этот цикл никогда не закончится!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        } while (true);

        //2 практика

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Пропуск " + i);
                continue;
            }

            // Останавливаем цикл, когда достигаем 7
            if (i == 7) {
                System.out.println("СТОП");
                break;
            }
        }
    }
}
