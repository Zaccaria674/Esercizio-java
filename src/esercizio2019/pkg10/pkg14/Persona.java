/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2019.pkg10.pkg14;

/**
 *
 * @author casinoo
 */
public class Persona {
    private String name;
    private String cognome;
    private String titolo;
    private String professione; 
    
    public Persona(String name,String cognome,String titolo,String professione){
        this.name=name;
        this.cognome=cognome;
        this.titolo=titolo;
        this.professione=professione;
    }
    
    public String getInfoPersona(){
       
        return name+" "+cognome+" professione "+professione;
     }
    
    public void set_titolo(String titolo){
        this.titolo=titolo;
    }
    public void set_professione(String professione){
        this.professione=professione;
    }
}
