package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.domain.Rlde206wType;
import tw.gov.moi.domain.Rlde207wType;
import tw.gov.moi.domain.Rlde208wType;
import tw.gov.moi.domain.Rlde209wType;
import tw.gov.moi.domain.Rlde210wType;
import tw.gov.moi.domain.Rlde211wType;
import tw.gov.moi.domain.Rlde212wType;

/**
 * 翻譯元件
 * @author Jason Huang
 */
public interface TranslateComponent {

    /**
     * 取得出生地英文
     * @param birthPlaceCode 出生地代碼
     * @param executantType  {@link tw.gov.moi.ae.domain.ExecutantType}
     * @return {@link tw.gov.moi.domain.Rlde210wType}
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde210wType getRlde210wType(String birthPlaceCode, ExecutantType executantType);
    
    /**
     * 取得里英文
     * @param village 里中文
     * @param executantType  {@link tw.gov.moi.ae.domain.ExecutantType}
     * @return {@link tw.gov.moi.domain.Rlde210wType}
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde211wType getRlde211wType(String village, ExecutantType executantType);
    
    /**
     * 取得街路門牌英文
     * @param street 街路門牌
     * @param executantType  {@link tw.gov.moi.ae.domain.ExecutantType}
     * @return {@link tw.gov.moi.domain.Rlde210wType}
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde212wType getRlde212wType(String street, ExecutantType executantType);
    
    /**
     * 取得稱謂英文
     * @param relationship 稱謂
     * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
     * @return {@link tw.gov.moi.domain.Rlde207wType}
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde207wType getRlde207wType(String relationship, ExecutantType executantType);
    
    /**
     * 取得戶別英文
     * @param householdType 戶別
     * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
     * @return {@link tw.gov.moi.domain.Rlde206wType}
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde206wType getRlde206wType(String householdType, ExecutantType executantType);
    
    /**
     * 取得出生別英文
     * @param birthOrderSex 出生別
     * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
     * @return {@link tw.gov.moi.domain.Rlde206wType}
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde208wType getRlde208wType(String birthOrderSex, ExecutantType executantType);
    
    /**
     * 取得行政區域英文
     * @param areaCode 行政區域
     * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
     * @return {@link tw.gov.moi.domain.Rlde206wType}
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde209wType getRlde209wType(String areaCode, ExecutantType executantType);
}
