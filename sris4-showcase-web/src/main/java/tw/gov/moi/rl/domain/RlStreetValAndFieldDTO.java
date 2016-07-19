package tw.gov.moi.rl.domain;

import tw.gov.moi.rl.common.RlStreetDoorComponent.QueryType;

public class RlStreetValAndFieldDTO {
    private String coloumn = "";
    private String[] values;
    private QueryType queryType = null;

    public RlStreetValAndFieldDTO(String coloumn, QueryType queryType, String... valuse) {
        super();
        this.coloumn = coloumn;
        this.values = valuse;
        this.queryType = queryType;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public String getColoumn() {
        return coloumn;
    }

    public void setColoumn(String coloumn) {
        this.coloumn = coloumn;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

}
