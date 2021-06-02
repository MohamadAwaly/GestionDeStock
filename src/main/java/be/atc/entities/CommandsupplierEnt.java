package be.atc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "commandsuppliers", schema = "stockmanagement", catalog = "" ) public class CommandsupplierEnt {
    private int                                   idCommandSuppliers;
    private int                                   idSupplier;
    private int                                   idUser;
    private Date                                  orderDate;
    private SupplierEnt                           suppliersByIdSupplier;
    private UserEnt                               usersByIdUser;
    private Collection<CommandsuppliersBatchsEnt> commandsuppliersBatchsByIdCommandSuppliers;

    @Id @Column( name = "ID_CommandSuppliers", nullable = false ) public int getIdCommandSuppliers() {
        return idCommandSuppliers;
    }

    public void setIdCommandSuppliers( int idCommandSuppliers ) {
        this.idCommandSuppliers = idCommandSuppliers;
    }

    @Basic @Column( name = "ID_Supplier", nullable = false ) public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier( int idSupplier ) {
        this.idSupplier = idSupplier;
    }

    @Basic @Column( name = "ID_User", nullable = false ) public int getIdUser() {
        return idUser;
    }

    public void setIdUser( int idUser ) {
        this.idUser = idUser;
    }

    @Basic @Column( name = "orderDate", nullable = false ) public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate( Date orderDate ) {
        this.orderDate = orderDate;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        CommandsupplierEnt that = (CommandsupplierEnt) o;
        return idCommandSuppliers == that.idCommandSuppliers && idSupplier == that.idSupplier && idUser == that.idUser
                && Objects.equals( orderDate, that.orderDate );
    }

    @Override public int hashCode() {
        return Objects.hash( idCommandSuppliers, idSupplier, idUser, orderDate );
    }

    @ManyToOne @JoinColumn( name = "ID_Supplier", referencedColumnName = "ID_Supplier", nullable = false ) public SupplierEnt getSuppliersByIdSupplier() {
        return suppliersByIdSupplier;
    }

    public void setSuppliersByIdSupplier( SupplierEnt suppliersByIdSupplier ) {
        this.suppliersByIdSupplier = suppliersByIdSupplier;
    }

    @ManyToOne @JoinColumn( name = "ID_User", referencedColumnName = "ID_User", nullable = false ) public UserEnt getUsersByIdUser() {
        return usersByIdUser;
    }

    public void setUsersByIdUser( UserEnt usersByIdUser ) {
        this.usersByIdUser = usersByIdUser;
    }

    @OneToMany( mappedBy = "commandsuppliersByIdCommandSupplier" ) public Collection<CommandsuppliersBatchsEnt> getCommandsuppliersBatchsByIdCommandSuppliers() {
        return commandsuppliersBatchsByIdCommandSuppliers;
    }

    public void setCommandsuppliersBatchsByIdCommandSuppliers(
            Collection<CommandsuppliersBatchsEnt> commandsuppliersBatchsByIdCommandSuppliers ) {
        this.commandsuppliersBatchsByIdCommandSuppliers = commandsuppliersBatchsByIdCommandSuppliers;
    }
}
