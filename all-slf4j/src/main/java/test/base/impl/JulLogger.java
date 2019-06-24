package test.base.impl;

import test.base.BaseLogger;

import java.util.logging.Logger;

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
public class JulLogger extends BaseLogger {
    private Logger logger = Logger.getLogger(JulLogger.class.getName());


    @Override
    public void log() {
        logger.info(getContent());
    }
}
