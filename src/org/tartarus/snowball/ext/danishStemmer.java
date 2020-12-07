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
public class danishStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among2 a_0[] = {
    new Among2("hed", -1, 1),
    new Among2("ethed", 0, 1),
    new Among2("ered", -1, 1),
    new Among2("e", -1, 1),
    new Among2("erede", 3, 1),
    new Among2("ende", 3, 1),
    new Among2("erende", 5, 1),
    new Among2("ene", 3, 1),
    new Among2("erne", 3, 1),
    new Among2("ere", 3, 1),
    new Among2("en", -1, 1),
    new Among2("heden", 10, 1),
    new Among2("eren", 10, 1),
    new Among2("er", -1, 1),
    new Among2("heder", 13, 1),
    new Among2("erer", 13, 1),
    new Among2("s", -1, 2),
    new Among2("heds", 16, 1),
    new Among2("es", 16, 1),
    new Among2("endes", 18, 1),
    new Among2("erendes", 19, 1),
    new Among2("enes", 18, 1),
    new Among2("ernes", 18, 1),
    new Among2("eres", 18, 1),
    new Among2("ens", 16, 1),
    new Among2("hedens", 24, 1),
    new Among2("erens", 24, 1),
    new Among2("ers", 16, 1),
    new Among2("ets", 16, 1),
    new Among2("erets", 28, 1),
    new Among2("et", -1, 1),
    new Among2("eret", 30, 1)
};

private final static Among2 a_1[] = {
    new Among2("gd", -1, -1),
    new Among2("dt", -1, -1),
    new Among2("gt", -1, -1),
    new Among2("kt", -1, -1)
};

private final static Among2 a_2[] = {
    new Among2("ig", -1, 1),
    new Among2("lig", 0, 1),
    new Among2("elig", 1, 1),
    new Among2("els", -1, 1),
    new Among2("l\u00F8st", -1, 2)
};

private static final char g_c[] = {119, 223, 119, 1 };

private static final char g_v[] = {17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 48, 0, 128 };

private static final char g_s_ending[] = {239, 254, 42, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16 };

private int I_x;
private int I_p1;
private java.lang.StringBuilder S_ch = new java.lang.StringBuilder();


private boolean r_mark_regions() {
    // (, line 31
    I_p1 = limit;
    // test, line 35
    int v_1 = cursor;
    // (, line 35
    // hop, line 35
    {
        int c = cursor + 3;
        if (0 > c || c > limit)
        {
            return false;
        }
        cursor = c;
    }
    // setmark x, line 35
    I_x = cursor;
    cursor = v_1;
    // goto, line 36
    golab0: while(true)
    {
        int v_2 = cursor;
        lab1: {
            if (!(in_grouping(g_v, 97, 248)))
            {
                break lab1;
            }
            cursor = v_2;
            break golab0;
        }
        cursor = v_2;
        if (cursor >= limit)
        {
            return false;
        }
        cursor++;
    }
    // gopast, line 36
    golab2: while(true)
    {
        lab3: {
            if (!(out_grouping(g_v, 97, 248)))
            {
                break lab3;
            }
            break golab2;
        }
        if (cursor >= limit)
        {
            return false;
        }
        cursor++;
    }
    // setmark p1, line 36
    I_p1 = cursor;
    // try, line 37
    lab4: {
        // (, line 37
        if (!(I_p1 < I_x))
        {
            break lab4;
        }
        I_p1 = I_x;
    }
    return true;
}

