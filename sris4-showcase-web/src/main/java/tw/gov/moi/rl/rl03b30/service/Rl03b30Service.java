package tw.gov.moi.rl.rl03b30.service;

import java.io.File;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03b30QueryDTO;

public interface Rl03b30Service {

    /** The Constant RECCOUNT. */
    String COUNT = "999";

    /** The Constant ERROR_MSG_2. */
    String ERROR_MSG_2 = "個人基本資料不存在";

    /** The Constant ERROR_METHOD. */
    String ERROR_METHOD = "queryImages";

    String IMAGE_PATH = File.separator + "imageHistory" + File.separator + "rl03b30";

    String UNDER_LINE = "_";

    String EXT_FILE_NAME = ".jpg";

    public void queryImageHistory(final Rl03b30QueryDTO rl03b30QueryDTO, final ExecutantType executantType)
            throws RisBusinessException;

}
