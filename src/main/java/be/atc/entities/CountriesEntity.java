package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "countries", schema = "stockmanagement", catalog = "")
public class CountriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCountry;
    private String country;

    @Id
    @Column(name = "ID_Country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Basic
    @Column(name = "Country", nullable = false, length = 60)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountriesEntity that = (CountriesEntity) o;
        return idCountry == that.idCountry && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, country);
    }
}
