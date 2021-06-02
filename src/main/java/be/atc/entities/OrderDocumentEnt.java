package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table( name = "orders_documents", schema = "stockmanagement", catalog = "" ) public class OrderDocumentEnt {
    private int         idOrdersDocuements;
    private int         idOrder;
    private int         idDocument;
    private OrderEnt    ordersByIdOrder;
    private DocumentEnt documentsByIdDocument;

    @Id @Column( name = "ID_Orders_docuements", nullable = false ) public int getIdOrdersDocuements() {
        return idOrdersDocuements;
    }

    public void setIdOrdersDocuements( int idOrdersDocuements ) {
        this.idOrdersDocuements = idOrdersDocuements;
    }

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
        OrderDocumentEnt that = (OrderDocumentEnt) o;
        return idOrdersDocuements == that.idOrdersDocuements && idOrder == that.idOrder
                && idDocument == that.idDocument;
    }

    @Override public int hashCode() {
        return Objects.hash( idOrdersDocuements, idOrder, idDocument );
    }

    @ManyToOne @JoinColumn( name = "ID_Order", referencedColumnName = "ID_Order", nullable = false ) public OrderEnt getOrdersByIdOrder() {
        return ordersByIdOrder;
    }

    public void setOrdersByIdOrder( OrderEnt ordersByIdOrder ) {
        this.ordersByIdOrder = ordersByIdOrder;
    }

    @ManyToOne @JoinColumn( name = "ID_Document", referencedColumnName = "ID_Document", nullable = false ) public DocumentEnt getDocumentsByIdDocument() {
        return documentsByIdDocument;
    }

    public void setDocumentsByIdDocument( DocumentEnt documentsByIdDocument ) {
        this.documentsByIdDocument = documentsByIdDocument;
    }
}
