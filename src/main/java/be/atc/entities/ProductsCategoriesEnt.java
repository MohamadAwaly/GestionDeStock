package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table( name = "products_categories", schema = "stockmanagement", catalog = "" ) public class ProductsCategoriesEnt {
    private int           idProduct;
    private int           idCategory;
    private ProductsEnt   productsByIdProduct;
    private CategoriesEnt categoriesByIdCategory;

    @Basic @Column( name = "ID_Product", nullable = false ) public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct( int idProduct ) {
        this.idProduct = idProduct;
    }

    @Basic @Column( name = "ID_Category", nullable = false ) public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory( int idCategory ) {
        this.idCategory = idCategory;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        ProductsCategoriesEnt that = (ProductsCategoriesEnt) o;
        return idProduct == that.idProduct && idCategory == that.idCategory;
    }

    @Override public int hashCode() {
        return Objects.hash( idProduct, idCategory );
    }

    @ManyToOne @JoinColumn( name = "ID_Product", referencedColumnName = "ID_Product", nullable = false ) public ProductsEnt getProductsByIdProduct() {
        return productsByIdProduct;
    }

    public void setProductsByIdProduct( ProductsEnt productsByIdProduct ) {
        this.productsByIdProduct = productsByIdProduct;
    }

    @ManyToOne @JoinColumn( name = "ID_Category", referencedColumnName = "ID_Categorie", nullable = false ) public CategoriesEnt getCategoriesByIdCategory() {
        return categoriesByIdCategory;
    }

    public void setCategoriesByIdCategory( CategoriesEnt categoriesByIdCategory ) {
        this.categoriesByIdCategory = categoriesByIdCategory;
    }
}
