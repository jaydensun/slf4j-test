package test;

/**
 *
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE            PERSON          REASON
 *  1    2015-10-26       089245          Create
 * ****************************************************************************
 * </pre>
 *
 * @author 089245
 * @since 1.0
 */
public abstract class BaseLog implements ILog {
    protected String getLogContent() {
        return getClass().getName() + " is logging ...";
    }
}
