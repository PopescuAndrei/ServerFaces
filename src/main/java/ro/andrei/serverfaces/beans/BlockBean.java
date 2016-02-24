package ro.andrei.serverfaces.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BlockBean {

    private String message = "Block integrates ajax without need for <p:ajax>";

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public String buttonAction() throws InterruptedException {
	Thread.currentThread().sleep(4000);
	return "";
    }
}
