package ro.andrei.serverfaces.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ToolTipBean {

    private String usernameTooltip = "Username Tooltip";
    private String passwordTooltip = "Password Tooltip";

    public String getUsernameTooltip() {
	return usernameTooltip;
    }

    public void setUsernameTooltip(String usernameTooltip) {
	this.usernameTooltip = usernameTooltip;
    }

    public String getPasswordTooltip() {
	return passwordTooltip;
    }

    public void setPasswordTooltip(String passwordTooltip) {
	this.passwordTooltip = passwordTooltip;
    }

    public String changeTooltipValues() {
	System.out.println("Some Asynchrouns Ajax Action ::");
	return "";
    }

}
