/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os.project;

/**
 *
 * @author pc
 */
 class Write   extends WriterReadersFirst implements Runnable {
     
    
      public void run() {
            try {
                st.acquire();
                wsem.acquire();
                System.out.println("Thread "+Thread.currentThread().getName() + " is updating information");
                Thread.sleep(2500);
                System.out.println("Thread "+Thread.currentThread().getName() + " has finished updating");
                wsem.release();
                st.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
}
