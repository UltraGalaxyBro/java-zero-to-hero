package person;

public class testOfPerson {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setCpf("043.005");
        teacher.setName("Pablo");
        teacher.setAge(28);
        teacher.setWage(50000);

        System.out.println(teacher.PrintDataFromPerson());
        System.out.println(teacher.getWage());

        Student student = new Student();
        student.setCpf("185.556");
        student.setName("Cláudio");
        student.setAge(65);
        student.setRegistration("5555-4444-02");

        System.out.println(student.PrintDataFromPerson());
        System.out.println(student.getRegistration());
    }
}
