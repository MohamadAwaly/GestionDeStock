package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "stockmanagement", catalog = "")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String code;
    private String designation;
    private int quantityTotal;
    private int unitCostPrice;
    private int margin;
    private int length;
    private int width;
    private int height;
    private BrandsEntity brandsByIdBrand;

    @Id
    @Column(name = "ID_Product", nullable = false)
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "designation", nullable = false, length = 255)
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Basic
    @Column(name = "quantityTotal", nullable = false)
    public int getQuantityTotal() {
        return quantityTotal;
    }

    public void setQuantityTotal(int quantityTotal) {
        this.quantityTotal = quantityTotal;
    }

    @Basic
    @Column(name = "unitCostPrice", nullable = false)
    public int getUnitCostPrice() {
        return unitCostPrice;
    }

    public void setUnitCostPrice(int unitCostPrice) {
        this.unitCostPrice = unitCostPrice;
    }

    @Basic
    @Column(name = "margin", nullable = false)
    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    @Basic
    @Column(name = "length", nullable = false)
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Basic
    @Column(name = "width", nullable = false)
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height", nullable = false)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return idProduct == that.idProduct && quantityTotal == that.quantityTotal && unitCostPrice == that.unitCostPrice && margin == that.margin && length == that.length && width == that.width && height == that.height && Objects.equals(code, that.code) && Objects.equals(designation, that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, code, designation, quantityTotal, unitCostPrice, margin, length, width, height);
    }

    @ManyToOne
    @JoinColumn(name = "ID_Brand", referencedColumnName = "ID_Brand", nullable = false)
    public BrandsEntity getBrandsByIdBrand() {
        return brandsByIdBrand;
    }

    public void setBrandsByIdBrand(BrandsEntity brandsByIdBrand) {
        this.brandsByIdBrand = brandsByIdBrand;
    }
}
