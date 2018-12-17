package facade.lights;

public class CorridorLights implements ILights {

    @Override
    public void switchOn() {
        System.out.println("Lights has been switched on in the corridors.");
    }

    @Override
    public void switchOff() {
        System.out.println("Lights has been switched on in the corridors.");
    }
}
