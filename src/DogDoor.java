// Assume the DogDoor class will interface with Doug's custom door hardware.
// This code will control the hardware on the dog door.
public class DogDoor {

    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    // Return the state of the door.
    public boolean isOpen() {
        return open;
    }
}
