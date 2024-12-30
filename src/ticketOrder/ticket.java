/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketOrder;

/**
 *
 * @author Lenovo
 */
public class ticket {
    private String ticketType;
    private double price;

    public ticket(String ticketType, double price) {
        this.ticketType = ticketType;
        this.price = price;
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getPrice() {
        return price;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
