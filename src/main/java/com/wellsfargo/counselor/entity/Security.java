package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private long total;

    @Column(nullable = false)
    private Date purchaseDate;

    protected Security(){
    }

    public Security(Portfolio portfolio, String symbol, String type, int quantity, float price, long total, Date purchaseDate) {
        this.portfolio = portfolio;
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
    }

    public long getSecurityId() { return securityId; }

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public String getSymbol() { return symbol; }

    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public float getPrice() { return price; }

    public void setPrice(float price) { this.price = price; }

    public long getTotal() { return total; }

    public void setTotal(long total) { this.total = total; }

    public Date getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }
}
