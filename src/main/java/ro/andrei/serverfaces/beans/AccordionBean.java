package ro.andrei.serverfaces.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.TabChangeEvent;

@ManagedBean
@SessionScoped
public class AccordionBean {

    private String welcomeMessage = "Welcome Andrei!";
    private String formMessage = "DashboardTitle";

    public String getWelcomeMessage() {
	return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
	this.welcomeMessage = welcomeMessage;
    }

    public String getFormMessage() {
	return formMessage;
    }

    public void setFormMessage(String formMessage) {
	this.formMessage = formMessage;
    }

    public void onChange(TabChangeEvent event) {
	System.out.println("Tab Changed :: You've Requested Seeing :: " + event.getTab().getTitle());
    }
}
