package tw.gov.moi.rl.component;

import java.util.Map;

import tw.gov.moi.exception.RisBusinessException;


import freemarker.template.Template;

public interface AutoNoteTemplate {

    String format(final Map<String, Object> objectModel) throws RisBusinessException;

    void setTemplate(Template template);
}
