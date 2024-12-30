/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketOrder;

/**
 *
 * @author Lenovo
 */
public class regular extends ticket{
    private int kouta;

    public regular(String ticketType, double price, int kouta) {
        super(ticketType, price);
        this.kouta = kouta;
    }

    public int getKouta() {
        return kouta;
    }

    public void setKouta(int kouta) {
        this.kouta = kouta;
    }
}
