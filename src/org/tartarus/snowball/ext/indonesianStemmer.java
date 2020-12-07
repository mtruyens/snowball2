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
public class indonesianStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among2 a_0[] = {
    new Among2("kah", -1, 1),
    new Among2("lah", -1, 1),
    new Among2("pun", -1, 1)
};

private final static Among2 a_1[] = {
    new Among2("nya", -1, 1),
    new Among2("ku", -1, 1),
    new Among2("mu", -1, 1)
};

private final static Among2 a_2[] = {
    new Among2("i", -1, 1, "r_SUFFIX_I_OK", indonesianStemmer.class),
    new Among2("an", -1, 1, "r_SUFFIX_AN_OK", indonesianStemmer.class),
    new Among2("kan", 1, 1, "r_SUFFIX_KAN_OK", indonesianStemmer.class)
};

private final static Among2 a_3[] = {
    new Among2("di", -1, 1),
    new Among2("ke", -1, 2),
    new Among2("me", -1, 1),
    new Among2("mem", 2, 5),
    new Among2("men", 2, 1),
    new Among2("meng", 4, 1),
    new Among2("meny", 4, 3, "r_VOWEL", indonesianStemmer.class),
    new Among2("pem", -1, 6),
    new Among2("pen", -1, 2),
    new Among2("peng", 8, 2),
    new Among2("peny", 8, 4, "r_VOWEL", indonesianStemmer.class),
    new Among2("ter", -1, 1)
};

private final static Among2 a_4[] = {
    new Among2("be", -1, 3, "r_KER", indonesianStemmer.class),
    new Among2("belajar", 0, 4),
    new Among2("ber", 0, 3),
    new Among2("pe", -1, 1),
    new Among2("pelajar", 3, 2),
    new Among2("per", 3, 1)
};

private static final char g_vowel[] = {17, 65, 16 };

private int I_prefix;
private int I_measure;


private boolean r_remove_particle() {
    // (, line 50
    // [, line 51
    ket = cursor;
    // substring, line 51
    if (find_among_b(a_0) == 0)
    {
        return false;
    }
    // ], line 51
    bra = cursor;
    // (, line 52
    // delete, line 52
    slice_del();
    I_measure -= 1;
    return true;
}

private boolean r_remove_possessive_pronoun() {
    // (, line 56
    // [, line 57
    ket = cursor;
    // substring, line 57
    if (find_among_b(a_1) == 0)
    {
        return false;
    }
    // ], line 57
    bra = cursor;
    // (, line 58
    // delete, line 58
    slice_del();
    I_measure -= 1;
    return true;
}

public boolean r_SUFFIX_KAN_OK() {
    // (, line 63
    // and, line 85
    if (!(I_prefix != 3))
    {
        return false;
    }
    if (!(I_prefix != 2))
    {
        return false;
    }
    return true;
}

public boolean r_SUFFIX_AN_OK() {
    // (, line 89
    if (!(I_prefix != 1))
    {
        return false;
    }
    return true;
}

public boolean r_SUFFIX_I_OK() {
    // (, line 91
    if (!(I_prefix <= 2))
    {
        return false;
    }
    // not, line 128
    {
        int v_1 = limit - cursor;
        lab0: {
            // literal, line 128
            if (!(eq_s_b("s")))
            {
                break lab0;
            }
            return false;
        }
        cursor = limit - v_1;
    }
    return true;
}

private boolean r_remove_suffix() {
    // (, line 131
    // [, line 132
    ket = cursor;
    // substring, line 132
    if (find_among_b(a_2) == 0)
    {
        return false;
    }
    // ], line 132
    bra = cursor;
    // (, line 134
    // delete, line 134
    slice_del();
    I_measure -= 1;
    return true;
}

public boolean r_VOWEL() {
    // (, line 141
    if (!(in_grouping(g_vowel, 97, 117)))
    {
        return false;
    }
    return true;
}

public boolean r_KER() {
    // (, line 143
    if (!(out_grouping(g_vowel, 97, 117)))
    {
        return false;
    }
    // literal, line 143
    if (!(eq_s("er")))
    {
        return false;
    }
    return true;
}

