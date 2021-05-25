package be.atc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "stockmanagement", catalog = "")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;
    private Integer reduction;
    private Date dateORder;
    private Boolean payed;
    private Date payementDate;
    private Boolean deliver;
    private Date deliverDate;
    private Object modeOfPayement;

    @Id
    @Column(name = "ID_Order", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "reduction", nullable = true)
    public Integer getReduction() {
        return reduction;
    }

    public void setReduction(Integer reduction) {
        this.reduction = reduction;
    }

    @Basic
    @Column(name = "dateORder", nullable = false)
    public Date getDateORder() {
        return dateORder;
    }

    public void setDateORder(Date dateORder) {
        this.dateORder = dateORder;
    }

    @Basic
    @Column(name = "payed", nullable = true)
    public Boolean getPayed() {
        return payed;
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    @Basic
    @Column(name = "payementDate", nullable = true)
    public Date getPayementDate() {
        return payementDate;
    }

    public void setPayementDate(Date payementDate) {
        this.payementDate = payementDate;
    }

    @Basic
    @Column(name = "deliver", nullable = true)
    public Boolean getDeliver() {
        return deliver;
    }

    public void setDeliver(Boolean deliver) {
        this.deliver = deliver;
    }

    @Basic
    @Column(name = "deliverDate", nullable = true)
    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    @Basic
    @Column(name = "modeOfPayement", nullable = true)
    public Object getModeOfPayement() {
        return modeOfPayement;
    }

    public void setModeOfPayement(Object modeOfPayement) {
        this.modeOfPayement = modeOfPayement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return idOrder == that.idOrder && Objects.equals(reduction, that.reduction) && Objects.equals(dateORder, that.dateORder) && Objects.equals(payed, that.payed) && Objects.equals(payementDate, that.payementDate) && Objects.equals(deliver, that.deliver) && Objects.equals(deliverDate, that.deliverDate) && Objects.equals(modeOfPayement, that.modeOfPayement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrder, reduction, dateORder, payed, payementDate, deliver, deliverDate, modeOfPayement);
    }
}
