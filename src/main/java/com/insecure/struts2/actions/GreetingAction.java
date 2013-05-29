package com.insecure.struts2.actions;

import com.insecure.springbeans.services.GreetingService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/25/13
 * Time: 8:25 PM
 */

@Named
@Namespace("/Greetings")
@ResultPath(value="/")
public class GreetingAction extends ActionSupport {

    @Action(value="Greeting", results={@Result(name="success",location="pages/greetings.jsp")})
    public String execute() throws Exception {
        return SUCCESS;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Inject
    private GreetingService greetingService;

}
