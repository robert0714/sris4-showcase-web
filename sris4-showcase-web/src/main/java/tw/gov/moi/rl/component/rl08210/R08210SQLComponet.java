package tw.gov.moi.rl.component.rl08210;

import java.util.List;

public abstract class R08210SQLComponet {

    private Object sqlDTO = null;

    public R08210SQLComponet(Object dto) {
        this.sqlDTO = dto;
    }

    public abstract void add(R08210SQLComponet sqlDTO);

    public abstract void remove(R08210SQLComponet sqlDTO);

    public abstract List<R08210SQLComponet> get();

    public Object getObj() {
        return sqlDTO;
    }
}
