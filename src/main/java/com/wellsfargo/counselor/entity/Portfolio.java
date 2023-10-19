package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private Client client;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float riskFactor;

    @Column(nullable = false)
    private long total;

    protected Portfolio() {

    }

    public Portfolio(Client client, String name, float riskFactor, long total) {
        this.client = client;
        this.name = name;
        this.riskFactor = riskFactor;
        this.total = total;
    }

    public Long getPortfolioId() { return portfolioId; }

    public Client getClient() { return client; }

    public void setClient (Client client) { this.client = client; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Float getRiskFactor () { return riskFactor; }

    public void setRiskFactor (float riskFactor) { this.riskFactor = riskFactor; }

    public Long getTotal () { return total; }

    public void setTotal (Long total) { this.total = total; }
}
