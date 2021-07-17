package grp.pandemicmonitor.dataClasses.misc;

public interface GeneralDao {
    boolean initSession(int sessionID,String mail);
    boolean checkSession(int sessionId);
    boolean endSession(int sessionId);
}
