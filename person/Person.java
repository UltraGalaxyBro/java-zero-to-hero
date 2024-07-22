package person;

public class Person {
    // Uma pessoa possui nome, idade, CPF
    String name;
    int age;
    String cpf;

    String PrintDataFromPerson() {
        return "O nome da pessoa é " + name + ". A idade é " + age + ". O CPF é " + cpf + ".";
    }
}
