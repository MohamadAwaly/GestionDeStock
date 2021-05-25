package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "batchs", schema = "stockmanagement", catalog = "")
public class BatchsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBatch;
    private int quantity;
    private int uniPrice;
    private int numberBatch;

    @Id
    @Column(name = "ID_Batch", nullable = false)
    public int getIdBatch() {
        return idBatch;
    }

    public void setIdBatch(int idBatch) {
        this.idBatch = idBatch;
    }

    @Basic
    @Column(name = "Quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "uniPrice", nullable = false)
    public int getUniPrice() {
        return uniPrice;
    }

    public void setUniPrice(int uniPrice) {
        this.uniPrice = uniPrice;
    }

    @Basic
    @Column(name = "numberBatch", nullable = false)
    public int getNumberBatch() {
        return numberBatch;
    }

    public void setNumberBatch(int numberBatch) {
        this.numberBatch = numberBatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchsEntity that = (BatchsEntity) o;
        return idBatch == that.idBatch && quantity == that.quantity && uniPrice == that.uniPrice && numberBatch == that.numberBatch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBatch, quantity, uniPrice, numberBatch);
    }
}
