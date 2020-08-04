package com.tutorial;

import java.util.*;

import javax.sound.sampled.Line;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Namamu : ");
        String nama = scan.nextLine();
        System.out.printf("Hello %s", nama);
    }
}