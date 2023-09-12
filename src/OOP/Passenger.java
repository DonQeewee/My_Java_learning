package OOP;

//passenger class
class Passenger
{
    // passenger name
    private String name;
    // passenger seat id number
    private int seatId;
    Passenger(String name, int seatId)
    {
        this.name = name;
        this.seatId = seatId;
    }
    public String getPassengerName()
    {
        return this.name;
    }
    public int getPassengerId()
    {
        return this.seatId;
    }
}

