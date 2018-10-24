/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import static MODEL.Pasien.daftarPasienKlinik;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class RumahSakit {

    private String nama;
    private String alamat;

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (noRM == null ? daftarPasienKlinik.get(i).getNoRekamMedis() == null : noRM.equals(daftarPasienKlinik.get(i).getNoRekamMedis())) {
                return daftarPasienKlinik.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
    }

    public static void tambahPasienBaru(Pasien test) {

    }

    public static void simpanDaftarPasien(File file) {

    }

    public static void bacaDaftarPasien(File file) {

    }

    public static void simpanObjekRumahSakit(File file) {

    }

    public static void bacaObjekRumahSakit(File file) {

    }

    public static ArrayList<Pasien> getDaftarpasien() {
        return daftarPasienKlinik;
    }
    
}