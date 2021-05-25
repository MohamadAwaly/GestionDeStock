package be.atc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "roles", schema = "stockmanagement", catalog = "")
public class RolesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    private String role;

    @Id
    @Column(name = "ID_Role", nullable = false)
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 60)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolesEntity that = (RolesEntity) o;
        return idRole == that.idRole && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRole, role);
    }
}
