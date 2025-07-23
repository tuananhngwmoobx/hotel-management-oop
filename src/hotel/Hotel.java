package hotel;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private String name;

    private Map<String, Room> roomMap; // map from String datatype to Room object
                                        // Thay vì khi duyệt tìm kiếm room trên list thì dùng map sẽ nhanh chóng hơn
    public Hotel(String name) {
        this.name = name;
        this.roomMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Room> getRoomMap() {
        return roomMap;
    }

    public void setRoomMap(Map<String, Room> roomMap) {
        this.roomMap = roomMap;
    }
}
