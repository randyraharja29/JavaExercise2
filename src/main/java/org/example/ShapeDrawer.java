package org.example;
import java.util.Scanner;

public class ShapeDrawer {

    Scanner scanner = new Scanner(System.in);// Masukin user input

    public void displayMenu() {
        System.out.println("Welcome to ASCII Shape Drawer!\n");
        System.out.println("Choose a shape to draw:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit\n");
    }

    public void drawTriangle(int height) {
        for(int i =1;i<=height;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawSquare(int height){
        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void drawRectangle(int panjang, int lebar){
        for(int i=1;i<=lebar;i++){
            for(int j=1;j<=panjang;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


   public void drawShape(int choice){
        switch (choice){
            case 1 :
                System.out.println("Masukkan Panjang Segitia Siku-Siku");
                int height = scanner.nextInt();
                drawTriangle(height); //Fungsi untuk menggambarkan segitiga
                break;

            case 2 :
                System.out.println("Masukkan Panjang Sisi Persegi");
                int height2 = scanner.nextInt();
                drawSquare(height2); //Fungsi untuk menggambarkan segitiga
                break;
            case 3 :
                System.out.println("Masukkan Panjang Sisi Persegi Panjang");
                int panjang = scanner.nextInt();
                System.out.println("Masukkan Lebar persegi panjang");
                int lebar = scanner.nextInt();
                drawRectangle(panjang, lebar);
                break;
            case 4 :
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }

    }

        public void run(){
            while (true){
                displayMenu();
                System.out.println("Enter your choice:");
                int choice =scanner.nextInt(); //Input jenisnya integer
                drawShape(choice);
                System.out.println();
            }
        }



    public static void main(String[]args){
//Program untuk gambar ASCII shape
        //untuk running function code

        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}
