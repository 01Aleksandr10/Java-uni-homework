class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class OooExample {
    /**
     * При переопределении метода equals() необходимо соблюдать следующие соглашения:
     * 1. Рефлексивность: для любого ненулевого объекта x, x.equals(x) должен возвращать true.
     * 2. Симметричность: для любых ненулевых объектов x и y, x.equals(y) должен возвращать true
     *    тогда и только тогда, когда y.equals(x) возвращает true.
     * 3. Транзитивность: для любых ненулевых объектов x, y и z, если x.equals(y) возвращает true
     *    и y.equals(z) возвращает true, то x.equals(z) должен возвращать true.
     * 4. Согласованность: для любых ненулевых объектов x и y, несколько вызовов x.equals(y)
     *    должны возвращать одно и то же значение, пока сравниваемые объекты не изменяются.
     * 5. Ненулевое значение: для любого ненулевого объекта x, x.equals(null) должен возвращать false.
     */

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Bob", 25);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(null));
        System.out.println(p1.equals("Not a Person"));
    }
}