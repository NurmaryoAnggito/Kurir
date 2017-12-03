
import DAO.TarifDAO;
import Model.Tarif;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toto
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarifDAO dao = new TarifDAO();
        ArrayList<Tarif> listtarif = dao.getListtarif();
        dao.scanTarif();
        for (Tarif tarif : listtarif) {
            System.out.println("prov: "+tarif.getProvinsiTujuan());
        }
    }
    
}
