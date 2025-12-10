public class VarargsExample {
    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void printNumbers(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printObjects(Object... objs) {
        for (Object obj : objs) {
            System.out.println(obj.toString());
        }
    }

    public static void printObjects(String separator, Object... objs) {
        for (int i = 0; i < objs.length; i++) {
            if (i > 0) {
                System.out.print(separator);
            }
            System.out.print(objs[i].toString());
        }
        System.out.println();
    }
}