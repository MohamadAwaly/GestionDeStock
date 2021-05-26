package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table( name = "orders_docuements", schema = "stockmanagement", catalog = "" ) public class OrdersDocuementsEnt {
    private int idOrder;
    private int idDocument;
    private OrdersEnt ordersByIdOrder;
    private DocumentsEnt documentsByIdDocument;

    @Basic @Column( name = "ID_Order", nullable = false ) public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder( int idOrder ) {
        this.idOrder = idOrder;
    }

    @Basic @Column( name = "ID_Document", nullable = false ) public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument( int idDocument ) {
        this.idDocument = idDocument;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        OrdersDocuementsEnt that = (OrdersDocuementsEnt) o;
        return idOrder == that.idOrder && idDocument == that.idDocument;
    }

    @Override public int hashCode() {
        return Objects.hash( idOrder, idDocument );
    }

    @ManyToOne @JoinColumn( name = "ID_Order", referencedColumnName = "ID_Order", nullable = false ) public OrdersEnt getOrdersByIdOrder() {
        return ordersByIdOrder;
    }

    public void setOrdersByIdOrder( OrdersEnt ordersByIdOrder ) {
        this.ordersByIdOrder = ordersByIdOrder;
    }

    @ManyToOne @JoinColumn( name = "ID_Document", referencedColumnName = "ID_Document", nullable = false ) public DocumentsEnt getDocumentsByIdDocument() {
        return documentsByIdDocument;
    }

    public void setDocumentsByIdDocument( DocumentsEnt documentsByIdDocument ) {
        this.documentsByIdDocument = documentsByIdDocument;
    }
}
