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
public class User {
    private String nama;
    private int nohp;
    private int nik;
    
    
    public void PENUMPANG(){
        Scanner input = new Scanner(System.in);
        System.out.println("<<<<<<<<<< ISI DATA DIRI >>>>>>>>>>");
        System.out.println("Nama:");String nama = input.next();
        System.out.println("No Hp:");int nohp = input.nextInt();
        System.out.println("NIK:");int nik = input.nextInt();
    }
}
