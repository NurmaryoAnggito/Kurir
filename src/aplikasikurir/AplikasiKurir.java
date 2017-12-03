/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikurir;

import DAO.TarifDAO;
import Model.Tarif;

/**
 *
 * @author user
 */
public class AplikasiKurir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarif trf;
        TarifDAO dao = new TarifDAO();
        dao.scanTarif();
        
        for (String a : dao.createcombo()) {
            System.out.println(a);
        }
//        for (Tarif tr : dao.getListtarif()) {
//            System.out.println(tr.getProvinsiTujuan());
//        }

    }
    
}
