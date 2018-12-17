package facade.doors;

public class ApartmentDoorsTwo implements IDoors {

    @Override
    public void openTheDoors() {
        System.out.println("Opening the doors in apartment 2.");
    }

    @Override
    public void closeTheDoors() {
        System.out.println("Opening the doors in apartment 2.");
    }

    @Override
    public void openApartment() {
        System.out.println("Opening apartment 2.");
    }

    @Override
    public void closeApartment() {
        System.out.println("Closing apartment 2.");
    }
}
