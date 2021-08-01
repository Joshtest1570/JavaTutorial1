package com.hornixuk;

public class Rectangle {
    private int width;
    public int height;

    public Rectangle(int width , int height) {
        this.width = width;
        this.height = height;
    }


    public int GetWidth() {
        return this.width;
    }

    /*public void SetWidth(int width) {
        this.width = width;
    }*/

    public int GetHeight() {
        return this.height;
    }

    public int Area() {
        return this.height * this.width;
    }

   /* public void SetHeight(int height) {
        this.height = height;
    }*/
}


