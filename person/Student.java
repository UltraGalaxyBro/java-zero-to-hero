package person;
// usando o extends para criar a herança de Pessoa
public class Student extends Person {
    private String registration;

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }
}
