
/**
 * Beschreiben Sie hier die Klasse Vokabelkarte.
 * 
 * @author guet
 * @version 2022
 */
public class VokabelKarte
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public String deutsch;
    public String fremdsprache;

    /**
     * Konstruktor für Objekte der Klasse Vokabelkarte
     */
    public VokabelKarte(String pDeu, String pFremd)
    {
        // Instanzvariable initialisieren
        deutsch = pDeu;
        fremdsprache = pFremd;
    }

    public void druckeKarte()
    {
        System.out.println("----------------------");
        System.out.println("-                    -");
        System.out.println("- "+fremdsprache+"    ");
        System.out.println("-                    -");
        System.out.println("----------------------");     
        System.out.println();
        System.out.println("----------------------");
        System.out.println("-                    -");
        System.out.println("- "+deutsch+"    ");
        System.out.println("-                    -");
        System.out.println("----------------------");
    }
}
