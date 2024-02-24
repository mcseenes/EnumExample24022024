package com.enes.enums;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Menu {

  public List<EGunler> eGunler=new ArrayList<>();
  public List<ECorbalar> eCorbalar=new ArrayList<>();
    public List<EIcecekler> eIcecekler=new ArrayList<>();
    public  List<ETatlilar> eTatlilar=new ArrayList<>();
    public  List<EYemekler> eYemekler=new ArrayList<>();
    Random random=new Random();

  public Menu(EGunler eGunler) {
    this.eCorbalar = new ArrayList<>();
    this.eIcecekler = new ArrayList<>();
    this.eTatlilar = new ArrayList<>();
    this.eYemekler = new ArrayList<>();
    this.eGunler = new ArrayList<>();
    }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Menu{");
    sb.append("eGunler=").append(eGunler);
    sb.append(", eCorbalar=").append(eCorbalar);
    sb.append(", eIcecekler=").append(eIcecekler);
    sb.append(", eTatlilar=").append(eTatlilar);
    sb.append(", eYemekler=").append(eYemekler);
    sb.append(", random=").append(random);
    sb.append('}');
    return sb.toString();
  }

  public List<EGunler> geteGunler() {
    return eGunler;
  }

  public void seteGunler(List<EGunler> eGunler) {
    this.eGunler = eGunler;
  }

  public List<ECorbalar> geteCorbalar() {
    return eCorbalar;
  }

  public void seteCorbalar(List<ECorbalar> eCorbalar) {
    this.eCorbalar = eCorbalar;
  }

  public List<EIcecekler> geteIcecekler() {
    return eIcecekler;
  }

  public void seteIcecekler(List<EIcecekler> eIcecekler) {
    this.eIcecekler = eIcecekler;
  }

  public List<ETatlilar> geteTatlilar() {
    return eTatlilar;
  }

  public void seteTatlilar(List<ETatlilar> eTatlilar) {
    this.eTatlilar = eTatlilar;
  }

  public List<EYemekler> geteYemekler() {
    return eYemekler;
  }

  public void seteYemekler(List<EYemekler> eYemekler) {
    this.eYemekler = eYemekler;
  }
}


