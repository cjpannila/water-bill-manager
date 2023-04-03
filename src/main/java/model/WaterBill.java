package model;

public class WaterBill {
    private int rooms;
    private double corporatePercentage;
    private double borewellPercentage;
    private int guests;
    private int totalWaterLiters;
    private int totalCost;

    public WaterBill() {
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

    public int getTotalWaterLiters() {
        return totalWaterLiters;
    }

    public void setTotalWaterLiters(int totalWaterLiters) {
        this.totalWaterLiters = totalWaterLiters;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
