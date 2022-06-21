package uk.gov.gchq.hqdm.rdf;


/**
 * A utility Pair with Left (L) and Right (R) values.
 * L the type of the Left element.
 * R the type of the Right element.
 *
 * */
public class Pair<L, R> {
    // The Left element.
    private L left;

    // The Right element.
    private R right;

    /**
     * All args constructor.
     *
     * @param left the Left element of type L
     * @param right the Right element of type R
     */
    public Pair(final L left, final R right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Getter for the Left element.
     *
     * @return the left element of type L
     */
    public L getLeft() {
        return left;
    }

    /**
     * Getter for the right element.
     *
     * @return the right element of type R
     */
    public R getRight() {
        return right;
    }

    /**
     * Convert a Pair to a {@link String}.
     *
     * @return {@link String}
     * */
    public String toString() {
        return "{ left=" + left + ", right=" + right + "}";
    }
}


