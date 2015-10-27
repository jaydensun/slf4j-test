package test.base;

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
public abstract class BaseLogger implements ILogger {
    protected String getContent() {
        return " printing ...";
    }
}
