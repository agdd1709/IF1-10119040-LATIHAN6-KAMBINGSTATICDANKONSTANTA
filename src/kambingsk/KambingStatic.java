/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingsk;

/**
 *
 * @author Acer
 */
public class KambingStatic {
    //
    public static final String NAMA_KAMBING = "JALU";
    
    public static void main(String [] args){
        Mamalia.jumlahKambing = 50;
        System.out.println(NAMA_KAMBING + "Memiliki kambing sebanyak" + Mamalia.jumlahKambing);
    }
    
}
