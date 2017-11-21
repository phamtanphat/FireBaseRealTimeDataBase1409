package com.ptp.phamtanphat.firebaserealtimedatabase1409;

/**
 * Created by KhoaPhamPC on 21/11/2017.
 */

public class Dongvat {
    private String Ten;
    private Integer Sochan;

    public Dongvat() {
    }

    public Dongvat(String ten, Integer sochan) {
        Ten = ten;
        Sochan = sochan;
    }

    public Integer getSochan() {
        return Sochan;
    }

    public void setSochan(Integer sochan) {
        Sochan = sochan;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }
}