private boolean r_remove_first_order_prefix() {
    int among_var;
    // (, line 145
    // [, line 146
    bra = cursor;
    // substring, line 146
    among_var = find_among(a_3);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 146
    ket = cursor;
    switch (among_var) {
        case 1:
            // (, line 147
            // delete, line 147
            slice_del();
            I_prefix = 1;
            I_measure -= 1;
            break;
        case 2:
            // (, line 148
            // delete, line 148
            slice_del();
            I_prefix = 3;
            I_measure -= 1;
            break;
        case 3:
            // (, line 149
            I_prefix = 1;
            // <-, line 149
            slice_from("s");
            I_measure -= 1;
            break;
        case 4:
            // (, line 150
            I_prefix = 3;
            // <-, line 150
            slice_from("s");
            I_measure -= 1;
            break;
        case 5:
            // (, line 151
            I_prefix = 1;
            I_measure -= 1;
            // or, line 151
            lab0: {
                int v_1 = cursor;
                lab1: {
                    // and, line 151
                    int v_2 = cursor;
                    if (!(in_grouping(g_vowel, 97, 117)))
                    {
                        break lab1;
                    }
                    cursor = v_2;
                    // <-, line 151
                    slice_from("p");
                    break lab0;
                }
                cursor = v_1;
                // delete, line 151
                slice_del();
            }
            break;
        case 6:
            // (, line 152
            I_prefix = 3;
            I_measure -= 1;
            // or, line 152
            lab2: {
                int v_3 = cursor;
                lab3: {
                    // and, line 152
                    int v_4 = cursor;
                    if (!(in_grouping(g_vowel, 97, 117)))
                    {
                        break lab3;
                    }
                    cursor = v_4;
                    // <-, line 152
                    slice_from("p");
                    break lab2;
                }
                cursor = v_3;
                // delete, line 152
                slice_del();
            }
            break;
    }
    return true;
}

private boolean r_remove_second_order_prefix() {
    int among_var;
    // (, line 156
    // [, line 162
    bra = cursor;
    // substring, line 162
    among_var = find_among(a_4);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 162
    ket = cursor;
    switch (among_var) {
        case 1:
            // (, line 163
            // delete, line 163
            slice_del();
            I_prefix = 2;
            I_measure -= 1;
            break;
        case 2:
            // (, line 164
            // <-, line 164
            slice_from("ajar");
            I_measure -= 1;
            break;
        case 3:
            // (, line 165
            // delete, line 165
            slice_del();
            I_prefix = 4;
            I_measure -= 1;
            break;
        case 4:
            // (, line 166
            // <-, line 166
            slice_from("ajar");
            I_prefix = 4;
            I_measure -= 1;
            break;
    }
    return true;
}

public boolean stem() {
    // (, line 171
    I_measure = 0;
    // do, line 173
    int v_1 = cursor;
    lab0: {
        // (, line 173
        // repeat, line 173
        while(true)
        {
            int v_2 = cursor;
            lab1: {
                // (, line 173
                // gopast, line 173
                golab2: while(true)
                {
                    lab3: {
                        if (!(in_grouping(g_vowel, 97, 117)))
                        {
                            break lab3;
                        }
                        break golab2;
                    }
                    if (cursor >= limit)
                    {
                        break lab1;
                    }
                    cursor++;
                }
                I_measure += 1;
                continue;
            }
            cursor = v_2;
            break;
        }
    }
    cursor = v_1;
    if (!(I_measure > 2))
    {
        return false;
    }
    I_prefix = 0;
    // backwards, line 176
    limit_backward = cursor;
    cursor = limit;
    // (, line 176
    // do, line 177
    int v_4 = limit - cursor;
    // call remove_particle, line 177
    r_remove_particle();
    cursor = limit - v_4;
    if (!(I_measure > 2))
    {
        return false;
    }
    // do, line 179
    int v_5 = limit - cursor;
    // call remove_possessive_pronoun, line 179
    r_remove_possessive_pronoun();
    cursor = limit - v_5;
    cursor = limit_backward;
    if (!(I_measure > 2))
    {
        return false;
    }
    // or, line 188
    lab4: {
        int v_6 = cursor;
        lab5: {
            // test, line 182
            int v_7 = cursor;
            // (, line 182
            // call remove_first_order_prefix, line 183
            if (!r_remove_first_order_prefix())
            {
                break lab5;
            }
            // do, line 184
            int v_8 = cursor;
            lab6: {
                // (, line 184
                // test, line 185
                int v_9 = cursor;
                // (, line 185
                if (!(I_measure > 2))
                {
                    break lab6;
                }
                // backwards, line 185
                limit_backward = cursor;
                cursor = limit;
                // call remove_suffix, line 185
                if (!r_remove_suffix())
                {
                    break lab6;
                }
                cursor = limit_backward;
                cursor = v_9;
                if (!(I_measure > 2))
                {
                    break lab6;
                }
                // call remove_second_order_prefix, line 186
                if (!r_remove_second_order_prefix())
                {
                    break lab6;
                }
            }
            cursor = v_8;
            cursor = v_7;
            break lab4;
        }
        cursor = v_6;
        // (, line 188
        // do, line 189
        int v_10 = cursor;
        // call remove_second_order_prefix, line 189
        r_remove_second_order_prefix();
        cursor = v_10;
        // do, line 190
        int v_11 = cursor;
        lab7: {
            // (, line 190
            if (!(I_measure > 2))
            {
                break lab7;
            }
            // backwards, line 190
            limit_backward = cursor;
            cursor = limit;
            // call remove_suffix, line 190
            if (!r_remove_suffix())
            {
                break lab7;
            }
            cursor = limit_backward;
        }
        cursor = v_11;
    }
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof indonesianStemmer;
}

@Override
public int hashCode() {
    return indonesianStemmer.class.getName().hashCode();
}



}

