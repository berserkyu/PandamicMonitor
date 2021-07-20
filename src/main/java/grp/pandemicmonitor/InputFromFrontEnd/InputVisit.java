package grp.pandemicmonitor.InputFromFrontEnd;

import grp.pandemicmonitor.dataClasses.visit.Visit;

public class InputVisit extends Visit {

    private int sessionId;
    String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }
}


