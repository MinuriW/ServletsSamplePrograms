package domain;

 

public class SeatingSection {
    private int id;
    private String seatingType;
    private double ticketCost;
    private int numberOfSeats;

 

    public SeatingSection() {
    }

 

    public SeatingSection(int id, String seatingType, double ticketCost, int numberOfSeats) {
        this.id = id;
        this.seatingType = seatingType;
        this.ticketCost = ticketCost;
        this.numberOfSeats = numberOfSeats;
    }

 

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getSeatingType() {
        return seatingType;
    }

 

    public void setSeatingType(String seatingType) {
        this.seatingType = seatingType;
    }

 

    public double getTicketCost() {
        return ticketCost;
    }

 

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

 

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

 

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
}
 