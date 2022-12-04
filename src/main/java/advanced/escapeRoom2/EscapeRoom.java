package advanced.escapeRoom2;

import java.util.List;

//klasa serwisowa - w niej będą realizowane zasady gry
public class EscapeRoom {

    private Room room = new Room();

    public EscapeRoom() {
        Key key = new Key("Klucz");
        Window window = new Window("Okno");
        Door door = new Door("Drzwi");
        room.addItem(key);
        room.addItem(window);
        room.addItem(door);
    }
    public List<Object> getItems() {
        return room.getItems();
    }


}