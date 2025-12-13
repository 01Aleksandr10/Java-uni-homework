class String2Example {
    public static void main(String[] args) {
        // Практика 1

        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hello");

        // append() - добавляет строку в конец
        sb.append(" World");
        sbf.append(" World");
        System.out.println(sb); // Hello World
        System.out.println(sbf); // Hello World

        // insert() - вставляет строку по индексу
        sb.insert(5, ",");
        sbf.insert(5, ",");
        System.out.println(sb); // Hello, World
        System.out.println(sbf); // Hello, World

        // delete() - удаляет символы в диапазоне
        sb.delete(5, 7);
        sbf.delete(5, 7);
        System.out.println(sb); // Hello World
        System.out.println(sbf); // Hello World

        // reverse() - переворачивает строку
        sb.reverse();
        sbf.reverse();
        System.out.println(sb); // dlroW olleH
        System.out.println(sbf); // dlroW olleH

        // setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'H');
        sbf.setCharAt(0, 'H');
        System.out.println(sb); // HlroW olleH
        System.out.println(sbf); // HlroW olleH

        // length() - возвращает длину строки
        System.out.println(sb.length()); // 11
        System.out.println(sbf.length()); // 11

        // capacity() - возвращает текущую емкость буфера
        System.out.println(sb.capacity()); // > 11
        System.out.println(sbf.capacity()); // > 11

        // substring() - возвращает подстроку
        System.out.println(sb.substring(0, 5)); // HlroW
        System.out.println(sbf.substring(0, 5)); // HlroW

        // indexOf() - возвращает индекс первого вхождения подстроки
        System.out.println(sb.indexOf("W")); // 4
        System.out.println(sbf.indexOf("W")); // 4

        // replace() - заменяет подстроку
        sb.replace(0, 5, "Hello");
        sbf.replace(0, 5, "Hello");
        System.out.println(sb); // Hello olleH
        System.out.println(sbf); // Hello olleH

        // toString() - преобразует в String
        String strFromSB = sb.toString();
        String strFromSBF = sbf.toString();

        // Практика 2

        // String -> StringBuilder
        String str = "Test";
        StringBuilder sbFromStr = new StringBuilder(str);

        // String -> StringBuffer
        StringBuffer sbfFromStr = new StringBuffer(str);

        // StringBuilder -> String
        String strFromSB2 = sbFromStr.toString();

        // StringBuffer -> String
        String strFromSBF2 = sbfFromStr.toString();

        // StringBuilder -> StringBuffer
        StringBuffer sbfFromSB = new StringBuffer(sbFromStr);

        // StringBuffer -> StringBuilder
        StringBuilder sbFromSBF = new StringBuilder(sbfFromStr);
    }
}