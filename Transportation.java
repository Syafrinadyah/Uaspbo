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
public class Transportation {
    private String price;
    private String destination;
    private int discountprice;
    private int totalprice;
    
    public void PESAWAT(){
        this.price = " RP. 585.000 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String destination = input.next();
        
        if(destination.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Pesawat" + price+ " + Diskon 4% ");
                discountprice = (585000*4/100);
                totalprice = 585000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            }else if (destination.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Pesawat" + price+ " + Diskon 6% ");
                discountprice = (585000*6/100);
                totalprice = 585000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            } else if (destination.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Pesawat" + price+ " + Diskon 8% ");
                discountprice = (585000*8/100);
                totalprice = 585000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            }
    }
    public void KERETA(){
        this.price = " Rp.332.000 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String destination = input.next();
        
        if (destination.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Kereta Api" + price+ " + Diskon 4% ");
                discountprice = (332000*4/100);
                totalprice = 332000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            } else if (destination.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Kereta Api" + price+ " + Diskon 6% ");
                discountprice = (332000*6/100);
                totalprice = 332000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            } else if (destination.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Kereta Api" + price+ " + Diskon 8% ");
                discountprice = (332000*8/100);
                totalprice = 332000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
                
        }
    }
    public void BUS(){
        this.price = " Rp.190.000 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String destination = input.next();
        
        if (destination.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Bus" + price+ " + Diskon 4% ");
                discountprice = (190000*4/100);
                totalprice = 190000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            } else if (destination.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Bus" + price+ " + Diskon 6% ");
                discountprice = (190000*6/100);
                totalprice = 190000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            } else if (destination.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Bus" + price+ " + Diskon 8% ");
                discountprice = (190000*8/100);
                totalprice = 190000 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
                
        }
    }
    public void AIRSPACE(){
        this.price = " Rp.1.333.999 ";
        Scanner input = new Scanner(System.in);
        System.out.println("Tujuan : ");String destination = input.next();
        
        if (destination.equalsIgnoreCase("Jakarta")){
                System.out.println("Harga Tiket Air Space" + price+ " + Diskon 4% ");
                discountprice = (1333999*4/100);
                totalprice = 1333999 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            } else if (destination.equalsIgnoreCase("Amerika")){
                System.out.println("Harga Tiket Air Space" + price+ " + Diskon 6% ");
                discountprice = (1333999*6/100);
                totalprice = 1333999 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            } else if (destination.equalsIgnoreCase("Bandung")){
                System.out.println("Harga Tiket Air Space" + price+ " + Diskon 8% ");
                discountprice = (1333999*8/100);
                totalprice = 1333999 - discountprice;
                System.out.println("Harga Total Rp. " + totalprice);
            }
}}
