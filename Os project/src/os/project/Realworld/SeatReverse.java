/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os.project;

/**
 *
 * @author pc
 */
public class SeatReverse  extends WriterReadersFirst implements Runnable {
    private Train t = new Train();
	private int numOfSeatsToBook;

	public SeatReverse (Train tr, int numOfSeatsToBook) {
		this.t = tr;
		this.numOfSeatsToBook = numOfSeatsToBook;
	}

	public void run() {

		System.out.println("Started Writer-Reserve Thread : "
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		if (t.bookTickets(numOfSeatsToBook)) {
			System.out.println("Thread " + Thread.currentThread().getName()
					+ ": Booked " + numOfSeatsToBook
					+ " seats..Remaining Seats: " + t.getRemainingSeats());
		} else {
			System.out.println("Thread " + Thread.currentThread().getName()
					+ " No Seats Available to Book..");
		}
	}
}
