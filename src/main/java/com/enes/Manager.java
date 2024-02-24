package com.enes;

import com.enes.enums.*;

import java.util.Collections;
import java.util.Random;
import java.util.UUID;

public class Manager {
   Menu menu;
   Random random = new Random();

   ECorbalar eCorbalar;
   ETatlilar eTatlilar;
   EIcecekler eIcecekler;
   EYemekler eYemekler;

   EGunler eGunler;
   public Manager(EGunler eGunler) {
      this.eGunler = eGunler;
      for (int i = 0; i < EGunler.values().length; i++) {
         Random random = new Random();
         ECorbalar cRandom = ECorbalar.values()[random.nextInt(ECorbalar.values().length)];
         EIcecekler iRandom = EIcecekler.values()[random.nextInt(EIcecekler.values().length)];
         ETatlilar tRandom = ETatlilar.values()[random.nextInt(ETatlilar.values().length)];
         EYemekler yRandom = EYemekler.values()[random.nextInt(EYemekler.values().length)];
         System.out.println(eGunler + " " + "MENUSU: "
                 + yRandom + cRandom + ", " + iRandom + ", " + tRandom + ", " + yRandom);
         break;

      }

   }

   @Override
   public String toString() {
      final StringBuffer sb = new StringBuffer("Manager{");
      sb.append("eCorbalar=").append(eCorbalar);
      sb.append(", eTatlilar=").append(eTatlilar);
      sb.append(", eIcecekler=").append(eIcecekler);
      sb.append(", eYemekler=").append(eYemekler);
      sb.append(", eGunler=").append(eGunler);
      sb.append('}');
      return sb.toString();
   }

   public ECorbalar geteCorbalar() {
      return eCorbalar;
   }

   public void seteCorbalar(ECorbalar eCorbalar) {
      this.eCorbalar = eCorbalar;
   }

   public ETatlilar geteTatlilar() {
      return eTatlilar;
   }

   public void seteTatlilar(ETatlilar eTatlilar) {
      this.eTatlilar = eTatlilar;
   }

   public EIcecekler geteIcecekler() {
      return eIcecekler;
   }

   public void seteIcecekler(EIcecekler eIcecekler) {
      this.eIcecekler = eIcecekler;
   }

   public EYemekler geteYemekler() {
      return eYemekler;
   }

   public void seteYemekler(EYemekler eYemekler) {
      this.eYemekler = eYemekler;
   }

   public EGunler geteGunler() {
      return eGunler;
   }

   public void seteGunler(EGunler eGunler) {
      this.eGunler = eGunler;
   }


}






