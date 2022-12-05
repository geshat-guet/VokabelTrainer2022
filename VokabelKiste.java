
/**
 * Beschreiben Sie hier die Klasse VokabelKiste.
 * 
 * @author guet 
 * @version 2022
 */
public class VokabelKiste
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public VokabelKarte[] vokabeln = new VokabelKarte[10];

    /**
     * Konstruktor für Objekte der Klasse VokabelKiste
     */
    public VokabelKiste()
    {
        // Instanzvariable initialisieren
        vokabeln[0] = new VokabelKarte("Baum", "tree");
        vokabeln[1] = new VokabelKarte("Tisch", "table");
        vokabeln[2] = new VokabelKarte("Stuhl", "chair");
        vokabeln[0] = new VokabelKarte("Raum", "room");
        vokabeln[0] = new VokabelKarte("Schule", "school");
    }


}
