package challenges.listchallenge;

import java.util.ArrayList;
import java.util.List;

enum Line {
    A,B,C,D,E,F,G,H
  }

public class Theatre {
    private String name;
    private List<Seat> seats=new ArrayList<>();
    private int numRows;
    private int numSeatsPerRow;

    private int availbleSeats;
    private int soldSeats;
    private int totalIncome;

    public Theatre(String name, int numRows, int numSeatsPerRow) {
        this.name = name;
        this.numRows = numRows;
        this.numSeatsPerRow = numSeatsPerRow;
        this.availbleSeats=0;
        this.soldSeats=0;
        this.totalIncome=0;

        for (Line line : Line.values()) {
            for(int i=1; i<=numSeatsPerRow; i++){
                seats.add(new Seat(line.toString(), i, 50));  
                availbleSeats+=1;  
            }
        }
   }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Seat> getSeats() {
        return seats;
    }
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
    public int getNumRows() {
        return numRows;
    }
    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }
    public int getNumSeats() {
        return numSeatsPerRow;
    }
    public void setNumSeats(int numSeats) {
        this.numSeatsPerRow = numSeats;
    }

    public boolean reserve(String seat){
        if(isValidSeat(seat)){
            
            String line =Character.toString(seat.charAt(0));
            int row= seat.charAt(1)-'0';
            //System.out.println("line: "+line+" row :"+ row);
            
            for(Seat s: seats){
                if(s.getLine().equalsIgnoreCase(line) && s.getRow()==row && s.isAvailable()){
                    s.setAvailable(false);
                    availbleSeats-=1;
                    soldSeats+=1;
                    totalIncome+=s.getPrice();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cancelReservation(String seat){
        if(isValidSeat(seat)){           
            String line =Character.toString(seat.charAt(0));
            int row= seat.charAt(1)-'0';
            
            for(Seat s: seats){
                if(s.getLine().equalsIgnoreCase(line) && s.getRow()==row && s.isAvailable()==false){
                    s.setAvailable(true);
                    availbleSeats+=1;
                    soldSeats-=1;
                    totalIncome-=s.getPrice();
                    return true;
                }
            }
        }
        return false;

    }

    public boolean isValidSeat(String seat){
        if(seat.matches("([A-Z]{1}|[a-z]{1})[0-8]")){
            return true;
        }
        return false;
    }

    

    public void printSeatingChart(){
        System.out.println(name);
        for(int i=0; i<seats.size(); i++){
            if(i%numSeatsPerRow==0){
                System.out.println("");
            }
            seats.get(i).printSeat();
        }
        System.out.println("Total Available: "+availbleSeats);
        System.out.println("Total Sold: "+soldSeats);
        System.out.println("Total Income: "+totalIncome);

    }

    public int getAvailbleSeats() {
        return availbleSeats;
    }
    public int getSoldSeats() {
        return soldSeats;
    }
    public int getTotalIncome() {
        return totalIncome;
    }



}
