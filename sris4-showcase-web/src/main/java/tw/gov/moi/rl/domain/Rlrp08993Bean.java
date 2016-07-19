package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

public class Rlrp08993Bean implements Serializable {

    private static final long serialVersionUID = -1997340997470360748L;

    /** 全戶資料 */
    private Rlrp08993HouseholdBean householdBean;

    /** 戶下成員資料 */
    private List<Rlrp08993PersonBean> PersonBeans;

    public Rlrp08993HouseholdBean getHouseholdBean() {
        return householdBean;
    }

    public void setHouseholdBean(Rlrp08993HouseholdBean householdBean) {
        this.householdBean = householdBean;
    }

    public List<Rlrp08993PersonBean> getPersonBeans() {
        return PersonBeans;
    }

    public void setPersonBeans(List<Rlrp08993PersonBean> personBeans) {
        PersonBeans = personBeans;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((householdBean == null) ? 0 : householdBean.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rlrp08993Bean other = (Rlrp08993Bean) obj;
        if (householdBean == null) {
            if (other.householdBean != null)
                return false;
        } else if (!householdBean.equals(other.householdBean))
            return false;
        return true;
    }
}
