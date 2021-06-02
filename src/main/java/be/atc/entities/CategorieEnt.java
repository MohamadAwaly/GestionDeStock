package be.atc.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "categories", schema = "stockmanagement", catalog = "" ) public class CategorieEnt {
    private int                             idCategorie;
    private String                          category;
    private Collection<ProductCategorieEnt> productsCategoriesByIdCategorie;

    @Id @Column( name = "ID_Categorie", nullable = false ) public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie( int idCategorie ) {
        this.idCategorie = idCategorie;
    }

    @Basic @Column( name = "category", nullable = false, length = 60 ) public String getCategory() {
        return category;
    }

    public void setCategory( String category ) {
        this.category = category;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        CategorieEnt that = (CategorieEnt) o;
        return idCategorie == that.idCategorie && Objects.equals( category, that.category );
    }

    @Override public int hashCode() {
        return Objects.hash( idCategorie, category );
    }

    @OneToMany( mappedBy = "categoriesByIdCategory" ) public Collection<ProductCategorieEnt> getProductsCategoriesByIdCategorie() {
        return productsCategoriesByIdCategorie;
    }

    public void setProductsCategoriesByIdCategorie(
            Collection<ProductCategorieEnt> productsCategoriesByIdCategorie ) {
        this.productsCategoriesByIdCategorie = productsCategoriesByIdCategorie;
    }
}
