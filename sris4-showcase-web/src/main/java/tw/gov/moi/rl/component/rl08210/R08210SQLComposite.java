package tw.gov.moi.rl.component.rl08210;

import java.util.ArrayList;
import java.util.List;

import tw.gov.moi.rl.domain.Rl08210SQLTitleDTO;

/**
 * SQL
 * 
 * @author Andy
 * 
 */
public class R08210SQLComposite extends R08210SQLComponet {

    public R08210SQLComposite(Rl08210SQLTitleDTO dto) {
        super(dto);
    }

    private List<R08210SQLComponet> sqlDTOs = new ArrayList<R08210SQLComponet>();

    @Override
    public void add(R08210SQLComponet sqlDTO) {
        this.sqlDTOs.add(sqlDTO);

    }

    @Override
    public void remove(R08210SQLComponet sqlDTO) {
        this.sqlDTOs.add(sqlDTO);

    }

    public List<R08210SQLComponet> getSqlDTOs() {
        return sqlDTOs;
    }

    @Override
    public List<R08210SQLComponet> get() {

        return sqlDTOs;
    }

}
