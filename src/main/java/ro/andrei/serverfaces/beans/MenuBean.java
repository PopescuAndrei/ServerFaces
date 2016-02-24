package ro.andrei.serverfaces.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class MenuBean {
    public String openAction() {
	FacesContext.getCurrentInstance().addMessage(null,
		new FacesMessage("Open action has activiated asynchrounsly !"));
	return "";
    }
}
