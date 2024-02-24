package com.enes;

import com.enes.enums.ECorbalar;
import com.enes.enums.EGunler;
import com.enes.enums.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Runner {
    public static void main(String[] args) {
        Manager manager=new Manager(EGunler.PAZARTESI);
         manager=new Manager(EGunler.SALI);
         manager=new Manager(EGunler.CARSAMBA);
         manager=new Manager(EGunler.PERSEMBE);
         manager=new Manager(EGunler.CUMA);
         manager=new Manager(EGunler.CUMARTESI);
         manager=new Manager(EGunler.PAZAR);



    }

}
