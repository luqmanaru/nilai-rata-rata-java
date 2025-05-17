package com.mycompany.nilairatarata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Program Menghitung Nilai Rata-Rata
 * @author luqmanaru
 */
public class NilaiRataRata {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input nilai dari user
        System.out.print("Masukkan nilai ujian 1: ");
        double nilai1 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian 2: ");
        double nilai2 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian 3: ");
        double nilai3 = Double.parseDouble(reader.readLine());

        // Hitung rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;
        System.out.println("Nilai rata-rata: " + rataRata);

        // Tentukan kelulusan
        if (rataRata >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
        
        reader.close();
    }
}
