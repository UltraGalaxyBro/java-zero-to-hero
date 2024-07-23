package vehicle;

public class TestOfVehicle {
    public static void main(String[] args) {
        //Em interfaces não tem como 'instanciar' a Super Classe
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.accelerate();
        car.brake();

        bike.accelerate();
        bike.brake();
    }

}
