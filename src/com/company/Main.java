package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index=0;
        int nhap;
	    int []array={1,3,4,2,5,412,12};
        System.out.println("nhap gia tri ban muon xoa trong mang");
        Scanner scanner =new  Scanner(System.in);
        nhap=scanner.nextInt();
        int mangmoi[]=new int[array.length-1];
        for (int i=0;i<array.length;i++){
            if (nhap==array[i]){
                index=i;
            }
        }
        for (int i=0;i<index;i++){
            mangmoi[i]=array[i];
        }
        for (int i=index+1;i<array.length;i++){
            mangmoi[i-1]=array[i];
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        for (int i=0;i<mangmoi.length;i++){
            System.out.print(mangmoi[i]+"\t");
        }
    }
}
