package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cities", schema = "stockmanagement", catalog = "")
public class CitiesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCity;
    private String citie;
    private int postalCode;

    @Id
    @Column(name = "ID_City", nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "citie", nullable = false, length = 60)
    public String getCitie() {
        return citie;
    }

    public void setCitie(String citie) {
        this.citie = citie;
    }

    @Basic
    @Column(name = "postalCode", nullable = false)
    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitiesEntity that = (CitiesEntity) o;
        return idCity == that.idCity && postalCode == that.postalCode && Objects.equals(citie, that.citie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCity, citie, postalCode);
    }
}
