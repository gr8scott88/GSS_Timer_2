package com.waters.sysdev.gss_timer_2;

/**
 * Created by usskel on 1/19/2018.
 */

public class Module {

    private int img;
    private String title;

    public Module(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
