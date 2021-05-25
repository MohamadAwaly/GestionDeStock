package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders_products", schema = "stockmanagement", catalog = "")
public class OrdersProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdersProducts;
    private int qteUnits;
    private int unitPrice;
    private Boolean deliver;
    private OrdersEntity ordersByIdOrder;

    @Id
    @Column(name = "ID_Orders_products", nullable = false)
    public int getIdOrdersProducts() {
        return idOrdersProducts;
    }

    public void setIdOrdersProducts(int idOrdersProducts) {
        this.idOrdersProducts = idOrdersProducts;
    }

    @Basic
    @Column(name = "qteUnits", nullable = false)
    public int getQteUnits() {
        return qteUnits;
    }

    public void setQteUnits(int qteUnits) {
        this.qteUnits = qteUnits;
    }

    @Basic
    @Column(name = "unitPrice", nullable = false)
    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "deliver", nullable = true)
    public Boolean getDeliver() {
        return deliver;
    }

    public void setDeliver(Boolean deliver) {
        this.deliver = deliver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersProductsEntity that = (OrdersProductsEntity) o;
        return idOrdersProducts == that.idOrdersProducts && qteUnits == that.qteUnits && unitPrice == that.unitPrice && Objects.equals(deliver, that.deliver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdersProducts, qteUnits, unitPrice, deliver);
    }

    @ManyToOne
    @JoinColumn(name = "ID_Order", referencedColumnName = "ID_Order", nullable = false)
    public OrdersEntity getOrdersByIdOrder() {
        return ordersByIdOrder;
    }

    public void setOrdersByIdOrder(OrdersEntity ordersByIdOrder) {
        this.ordersByIdOrder = ordersByIdOrder;
    }
}
