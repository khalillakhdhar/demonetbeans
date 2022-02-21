/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demonetbeans;

/**
 *
 * @author khali
 */
public class Conditions {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void evaluer()
    {
    if(this.getA()>0)
    System.out.println(a+" est positif");
    else
            System.out.println(a+" est negatif");

    
    }
    public boolean parite()
    {
    if(this.a % 2 == 0) // % pour le reste modulo == pour la comparaison
    {
        return true;
    }
    else 
        return false;
    }
    
    
}
