package person;

public class testOfPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.cpf = "043.005.731-82";
        person.name = "Pablo Nogueira de Faria";
        person.age = 28;

        System.out.println(person.PrintDataFromPerson());
    }
}
