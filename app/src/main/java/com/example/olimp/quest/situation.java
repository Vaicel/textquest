package com.example.olimp.quest;

/**
 * Created by samsung on 08.12.2015.
 */
public class situation {
    public situation [] direction;
    public String subject;
    public String text;
    public int dK;
    public int dA;
    public int dR;
    public situation(String subject, String text,int variants ,int dk, int da, int dr){
        this.subject=subject;
        this.text=text;
        dK=dk;
        dA=da;
        dR=dr;
        direction = new situation[variants];
    }
}
