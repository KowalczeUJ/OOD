package facade;

import facade.airCondition.ApartmentAirConditioning;
import facade.airCondition.CorridorAirConditioning;
import facade.doors.ApartmentDoorsOne;
import facade.doors.ApartmentDoorsTwo;
import facade.lights.ApartmentsLights;
import facade.lights.CorridorLights;

public class Facade {

    private ApartmentDoorsOne doorsOne = new ApartmentDoorsOne();
    private ApartmentDoorsTwo doorsTwo = new ApartmentDoorsTwo();

    private CorridorAirConditioning corridorAirConditioning = new CorridorAirConditioning();
    private ApartmentAirConditioning apartmentAirConditioning = new ApartmentAirConditioning();

    private CorridorLights corridorLights = new CorridorLights();
    private ApartmentsLights apartmentsLights = new ApartmentsLights();

    public void openApartments() {
        doorsOne.openApartment();
        doorsTwo.openApartment();
    }

    public void closeApartments() {
        doorsOne.closeApartment();
        doorsTwo.closeApartment();
    }

    public void openDoors() {
        doorsOne.openTheDoors();
        doorsTwo.openTheDoors();
    }

    public void closeDoors() {
        doorsOne.closeTheDoors();
        doorsTwo.closeTheDoors();
    }

    public void turnOnAirConditioning() {
        corridorAirConditioning.on();
        apartmentAirConditioning.on();
    }

    public void turnOffAirConditioning() {
        corridorAirConditioning.off();
        apartmentAirConditioning.off();
    }

    public void switchOnTheLights() {
        corridorLights.switchOn();
        apartmentsLights.switchOn();
    }

    public void switchOffTheLights() {
        corridorLights.switchOff();
        apartmentsLights.switchOff();
    }

    public static void main(String[] args) {
        Facade control = new Facade();

        control.openApartments();
        control.openDoors();
        control.switchOnTheLights();
        control.turnOnAirConditioning();
        control.switchOffTheLights();
        control.turnOffAirConditioning();
        control.closeDoors();
        control.closeApartments();
    }

}
