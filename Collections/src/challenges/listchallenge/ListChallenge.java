package challenges.listchallenge;

public class ListChallenge {
    public static void main(String[] args) {
        Theatre theatre= new Theatre("CINEPOLIS",8, 8);

        //VALID SEATS
        theatre.reserve("a3");
        theatre.reserve("A4");
        theatre.reserve("A7");
        theatre.reserve("D3");
        theatre.reserve("D4");
        theatre.reserve("D5");
        theatre.reserve("C7");
        theatre.reserve("B4");
        theatre.reserve("H7");

        //INVALID SEATS
        theatre.reserve("a0");
        theatre.reserve("A400");
        theatre.reserve("X7");
        theatre.reserve("");
        theatre.reserve("00");
        theatre.reserve("AA");
        theatre.reserve("D4");

        //CANCEL SEAT
        theatre.cancelReservation("A4");

        theatre.printSeatingChart();

//OUTPUT
/*
CINEPOLIS

..[A3]...[A7].
...[B4]....
......[C7].
..[D3][D4][D5]...
........
........
........
......[H7].Total Available: 56
Total Sold: 8
Total Income: 400
*/

    }
}
