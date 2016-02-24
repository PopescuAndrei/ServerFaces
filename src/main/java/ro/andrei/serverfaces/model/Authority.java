package ro.andrei.serverfaces.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the authorities database table.
 * 
 */
@Entity
@Table(name = "authorities")
@NamedQuery(name = "Authority.findAll", query = "SELECT a FROM Authority a")
public class Authority implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String authority;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    public Authority() {
    }

    public String getAuthority() {
	return this.authority;
    }

    public void setAuthority(String authority) {
	this.authority = authority;
    }

    public User getUser() {
	return this.user;
    }

    public void setUser(User user) {
	this.user = user;
    }

}