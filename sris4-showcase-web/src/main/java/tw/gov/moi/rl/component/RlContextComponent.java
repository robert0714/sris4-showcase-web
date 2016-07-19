package tw.gov.moi.rl.component;

import tw.gov.moi.exception.RisBusinessException;

public interface RlContextComponent {
    public void storeTmpRemovePageYyyMmddTime(final String removeYyyMMdd,final String removeTime)throws RisBusinessException;
    public String getTmpRemovePageYyyMmdd()throws RisBusinessException;
    public String getTmpRemovePageTime()throws RisBusinessException;
}
