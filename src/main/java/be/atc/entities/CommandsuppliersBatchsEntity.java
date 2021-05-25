package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "commandsuppliers_batchs", schema = "stockmanagement", catalog = "")
public class CommandsuppliersBatchsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommandsuppliersBatchs;
    private int costPrice;
    private int lotQuantity;
    private CommandsuppliersEntity commandsuppliersByIdCommandSupplier;
    private BatchsEntity batchsByIdBatch;

    @Id
    @Column(name = "ID_Commandsuppliers_batchs", nullable = false)
    public int getIdCommandsuppliersBatchs() {
        return idCommandsuppliersBatchs;
    }

    public void setIdCommandsuppliersBatchs(int idCommandsuppliersBatchs) {
        this.idCommandsuppliersBatchs = idCommandsuppliersBatchs;
    }

    @Basic
    @Column(name = "costPrice", nullable = false)
    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    @Basic
    @Column(name = "lotQuantity", nullable = false)
    public int getLotQuantity() {
        return lotQuantity;
    }

    public void setLotQuantity(int lotQuantity) {
        this.lotQuantity = lotQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandsuppliersBatchsEntity that = (CommandsuppliersBatchsEntity) o;
        return idCommandsuppliersBatchs == that.idCommandsuppliersBatchs && costPrice == that.costPrice && lotQuantity == that.lotQuantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommandsuppliersBatchs, costPrice, lotQuantity);
    }

    @ManyToOne
    @JoinColumn(name = "ID_CommandSupplier", referencedColumnName = "ID_CommandSuppliers", nullable = false)
    public CommandsuppliersEntity getCommandsuppliersByIdCommandSupplier() {
        return commandsuppliersByIdCommandSupplier;
    }

    public void setCommandsuppliersByIdCommandSupplier(CommandsuppliersEntity commandsuppliersByIdCommandSupplier) {
        this.commandsuppliersByIdCommandSupplier = commandsuppliersByIdCommandSupplier;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Batch", referencedColumnName = "ID_Batch", nullable = false)
    public BatchsEntity getBatchsByIdBatch() {
        return batchsByIdBatch;
    }

    public void setBatchsByIdBatch(BatchsEntity batchsByIdBatch) {
        this.batchsByIdBatch = batchsByIdBatch;
    }
}
