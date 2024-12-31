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
public class fastTrack extends ticket{
    // menyimpan benefit yg diperoleh
    private String benefit;

    // Constructor utk menginisialisasi ticketType, price, benefit saat objek dibuat
    public fastTrack(String ticketType, double price, String benefit) {
        super(ticketType, price);
        this.benefit = benefit;
    }

    // Getter utk mengambil nilai
    public String getBenefit() {
        return benefit;
    }

    // Setter utk mengubah nilai 
    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
}
