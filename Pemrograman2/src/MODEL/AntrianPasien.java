/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author RamaEka
 */
public class AntrianPasien {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private Pasien []daftarPasienAntri;
    
    public void mendaftar (Pasien pasien){
        
    }
    public static void Mendaftar(Pasien pasie, int Bulan, int Tahun){
        
    }
    //public static AntrianPasien cariPasien(String noRM){
      //  return null;
    //}
//    public static Pasien cariPasien(String noRM, int Tanggal, int Bulan, int Tahun){
//        
//    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasienAntri() {
        return daftarPasienAntri;
    }

    public void setDaftarPasienAntri(Pasien[] daftarPasienAntri) {
        this.daftarPasienAntri = daftarPasienAntri;
    }

}
