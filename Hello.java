public class Hello {
    public Hello(String name){
        System.out.println("Привет "+name);
    }

    public Hello(String name,
                 String surname){
        System.out.println("Здравствуйте, "+name+" "+surname);
    }

    public Hello(String name,
                 String surname,
                 String patronymic){
        System.out.println("Здравствуйте, "+surname+" "+name+" "+patronymic);
    }
}
