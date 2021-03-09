/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Optimoes
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random angkaRandom = new Random(); 
        int angka,angkaLotere,angkaLotere1,angkaLotere2,angka1,angka2,hadiah=0;
        angkaLotere = angkaRandom.nextInt(100);
        String pesan;
        
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan dua digit angka [00-99]: ");
            angka = input.nextInt();

        }while(angka >= 99 && angka <= 0);
        
        angkaLotere1 = angkaLotere / 10; //digit pertama angka lotere
        angkaLotere2 = angkaLotere % 10; //digit kedua angka lotere
        
        angka1 = angka / 10; //digit pertama input angka
        angka2 = angka % 10; //digit kedua iput angka
        
        if(angka == angkaLotere){
            hadiah = 10000;
            pesan = "Angka tebakan anda benar semua!";
        }
        else if((angka1 == angkaLotere1 && angka2 == angkaLotere2) || (angka1 == angkaLotere2 && angka2 == angkaLotere1)){
            hadiah = 3000;
            pesan = "Angka tebakan anda benar semua! tetapi urutannya tidak sama!";
        }
        else if(angka1 == angkaLotere1 || angka1 == angkaLotere2 || angka2 == angkaLotere1 || angka2 == angkaLotere2){
            hadiah = 1000;
            pesan = "Angka tebakan anda benar 1 digit saja";
        }
        else{
            pesan = "Angka tebakan anda tidak ada yang benar";
        }
        System.out.println("Angka lotere : "+angkaLotere);
        System.out.println(pesan+" Hadiah anda $"+hadiah);
    }
    
}
