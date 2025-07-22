package hotel;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private String name;

    private Map<String, Room> roomMap; // map from String datatype to Room object

    public Hotel(String name) {
        this.name = name;
        this.roomMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }
}
