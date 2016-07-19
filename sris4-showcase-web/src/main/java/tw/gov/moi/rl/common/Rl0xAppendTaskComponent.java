package tw.gov.moi.rl.common;

import tw.gov.moi.rl.domain.Rl0x001DTO;

/**
 * 申請書核准之後
 * 
 * @author Andy
 * 
 */
public interface Rl0xAppendTaskComponent {
    /**
     * 
     * @param source申請書
     *            (S or T)
     * @param mainDTO
     * @return
     * @throws RuntimeException
     */
    public <T> T rl0x401do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x402do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x403do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x404do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x405do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x412do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x461do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x462do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x473do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x474do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x475do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x477do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x479do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x480do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x481do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x482do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x484do(T source, Rl0x001DTO mainDTO) throws RuntimeException;

    public <T> T rl0x485do(T source, Rl0x001DTO mainDTO) throws RuntimeException;
}
