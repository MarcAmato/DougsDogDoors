public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...\n");
        // Now the button will open the door AND start a timer to close that door.
        remote.pressButton();

        System.out.println("Fido has gone outside...\n");
        System.out.println("Fido's all done...\n");
        System.out.println("Fido's back inside...\n");
    }
}
