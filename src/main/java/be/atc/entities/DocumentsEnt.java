package be.atc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "documents", schema = "stockmanagement", catalog = "" ) public class DocumentsEnt {
    private int idDocument;
    private int idDocumentType;
    private int numero;
    private Date dateDocument;
    private DocumenttypesEnt documenttypesByIdDocumentType;
    private Collection<OrdersDocuementsEnt> ordersDocuementsByIdDocument;

    @Id @Column( name = "ID_Document", nullable = false ) public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument( int idDocument ) {
        this.idDocument = idDocument;
    }

    @Basic @Column( name = "ID_DocumentType", nullable = false ) public int getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType( int idDocumentType ) {
        this.idDocumentType = idDocumentType;
    }

    @Basic @Column( name = "Numero", nullable = false ) public int getNumero() {
        return numero;
    }

    public void setNumero( int numero ) {
        this.numero = numero;
    }

    @Basic @Column( name = "DateDocument", nullable = false ) public Date getDateDocument() {
        return dateDocument;
    }

    public void setDateDocument( Date dateDocument ) {
        this.dateDocument = dateDocument;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        DocumentsEnt that = (DocumentsEnt) o;
        return idDocument == that.idDocument && idDocumentType == that.idDocumentType && numero == that.numero
                && Objects.equals( dateDocument, that.dateDocument );
    }

    @Override public int hashCode() {
        return Objects.hash( idDocument, idDocumentType, numero, dateDocument );
    }

    @ManyToOne @JoinColumn( name = "ID_DocumentType", referencedColumnName = "ID_TypeDocument", nullable = false ) public DocumenttypesEnt getDocumenttypesByIdDocumentType() {
        return documenttypesByIdDocumentType;
    }

    public void setDocumenttypesByIdDocumentType( DocumenttypesEnt documenttypesByIdDocumentType ) {
        this.documenttypesByIdDocumentType = documenttypesByIdDocumentType;
    }

    @OneToMany( mappedBy = "documentsByIdDocument" ) public Collection<OrdersDocuementsEnt> getOrdersDocuementsByIdDocument() {
        return ordersDocuementsByIdDocument;
    }

    public void setOrdersDocuementsByIdDocument(
            Collection<OrdersDocuementsEnt> ordersDocuementsByIdDocument ) {
        this.ordersDocuementsByIdDocument = ordersDocuementsByIdDocument;
    }
}
