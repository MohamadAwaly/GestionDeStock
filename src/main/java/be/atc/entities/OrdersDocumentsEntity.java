package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders_documents", schema = "stockmanagement", catalog = "")
public class OrdersDocumentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdersDocuements;
    private OrdersEntity ordersByIdOrder;
    private DocumentsEntity documentsByIdDocument;

    @Id
    @Column(name = "ID_Orders_docuements", nullable = false)
    public int getIdOrdersDocuements() {
        return idOrdersDocuements;
    }

    public void setIdOrdersDocuements(int idOrdersDocuements) {
        this.idOrdersDocuements = idOrdersDocuements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersDocumentsEntity that = (OrdersDocumentsEntity) o;
        return idOrdersDocuements == that.idOrdersDocuements;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdersDocuements);
    }

    @ManyToOne
    @JoinColumn(name = "ID_Order", referencedColumnName = "ID_Order", nullable = false)
    public OrdersEntity getOrdersByIdOrder() {
        return ordersByIdOrder;
    }

    public void setOrdersByIdOrder(OrdersEntity ordersByIdOrder) {
        this.ordersByIdOrder = ordersByIdOrder;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Document", referencedColumnName = "ID_Document", nullable = false)
    public DocumentsEntity getDocumentsByIdDocument() {
        return documentsByIdDocument;
    }

    public void setDocumentsByIdDocument(DocumentsEntity documentsByIdDocument) {
        this.documentsByIdDocument = documentsByIdDocument;
    }
}
