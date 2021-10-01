package com.company.kodluyoruz;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input:  ");
        int x = input.nextInt();

        for(int i = 1; i <= x;i++) {
            if(i==1){
                for (int j = 0;j<x;j++)
                    System.out.print("*");
                System.out.println();
                continue;
            }else if(i==x){
                for (int j=0;j<x;j++)
                    System.out.print("*");
                System.out.println();
                continue;
            }
            for(int j = 1; j<=x ; j++){// sütunlar

                if (j == 1) {
                    System.out.print("*");
                    continue;
                }else if(j == x){
                    System.out.print("*");
                    continue;
                }
                if ((i % 2) == 0) {

                    if ((j % 2) == 0)
                        System.out.print("+");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if ((j % 2) == 0)
                        System.out.print(" ");
                    else
                        System.out.print("+");
                }
            }
            System.out.println();
        }
    }
    }
