package be.atc.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "brands", schema = "stockmanagement", catalog = "" ) public class BrandEnt {
    private int                    idBrand;
    private String                 brand;
    private Collection<ProductEnt> productsByIdBrand;

    @Id @Column( name = "ID_Brand", nullable = false ) public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand( int idBrand ) {
        this.idBrand = idBrand;
    }

    @Basic @Column( name = "brand", nullable = false, length = 60 ) public String getBrand() {
        return brand;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        BrandEnt brandEnt = (BrandEnt) o;
        return idBrand == brandEnt.idBrand && Objects.equals( brand, brandEnt.brand );
    }

    @Override public int hashCode() {
        return Objects.hash( idBrand, brand );
    }

    @OneToMany( mappedBy = "brandsByIdBrand" ) public Collection<ProductEnt> getProductsByIdBrand() {
        return productsByIdBrand;
    }

    public void setProductsByIdBrand( Collection<ProductEnt> productsByIdBrand ) {
        this.productsByIdBrand = productsByIdBrand;
    }
}
