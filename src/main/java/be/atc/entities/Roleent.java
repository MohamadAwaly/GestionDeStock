package be.atc.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity @Table( name = "roles", schema = "stockmanagement", catalog = "" ) public class Roleent {
    private int                 idRole;
    private String              role;
    private Collection<UserEnt> usersByIdRole;

    @Id @Column( name = "ID_Role", nullable = false ) public int getIdRole() {
        return idRole;
    }

    public void setIdRole( int idRole ) {
        this.idRole = idRole;
    }

    @Basic @Column( name = "role", nullable = false, length = 60 ) public String getRole() {
        return role;
    }

    public void setRole( String role ) {
        this.role = role;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        Roleent roleent = (Roleent) o;
        return idRole == roleent.idRole && Objects.equals( role, roleent.role );
    }

    @Override public int hashCode() {
        return Objects.hash( idRole, role );
    }

    @OneToMany( mappedBy = "rolesByIdRole" ) public Collection<UserEnt> getUsersByIdRole() {
        return usersByIdRole;
    }

    public void setUsersByIdRole( Collection<UserEnt> usersByIdRole ) {
        this.usersByIdRole = usersByIdRole;
    }
}
