/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ANGGAA
 */
public class BaseModel {

    final double ALPHA = 0.1;
    final double ALPHA2 = 0.9;

    protected double[] forecasting(double permintaan, double ramalan) {

        ArrayList<Double> data = new ArrayList<Double>();
        ArrayList<Double> dataset = new ArrayList<Double>();

        if (permintaan == 0 && ramalan ==0) {
            data.add(20.0);
            data.add(25.0);
            dataset.add(0.0);
            dataset.add(data.get(0));
            
            for (int i = 2; i < data.size() + 1; i++) {
                dataset.add((ALPHA2 * data.get(i - 1)) + (ALPHA * dataset.get(i - 1)));
            }
        }else{
            data.add(permintaan);
            dataset.add(ramalan);
            
            dataset.add((ALPHA2 * data.get(0)) + (ALPHA * dataset.get(0)));
            
        }       

        System.out.print("RAMALAN DITEMUKAN ==> ");
        System.out.println(dataset.get(dataset.size() - 1));

        //random
        Random random = new Random();
        int hasil = random.nextInt((5 - 1) + 1) + 1;
        System.out.println("Random ==> " + hasil);

        //pembulatan keatas + hasil random
        double oke = Math.ceil(dataset.get(dataset.size() - 1)) + hasil;

        System.out.println("DATA PERMINTAAN selanjutnya ==> " + oke);

        //ramalan selanjutnya
        dataset.add((ALPHA2 * oke) + (ALPHA * dataset.get(dataset.size() - 1)));
        System.out.print("RAMALAN RAHASIA SELANJUTNYA ==> ");
        System.out.println(dataset.get(dataset.size() - 1));
        double rahasia = dataset.get(dataset.size() - 1);

        double hasilsiap[] = new double[2];
        hasilsiap[0] = oke;
        hasilsiap[1] = dataset.get(dataset.size() - 1);

        return hasilsiap;
    }

    protected ArrayList<Integer> customer(int customer) {
        int angka = customer;
        ArrayList<Integer> hasil = new ArrayList<Integer>();

        Random data = new Random();
        int temp = 0;
        int cek = 0;
        do {

            temp = data.nextInt((angka - 1) + 1) + 1;

            /*agar dipastikan data ketika pertama kali di random untuk split
             *tidak sama dengan data awal, karena nanti menyebabkan permainan sekali
             */
            if (temp == angka && cek == 0) {

                temp = data.nextInt((angka - 1) + 1) + 1;
            }

            //tambahakan data ke array
            hasil.add(temp);
            //melakukan pengurangan data untuk deteksi random selanjutnya
            angka -= hasil.get(hasil.size() - 1);
            cek++;

        } while (angka != 0);

        //reset
        temp = 0;
        cek = 0;
        angka = 0;

//        for (int i = 0; i < hasil.size(); i++) {
//            System.out.print(hasil.get(i)+", ");
//        }
        return hasil;
    }
}
