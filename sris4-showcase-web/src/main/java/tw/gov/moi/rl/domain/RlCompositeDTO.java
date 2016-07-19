package tw.gov.moi.rl.domain;

import java.util.List;

public abstract class RlCompositeDTO {
    public abstract void add(RlCompositeDTO compositeDTO);

    public abstract void remove(RlCompositeDTO compositeDTO);

    public abstract List<RlCompositeDTO> get();

}
