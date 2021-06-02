package be.atc.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "batchs", schema = "stockmanagement", catalog = "" ) public class BatchEnt {
    private int                                   idBatch;
    private int                                   idProducts;
    private int                                   quantity;
    private int                                   uniPrice;
    private int                                   numberBatch;
    private ProductEnt                            productsByIdProducts;
    private Collection<CommandsuppliersBatchsEnt> commandsuppliersBatchsByIdBatch;

    @Id @Column( name = "ID_Batch", nullable = false ) public int getIdBatch() {
        return idBatch;
    }

    public void setIdBatch( int idBatch ) {
        this.idBatch = idBatch;
    }

    @Basic @Column( name = "ID_Products", nullable = false ) public int getIdProducts() {
        return idProducts;
    }

    public void setIdProducts( int idProducts ) {
        this.idProducts = idProducts;
    }

    @Basic @Column( name = "Quantity", nullable = false ) public int getQuantity() {
        return quantity;
    }

    public void setQuantity( int quantity ) {
        this.quantity = quantity;
    }

    @Basic @Column( name = "uniPrice", nullable = false ) public int getUniPrice() {
        return uniPrice;
    }

    public void setUniPrice( int uniPrice ) {
        this.uniPrice = uniPrice;
    }

    @Basic @Column( name = "numberBatch", nullable = false ) public int getNumberBatch() {
        return numberBatch;
    }

    public void setNumberBatch( int numberBatch ) {
        this.numberBatch = numberBatch;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        BatchEnt batchEnt = (BatchEnt) o;
        return idBatch == batchEnt.idBatch && idProducts == batchEnt.idProducts && quantity == batchEnt.quantity
                && uniPrice == batchEnt.uniPrice && numberBatch == batchEnt.numberBatch;
    }

    @Override public int hashCode() {
        return Objects.hash( idBatch, idProducts, quantity, uniPrice, numberBatch );
    }

    @ManyToOne @JoinColumn( name = "ID_Products", referencedColumnName = "ID_Product", nullable = false ) public ProductEnt getProductsByIdProducts() {
        return productsByIdProducts;
    }

    public void setProductsByIdProducts( ProductEnt productsByIdProducts ) {
        this.productsByIdProducts = productsByIdProducts;
    }

    @OneToMany( mappedBy = "batchsByIdBatch" ) public Collection<CommandsuppliersBatchsEnt> getCommandsuppliersBatchsByIdBatch() {
        return commandsuppliersBatchsByIdBatch;
    }

    public void setCommandsuppliersBatchsByIdBatch(
            Collection<CommandsuppliersBatchsEnt> commandsuppliersBatchsByIdBatch ) {
        this.commandsuppliersBatchsByIdBatch = commandsuppliersBatchsByIdBatch;
    }
}
