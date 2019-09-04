package com.amber;

public class TextBox {
    public String text = ""; // Field

    public void setText(String text) {
        this.text = text; // same as just saying text = text;
    }

    public void clear(){
        text = "";

    }
}