private boolean r_main_suffix() {
    int among_var;
    // (, line 42
    // setlimit, line 43
    if (cursor < I_p1)
    {
        return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_p1;
    // (, line 43
    // [, line 43
    ket = cursor;
    // substring, line 43
    among_var = find_among_b(a_0);
    if (among_var == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 43
    bra = cursor;
    limit_backward = v_2;
    switch (among_var) {
        case 1:
            // (, line 50
            // delete, line 50
            slice_del();
            break;
        case 2:
            // (, line 52
            if (!(in_grouping_b(g_s_ending, 97, 229)))
            {
                return false;
            }
            // delete, line 52
            slice_del();
            break;
    }
    return true;
}

private boolean r_consonant_pair() {
    // (, line 56
    // test, line 57
    int v_1 = limit - cursor;
    // (, line 57
    // setlimit, line 58
    if (cursor < I_p1)
    {
        return false;
    }
    int v_3 = limit_backward;
    limit_backward = I_p1;
    // (, line 58
    // [, line 58
    ket = cursor;
    // substring, line 58
    if (find_among_b(a_1) == 0)
    {
        limit_backward = v_3;
        return false;
    }
    // ], line 58
    bra = cursor;
    limit_backward = v_3;
    cursor = limit - v_1;
    // next, line 64
    if (cursor <= limit_backward)
    {
        return false;
    }
    cursor--;
    // ], line 64
    bra = cursor;
    // delete, line 64
    slice_del();
    return true;
}

private boolean r_other_suffix() {
    int among_var;
    // (, line 67
    // do, line 68
    int v_1 = limit - cursor;
    lab0: {
        // (, line 68
        // [, line 68
        ket = cursor;
        // literal, line 68
        if (!(eq_s_b("st")))
        {
            break lab0;
        }
        // ], line 68
        bra = cursor;
        // literal, line 68
        if (!(eq_s_b("ig")))
        {
            break lab0;
        }
        // delete, line 68
        slice_del();
    }
    cursor = limit - v_1;
    // setlimit, line 69
    if (cursor < I_p1)
    {
        return false;
    }
    int v_3 = limit_backward;
    limit_backward = I_p1;
    // (, line 69
    // [, line 69
    ket = cursor;
    // substring, line 69
    among_var = find_among_b(a_2);
    if (among_var == 0)
    {
        limit_backward = v_3;
        return false;
    }
    // ], line 69
    bra = cursor;
    limit_backward = v_3;
    switch (among_var) {
        case 1:
            // (, line 72
            // delete, line 72
            slice_del();
            // do, line 72
            int v_4 = limit - cursor;
            // call consonant_pair, line 72
            r_consonant_pair();
            cursor = limit - v_4;
            break;
        case 2:
            // (, line 74
            // <-, line 74
            slice_from("l\u00F8s");
            break;
    }
    return true;
}

private boolean r_undouble() {
    // (, line 77
    // setlimit, line 78
    if (cursor < I_p1)
    {
        return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_p1;
    // (, line 78
    // [, line 78
    ket = cursor;
    if (!(in_grouping_b(g_c, 98, 122)))
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 78
    bra = cursor;
    // -> ch, line 78
    slice_to(S_ch);
    limit_backward = v_2;
    // name ch, line 79
    if (!(eq_s_b(S_ch)))
    {
        return false;
    }
    // delete, line 80
    slice_del();
    return true;
}

public boolean stem() {
    // (, line 84
    // do, line 86
    int v_1 = cursor;
    // call mark_regions, line 86
    r_mark_regions();
    cursor = v_1;
    // backwards, line 87
    limit_backward = cursor;
    cursor = limit;
    // (, line 87
    // do, line 88
    int v_2 = limit - cursor;
    // call main_suffix, line 88
    r_main_suffix();
    cursor = limit - v_2;
    // do, line 89
    int v_3 = limit - cursor;
    // call consonant_pair, line 89
    r_consonant_pair();
    cursor = limit - v_3;
    // do, line 90
    int v_4 = limit - cursor;
    // call other_suffix, line 90
    r_other_suffix();
    cursor = limit - v_4;
    // do, line 91
    int v_5 = limit - cursor;
    // call undouble, line 91
    r_undouble();
    cursor = limit - v_5;
    cursor = limit_backward;
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof danishStemmer;
}

@Override
public int hashCode() {
    return danishStemmer.class.getName().hashCode();
}



}

