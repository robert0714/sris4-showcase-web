package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.rl.domain.Rl08210DTO;

public interface Rl08210SQLComponent {
    public String getSqlTemplateOne(Rl08210DTO rl08210dto, R08210SQLComponet sqlComponet);

    public String getSqlTemplateTWO(Rl08210DTO rl08210dto, R08210SQLComponet sqlComponet);
}
