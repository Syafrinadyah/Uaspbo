/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesin.tiket;
import java.util.Scanner;
/**
 *
 * @author SYAFRINA DYAH
 */
public class Mesin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        User User = new User();
        User.PENUMPANG();
        
        
        Transportasi Transportasi = new Transportasi();
        int pilih = 4;
        
        System.out.println("<<<<<<<<<< TRANSPORTASI >>>>>>>>>>");
        System.out.println("1. PESAWAT");
        System.out.println("2. KERETA");
        System.out.println("3. BUS");
        System.out.println("4. AIR SPACE");
        System.out.println("Pilih Transportasi = ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                Transportasi.PESAWAT();
                break;
            case 2:
                Transportasi.KERETA();
                break;
            case 3:
                Transportasi.BUS();
                break;
            case 4:
                Transportasi.AIRSPACE();
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }
        
        }
        
    }
    
