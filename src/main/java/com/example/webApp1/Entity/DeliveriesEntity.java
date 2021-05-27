package com.example.webApp1.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "deliveries", schema = "productmarket", catalog = "")
public class DeliveriesEntity {
    private int id;
    private Integer idProduct;
    private Integer idSupplier;
    private Date deliveryDate;
    private Integer deliveryAmount;
    private Integer productId;
    private Integer suppliersId;

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
    @Column(name = "idSupplier", nullable = true)
    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    @Basic
    @Column(name = "deliveryDate", nullable = true)
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "deliveryAmount", nullable = true)
    public Integer getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(Integer deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    @Basic
    @Column(name = "product_id", nullable = true)
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "suppliers_id", nullable = true)
    public Integer getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Integer suppliersId) {
        this.suppliersId = suppliersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveriesEntity that = (DeliveriesEntity) o;

        if (id != that.id) return false;
        if (idProduct != null ? !idProduct.equals(that.idProduct) : that.idProduct != null) return false;
        if (idSupplier != null ? !idSupplier.equals(that.idSupplier) : that.idSupplier != null) return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (deliveryAmount != null ? !deliveryAmount.equals(that.deliveryAmount) : that.deliveryAmount != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (suppliersId != null ? !suppliersId.equals(that.suppliersId) : that.suppliersId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idProduct != null ? idProduct.hashCode() : 0);
        result = 31 * result + (idSupplier != null ? idSupplier.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (deliveryAmount != null ? deliveryAmount.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (suppliersId != null ? suppliersId.hashCode() : 0);
        return result;
    }
}
