package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "adress_users", schema = "stockmanagement", catalog = "")
public class AdressUsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdressUsers;
    private Object typeAdress;
    private AddressEntity addressByIdAdress;

    @Id
    @Column(name = "ID_Adress_users", nullable = false)
    public int getIdAdressUsers() {
        return idAdressUsers;
    }

    public void setIdAdressUsers(int idAdressUsers) {
        this.idAdressUsers = idAdressUsers;
    }

    @Basic
    @Column(name = "typeAdress", nullable = false)
    public Object getTypeAdress() {
        return typeAdress;
    }

    public void setTypeAdress(Object typeAdress) {
        this.typeAdress = typeAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdressUsersEntity that = (AdressUsersEntity) o;
        return idAdressUsers == that.idAdressUsers && Objects.equals(typeAdress, that.typeAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdressUsers, typeAdress);
    }

    @ManyToOne
    @JoinColumn(name = "ID_Adress", referencedColumnName = "ID_Adress", nullable = false)
    public AddressEntity getAddressByIdAdress() {
        return addressByIdAdress;
    }

    public void setAddressByIdAdress(AddressEntity addressByIdAdress) {
        this.addressByIdAdress = addressByIdAdress;
    }
}
