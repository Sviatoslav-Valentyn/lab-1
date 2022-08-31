import java.util.Objects;

public class Room {
    private TypeRoom typeRoom;
    private String sniezka;
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfFurniture;
    private int numberOfChandeliers;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Room room = (Room) o;
        return numberOfDoors == room.numberOfDoors && numberOfWindows == room.numberOfWindows && numberOfFurniture == room.numberOfFurniture && numberOfChandeliers == room.numberOfChandeliers && typeRoom == room.typeRoom && sniezka.equals(room.sniezka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeRoom, sniezka, numberOfDoors, numberOfWindows, numberOfFurniture, numberOfChandeliers);
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(final TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getSniezka() {
        return sniezka;
    }

    public void setSniezka(final String sniezka) {
        this.sniezka = sniezka;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(final int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(final int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfFurniture() {
        return numberOfFurniture;
    }

    public void setNumberOfFurniture(final int numberOfFurniture) {
        this.numberOfFurniture = numberOfFurniture;
    }

    public int getNumberOfChandeliers() {
        return numberOfChandeliers;
    }

    public void setNumberOfChandeliers(final int numberOfChandeliers) {
        this.numberOfChandeliers = numberOfChandeliers;
    }

    public Room(final String sniezka, final TypeRoom typeRoom, final int numberOfDoors, final int numberOfWindows,
                final int numberOfFurniture, final int numberOfChandeliers)  {
        this.sniezka = sniezka;
        this.typeRoom = typeRoom;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfFurniture = numberOfFurniture;
        this.numberOfChandeliers = numberOfChandeliers;
    }

    public void buildDoors() {
        numberOfDoors++;
    }
    public void buildWindows() {
        numberOfWindows++;
    }
    public void addFurniture() {
        numberOfFurniture++;
    }
    public void addChandeliers() {
        numberOfChandeliers++;
    }

    public void demolishDoors() {
        if(numberOfDoors > 0){
            numberOfDoors--;
        }else {
            System.out.println("Impossible demolish door");
        }
    }
    public void demolishWindows() {
        if(numberOfWindows > 0){
            numberOfWindows--;
        }else {
            System.out.println("Impossible demolish Window");
        }
    }
    public void takeAwayFurniture() {
        if(numberOfFurniture > 0){
            numberOfFurniture--;
        }else {
            System.out.println("Impossible take away Furniture");
        }
    }
    public void takeAwayChandeliers() {
        if(numberOfChandeliers > 0){
            numberOfChandeliers--;
        }else {
            System.out.println("Impossible take away Chandeliers");
        }
    }
    public void sniezkaInRoom(final String sniezka) {
        setSniezka(sniezka);
    }

    public void changeTypeRoom(final TypeRoom typeRoom) {
        setTypeRoom(typeRoom);
    }
    public String toString() {
        return "Room: "  + "sniezka=" + sniezka + ", typeRoom=" + typeRoom + " " + ", numberOfDoors="
                + numberOfDoors + ", numberOfWindows=" + numberOfWindows + ", numberOfFurniture="
                + numberOfFurniture + ", numberOfChandeliers=" + numberOfChandeliers;
    }
}
