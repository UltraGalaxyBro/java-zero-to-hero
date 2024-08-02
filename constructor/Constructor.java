package constructor;

//Conceitos de um construtor.
public class Constructor {
    // 1 - Obrigatoriamente ele precisa ter o mesmo nome da classe em que se situa;
    // 2 - Ele não possui nenhum tipo de retorno, portanto não é necessário definir o mesmo;
    // 3 - Podem haver vários parâmetros para um construtor;
    // 4 - Podem haver vários construtores dentro de apenas uma classe;
    private int number;

    /* private Constructor(int number) {
        this.number = number;
        System.out.println("Construtor com somente um parâmetro criado.");
    } */

    public Constructor(int number, String text) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
