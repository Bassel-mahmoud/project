/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os.project;

/**
 *
 * @author pc
 */
public class SeatCancel extends WriterReadersFirst implements Runnable {
    private Train tr = new Train();
	private int numOfSeatsToCancel;

	public SeatCancel(Train tr, int numOfSeatsToCancel) {
		this.tr = tr;
		this.numOfSeatsToCancel = numOfSeatsToCancel;
	}

	public void run() {
		System.out.println("Started Writer-Cancel Thread : "
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		tr.cancelTickets(numOfSeatsToCancel);

		System.out.println("Thread :" + Thread.currentThread().getName()
				+ " Cancelled 1 Ticket. Remaining Seats: "
				+ tr.getRemainingSeats());
	}

}

