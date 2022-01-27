package model;

public class FreeRoom extends Room{

    public void Room() {
        price = Double.valueOf(0);
    }

    @Override
    public String toString() {
        return "The price for this room is:" + price;
    }
}
