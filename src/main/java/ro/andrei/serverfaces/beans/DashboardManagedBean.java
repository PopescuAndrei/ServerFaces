package ro.andrei.serverfaces.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

@ManagedBean
@SessionScoped
public class DashboardManagedBean {
    private DashboardModel model;

    public DashboardManagedBean() {
	this.model = new DefaultDashboardModel();
	DashboardColumn column1 = new DefaultDashboardColumn();
	DashboardColumn column2 = new DefaultDashboardColumn();
	DashboardColumn column3 = new DefaultDashboardColumn();

	column1.addWidget("Sports");
	column1.addWidget("Technology");
	column2.addWidget("Finance");
	column2.addWidget("Cooking");
	column3.addWidget("News");

	this.model.addColumn(column1);
	this.model.addColumn(column2);
	this.model.addColumn(column3);
    }

    public DashboardModel getModel() {
	return model;
    }

    public void setModel(DashboardModel model) {
	this.model = model;
    }

    public void handleReorder(DashboardReorderEvent event) {
	FacesMessage message = new FacesMessage();
	message.setSeverity(FacesMessage.SEVERITY_INFO);
	message.setSummary("Reordered: " + event.getWidgetId());
	message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex()
		+ ", Sender index: " + event.getSenderColumnIndex());

	addMessage(message);
    }

    private void addMessage(FacesMessage message) {
	FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
