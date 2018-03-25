package hu.ppke.itk.ai.config;

/**
 * Class for storing configuration values
 */
public class Config {

    /**
     * Default size of the map canvas
     */
    public static final short SIZE_OF_CANVAS = 800;

    /**
     * Default size of one feature on the map
     */
    public static final int DEFAULT_FEATURE_SIZE = 5;

    /**
     * Default threshold. It determines the ratio of land and water.
     * Should be set between -1 and 1
     */
    public static final float DEFAULT_THRESHOLD = 0.5f;

}
