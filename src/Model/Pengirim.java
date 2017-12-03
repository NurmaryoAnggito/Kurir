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
public class Pengirim {
    private String PengirimNama;
    private String PengirimAlamat;
    private String PengirimKota;
    private String PengirimProvinsi;
    private String PengirimKodePos;
    private String PengirimTelp;

    public Pengirim() {
    }

    public Pengirim(String PengirimNama, String Alamat, String Kota, String Provinsi, String KodePos, String NoTelp) {
        this.PengirimNama = PengirimNama;
        this.PengirimAlamat = Alamat;
        this.PengirimKota = Kota;
        this.PengirimProvinsi = Provinsi;
        this.PengirimKodePos = KodePos;
        this.PengirimTelp = NoTelp;
    }

    /**
     * @return the PengirimNama
     */
    public String getPengirimNama() {
        return PengirimNama;
    }

    /**
     * @param PengirimNama the PengirimNama to set
     */
    public void setPengirimNama(String PengirimNama) {
        this.PengirimNama = PengirimNama;
    }

    /**
     * @return the PengirimAlamat
     */
    public String getPengirimAlamat() {
        return PengirimAlamat;
    }

    /**
     * @param PengirimAlamat the PengirimAlamat to set
     */
    public void setPengirimAlamat(String PengirimAlamat) {
        this.PengirimAlamat = PengirimAlamat;
    }

    /**
     * @return the PengirimKota
     */
    public String getPengirimKota() {
        return PengirimKota;
    }

    /**
     * @param PengirimKota the PengirimKota to set
     */
    public void setPengirimKota(String PengirimKota) {
        this.PengirimKota = PengirimKota;
    }

    /**
     * @return the PengirimProvinsi
     */
    public String getPengirimProvinsi() {
        return PengirimProvinsi;
    }

    /**
     * @param PengirimProvinsi the PengirimProvinsi to set
     */
    public void setPengirimProvinsi(String PengirimProvinsi) {
        this.PengirimProvinsi = PengirimProvinsi;
    }

    /**
     * @return the PengirimKodePos
     */
    public String getPengirimKodePos() {
        return PengirimKodePos;
    }

    /**
     * @param PengirimKodePos the PengirimKodePos to set
     */
    public void setPengirimKodePos(String PengirimKodePos) {
        this.PengirimKodePos = PengirimKodePos;
    }

    /**
     * @return the PengirimTelp
     */
    public String getPengirimTelp() {
        return PengirimTelp;
    }

    /**
     * @param PengirimTelp the PengirimTelp to set
     */
    public void setPengirimTelp(String PengirimTelp) {
        this.PengirimTelp = PengirimTelp;
    }
    
    
}

