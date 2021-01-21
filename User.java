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
    private String name;
    
    
    public void PENUMPANG(){
        Scanner input = new Scanner(System.in);
        System.out.println("<<<<<<<<<< ISI DATA DIRI >>>>>>>>>>");
        System.out.println("Name:");String name = input.next();
    }
}
