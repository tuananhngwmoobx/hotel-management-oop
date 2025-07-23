package employee;

import hotel.Room;

import java.util.LinkedList;
import java.util.List;

public abstract class Employee {
    private String id;
    private String name;
    private List<Room> rooms = new LinkedList<>(); // 1 emoployee can manage multiple rooms

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
