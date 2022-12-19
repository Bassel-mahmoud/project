/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os.project;

import static os.project.WriterReadersFirst.readerCount;
import static os.project.WriterReadersFirst.wsem;
import static os.project.WriterReadersFirst.x;

/**
 *
 * @author pc
 */
public class Read extends WriterReadersFirst implements Runnable {
    
    
    
     public void run() {
            try {
                st.acquire();
                x.acquire();
                readerCount++;
                if (readerCount == 1) wsem.acquire();
                x.release();

                System.out.println("Thread "+Thread.currentThread().getName() + " is READING ");
                Thread.sleep(1500);
                System.out.println("Thread "+Thread.currentThread().getName() + " has FINISHED READING");
                
                x.acquire();
                readerCount--;
                if (readerCount == 0) wsem.release();
                x.release();
                st.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
          
}
      
    }


