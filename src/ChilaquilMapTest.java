/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 09060
 */
public class ChilaquilMapTest {
    public static void main(String [] args){
        ChilaquilMap ch = new ChilaquilMap(6,9, true) ;
        ch.setDestiny(2, 2);
        ch.setDestiny(4, 6);
        ch.print();
        ch.printMap();
    }
}
