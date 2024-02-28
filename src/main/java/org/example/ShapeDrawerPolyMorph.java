package org.example;
import java.awt.*;
import java.util.Scanner;
import java.util.InputMismatchException;

interface Shape{ //one of implement Polymorphism
    void draw (int height, int side);
}

class drawTriangle implements Shape{
    @Override
    public void draw(int height) {
        for(int i =1;i<=height;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


class drawRectangle implements Shape{

        @Override
        public void draw(int panjang, int lebar) {
            for (int i = 1; i <= lebar; i++) {
                for (int j = 1; j <= panjang; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}


public class ShapeDrawerPolyMorph {

    Scanner scanner = new Scanner(System.in);// Masukin user input

    public void displayMenu() {
        System.out.println("Welcome to ASCII Shape Drawer!\n");
        System.out.println("Choose a shape to draw:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit\n");
    }

    public void drawSquare(int height){
        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }




   public void drawShape(int choice){
        try {
            switch (choice) {
                case 1:
                    System.out.println("Masukkan Panjang Segitia Siku-Siku");
                    int height = scanner.nextInt();
                    new drawTriangleSS().draw(height,1); //Fungsi untuk menggambarkan segitiga
                    break;

                case 2:
                    System.out.println("Masukkan Panjang Sisi Persegi");
                    int height2 = scanner.nextInt();
                    new drawRectangle().draw(panjang,lebar); //Fungsi untuk menggambarkan segitiga
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } catch (InputMismatchException ime){
            System.out.println("Please enter a valid integer.");
            scanner.next();// consume the invalid token
        }
    }

        public void run(){
            while (true){
                displayMenu();
                System.out.println("Enter your choice:");
                try{
                    int choice =scanner.nextInt(); //Input jenisnya integer
                    drawShape(choice);
                    System.out.println()  ;
                }catch (InputMismatchException ime){
                    System.out.println("Please input valid interger.");
                    scanner.next();
                }

            }
        }

    public void main(String[] args){
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
        }
    }
}

