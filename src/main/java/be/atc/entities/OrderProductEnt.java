package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table( name = "orders_products", schema = "stockmanagement", catalog = "" ) public class OrderProductEnt {
    private int        idOrdersProducts;
    private int        idOrder;
    private int        idProduct;
    private int        qteUnits;
    private int        unitPrice;
    private boolean    deliver;
    private OrderEnt   ordersByIdOrder;
    private ProductEnt productsByIdProduct;

    @Id @Column( name = "ID_Orders_products", nullable = false ) public int getIdOrdersProducts() {
        return idOrdersProducts;
    }

    public void setIdOrdersProducts( int idOrdersProducts ) {
        this.idOrdersProducts = idOrdersProducts;
    }

    @Basic @Column( name = "ID_Order", nullable = false ) public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder( int idOrder ) {
        this.idOrder = idOrder;
    }

    @Basic @Column( name = "ID_Product", nullable = false ) public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct( int idProduct ) {
        this.idProduct = idProduct;
    }

    @Basic @Column( name = "qteUnits", nullable = false ) public int getQteUnits() {
        return qteUnits;
    }

    public void setQteUnits( int qteUnits ) {
        this.qteUnits = qteUnits;
    }

    @Basic @Column( name = "unitPrice", nullable = false ) public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice( int unitPrice ) {
        this.unitPrice = unitPrice;
    }

    @Basic @Column( name = "deliver", nullable = true ) public boolean isDeliver() {
        return deliver;
    }

    public void setDeliver( boolean deliver ) {
        this.deliver = deliver;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        OrderProductEnt that = (OrderProductEnt) o;
        return idOrdersProducts == that.idOrdersProducts && idOrder == that.idOrder && idProduct == that.idProduct
                && qteUnits == that.qteUnits && unitPrice == that.unitPrice && deliver == that.deliver;
    }

    @Override public int hashCode() {
        return Objects.hash( idOrdersProducts, idOrder, idProduct, qteUnits, unitPrice, deliver );
    }

    @ManyToOne @JoinColumn( name = "ID_Order", referencedColumnName = "ID_Order", nullable = false ) public OrderEnt getOrdersByIdOrder() {
        return ordersByIdOrder;
    }

    public void setOrdersByIdOrder( OrderEnt ordersByIdOrder ) {
        this.ordersByIdOrder = ordersByIdOrder;
    }

    @ManyToOne @JoinColumn( name = "ID_Product", referencedColumnName = "ID_Product", nullable = false ) public ProductEnt getProductsByIdProduct() {
        return productsByIdProduct;
    }

    public void setProductsByIdProduct( ProductEnt productsByIdProduct ) {
        this.productsByIdProduct = productsByIdProduct;
    }
}
