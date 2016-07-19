package tw.gov.moi.rl.domain.xldf;

import java.util.List;

import tw.gov.moi.rl.common.SelectModeUtils;
import tw.gov.moi.rl.common.SelectableItem;


public class XLDFSelectModeItem<T> implements SelectableItem<T> {

    private int selectMode;

    private T selection;

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
        return selection;
    }

    @Override
    public List<Integer> getSelectedContainerIdList() {
        return SelectModeUtils.getSelectedContainerIdList(this.selectMode);
    }

}
