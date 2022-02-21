/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demonetbeans;

/**
 *
 * @author khali
 */
public class Test {
    public static void main(String args[])
    {
        Calcule c=new Calcule();
        System.out.println(c.somme(22, 33));
        Conditions c2=new Conditions();
        c2.setA(-3);
        c2.evaluer();
    }
    
}
