package ejercicio2.dto;

import java.io.Serializable;

public class PuntosDTO implements Serializable {

    private Integer id;
    private String clientName;
    private double price;
    private double totalPoints;

    public PuntosDTO(Integer id, String clientName, double price, double totalPoints) {
        this.id = id;
        this.clientName = clientName;
        this.price = price;
        this.totalPoints = totalPoints;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "MainPuntosT{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", price=" + price +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
