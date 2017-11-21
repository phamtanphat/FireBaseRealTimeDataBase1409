package com.ptp.phamtanphat.firebaserealtimedatabase1409;

import android.widget.Toast;

/**
 * Created by KhoaPhamPC on 21/11/2017.
 */

public class Father {
    private String Ten;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public Father(String ten) {
        Ten = ten;
    }
    public void ShowTen(String ten){
       this.Ten = "Ten cha " + ten;
    }
}
