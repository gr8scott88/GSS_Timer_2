package com.waters.sysdev.gss_timer_2;

/**
 * Created by usskel on 1/19/2018.
 */

public class System {
    private int img;
    private String title;

    public System(int imgResource, String title) {
        this.img = imgResource;
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
