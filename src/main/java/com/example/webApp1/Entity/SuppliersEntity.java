package com.example.webApp1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "suppliers", schema = "productmarket", catalog = "")
public class SuppliersEntity {
    private int id;
    private String supplierAddress;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "supplierAddress", nullable = true, length = 30)
    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SuppliersEntity that = (SuppliersEntity) o;

        if (id != that.id) return false;
        if (supplierAddress != null ? !supplierAddress.equals(that.supplierAddress) : that.supplierAddress != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (supplierAddress != null ? supplierAddress.hashCode() : 0);
        return result;
    }
}
