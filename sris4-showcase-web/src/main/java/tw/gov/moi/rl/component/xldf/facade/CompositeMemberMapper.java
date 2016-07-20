package tw.gov.moi.rl.component.xldf.facade;

public interface CompositeMemberMapper {

    public Object getMember(Object dataOwner) throws Throwable;

    public void setMember(Object dataOwner, Object value) throws Throwable;

}
