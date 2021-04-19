/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author CHRISTIAN
 */
public class LoopTest {

    int k = 5;

    public boolean checkIt(int k) {
      return k-->0?true:false; 
    }

    public void printThem() {
        while (checkIt(k)) {
           // System.out.print(k);
            System.out.println(k--);
        }
    }
}
