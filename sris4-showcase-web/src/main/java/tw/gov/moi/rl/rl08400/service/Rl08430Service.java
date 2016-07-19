package tw.gov.moi.rl.rl08400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl08430DTO;


public interface Rl08430Service {
    public String doPrint(Rl08430DTO rl08430DTO, final ExecutantType executantType);
}
