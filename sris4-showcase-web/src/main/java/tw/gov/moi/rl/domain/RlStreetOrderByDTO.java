package tw.gov.moi.rl.domain;

import tw.gov.moi.rl.common.RlStreetDoorComponent.OrderSatae;

/**
 * 排序欄位
 * 
 * @author Andy
 * 
 */
public class RlStreetOrderByDTO {
    private String name = "";
    private OrderSatae satate;

    public RlStreetOrderByDTO(String name, OrderSatae satate) {
        super();
        this.name = name;
        this.satate = satate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderSatae getSatate() {
        return satate;
    }

    public void setSatate(OrderSatae satate) {
        this.satate = satate;
    }

}
