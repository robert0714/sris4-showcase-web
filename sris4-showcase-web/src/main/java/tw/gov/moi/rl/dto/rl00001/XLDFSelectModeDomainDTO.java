package tw.gov.moi.rl.dto.rl00001;

import java.lang.reflect.Field;
import java.util.List;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.SelectModeUtils;
import tw.gov.moi.rl.common.SelectableItem;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.dto.XLDFDomainDTO;

public class XLDFSelectModeDomainDTO<T extends XLDFDomainDTO> implements SelectableItem<T>, XLDFDomainDTO {

    private Integer selectMode;

    private T xldfDomainDTO;

    public XLDFSelectModeDomainDTO(/* int containerID, */int selectMode, T xldfDomainDTO) {
        super();
        this.selectMode = selectMode;
        this.xldfDomainDTO = xldfDomainDTO;
    }

    @Override
    public boolean isSelected(int containerId) {
        return SelectModeUtils.checkSelected(selectMode, containerId);
    }

    @Override
    public void setSelected(int containerId, boolean selected) {
        selectMode = SelectModeUtils.changeSelectMode(selectMode, containerId, selected);
    }

    @Override
    public T getItem() {
        return xldfDomainDTO;
    }

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {
        XLDFDomainObject result = xldfDomainDTO.makeXLDFDomainObject();

        try {
            Field selectModeField = result.getClass().getDeclaredField(RlConstant.SELECT_MODE_FIELD);
            selectModeField.setAccessible(RlConstant.ACCESSIBLE);
            selectModeField.set(result, selectMode);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6089E, e);
        }
        return result;
    }

    @Override
    public List<Integer> getSelectedContainerIdList() {
        return SelectModeUtils.getSelectedContainerIdList(this.selectMode);
    }

}
