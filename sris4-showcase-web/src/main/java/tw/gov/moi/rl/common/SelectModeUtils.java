package tw.gov.moi.rl.common;

import java.util.ArrayList;
import java.util.List;

public class SelectModeUtils {

    private static final int BINARY_CARRY = 2;

    private static final int BIT_SET = 1;

    public static boolean checkSelected(int selectMode, int containerId) {
        final int mask = 0x01 << containerId;

        return (mask & selectMode) != 0;
    }

    public static int changeSelectMode(int selectMode, int containerId, boolean selected) {
        final int mask = (0x01 << containerId);

        if (selected) {
            selectMode |= mask;
        } else {
            selectMode &= (~mask);
        }
        return selectMode;
    }

    public static List<Integer> getSelectedContainerIdList(int selectMode) {
        List<Integer> result = new ArrayList<Integer>();

        int containerId = 0;
        int testValue = selectMode;
        do {
            int testBit = testValue % BINARY_CARRY;
            if (testBit == BIT_SET) {
                result.add(containerId);
            }
            testValue /= testValue;
            containerId++;
        } while (testValue == 0);
        return result;
    }
}
