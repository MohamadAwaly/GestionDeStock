package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products_categories", schema = "stockmanagement", catalog = "")
public class ProductsCategoriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductsCategories;
    private ProductsEntity productsByIdProduct;
    private CategoriesEntity categoriesByIdCategory;

    @Id
    @Column(name = "ID_Products_categories", nullable = false)
    public int getIdProductsCategories() {
        return idProductsCategories;
    }

    public void setIdProductsCategories(int idProductsCategories) {
        this.idProductsCategories = idProductsCategories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsCategoriesEntity that = (ProductsCategoriesEntity) o;
        return idProductsCategories == that.idProductsCategories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProductsCategories);
    }

    @ManyToOne
    @JoinColumn(name = "ID_Product", referencedColumnName = "ID_Product", nullable = false)
    public ProductsEntity getProductsByIdProduct() {
        return productsByIdProduct;
    }

    public void setProductsByIdProduct(ProductsEntity productsByIdProduct) {
        this.productsByIdProduct = productsByIdProduct;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Category", referencedColumnName = "ID_Categorie", nullable = false)
    public CategoriesEntity getCategoriesByIdCategory() {
        return categoriesByIdCategory;
    }

    public void setCategoriesByIdCategory(CategoriesEntity categoriesByIdCategory) {
        this.categoriesByIdCategory = categoriesByIdCategory;
    }
}
