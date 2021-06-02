package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table( name = "products_categories", schema = "stockmanagement", catalog = "" ) public class ProductCategorieEnt {
    private int          idProductsCategories;
    private int          idProduct;
    private int          idCategory;
    private ProductEnt   productsByIdProduct;
    private CategorieEnt categoriesByIdCategory;

    @Id @Column( name = "ID_Products_categories", nullable = false ) public int getIdProductsCategories() {
        return idProductsCategories;
    }

    public void setIdProductsCategories( int idProductsCategories ) {
        this.idProductsCategories = idProductsCategories;
    }

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
        ProductCategorieEnt that = (ProductCategorieEnt) o;
        return idProductsCategories == that.idProductsCategories && idProduct == that.idProduct
                && idCategory == that.idCategory;
    }

    @Override public int hashCode() {
        return Objects.hash( idProductsCategories, idProduct, idCategory );
    }

    @ManyToOne @JoinColumn( name = "ID_Product", referencedColumnName = "ID_Product", nullable = false ) public ProductEnt getProductsByIdProduct() {
        return productsByIdProduct;
    }

    public void setProductsByIdProduct( ProductEnt productsByIdProduct ) {
        this.productsByIdProduct = productsByIdProduct;
    }

    @ManyToOne @JoinColumn( name = "ID_Category", referencedColumnName = "ID_Categorie", nullable = false ) public CategorieEnt getCategoriesByIdCategory() {
        return categoriesByIdCategory;
    }

    public void setCategoriesByIdCategory( CategorieEnt categoriesByIdCategory ) {
        this.categoriesByIdCategory = categoriesByIdCategory;
    }
}
