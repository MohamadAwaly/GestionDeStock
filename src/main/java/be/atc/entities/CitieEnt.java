package be.atc.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "cities", schema = "stockmanagement", catalog = "" ) public class CitieEnt {
    private int                    idCity;
    private int                    idCountry;
    private String                 citie;
    private int                    postalCode;
    private Collection<AddressEnt> addressesByIdCity;
    private CountrieEnt            countriesByIdCountry;

    @Id @Column( name = "ID_City", nullable = false ) public int getIdCity() {
        return idCity;
    }

    public void setIdCity( int idCity ) {
        this.idCity = idCity;
    }

    @Basic @Column( name = "ID_Country", nullable = false ) public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry( int idCountry ) {
        this.idCountry = idCountry;
    }

    @Basic @Column( name = "citie", nullable = false, length = 60 ) public String getCitie() {
        return citie;
    }

    public void setCitie( String citie ) {
        this.citie = citie;
    }

    @Basic @Column( name = "postalCode", nullable = false ) public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode( int postalCode ) {
        this.postalCode = postalCode;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        CitieEnt citieEnt = (CitieEnt) o;
        return idCity == citieEnt.idCity && idCountry == citieEnt.idCountry && postalCode == citieEnt.postalCode
                && Objects.equals( citie, citieEnt.citie );
    }

    @Override public int hashCode() {
        return Objects.hash( idCity, idCountry, citie, postalCode );
    }

    @OneToMany( mappedBy = "citiesByIdCity" ) public Collection<AddressEnt> getAddressesByIdCity() {
        return addressesByIdCity;
    }

    public void setAddressesByIdCity( Collection<AddressEnt> addressesByIdCity ) {
        this.addressesByIdCity = addressesByIdCity;
    }

    @ManyToOne @JoinColumn( name = "ID_Country", referencedColumnName = "ID_Country", nullable = false ) public CountrieEnt getCountriesByIdCountry() {
        return countriesByIdCountry;
    }

    public void setCountriesByIdCountry( CountrieEnt countriesByIdCountry ) {
        this.countriesByIdCountry = countriesByIdCountry;
    }
}
