/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketOrder;

/**
 *
 * @author Lenovo
 */
public class fastTrack extends ticket{
    private String benefit;

    public fastTrack(String ticketType, double price, String benefit) {
        super(ticketType, price);
        this.benefit = benefit;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
}
