package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

public class RlStreetConditionDTO {

    private Class<?> pClass = null;
    private List<RlStreetValAndFieldDTO> sqls = new ArrayList<RlStreetValAndFieldDTO>();
    private List<RlStreetOrderByDTO> orders = new ArrayList<RlStreetOrderByDTO>();

    public List<RlStreetValAndFieldDTO> getSqls() {
        return sqls;
    }

    public void setSqls(List<RlStreetValAndFieldDTO> sqls) {
        this.sqls = sqls;
    }

    public List<RlStreetOrderByDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<RlStreetOrderByDTO> orders) {
        this.orders = orders;
    }

    public Class<?> getpClass() {
        return pClass;
    }

    public void setpClass(Class<?> pClass) {
        this.pClass = pClass;
    }

}
