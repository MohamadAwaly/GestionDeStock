package be.atc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "orders", schema = "stockmanagement", catalog = "" ) public class OrderEnt {
    private int                          idOrder;
    private int                          idUser;
    private int                          reduction;
    private Date                         dateORder;
    private Boolean                      payed;
    private Date                         payementDate;
    private Boolean                      deliver;
    private Date                         deliverDate;
    private Object                       modeOfPayement;
    private UserEnt                      usersByIdUser;
    private Collection<OrderDocumentEnt> ordersDocumentsByIdOrder;
    private Collection<OrderProductEnt>  ordersProductsByIdOrder;

    @Id @Column( name = "ID_Order", nullable = false ) public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder( int idOrder ) {
        this.idOrder = idOrder;
    }

    @Basic @Column( name = "Id_User", nullable = false ) public int getIdUser() {
        return idUser;
    }

    public void setIdUser( int idUser ) {
        this.idUser = idUser;
    }

    @Basic @Column( name = "reduction", nullable = true ) public int getReduction() {
        return reduction;
    }

    public void setReduction( int reduction ) {
        this.reduction = reduction;
    }

    @Basic @Column( name = "dateORder", nullable = false ) public Date getDateORder() {
        return dateORder;
    }

    public void setDateORder( Date dateORder ) {
        this.dateORder = dateORder;
    }

    @Basic @Column( name = "payed", nullable = true ) public Boolean getPayed() {
        return payed;
    }

    public void setPayed( Boolean payed ) {
        this.payed = payed;
    }

    @Basic @Column( name = "payementDate", nullable = true ) public Date getPayementDate() {
        return payementDate;
    }

    public void setPayementDate( Date payementDate ) {
        this.payementDate = payementDate;
    }

    @Basic @Column( name = "deliver", nullable = true ) public Boolean getDeliver() {
        return deliver;
    }

    public void setDeliver( Boolean deliver ) {
        this.deliver = deliver;
    }

    @Basic @Column( name = "deliverDate", nullable = true ) public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate( Date deliverDate ) {
        this.deliverDate = deliverDate;
    }

    @Basic @Column( name = "modeOfPayement", nullable = true ) public Object getModeOfPayement() {
        return modeOfPayement;
    }

    public void setModeOfPayement( Object modeOfPayement ) {
        this.modeOfPayement = modeOfPayement;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        OrderEnt orderEnt = (OrderEnt) o;
        return idOrder == orderEnt.idOrder && idUser == orderEnt.idUser && reduction == orderEnt.reduction
                && Objects.equals( dateORder, orderEnt.dateORder ) && Objects
                .equals( payed, orderEnt.payed ) && Objects.equals( payementDate, orderEnt.payementDate )
                && Objects.equals( deliver, orderEnt.deliver ) && Objects
                .equals( deliverDate, orderEnt.deliverDate ) && Objects
                .equals( modeOfPayement, orderEnt.modeOfPayement );
    }

    @Override public int hashCode() {
        return Objects
                .hash( idOrder, idUser, reduction, dateORder, payed, payementDate, deliver, deliverDate,
                        modeOfPayement );
    }

    @ManyToOne @JoinColumn( name = "Id_User", referencedColumnName = "ID_User", nullable = false ) public UserEnt getUsersByIdUser() {
        return usersByIdUser;
    }

    public void setUsersByIdUser( UserEnt usersByIdUser ) {
        this.usersByIdUser = usersByIdUser;
    }

    @OneToMany( mappedBy = "ordersByIdOrder" ) public Collection<OrderDocumentEnt> getOrdersDocumentsByIdOrder() {
        return ordersDocumentsByIdOrder;
    }

    public void setOrdersDocumentsByIdOrder( Collection<OrderDocumentEnt> ordersDocumentsByIdOrder ) {
        this.ordersDocumentsByIdOrder = ordersDocumentsByIdOrder;
    }

    @OneToMany( mappedBy = "ordersByIdOrder" ) public Collection<OrderProductEnt> getOrdersProductsByIdOrder() {
        return ordersProductsByIdOrder;
    }

    public void setOrdersProductsByIdOrder( Collection<OrderProductEnt> ordersProductsByIdOrder ) {
        this.ordersProductsByIdOrder = ordersProductsByIdOrder;
    }
}
