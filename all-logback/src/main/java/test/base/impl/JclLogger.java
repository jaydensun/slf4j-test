package test.base.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import test.base.BaseLogger;

/**
 * √Ë ˆ£∫
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE            PERSON          REASON
 *  1    2015-10-27       089245          Create
 * ****************************************************************************
 * </pre>
 *
 * @author 089245
 * @since 1.0
 */
public class JclLogger extends BaseLogger {
    private Log log = LogFactory.getLog(JclLogger.class);

    @Override
    public void log() {
        log.info(getContent());
    }
}
