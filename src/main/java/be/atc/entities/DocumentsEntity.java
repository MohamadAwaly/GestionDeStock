package be.atc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "documents", schema = "stockmanagement", catalog = "")
public class DocumentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocument;
    private int numero;
    private Date dateDocument;

    @Id
    @Column(name = "ID_Document", nullable = false)
    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    @Basic
    @Column(name = "Numero", nullable = false)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "DateDocument", nullable = false)
    public Date getDateDocument() {
        return dateDocument;
    }

    public void setDateDocument(Date dateDocument) {
        this.dateDocument = dateDocument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentsEntity that = (DocumentsEntity) o;
        return idDocument == that.idDocument && numero == that.numero && Objects.equals(dateDocument, that.dateDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocument, numero, dateDocument);
    }
}
