package facade.airCondition;

public class ApartmentAirConditioning implements IAirConditioning {

    @Override
    public void on() {
        System.out.println("Air conditioning has been turned on in all apartments.");
    }

    @Override
    public void off() {
        System.out.println("Air conditioning has been turned off in all apartments.");
    }
}
