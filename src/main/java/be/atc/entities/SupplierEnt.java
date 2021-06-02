package be.atc.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "suppliers", schema = "stockmanagement", catalog = "" ) public class SupplierEnt {
    private int                            idSupplier;
    private String                         name;
    private Collection<CommandsupplierEnt> commandsuppliersByIdSupplier;

    @Id @Column( name = "ID_Supplier", nullable = false ) public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier( int idSupplier ) {
        this.idSupplier = idSupplier;
    }

    @Basic @Column( name = "name", nullable = false, length = 60 ) public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        SupplierEnt that = (SupplierEnt) o;
        return idSupplier == that.idSupplier && Objects.equals( name, that.name );
    }

    @Override public int hashCode() {
        return Objects.hash( idSupplier, name );
    }

    @OneToMany( mappedBy = "suppliersByIdSupplier" ) public Collection<CommandsupplierEnt> getCommandsuppliersByIdSupplier() {
        return commandsuppliersByIdSupplier;
    }

    public void setCommandsuppliersByIdSupplier(
            Collection<CommandsupplierEnt> commandsuppliersByIdSupplier ) {
        this.commandsuppliersByIdSupplier = commandsuppliersByIdSupplier;
    }
}
