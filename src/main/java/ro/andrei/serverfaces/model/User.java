package ro.andrei.serverfaces.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String username;

    private byte enabled;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Authority> authorities;

    public User() {
    }

    public String getUsername() {
	return this.username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public byte getEnabled() {
	return this.enabled;
    }

    public void setEnabled(byte enabled) {
	this.enabled = enabled;
    }

    public String getPassword() {
	return this.password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public List<Authority> getAuthorities() {
	return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
	this.authorities = authorities;
    }

}