/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketOrder;

/**
 *
 * @author Lenovo
 */

// menyimpan informasi (jenis tiket, harga)
public class ticket {
    // menyimpan jenis tiket (Fast Track, Regular)
    private String ticketType;
    // menyimpan harga tiket
    private double price;

    // Constructor utk menginisialisasi ticketType dan price saat objek ticket dibuat
    public ticket(String ticketType, double price) {
        this.ticketType = ticketType;
        this.price = price;
    }

    // Getter utk mengambil nilai
    public String getTicketType() {
        return ticketType;
    }

    public double getPrice() {
        return price;
    }

    // Setter utk mengubah nilai 
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
