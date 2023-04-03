package model;

public class WaterBill {
    private int rooms;
    private double corporatePercentage;
    private double borewellPercentage;
    private int guests;

    public WaterBill() {
    }

    public WaterBill(int rooms, double corporatePercentage, double borewellPercentage, int guests) {
        this.setRooms(rooms);
        this.setCorporatePercentage(corporatePercentage);
        this.setBorewellPercentage(borewellPercentage);
        this.setGuests(guests);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getCorporatePercentage() {
        return corporatePercentage;
    }

    public void setCorporatePercentage(double corporatePercentage) {
        this.corporatePercentage = corporatePercentage;
    }

    public double getBorewellPercentage() {
        return borewellPercentage;
    }

    public void setBorewellPercentage(double borewellPercentage) {
        this.borewellPercentage = borewellPercentage;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }
}
