package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rlde480wType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04810DTORecode;
import tw.gov.moi.rs.domain.Rs04810MainDTO;

public interface Rl04810Componet {

    static String MAIN = "MAIN";

    static String rl04820 = "rl04820";

    // public <T> T getObjByFile(String fileName, Class<T> pClass, final
    // ExecutantType pExecutantType)
    // throws RisBusinessException;
    //
    // public <T> void writeObjByFile(String fileName, T obj, final
    // ExecutantType pExecutantType)
    // throws RisBusinessException;
    //
    // public void delObjByFile(String fileName, final ExecutantType
    // pExecutantType) throws RisBusinessException;

    public Rl04810DTORecode getRl04810DTORecode(String site, String oldAdmin, String newAdmin,
            final ExecutantType pExecutantType);

    public void write4810DTORecodeByFile(String site, String oldAdmin, String newAdmin, Rl04810DTORecode record,
            final ExecutantType pExecutantType) throws RisBusinessException;

    public void del4810DTORecodByFile(String site, String oldAdmin, String newAdmin, final ExecutantType pExecutantType)
            throws RisBusinessException;

    public Rs04810MainDTO getRl04810MainDTO(String site, final ExecutantType pExecutantType);

    public void write48100MainDTORecodeByFile(String site, Rs04810MainDTO mainDTO, final ExecutantType pExecutantType)
            throws RisBusinessException;

    public void delRl04810MainDTOByFile(String site, final ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 刪除所有官file tabl資料
     * 
     * @param pExecutantType
     * @throws RisBusinessException
     */
    public void delAllCache(final ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 傳送通報
     * 
     * @param types
     * @param pExecutantType
     * @throws RisBusinessException
     */
    public void makeXMLObnf(Boolean isR, List<Rlde480wType> types, final ExecutantType pExecutantType)
            throws RisBusinessException;

}
