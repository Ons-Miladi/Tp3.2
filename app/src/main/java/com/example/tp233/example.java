package com.example.tp233;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class example {
    private String text1;
    private  String text2;
    public example(){}
    public example(String txt1,String txt2){
        text1=txt1;
        text2=txt2;
    }
    public String getText1(){
        return text1;
    }
    public String getText2(){
        return text2;
    }
}
