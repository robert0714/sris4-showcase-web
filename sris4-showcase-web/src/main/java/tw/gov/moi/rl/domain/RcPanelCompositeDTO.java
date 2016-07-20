package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

public class RcPanelCompositeDTO extends RlCompositeDTO {
    private List<RlCompositeDTO> dtos = new ArrayList<RlCompositeDTO>();

    @Override
    public void add(RlCompositeDTO compositeDTO) {
        dtos.add(compositeDTO);

    }

    @Override
    public void remove(RlCompositeDTO compositeDTO) {
        dtos.remove(compositeDTO);

    }

    @Override
    public List<RlCompositeDTO> get() {
        // TODO Auto-generated method stub
        return dtos;
    }

}
