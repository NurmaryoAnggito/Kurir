/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Tarif;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TarifDAO {
    private ArrayList<Tarif> listtarif = new ArrayList<>();
    
    
    

    public TarifDAO() {
    }
    
    
    public void scanTarif(){
        
        try {
            Scanner scan = new Scanner(new File("C:/Users/Toto/Documents/NetBeansProjects/AplikasiKurir/tarif.txt"));
            
            while (scan.hasNextLine()) {
                
                String baristarif = scan.nextLine();
                String[] datatarif = baristarif.split(";");
                String provinsitujuan = datatarif[0].trim();
                double tarifreguler = Double.parseDouble(datatarif[1].trim());
                double tarifcepat = Double.parseDouble(datatarif[2].trim());
                double tarifexpress = Double.parseDouble(datatarif[3].trim());
                double tariftommorow = Double.parseDouble(datatarif[4].trim());
                double tarifsameday = Double.parseDouble(datatarif[5].trim());
                
                Tarif tarif = new Tarif(provinsitujuan, tarifreguler, tarifcepat, tarifexpress, tariftommorow, tarifsameday);
                getListtarif().add(tarif);
                
                
                
                }
            
        } catch (FileNotFoundException el) {
            Logger.getLogger(TarifDAO.class.getName()).log(Level.SEVERE, null, el);
        }
        
        
       
        
        
    }
    
    

    public ArrayList<String> createComboArray(){
            ArrayList<String> combo= new ArrayList<>();
            for (Tarif t : listtarif) {
                combo.add(t.getProvinsiTujuan());
            
        }
            return combo;
        }
    public String[] createcombo(){
        String[] cmb = createComboArray().toArray(new String[createComboArray().size()]);
        return cmb;
    }
    
    
    /**
     * @return the listtarif
     */
    public ArrayList<Tarif> getListtarif() {
        return listtarif;
    }

    /**
     * @param listtarif the listtarif to set
     */
    public void setListtarif(ArrayList<Tarif> listtarif) {
        this.listtarif = listtarif;
    }
    
    
    
    
    
}
