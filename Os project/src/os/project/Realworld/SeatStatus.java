/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os.project;
  import java.util.Date;

/**
 *
 * @author pc
 */
public class SeatStatus {
  
/*
 * Name : SeatStatus.java
 * Author : knar@
 * Description : Reader Thread that returns the number of available seats.
 * 
 */


	private Train t = new Train();

	public SeatStatus(Train tr) {
		this.t = tr;
	}

	public void run() {
		System.out.println("Started Reader Thread : "
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Date date = new Date();
		System.out.println("Thread " + Thread.currentThread().getName()
				+ ": Remaining Seats at " + date.getTime() + " :"
				+ t.getRemainingSeats());
	}
}
