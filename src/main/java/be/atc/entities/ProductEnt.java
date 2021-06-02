package be.atc.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "products", schema = "stockmanagement", catalog = "" ) public class ProductEnt {
    private int                             idProduct;
    private int                             idBrand;
    private String                          code;
    private String                          designation;
    private int                             quantityTotal;
    private int                             unitCostPrice;
    private int                             margin;
    private int                             length;
    private int                             width;
    private int                             height;
    private Collection<BatchEnt>            batchsByIdProduct;
    private Collection<OrderProductEnt>     ordersProductsByIdProduct;
    private BrandEnt                        brandsByIdBrand;
    private Collection<ProductCategorieEnt> productsCategoriesByIdProduct;

    @Id @Column( name = "ID_Product", nullable = false ) public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct( int idProduct ) {
        this.idProduct = idProduct;
    }

    @Basic @Column( name = "ID_Brand", nullable = false ) public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand( int idBrand ) {
        this.idBrand = idBrand;
    }

    @Basic @Column( name = "code", nullable = false, length = 255 ) public String getCode() {
        return code;
    }

    public void setCode( String code ) {
        this.code = code;
    }

    @Basic @Column( name = "designation", nullable = false, length = 255 ) public String getDesignation() {
        return designation;
    }

    public void setDesignation( String designation ) {
        this.designation = designation;
    }

    @Basic @Column( name = "quantityTotal", nullable = false ) public int getQuantityTotal() {
        return quantityTotal;
    }

    public void setQuantityTotal( int quantityTotal ) {
        this.quantityTotal = quantityTotal;
    }

    @Basic @Column( name = "unitCostPrice", nullable = false ) public int getUnitCostPrice() {
        return unitCostPrice;
    }

    public void setUnitCostPrice( int unitCostPrice ) {
        this.unitCostPrice = unitCostPrice;
    }

    @Basic @Column( name = "margin", nullable = false ) public int getMargin() {
        return margin;
    }

    public void setMargin( int margin ) {
        this.margin = margin;
    }

    @Basic @Column( name = "length", nullable = false ) public int getLength() {
        return length;
    }

    public void setLength( int length ) {
        this.length = length;
    }

    @Basic @Column( name = "width", nullable = false ) public int getWidth() {
        return width;
    }

    public void setWidth( int width ) {
        this.width = width;
    }

    @Basic @Column( name = "height", nullable = false ) public int getHeight() {
        return height;
    }

    public void setHeight( int height ) {
        this.height = height;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        ProductEnt that = (ProductEnt) o;
        return idProduct == that.idProduct && idBrand == that.idBrand && quantityTotal == that.quantityTotal
                && unitCostPrice == that.unitCostPrice && margin == that.margin && length == that.length
                && width == that.width && height == that.height && Objects.equals( code, that.code )
                && Objects.equals( designation, that.designation );
    }

    @Override public int hashCode() {
        return Objects
                .hash( idProduct, idBrand, code, designation, quantityTotal, unitCostPrice, margin, length, width,
                        height );
    }

    @OneToMany( mappedBy = "productsByIdProducts" ) public Collection<BatchEnt> getBatchsByIdProduct() {
        return batchsByIdProduct;
    }

    public void setBatchsByIdProduct( Collection<BatchEnt> batchsByIdProduct ) {
        this.batchsByIdProduct = batchsByIdProduct;
    }

    @OneToMany( mappedBy = "productsByIdProduct" ) public Collection<OrderProductEnt> getOrdersProductsByIdProduct() {
        return ordersProductsByIdProduct;
    }

    public void setOrdersProductsByIdProduct( Collection<OrderProductEnt> ordersProductsByIdProduct ) {
        this.ordersProductsByIdProduct = ordersProductsByIdProduct;
    }

    @ManyToOne @JoinColumn( name = "ID_Brand", referencedColumnName = "ID_Brand", nullable = false ) public BrandEnt getBrandsByIdBrand() {
        return brandsByIdBrand;
    }

    public void setBrandsByIdBrand( BrandEnt brandsByIdBrand ) {
        this.brandsByIdBrand = brandsByIdBrand;
    }

    @OneToMany( mappedBy = "productsByIdProduct" ) public Collection<ProductCategorieEnt> getProductsCategoriesByIdProduct() {
        return productsCategoriesByIdProduct;
    }

    public void setProductsCategoriesByIdProduct(
            Collection<ProductCategorieEnt> productsCategoriesByIdProduct ) {
        this.productsCategoriesByIdProduct = productsCategoriesByIdProduct;
    }
}
