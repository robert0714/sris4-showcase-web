package tw.gov.moi.rl.component;

import tw.gov.moi.exception.RisBusinessException;

public interface AutoNoteTemplateFactory {

    AutoNoteTemplate getAutoNoteTemplate(final String autoNoteID) throws RisBusinessException;

}
