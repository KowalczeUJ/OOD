package facade.airCondition;

public class CorridorAirConditioning implements IAirConditioning {

    @Override
    public void on() {
        System.out.println("Air conditioning has been turned on in the corridors.");
    }

    @Override
    public void off() {
        System.out.println("Air conditioning has been turned off in the corridors.");
    }
}
