package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "documenttypes", schema = "stockmanagement", catalog = "")
public class DocumenttypesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeDocument;
    private String documentType;

    @Id
    @Column(name = "ID_TypeDocument", nullable = false)
    public int getIdTypeDocument() {
        return idTypeDocument;
    }

    public void setIdTypeDocument(int idTypeDocument) {
        this.idTypeDocument = idTypeDocument;
    }

    @Basic
    @Column(name = "documentType", nullable = false, length = 60)
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumenttypesEntity that = (DocumenttypesEntity) o;
        return idTypeDocument == that.idTypeDocument && Objects.equals(documentType, that.documentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTypeDocument, documentType);
    }
}
