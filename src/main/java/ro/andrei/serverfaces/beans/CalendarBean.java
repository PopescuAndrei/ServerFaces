package ro.andrei.serverfaces.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean
@SessionScoped
public class CalendarBean {

    private Date date = new Date();

    public void setDate(Date date) {
	this.date = date;
    }

    public Date getDate() {
	return date;
    }

    public void dateSelectedAction(SelectEvent e) {
	FacesContext facesContext = FacesContext.getCurrentInstance();
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	facesContext.addMessage(null,
		new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(e.getObject())));

    }
}
