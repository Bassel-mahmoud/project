/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os.project;
import java.util.concurrent.Semaphore;
/**
 *
 * @author pc
 */
public class WriterReadersFirst {
    
    static int readerCount = 0;
    static Semaphore x = new Semaphore(1);
    static Semaphore wsem = new Semaphore(1);
    static Semaphore st = new Semaphore(1);
   
}

