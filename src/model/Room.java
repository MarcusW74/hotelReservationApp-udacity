package model;

public class Room implements IRoom {

    String roomNumber;
    Double price;
    RoomType enumeration;

    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + "Room Price: " + getRoomPrice() +
                "Room Type: " + getRoomType();
    }
}
