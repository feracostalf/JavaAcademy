package challenges.listchallenge;

public class Seat {
    private String line;
    private int row;
    private double price;
    private boolean isAvailable;

    public Seat(String line, int row, double price) {
        this.line = line;
        this.row = row;
        this.price = price;
        this.isAvailable=true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    
    public void printSeat(){
        if(isAvailable){
            System.out.print(".");
        }
        else{
            System.out.print("["+line+row+"]");
        }
        
    }
}
