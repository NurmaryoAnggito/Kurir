/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.TarifDAO;

/**
 *
 * @author user
 */
public class DataBarangKirimian {
    
    private double TarifAsuransi = 0.03;
    private double berat;
    private double HargaBarang;
    private boolean asuransi;
    private String pembayaran;
    private double panjang;
    private double lebar;
    private double tinggi;
    private String jenispengiriman;

    public DataBarangKirimian() {
    }

    public DataBarangKirimian(double berat, double HargaBarang, boolean asuransi, String pembayaran, double panjang, double lebar, double tinggi, String jenis) {
        this.berat = berat;
        this.HargaBarang = HargaBarang;
        this.asuransi = asuransi;
        this.pembayaran = pembayaran;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.jenispengiriman = jenis;
        
    }

    
    
    
    
    
    
    /**
     * @return the tarif
     */
    

    /**
     * @return the TarifAsuransi
     */
    public double getTarifAsuransi() {
        return TarifAsuransi;
    }

    /**
     * @param TarifAsuransi the TarifAsuransi to set
     */
    public void setTarifAsuransi(double TarifAsuransi) {
        this.TarifAsuransi = TarifAsuransi;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }

    /**
     * @return the HargaBarang
     */
    public double getHargaBarang() {
        return HargaBarang;
    }

    /**
     * @param HargaBarang the HargaBarang to set
     */
    public void setHargaBarang(double HargaBarang) {
        this.HargaBarang = HargaBarang;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the jenispengiriman
     */
    public String getJenispengiriman() {
        return jenispengiriman;
    }

    /**
     * @param jenispengiriman the jenispengiriman to set
     */
    public void setJenispengiriman(String jenispengiriman) {
        this.jenispengiriman = jenispengiriman;
    }
    
    
}
