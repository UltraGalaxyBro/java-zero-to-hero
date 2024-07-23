package person;
// usando o extends para criar uma herança
public class Teacher extends Person {

    private double wage;

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }
}
