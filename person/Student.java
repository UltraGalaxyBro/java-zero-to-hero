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
//polimorfismo no método 
    String PrintDataFromPerson(){
        //mantendo o procedimento do método na classe pai, que no caso é Pessoa e então continua com o comportamento específico
        System.out.println(super.PrintDataFromPerson());
        return "Temos um aluno nesse caso!";
    }
}
