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
public class Transportasi {
    private String Harga;
    private String tujuan;
    private int hargadiskon;
    private int totalbiaya;
    
    public void PESAWAT(){
        this.Harga = " RP. 585.000 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String tujuan = input.next();
        
        if(tujuan.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Pesawat" + Harga+ " + Diskon 4% ");
                hargadiskon = (585000*4/100);
                totalbiaya = 585000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            }else if (tujuan.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Pesawat" + Harga+ " + Diskon 6% ");
                hargadiskon = (585000*6/100);
                totalbiaya = 585000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            } else if (tujuan.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Pesawat" + Harga+ " + Diskon 8% ");
                hargadiskon = (585000*8/100);
                totalbiaya = 585000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            }
    }
    public void KERETA(){
        this.Harga = " Rp.332.000 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String tujuan = input.next();
        
        if (tujuan.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Kereta Api" + Harga+ " + Diskon 4% ");
                hargadiskon = (332000*4/100);
                totalbiaya = 332000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            } else if (tujuan.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Kereta Api" + Harga+ " + Diskon 6% ");
                hargadiskon = (332000*6/100);
                totalbiaya = 332000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            } else if (tujuan.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Kereta Api" + Harga+ " + Diskon 8% ");
                hargadiskon = (332000*8/100);
                totalbiaya = 332000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
                
        }
    }
    public void BUS(){
        this.Harga = " Rp.190.000 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String tujuan = input.next();
        
        if (tujuan.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Bus" + Harga+ " + Diskon 4% ");
                hargadiskon = (190000*4/100);
                totalbiaya = 190000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            } else if (tujuan.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Bus" + Harga+ " + Diskon 6% ");
                hargadiskon = (190000*6/100);
                totalbiaya = 190000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            } else if (tujuan.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Bus" + Harga+ " + Diskon 8% ");
                hargadiskon = (190000*8/100);
                totalbiaya = 190000 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
                
        }
    }
    public void AIRSPACE(){
        this.Harga = " Rp.1.333.999 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String tujuan = input.next();
        
        if (tujuan.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Air Space" + Harga+ " + Diskon 4% ");
                hargadiskon = (1333999*4/100);
                totalbiaya = 1333999 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            } else if (tujuan.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Air Space" + Harga+ " + Diskon 6% ");
                hargadiskon = (1333999*6/100);
                totalbiaya = 1333999 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            } else if (tujuan.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Air Space" + Harga+ " + Diskon 8% ");
                hargadiskon = (1333999*8/100);
                totalbiaya = 1333999 - hargadiskon;
                System.out.println("Harga Total Rp. " + totalbiaya);
            }
}}
