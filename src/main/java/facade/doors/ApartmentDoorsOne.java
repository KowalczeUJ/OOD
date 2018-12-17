package facade.doors;

public class ApartmentDoorsOne implements IDoors {


    @Override
    public void openTheDoors() {
        System.out.println("Opening the doors in apartment 1.");
    }

    @Override
    public void closeTheDoors() {
        System.out.println("Closing the doors in apartment 1.");
    }

    @Override
    public void openApartment() {
        System.out.println("Opening apartment 1.");
    }

    @Override
    public void closeApartment() {
        System.out.println("Closing apartment 1.");
    }
}
