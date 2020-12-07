// Generated by Snowball 2.0.0 - https://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among2;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 * <p>
 * Generated by Snowball 2.0.0 - https://snowballstem.org/
 * </p>
 */
@SuppressWarnings("unused")
public class hindiStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among2 a_0[] = {
    new Among2("\u0906\u0901", -1, -1),
    new Among2("\u093E\u0901", -1, -1),
    new Among2("\u0907\u092F\u093E\u0901", 1, -1),
    new Among2("\u0906\u0907\u092F\u093E\u0901", 2, -1),
    new Among2("\u093E\u0907\u092F\u093E\u0901", 2, -1),
    new Among2("\u093F\u092F\u093E\u0901", 1, -1),
    new Among2("\u0906\u0902", -1, -1),
    new Among2("\u0909\u0906\u0902", 6, -1),
    new Among2("\u0941\u0906\u0902", 6, -1),
    new Among2("\u0908\u0902", -1, -1),
    new Among2("\u0906\u0908\u0902", 9, -1),
    new Among2("\u093E\u0908\u0902", 9, -1),
    new Among2("\u090F\u0902", -1, -1),
    new Among2("\u0906\u090F\u0902", 12, -1),
    new Among2("\u0909\u090F\u0902", 12, -1),
    new Among2("\u093E\u090F\u0902", 12, -1),
    new Among2("\u0924\u093E\u090F\u0902", 15, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0924\u093E\u090F\u0902", 16, -1),
    new Among2("\u0928\u093E\u090F\u0902", 15, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0928\u093E\u090F\u0902", 18, -1),
    new Among2("\u0941\u090F\u0902", 12, -1),
    new Among2("\u0913\u0902", -1, -1),
    new Among2("\u0906\u0913\u0902", 21, -1),
    new Among2("\u0909\u0913\u0902", 21, -1),
    new Among2("\u093E\u0913\u0902", 21, -1),
    new Among2("\u0924\u093E\u0913\u0902", 24, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0924\u093E\u0913\u0902", 25, -1),
    new Among2("\u0928\u093E\u0913\u0902", 24, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0928\u093E\u0913\u0902", 27, -1),
    new Among2("\u0941\u0913\u0902", 21, -1),
    new Among2("\u093E\u0902", -1, -1),
    new Among2("\u0907\u092F\u093E\u0902", 30, -1),
    new Among2("\u0906\u0907\u092F\u093E\u0902", 31, -1),
    new Among2("\u093E\u0907\u092F\u093E\u0902", 31, -1),
    new Among2("\u093F\u092F\u093E\u0902", 30, -1),
    new Among2("\u0940\u0902", -1, -1),
    new Among2("\u0924\u0940\u0902", 35, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0924\u0940\u0902", 36, -1),
    new Among2("\u0906\u0924\u0940\u0902", 36, -1),
    new Among2("\u093E\u0924\u0940\u0902", 36, -1),
    new Among2("\u0947\u0902", -1, -1),
    new Among2("\u094B\u0902", -1, -1),
    new Among2("\u0907\u092F\u094B\u0902", 41, -1),
    new Among2("\u0906\u0907\u092F\u094B\u0902", 42, -1),
    new Among2("\u093E\u0907\u092F\u094B\u0902", 42, -1),
    new Among2("\u093F\u092F\u094B\u0902", 41, -1),
    new Among2("\u0905", -1, -1),
    new Among2("\u0906", -1, -1),
    new Among2("\u0907", -1, -1),
    new Among2("\u0908", -1, -1),
    new Among2("\u0906\u0908", 49, -1),
    new Among2("\u093E\u0908", 49, -1),
    new Among2("\u0909", -1, -1),
    new Among2("\u090A", -1, -1),
    new Among2("\u090F", -1, -1),
    new Among2("\u0906\u090F", 54, -1),
    new Among2("\u0907\u090F", 54, -1),
    new Among2("\u0906\u0907\u090F", 56, -1),
    new Among2("\u093E\u0907\u090F", 56, -1),
    new Among2("\u093E\u090F", 54, -1),
    new Among2("\u093F\u090F", 54, -1),
    new Among2("\u0913", -1, -1),
    new Among2("\u0906\u0913", 61, -1),
    new Among2("\u093E\u0913", 61, -1),
    new Among2("\u0915\u0930", -1, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0915\u0930", 64, -1),
    new Among2("\u0906\u0915\u0930", 64, -1),
    new Among2("\u093E\u0915\u0930", 64, -1),
    new Among2("\u093E", -1, -1),
    new Among2("\u090A\u0902\u0917\u093E", 68, -1),
    new Among2("\u0906\u090A\u0902\u0917\u093E", 69, -1),
    new Among2("\u093E\u090A\u0902\u0917\u093E", 69, -1),
    new Among2("\u0942\u0902\u0917\u093E", 68, -1),
    new Among2("\u090F\u0917\u093E", 68, -1),
    new Among2("\u0906\u090F\u0917\u093E", 73, -1),
    new Among2("\u093E\u090F\u0917\u093E", 73, -1),
    new Among2("\u0947\u0917\u093E", 68, -1),
    new Among2("\u0924\u093E", 68, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0924\u093E", 77, -1),
    new Among2("\u0906\u0924\u093E", 77, -1),
    new Among2("\u093E\u0924\u093E", 77, -1),
    new Among2("\u0928\u093E", 68, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0928\u093E", 81, -1),
    new Among2("\u0906\u0928\u093E", 81, -1),
    new Among2("\u093E\u0928\u093E", 81, -1),
    new Among2("\u0906\u092F\u093E", 68, -1),
    new Among2("\u093E\u092F\u093E", 68, -1),
    new Among2("\u093F", -1, -1),
    new Among2("\u0940", -1, -1),
    new Among2("\u090A\u0902\u0917\u0940", 88, -1),
    new Among2("\u0906\u090A\u0902\u0917\u0940", 89, -1),
    new Among2("\u093E\u090A\u0902\u0917\u0940", 89, -1),
    new Among2("\u090F\u0902\u0917\u0940", 88, -1),
    new Among2("\u0906\u090F\u0902\u0917\u0940", 92, -1),
    new Among2("\u093E\u090F\u0902\u0917\u0940", 92, -1),
    new Among2("\u0942\u0902\u0917\u0940", 88, -1),
    new Among2("\u0947\u0902\u0917\u0940", 88, -1),
    new Among2("\u090F\u0917\u0940", 88, -1),
    new Among2("\u0906\u090F\u0917\u0940", 97, -1),
    new Among2("\u093E\u090F\u0917\u0940", 97, -1),
    new Among2("\u0913\u0917\u0940", 88, -1),
    new Among2("\u0906\u0913\u0917\u0940", 100, -1),
    new Among2("\u093E\u0913\u0917\u0940", 100, -1),
    new Among2("\u0947\u0917\u0940", 88, -1),
    new Among2("\u094B\u0917\u0940", 88, -1),
    new Among2("\u0924\u0940", 88, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0924\u0940", 105, -1),
    new Among2("\u0906\u0924\u0940", 105, -1),
    new Among2("\u093E\u0924\u0940", 105, -1),
    new Among2("\u0928\u0940", 88, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0928\u0940", 109, -1),
    new Among2("\u0941", -1, -1),
    new Among2("\u0942", -1, -1),
    new Among2("\u0947", -1, -1),
    new Among2("\u090F\u0902\u0917\u0947", 113, -1),
    new Among2("\u0906\u090F\u0902\u0917\u0947", 114, -1),
    new Among2("\u093E\u090F\u0902\u0917\u0947", 114, -1),
    new Among2("\u0947\u0902\u0917\u0947", 113, -1),
    new Among2("\u0913\u0917\u0947", 113, -1),
    new Among2("\u0906\u0913\u0917\u0947", 118, -1),
    new Among2("\u093E\u0913\u0917\u0947", 118, -1),
    new Among2("\u094B\u0917\u0947", 113, -1),
    new Among2("\u0924\u0947", 113, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0924\u0947", 122, -1),
    new Among2("\u0906\u0924\u0947", 122, -1),
    new Among2("\u093E\u0924\u0947", 122, -1),
    new Among2("\u0928\u0947", 113, -1, "r_CONSONANT", hindiStemmer.class),
    new Among2("\u0905\u0928\u0947", 126, -1),
    new Among2("\u0906\u0928\u0947", 126, -1),
    new Among2("\u093E\u0928\u0947", 126, -1),
    new Among2("\u094B", -1, -1),
    new Among2("\u094D", -1, -1)
};

private static final char g_consonant[] = {255, 255, 255, 255, 159, 0, 0, 0, 248, 7 };

private int I_p;


public boolean r_CONSONANT() {
    // (, line 129
    if (!(in_grouping_b(g_consonant, 2325, 2399)))
    {
        return false;
    }
    return true;
}

public boolean stem() {
    // (, line 131
    // test, line 132
    int v_1 = cursor;
    // (, line 132
    // next, line 132
    if (cursor >= limit)
    {
        return false;
    }
    cursor++;
    // setmark p, line 132
    I_p = cursor;
    cursor = v_1;
    // backwards, line 133
    limit_backward = cursor;
    cursor = limit;
    // (, line 133
    // setlimit, line 139
    if (cursor < I_p)
    {
        return false;
    }
    int v_3 = limit_backward;
    limit_backward = I_p;
    // (, line 139
    // [, line 139
    ket = cursor;
    // substring, line 139
    if (find_among_b(a_0) == 0)
    {
        limit_backward = v_3;
        return false;
    }
    // ], line 139
    bra = cursor;
    limit_backward = v_3;
    // delete, line 321
    slice_del();
    cursor = limit_backward;
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof hindiStemmer;
}

@Override
public int hashCode() {
    return hindiStemmer.class.getName().hashCode();
}



}

