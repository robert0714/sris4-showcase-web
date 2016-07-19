package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

public class Rl04240RlCompositeDTO extends RlCompositeDTO {

    private List<RlCompositeDTO> dtos = new ArrayList<RlCompositeDTO>();
    private String path = "";

    public Rl04240RlCompositeDTO(String path) {
        this.path = path;
    }

    @Override
    public void add(RlCompositeDTO compositeDTO) {
        this.dtos.add(compositeDTO);

    }

    @Override
    public void remove(RlCompositeDTO compositeDTO) {
        this.dtos.remove(compositeDTO);

    }

    @Override
    public List<RlCompositeDTO> get() {

        return dtos;
    }

    public String getPath() {
        return path;
    }

}
