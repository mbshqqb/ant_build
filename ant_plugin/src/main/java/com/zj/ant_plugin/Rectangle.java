package com.zj.ant_plugin;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.DataType;

public class Rectangle extends DataType{
    private int x,y,wide,height;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
