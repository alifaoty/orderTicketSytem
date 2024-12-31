/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketOrder;

/**
 *
 * @author Lenovo
 */
// subclass kelas ticket
public class regular extends ticket{
    // menyimpan kouta yg ada
    private int kouta;

    // Constructor utk menginisialisasi ticketType, price, kouta saat objek dibuat
    public regular(String ticketType, double price, int kouta) {
        super(ticketType, price);
        this.kouta = kouta;
    }

    // Getter utk mengambil nilai
    public int getKouta() {
        return kouta;
    }

    // Setter utk mengubah nilai 
    public void setKouta(int kouta) {
        this.kouta = kouta;
    }
}
