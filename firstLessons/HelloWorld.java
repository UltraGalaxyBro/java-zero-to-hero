package firstLessons;
/*
 * HelloWorld == O nome da classe
 * public == Tipo de acesso da classe. Nesse caso quer dizer que é acessível por todo o projeto
 * class == Tipo da estrutura que no caso é uma classe
 */
public class HelloWorld {
    /*
     * static == Demonstra que pertence a essa classe específica o método a seguir
     * ao invés de uma instância passada, por exemplo
     * void == É o tipo de retorno que o método deve ter. No caso ao ser executado o
     * método, não retornará nada
     * main == Sinalizando ao JAVA que é o ponto de partida do programa
     * String [] args == São basicamnete os argumentos que desejo receber no meu
     * método
     */
    public static void main(String[] args) {
        // Valores numéricos (int, double, float, long)
        // Texto (String)
        // Booleano (boolean)
        int dadoInt = 3;
        double dadoDouble = 10.25;
        float dadoFloat = 10.25f;
        long dadoLong = 8797898778987978L;
        String dadoString = "Hello, Universe!";
        boolean dadoBoolean = false;

        if (dadoInt == 15) {
            // sysout é basicamente o printf do Python (Sem pular linhas), por exemplo. Exibe o texto no
            // terminal
            System.out.println("O dadoInt é igual a 15.");
        } else if (dadoInt == 10) {
            System.out.println("O dadoInt é igual a 10.");
        } else {
            System.out.println("Não é 15 e nem 10.");
        }

        while (dadoInt < 15) {
            if (dadoInt == 14) {
                System.out.println("Está para completar 15 no dadoInt por agora");
                dadoInt++;
            } else {
                System.out.println("Ainda não é 15 no dadoInt. Na verdade é " + dadoInt);
                dadoInt++;
            }
        }

        System.out.println("Saindo do while.");
        System.out.println("Entrando no for...");

        for(int i = 0; i < 5; i++){
            System.out.println("O valor de i é " + i);
        }

        System.out.println("Saindo do for");
    }
}