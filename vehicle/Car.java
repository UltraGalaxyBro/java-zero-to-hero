package vehicle;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Acelerando o carro!");
    }

    @Override
    public void brake() {
        System.out.println("Freando o carro!");
    }
    
}
