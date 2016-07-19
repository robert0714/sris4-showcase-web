package tw.gov.moi.rl.component.dto;

public enum OperationMaintainMode {
    APPEND, EDIT, REVIEW;
    public enum EditModeButton implements XldfModeButton {
	/**
	 * <p>
	 * 暫存按鈕
	 * </p>
	 * 回到戶籍大簿L2,<b>觸發Review mode（大簿updateContext方法）,不管是那一個mode都會出現的按鈕
	 * 
	 */
	SAVE_TEMP,
	/**
	 * <p>
	 * 刪除按鈕
	 * </p>
	 * 回到戶籍大簿L2...<b>不觸發Review mode</b>（大簿updateContext方法）
	 * 
	 * <p>
	 * <b>WARNING</b>:刪除時會將該作業順序下的xldftxnopr,xldfopracs刪除
	 * </p>
	 * <p>
	 * ps.需要注意刪除按鈕在Edit mode會出現,reivew mode會隱藏
	 * </p>
	 * 
	 */
	DELETE,
	/**
	 * <p>
	 * 關閉按鈕
	 * </p>
	 * 回到戶籍大簿L2...<b>不觸發Review mode</b>（大簿updateContext方法）
	 * <p>
	 * ps.需要注意關閉按鈕在Edit mode會出現,reivew mode會隱藏
	 * </p>
	 * 
	 */
	CLOSE;
    }
}