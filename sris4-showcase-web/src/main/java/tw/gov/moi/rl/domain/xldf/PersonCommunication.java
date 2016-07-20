package tw.gov.moi.rl.domain.xldf;

public interface PersonCommunication {

    public AssignAddress getAssignAddress();

    public void setAssignAddress(AssignAddress AassignAddress);

    public String getMailbox();

    public void setMailbox(String mailbox);

    public PeriodPhone getDayPhone();

    public void setDayPhone(PeriodPhone dayPhone);

    public PeriodPhone getNightPhone();

    public void setNightPhone(PeriodPhone nightPhone);

    // public String getNightPhoneAreacode();
    //
    // public void setNightPhoneAreacode(String nightPhoneAreacode);
    //
    // public String getNightPhoneNumber();
    //
    // public void setNightPhoneNumber(String nightPhoneNumber);
    //
    // public String getNightPhoneExtension();
    //
    // public void setNightPhoneExtension(String nightPhone_extension);

    public String getCellPhoneNumber();

    public void setCellPhoneNumber(String cellPhoneNumber);

    public String getEmailAddress();

    public void setEmailAddress(String emailAddress);

    public String getImAccount();

    public void setImAccount(String imAccount);

}
