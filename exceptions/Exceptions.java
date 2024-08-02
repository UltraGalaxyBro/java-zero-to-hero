package exceptions;

import person.Person;

public class Exceptions {
    // checked exceptions
    /* public static void main(String[] args) throws Exception {
        try {
            validateNumber();
        } catch (Exception e) {
            System.out.println("Houve um erro. Informe-se com o suporte");
            e.printStackTrace();
        }

    }

    public static void validateNumber() throws Exception {
        int number = 10;
        if (number < 100) {
            throw new Exception("Erro apresentado. Exceção ativada por number ser menor que 100.");
        }
    } */

    // unchecked exceptions
    public static void main(String[] args) {
        Person p = null;
        p.getCpf();
    }
}
