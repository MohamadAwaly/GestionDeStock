package be.atc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "users", schema = "stockmanagement", catalog = "" ) public class UsersEnt {
    private int                             idUser;
    private int                             idRole;
    private String                          lastName;
    private String                          firstName;
    private Date                            dayOfBirth;
    private Date                            inscriptionDate;
    private String                          vat;
    private String                          mail;
    private String                          password;
    private String                          login;
    private Collection<AdressUsersEnt>      adressUsersByIdUser;
    private Collection<CommandsuppliersEnt> commandsuppliersByIdUser;
    private Collection<OrdersEnt>           ordersByIdUser;
    private RolesEnt                        rolesByIdRole;

    @Id @Column( name = "ID_User", nullable = false ) public int getIdUser() {
        return idUser;
    }

    public void setIdUser( int idUser ) {
        this.idUser = idUser;
    }

    @Basic @Column( name = "ID_Role", nullable = false ) public int getIdRole() {
        return idRole;
    }

    public void setIdRole( int idRole ) {
        this.idRole = idRole;
    }

    @Basic @Column( name = "lastName", nullable = false, length = 60 ) public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    @Basic @Column( name = "firstName", nullable = false, length = 60 ) public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    @Basic @Column( name = "dayOfBirth", nullable = true ) public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth( Date dayOfBirth ) {
        this.dayOfBirth = dayOfBirth;
    }

    @Basic @Column( name = "inscriptionDate", nullable = false ) public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate( Date inscriptionDate ) {
        this.inscriptionDate = inscriptionDate;
    }

    @Basic @Column( name = "VAT", nullable = true, length = 20 ) public String getVat() {
        return vat;
    }

    public void setVat( String vat ) {
        this.vat = vat;
    }

    @Basic @Column( name = "mail", nullable = true, length = 255 ) public String getMail() {
        return mail;
    }

    public void setMail( String mail ) {
        this.mail = mail;
    }

    @Basic @Column( name = "password", nullable = false, length = 255 ) public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    @Basic @Column( name = "login", nullable = false, length = 60 ) public String getLogin() {
        return login;
    }

    public void setLogin( String login ) {
        this.login = login;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        UsersEnt usersEnt = (UsersEnt) o;
        return idUser == usersEnt.idUser && idRole == usersEnt.idRole && Objects
                .equals( lastName, usersEnt.lastName ) && Objects.equals( firstName, usersEnt.firstName )
                && Objects.equals( dayOfBirth, usersEnt.dayOfBirth ) && Objects
                .equals( inscriptionDate, usersEnt.inscriptionDate ) && Objects.equals( vat, usersEnt.vat )
                && Objects.equals( mail, usersEnt.mail ) && Objects
                .equals( password, usersEnt.password ) && Objects.equals( login, usersEnt.login );
    }

    @Override public int hashCode() {
        return Objects
                .hash( idUser, idRole, lastName, firstName, dayOfBirth, inscriptionDate, vat, mail, password, login );
    }

    @OneToMany( mappedBy = "usersByIdUser" ) public Collection<AdressUsersEnt> getAdressUsersByIdUser() {
        return adressUsersByIdUser;
    }

    public void setAdressUsersByIdUser( Collection<AdressUsersEnt> adressUsersByIdUser ) {
        this.adressUsersByIdUser = adressUsersByIdUser;
    }

    @OneToMany( mappedBy = "usersByIdUser" ) public Collection<CommandsuppliersEnt> getCommandsuppliersByIdUser() {
        return commandsuppliersByIdUser;
    }

    public void setCommandsuppliersByIdUser( Collection<CommandsuppliersEnt> commandsuppliersByIdUser ) {
        this.commandsuppliersByIdUser = commandsuppliersByIdUser;
    }

    @OneToMany( mappedBy = "usersByIdUser" ) public Collection<OrdersEnt> getOrdersByIdUser() {
        return ordersByIdUser;
    }

    public void setOrdersByIdUser( Collection<OrdersEnt> ordersByIdUser ) {
        this.ordersByIdUser = ordersByIdUser;
    }

    @ManyToOne @JoinColumn( name = "ID_Role", referencedColumnName = "ID_Role", nullable = false ) public RolesEnt getRolesByIdRole() {
        return rolesByIdRole;
    }

    public void setRolesByIdRole( RolesEnt rolesByIdRole ) {
        this.rolesByIdRole = rolesByIdRole;
    }
}
