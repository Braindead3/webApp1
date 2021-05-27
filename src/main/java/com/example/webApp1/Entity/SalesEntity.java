package com.example.webApp1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "sales", schema = "productmarket", catalog = "")
public class SalesEntity {
    private int id;
    private Integer idCustomer;
    private Integer idProduct;
    private Integer amount;
    private Integer customerSalesId;
    private Integer productSalesId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idCustomer", nullable = true)
    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
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
    @Column(name = "amount", nullable = true)
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "customerSales_id", nullable = true)
    public Integer getCustomerSalesId() {
        return customerSalesId;
    }

    public void setCustomerSalesId(Integer customerSalesId) {
        this.customerSalesId = customerSalesId;
    }

    @Basic
    @Column(name = "productSales_id", nullable = true)
    public Integer getProductSalesId() {
        return productSalesId;
    }

    public void setProductSalesId(Integer productSalesId) {
        this.productSalesId = productSalesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesEntity that = (SalesEntity) o;

        if (id != that.id) return false;
        if (idCustomer != null ? !idCustomer.equals(that.idCustomer) : that.idCustomer != null) return false;
        if (idProduct != null ? !idProduct.equals(that.idProduct) : that.idProduct != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (customerSalesId != null ? !customerSalesId.equals(that.customerSalesId) : that.customerSalesId != null)
            return false;
        if (productSalesId != null ? !productSalesId.equals(that.productSalesId) : that.productSalesId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idCustomer != null ? idCustomer.hashCode() : 0);
        result = 31 * result + (idProduct != null ? idProduct.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (customerSalesId != null ? customerSalesId.hashCode() : 0);
        result = 31 * result + (productSalesId != null ? productSalesId.hashCode() : 0);
        return result;
    }
}
