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
public class Tarif {
    private String ProvinsiTujuan;
    
    private double tarifreguler;
    private double tarifcepat;
    private double tarifexpress;
    private double tariftommorow;
    private double tarifsameday;
    
    

    public Tarif() {
    }

    public Tarif(String ProvinsiTujuan,double tarifreguler, double tarifcepat, double tarifexpress, double tariftommorow, double tarifsameday) {
        this.ProvinsiTujuan = ProvinsiTujuan;
        
        this.tarifreguler = tarifreguler;
        this.tarifcepat = tarifcepat;
        this.tarifexpress = tarifexpress;
        this.tariftommorow = tariftommorow;
        this.tarifsameday = tarifsameday;
        
        
    }
    
   
    

    

   
    
    

    /**
     * @return the ProvinsiTujuan
     */
    public String getProvinsiTujuan() {
        return ProvinsiTujuan;
    }

    /**
     * @param ProvinsiTujuan the ProvinsiTujuan to set
     */
    public void setProvinsiTujuan(String ProvinsiTujuan) {
        this.ProvinsiTujuan = ProvinsiTujuan;
    }

    /**
     * @return the JenisPaket
     */
    

    /**
     * @return the tarifreguler
     */
    public double getTarifreguler() {
        return tarifreguler;
    }

    /**
     * @param tarifreguler the tarifreguler to set
     */
    public void setTarifreguler(double tarifreguler) {
        this.tarifreguler = tarifreguler;
    }

    /**
     * @return the tarifcepat
     */
    public double getTarifcepat() {
        return tarifcepat;
    }

    /**
     * @param tarifcepat the tarifcepat to set
     */
    public void setTarifcepat(double tarifcepat) {
        this.tarifcepat = tarifcepat;
    }

    /**
 * @return the tarifexpress
     */
    public double getTarifexpress() {
        return tarifexpress;
    }

    /**
     * @param tarifexpress the tarifexpress to set
     */
    public void setTarifexpress(double tarifexpress) {
        this.tarifexpress = tarifexpress;
    }

    /**
     * @return the tariftommorow
     */
    public double getTariftommorow() {
        return tariftommorow;
    }

    /**
     * @param tariftommorow the tariftommorow to set
     */
    public void setTariftommorow(double tariftommorow) {
        this.tariftommorow = tariftommorow;
    }

    /**
     * @return the tarifsameday
     */
    public double getTarifsameday() {
        return tarifsameday;
    }

    /**
     * @param tarifsameday the tarifsameday to set
     */
    public void setTarifsameday(double tarifsameday) {
        this.tarifsameday = tarifsameday;
    }

   
    
    
}
