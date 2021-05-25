package be.atc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "commandsuppliers", schema = "stockmanagement", catalog = "")
public class CommandsuppliersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommandSuppliers;
    private Date orderDate;

    @Id
    @Column(name = "ID_CommandSuppliers", nullable = false)
    public int getIdCommandSuppliers() {
        return idCommandSuppliers;
    }

    public void setIdCommandSuppliers(int idCommandSuppliers) {
        this.idCommandSuppliers = idCommandSuppliers;
    }

    @Basic
    @Column(name = "orderDate", nullable = false)
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandsuppliersEntity that = (CommandsuppliersEntity) o;
        return idCommandSuppliers == that.idCommandSuppliers && Objects.equals(orderDate, that.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommandSuppliers, orderDate);
    }
}
