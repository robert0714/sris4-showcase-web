package tw.gov.moi.rl.exception;

import tw.gov.moi.exception.RisBusinessException;

public class RisBusinessMethodException extends RisBusinessException {

    private static final long serialVersionUID = 1L;

    /** 方法名稱 */
    private String methodNmae;

    public RisBusinessMethodException(String errorCode, String methodNmae, Throwable cause) {
        super(errorCode, cause);
        this.methodNmae = methodNmae;
    }

    public RisBusinessMethodException(String errorCode, String extMessage, String methodNmae, Throwable cause) {
        super(errorCode, extMessage, cause);
        this.methodNmae = methodNmae;
    }

    public String getMethodNmae() {
        return methodNmae;
    }

    public void setMethodNmae(String methodNmae) {
        this.methodNmae = methodNmae;
    }

}