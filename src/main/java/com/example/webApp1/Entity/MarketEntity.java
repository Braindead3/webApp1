package com.example.webApp1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "market", schema = "productmarket", catalog = "")
public class MarketEntity {
    private int id;
    private Integer idProduct;
    private Integer marketAmount;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idProduct", nullable = true)
    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "marketAmount", nullable = true)
    public Integer getMarketAmount() {
        return marketAmount;
    }

    public void setMarketAmount(Integer marketAmount) {
        this.marketAmount = marketAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarketEntity that = (MarketEntity) o;

        if (id != that.id) return false;
        if (idProduct != null ? !idProduct.equals(that.idProduct) : that.idProduct != null) return false;
        if (marketAmount != null ? !marketAmount.equals(that.marketAmount) : that.marketAmount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idProduct != null ? idProduct.hashCode() : 0);
        result = 31 * result + (marketAmount != null ? marketAmount.hashCode() : 0);
        return result;
    }
}
