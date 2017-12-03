/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perhitungan;

import DAO.TarifDAO;
import Model.DataBarangKirimian;
import Model.Penerima;
import Model.Tarif;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Perhitungan {

    /**
     * @return the jenispaket
     */
    public String getJenispaket() {
        return jenispaket;
    }

    /**
     * @param jenispaket the jenispaket to set
     */
    public void setJenispaket(String jenispaket) {
        this.jenispaket = jenispaket;
    }
    private DataBarangKirimian datakirim = new DataBarangKirimian();
    private TarifDAO tarifdao = new TarifDAO();
    private Tarif datatarif = new Tarif();
    private Penerima penerima = new Penerima();
    private double tarifterpilih;
    private String jenispaket;
    
    private double biayakirim;
    private double biayaasuransi;
    private double biayakirimdanasuransi;
    private double dimensi;

    /**
     * @return the datakirim
     */
    
    
    public Perhitungan() {
    }
    
    public double hitungDimensi(){
        double d = datakirim.getPanjang()*datakirim.getLebar()*datakirim.getTinggi();
        setDimensi(d);
        return getDimensi();
    }
    
    public double hitungHargaAsuransi(){
        setBiayaasuransi(datakirim.getTarifAsuransi()*datakirim.getHargaBarang());
        return getBiayaasuransi();
    }
    
    public double hitungBiayaKirim(){
        setBiayakirim(datakirim.getBerat()*this.getTarifterpilih());
        return getBiayakirim();
    }

    public double hitungbiayaTotal(){
        setBiayakirimdanasuransi(this.getBiayaasuransi()+this.getBiayakirim());
        return getBiayakirimdanasuransi();
    }
    
    public void selectTarifReguler(){
        tarifdao.scanTarif();
        for (Tarif tarif : tarifdao.getListtarif()) {
            if (penerima.getPenerimaProvinsi().equalsIgnoreCase(tarif.getProvinsiTujuan())) {
                this.setTarifterpilih(tarif.getTarifreguler());
            }
        }
        
    }
    
    public void selectTarifCepat(){
        tarifdao.scanTarif();
        for (Tarif tarif : tarifdao.getListtarif()) {
            if (penerima.getPenerimaProvinsi().equalsIgnoreCase(tarif.getProvinsiTujuan())) {
                this.setTarifterpilih(tarif.getTarifcepat());
            }
        }
        
    }
    
    public void selectTarifExpress(){
        tarifdao.scanTarif();
        for (Tarif tarif : tarifdao.getListtarif()) {
            if (penerima.getPenerimaProvinsi().equalsIgnoreCase(tarif.getProvinsiTujuan())) {
                this.setTarifterpilih(tarif.getTarifexpress());
            }
        }
        
    }
    
    public void selectTarifTommorow(){
        tarifdao.scanTarif();
        for (Tarif tarif : tarifdao.getListtarif()) {
            if (penerima.getPenerimaProvinsi().equalsIgnoreCase(tarif.getProvinsiTujuan())) {
                this.setTarifterpilih(tarif.getTariftommorow());
            }
        }
        
    }
    
    public void selectTarifSameday(){
        tarifdao.scanTarif();
        for (Tarif tarif : tarifdao.getListtarif()) {
            if (penerima.getPenerimaProvinsi().equalsIgnoreCase(tarif.getProvinsiTujuan())) {
                this.setTarifterpilih(tarif.getTarifsameday());
            }
        }
        
    }
    
    
    public DataBarangKirimian getDatakirim() {
        return datakirim;
    }

    /**
     * @param datakirim the datakirim to set
     */
    public void setDatakirim(DataBarangKirimian datakirim) {
        this.datakirim = datakirim;
    }

    /**
     * @return the tarifdao
     */
    public TarifDAO getTarifdao() {
        return tarifdao;
    }

    /**
     * @param tarifdao the tarifdao to set
     */
    public void setTarifdao(TarifDAO tarifdao) {
        this.tarifdao = tarifdao;
    }

    /**
     * @return the datatarif
     */
    public Tarif getDatatarif() {
        return datatarif;
    }

    /**
     * @param datatarif the datatarif to set
     */
    public void setDatatarif(Tarif datatarif) {
        this.datatarif = datatarif;
    }

    /**
     * @return the tarifterpilih
     */
    public double getTarifterpilih() {
        return tarifterpilih;
    }

    /**
     * @param tarifterpilih the tarifterpilih to set
     */
    public void setTarifterpilih(double tarifterpilih) {
        this.tarifterpilih = tarifterpilih;
    }

    /**
     * @return the penerima
     */
    public Penerima getPenerima() {
        return penerima;
    }

    /**
     * @param penerima the penerima to set
     */
    public void setPenerima(Penerima penerima) {
        this.penerima = penerima;
    }

    /**
     * @return the listtarif
     */
    

    /**
     * @return the biayakirim
     */
    public double getBiayakirim() {
        return biayakirim;
    }

    /**
     * @param biayakirim the biayakirim to set
     */
    public void setBiayakirim(double biayakirim) {
        this.biayakirim = biayakirim;
    }

    /**
     * @return the biayaasuransi
     */
    public double getBiayaasuransi() {
        return biayaasuransi;
    }

    /**
     * @param biayaasuransi the biayaasuransi to set
     */
    public void setBiayaasuransi(double biayaasuransi) {
        this.biayaasuransi = biayaasuransi;
    }

    /**
     * @return the biayakirimdanasuransi
     */
    public double getBiayakirimdanasuransi() {
        return biayakirimdanasuransi;
    }

    /**
     * @param biayakirimdanasuransi the biayakirimdanasuransi to set
     */
    public void setBiayakirimdanasuransi(double biayakirimdanasuransi) {
        this.biayakirimdanasuransi = biayakirimdanasuransi;
    }

    /**
     * @return the dimensi
     */
    public double getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi(double dimensi) {
        this.dimensi = dimensi;
    }
    
    
    
}
