/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package os.project;


/**
 *
 * @author pc
 */
public class OsProject {

   Train t = new Train();

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws Exception {
    
         Read read = new Read();
        Write write = new Write();
        Thread t1 = new Thread(read);
        t1.setName("customer1");
        Thread t2 = new Thread(read);
        t2.setName("customer2");
        Thread t3 = new Thread(write);
        t3.setName("Writer1");
        Thread t4 = new Thread(read);
        t4.setName("customer4");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

