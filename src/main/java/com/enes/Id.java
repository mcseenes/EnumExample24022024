package com.enes;

import java.util.Random;

public class Id {
    private int id;
    private String ad;

    Random random=new Random();
    public Id(String ad) {

        this.id = random.nextInt(1,5);
        this.ad = ad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Id{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
