/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo4.tredsillos;

/**
 *
 * @author T107
 */
public class Intermedia implements Runnable {
    
    public static void main(String args[]){
   //paso 1 crear el thread
        Runnable r=new Intermedia();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        //paso 2 inicializarlo
        t1.start();
        t2.start();
        t3.start();
        t1.setName("impresion");
        t2.setName("conexion");//lo ponemos a dormir
        t3.setName("guardar");
        
    }

    @Override
    public void run() {
   //ejecutarse
        try{
        if(Thread.currentThread().getName().equals("conexion"))Thread.sleep(2000);
        if(Thread.currentThread().getName().equals("impresion"))Thread.sleep(4000);
        if(Thread.currentThread().getName().equals("guardar"))Thread.sleep(6000);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Soy un Thread mediano");
        }catch(Exception e){}
    }
   
        
    }

