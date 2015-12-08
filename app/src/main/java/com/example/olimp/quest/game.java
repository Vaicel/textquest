package com.example.olimp.quest;

import java.util.Scanner;

/**
 * Created by samsung on 08.12.2015.
 */
public class game {
    public static character manager;
    public static story story;
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("... подпись под договором (ваше имя):");
        manager = new character(in.next());
        story = new story();
        while(true){
            manager.K+=story.current_situation.dK;
            manager.A+=story.current_situation.dA;
            manager.R+=story.current_situation.dR;
            System.out.println("=====\n Карьера"+manager.K+"\tАктивы"+manager.A+"\tУважуха"+manager.R+"\n=====");
            System.out.println("===========" + story.current_situation.subject + "===========");
            System.out.println(story.current_situation.text);
            if(story.isEnd()){
                System.out.println("============================Конец============================");
                return;
            }
            story.go(in.nextInt());

        }
    }
}
