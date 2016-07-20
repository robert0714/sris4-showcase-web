package tw.gov.moi.rl.common;

import java.util.List;

public interface SelectableItem<T> {

    // public static final int BINARY_CARRY = 2;

    // public static final int BIT_SET = 1;

    public boolean isSelected(int containerId);

    public void setSelected(int containerId, boolean selected);

    public List<Integer> getSelectedContainerIdList();

    public T getItem();

}
