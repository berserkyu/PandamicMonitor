package grp.pandemicmonitor.dataClasses.location;

import java.sql.Date;
import java.sql.Time;

public class LocationVisit extends Location{
    Date dateVisit;
    Time timeVisit;

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public Time getTimeVisit() {
        return timeVisit;
    }

    public void setTimeVisit(Time timeVisit) {
        this.timeVisit = timeVisit;
    }
}
