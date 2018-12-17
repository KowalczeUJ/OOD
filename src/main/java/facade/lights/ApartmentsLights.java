package facade.lights;

public class ApartmentsLights implements ILights {

    @Override
    public void switchOn() {
        System.out.println("Lights has been switched on in the apartments.");
    }

    @Override
    public void switchOff() {
        System.out.println("Lights has been switched off in the apartments.");
    }
}
