package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table( name = "commandsuppliers_batchs", schema = "stockmanagement", catalog = "" ) public class CommandsuppliersBatchsEnt {
    private int idCommandSupplier;
    private int idBatch;
    private int costPrice;
    private int lotQuantity;
    private CommandsuppliersEnt commandsuppliersByIdCommandSupplier;
    private BatchsEnt batchsByIdBatch;

    @Basic @Column( name = "ID_CommandSupplier", nullable = false ) public int getIdCommandSupplier() {
        return idCommandSupplier;
    }

    public void setIdCommandSupplier( int idCommandSupplier ) {
        this.idCommandSupplier = idCommandSupplier;
    }

    @Basic @Column( name = "ID_Batch", nullable = false ) public int getIdBatch() {
        return idBatch;
    }

    public void setIdBatch( int idBatch ) {
        this.idBatch = idBatch;
    }

    @Basic @Column( name = "costPrice", nullable = false ) public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice( int costPrice ) {
        this.costPrice = costPrice;
    }

    @Basic @Column( name = "lotQuantity", nullable = false ) public int getLotQuantity() {
        return lotQuantity;
    }

    public void setLotQuantity( int lotQuantity ) {
        this.lotQuantity = lotQuantity;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        CommandsuppliersBatchsEnt that = (CommandsuppliersBatchsEnt) o;
        return idCommandSupplier == that.idCommandSupplier && idBatch == that.idBatch && costPrice == that.costPrice
                && lotQuantity == that.lotQuantity;
    }

    @Override public int hashCode() {
        return Objects.hash( idCommandSupplier, idBatch, costPrice, lotQuantity );
    }

    @ManyToOne @JoinColumn( name = "ID_CommandSupplier", referencedColumnName = "ID_CommandSuppliers", nullable = false ) public CommandsuppliersEnt getCommandsuppliersByIdCommandSupplier() {
        return commandsuppliersByIdCommandSupplier;
    }

    public void setCommandsuppliersByIdCommandSupplier( CommandsuppliersEnt commandsuppliersByIdCommandSupplier ) {
        this.commandsuppliersByIdCommandSupplier = commandsuppliersByIdCommandSupplier;
    }

    @ManyToOne @JoinColumn( name = "ID_Batch", referencedColumnName = "ID_Batch", nullable = false ) public BatchsEnt getBatchsByIdBatch() {
        return batchsByIdBatch;
    }

    public void setBatchsByIdBatch( BatchsEnt batchsByIdBatch ) {
        this.batchsByIdBatch = batchsByIdBatch;
    }
}