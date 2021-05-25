package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "stockmanagement", catalog = "")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdress;
    private String street;
    private int number;
    private Integer box;

    @Id
    @Column(name = "ID_Adress", nullable = false)
    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    @Basic
    @Column(name = "street", nullable = false, length = 255)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "number", nullable = false)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "box", nullable = true)
    public Integer getBox() {
        return box;
    }

    public void setBox(Integer box) {
        this.box = box;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return idAdress == that.idAdress && number == that.number && Objects.equals(street, that.street) && Objects.equals(box, that.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdress, street, number, box);
    }
}
