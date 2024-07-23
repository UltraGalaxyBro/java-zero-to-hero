package person;

public class Person {
    // Uma pessoa possui nome, idade, CPF
    private String name;
    private int age;
    private String cpf;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    String PrintDataFromPerson() {
        return "O nome da pessoa é " + name + ". A idade é " + age + ". O CPF é " + cpf + ".";
    }
}
