package vehicle;

public class Bike implements Vehicle {

    //Uma prática recomendada (@Override) para ajudar a encontrar erros e sinalizar com maior clareza que não são métodos novos, por exemplo
    @Override
    public void accelerate() {
        System.out.println("Acelerando a moto!");
    }

    @Override
    public void brake() {
        System.out.println("Freando a moto!");
    }

}
