/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formSiswa;

/**
 *
 * @author Gatra
 */
public class FormSiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FormSiswa form = new FormSiswa();
            form.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
