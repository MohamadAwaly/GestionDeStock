package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table( name = "adress_users", schema = "stockmanagement", catalog = "" ) public class AdressUsersEnt {
    private int idAdress;
    private int idUser;
    private Object typeAdress;
    private AddressEnt addressByIdAdress;
    private UsersEnt usersByIdUser;

    @Basic @Column( name = "ID_Adress", nullable = false ) public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress( int idAdress ) {
        this.idAdress = idAdress;
    }

    @Basic @Column( name = "ID_User", nullable = false ) public int getIdUser() {
        return idUser;
    }

    public void setIdUser( int idUser ) {
        this.idUser = idUser;
    }

    @Basic @Column( name = "typeAdress", nullable = false ) public Object getTypeAdress() {
        return typeAdress;
    }

    public void setTypeAdress( Object typeAdress ) {
        this.typeAdress = typeAdress;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        AdressUsersEnt that = (AdressUsersEnt) o;
        return idAdress == that.idAdress && idUser == that.idUser && Objects
                .equals( typeAdress, that.typeAdress );
    }

    @Override public int hashCode() {
        return Objects.hash( idAdress, idUser, typeAdress );
    }

    @ManyToOne @JoinColumn( name = "ID_Adress", referencedColumnName = "ID_Adress", nullable = false ) public AddressEnt getAddressByIdAdress() {
        return addressByIdAdress;
    }

    public void setAddressByIdAdress( AddressEnt addressByIdAdress ) {
        this.addressByIdAdress = addressByIdAdress;
    }

    @ManyToOne @JoinColumn( name = "ID_User", referencedColumnName = "ID_User", nullable = false ) public UsersEnt getUsersByIdUser() {
        return usersByIdUser;
    }

    public void setUsersByIdUser( UsersEnt usersByIdUser ) {
        this.usersByIdUser = usersByIdUser;
    }
}
