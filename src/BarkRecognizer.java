// We need software to run when the hardware "hears" a bark.
public class BarkRecognizer {

    // Store the DogDoor that this BarkRecognizer is attatched too in this member variable
    private DogDoor door;

    // BarkRecognizer needs too know *which* door it will open.
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    // Every time the hardware hears a bark, it will call this method with the sound of the bark it heard.
    public void recognize(String bark) {

        // Output a message letting the system know we heard a bark.
        System.out.println("    BarkRecognizer: Heard a '" +
            bark + "'");
        door.open();
    }
}
