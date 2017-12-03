/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class Penerima {
    private String PenerimaNama;
    private String PenerimaTelp;
    private String PenerimaKota;
    private String PenerimaProvinsi;
    private String PenerimaKodePos;
    private String penerimaAlamat;

    public Penerima() {
    }

    public Penerima(String PenerimaNama, String PenerimaTelp, String PenerimaKota, String PenerimaProvinsi, String PenerimaKodePos) {
        this.PenerimaNama = PenerimaNama;
        this.PenerimaTelp = PenerimaTelp;
        this.PenerimaKota = PenerimaKota;
        this.PenerimaProvinsi = PenerimaProvinsi;
        this.PenerimaKodePos = PenerimaKodePos;
    }

    /**
     * @return the PenerimaNama
     */
    public String getPenerimaNama() {
        return PenerimaNama;
    }

    /**
     * @param PenerimaNama the PenerimaNama to set
     */
    public void setPenerimaNama(String PenerimaNama) {
        this.PenerimaNama = PenerimaNama;
    }

    /**
     * @return the PenerimaTelp
     */
    public String getPenerimaTelp() {
        return PenerimaTelp;
    }

    /**
     * @param PenerimaTelp the PenerimaTelp to set
     */
    public void setPenerimaTelp(String PenerimaTelp) {
        this.PenerimaTelp = PenerimaTelp;
    }

    /**
     * @return the PenerimaKota
     */
    public String getPenerimaKota() {
        return PenerimaKota;
    }

    /**
     * @param PenerimaKota the PenerimaKota to set
     */
    public void setPenerimaKota(String PenerimaKota) {
        this.PenerimaKota = PenerimaKota;
    }

    /**
     * @return the PenerimaProvinsi
     */
    public String getPenerimaProvinsi() {
        return PenerimaProvinsi;
    }

    /**
     * @param PenerimaProvinsi the PenerimaProvinsi to set
     */
    public void setPenerimaProvinsi(String PenerimaProvinsi) {
        this.PenerimaProvinsi = PenerimaProvinsi;
    }

    /**
     * @return the PenerimaKodePos
     */
    public String getPenerimaKodePos() {
        return PenerimaKodePos;
    }

    /**
     * @param PenerimaKodePos the PenerimaKodePos to set
     */
    public void setPenerimaKodePos(String PenerimaKodePos) {
        this.PenerimaKodePos = PenerimaKodePos;
    }

    /**
     * @return the penerimaAlamat
     */
    public String getPenerimaAlamat() {
        return penerimaAlamat;
    }

    /**
     * @param penerimaAlamat the penerimaAlamat to set
     */
    public void setPenerimaAlamat(String penerimaAlamat) {
        this.penerimaAlamat = penerimaAlamat;
    }
    
    
}
