
class TicketBooking {
    int availableSeats;

    TicketBooking(int seats) {
        availableSeats = seats;
    }

    // Synchronized method
    synchronized void bookSeat(String user, int seats) {
        if (availableSeats >= seats) {
            availableSeats = availableSeats - seats;

            System.out.println(user + " booked "
                    + seats + " seat(s) successfully");
        } else {
            System.out.println(user
                    + " booking failed. Not enough seats");
        }
    }
}

class User1 extends Thread {
    TicketBooking booking;

    User1(TicketBooking booking) {
        this.booking = booking;
    }

    public void run() {
        booking.bookSeat("User1", 1);
    }
}

class User2 extends Thread {
    TicketBooking booking;

    User2(TicketBooking booking) {
        this.booking = booking;
    }

    public void run() {
        booking.bookSeat("User2", 2);
    }
}

public class A3_Q7 {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking(2);

        User1 u1 = new User1(booking);
        User2 u2 = new User2(booking);

        u1.start();
        u2.start();
    }
}
