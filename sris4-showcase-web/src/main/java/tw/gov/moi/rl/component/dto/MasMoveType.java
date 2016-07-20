/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

/**
 * @author marcus
 * 
 */
public enum MasMoveType {

    /** 遷出地現住人口 */
    OUT_RESIDENT,

    /** 遷入地現住人口 */
    IN_RESIDENT,

    /** 除口、國內遷徙 */
    MOVE_DOMESTIC,

    /** 死亡人口 */
    DEAD,

    /** 遷出國外 */
    MOVE_NONDOMESTIC,

    /** 兩邊都有資料 */
    BOTH_RESIDENT;

    private MasMoveType() {

    }

    /**
     * Cast column type.
     * 
     * @param pFieldKind
     *            the field kind
     * @return the column type
     */
    public static MasMoveType caseMasMoveType(final Integer pFieldKind) {
        MasMoveType moveType = null;
        for (MasMoveType type : MasMoveType.values()) {
            if (type.ordinal() == pFieldKind) {
                moveType = type;
                break;
            }
        }

        return moveType;
    }
}
