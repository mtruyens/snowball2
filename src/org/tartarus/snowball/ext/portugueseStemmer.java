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
public class portugueseStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among2 a_0[] = {
    new Among2("", -1, 3),
    new Among2("\u00E3", 0, 1),
    new Among2("\u00F5", 0, 2)
};

private final static Among2 a_1[] = {
    new Among2("", -1, 3),
    new Among2("a~", 0, 1),
    new Among2("o~", 0, 2)
};

private final static Among2 a_2[] = {
    new Among2("ic", -1, -1),
    new Among2("ad", -1, -1),
    new Among2("os", -1, -1),
    new Among2("iv", -1, 1)
};

private final static Among2 a_3[] = {
    new Among2("ante", -1, 1),
    new Among2("avel", -1, 1),
    new Among2("\u00EDvel", -1, 1)
};

private final static Among2 a_4[] = {
    new Among2("ic", -1, 1),
    new Among2("abil", -1, 1),
    new Among2("iv", -1, 1)
};

private final static Among2 a_5[] = {
    new Among2("ica", -1, 1),
    new Among2("\u00E2ncia", -1, 1),
    new Among2("\u00EAncia", -1, 4),
    new Among2("logia", -1, 2),
    new Among2("ira", -1, 9),
    new Among2("adora", -1, 1),
    new Among2("osa", -1, 1),
    new Among2("ista", -1, 1),
    new Among2("iva", -1, 8),
    new Among2("eza", -1, 1),
    new Among2("idade", -1, 7),
    new Among2("ante", -1, 1),
    new Among2("mente", -1, 6),
    new Among2("amente", 12, 5),
    new Among2("\u00E1vel", -1, 1),
    new Among2("\u00EDvel", -1, 1),
    new Among2("ico", -1, 1),
    new Among2("ismo", -1, 1),
    new Among2("oso", -1, 1),
    new Among2("amento", -1, 1),
    new Among2("imento", -1, 1),
    new Among2("ivo", -1, 8),
    new Among2("a\u00E7a~o", -1, 1),
    new Among2("u\u00E7a~o", -1, 3),
    new Among2("ador", -1, 1),
    new Among2("icas", -1, 1),
    new Among2("\u00EAncias", -1, 4),
    new Among2("logias", -1, 2),
    new Among2("iras", -1, 9),
    new Among2("adoras", -1, 1),
    new Among2("osas", -1, 1),
    new Among2("istas", -1, 1),
    new Among2("ivas", -1, 8),
    new Among2("ezas", -1, 1),
    new Among2("idades", -1, 7),
    new Among2("adores", -1, 1),
    new Among2("antes", -1, 1),
    new Among2("a\u00E7o~es", -1, 1),
    new Among2("u\u00E7o~es", -1, 3),
    new Among2("icos", -1, 1),
    new Among2("ismos", -1, 1),
    new Among2("osos", -1, 1),
    new Among2("amentos", -1, 1),
    new Among2("imentos", -1, 1),
    new Among2("ivos", -1, 8)
};

private final static Among2 a_6[] = {
    new Among2("ada", -1, 1),
    new Among2("ida", -1, 1),
    new Among2("ia", -1, 1),
    new Among2("aria", 2, 1),
    new Among2("eria", 2, 1),
    new Among2("iria", 2, 1),
    new Among2("ara", -1, 1),
    new Among2("era", -1, 1),
    new Among2("ira", -1, 1),
    new Among2("ava", -1, 1),
    new Among2("asse", -1, 1),
    new Among2("esse", -1, 1),
    new Among2("isse", -1, 1),
    new Among2("aste", -1, 1),
    new Among2("este", -1, 1),
    new Among2("iste", -1, 1),
    new Among2("ei", -1, 1),
    new Among2("arei", 16, 1),
    new Among2("erei", 16, 1),
    new Among2("irei", 16, 1),
    new Among2("am", -1, 1),
    new Among2("iam", 20, 1),
    new Among2("ariam", 21, 1),
    new Among2("eriam", 21, 1),
    new Among2("iriam", 21, 1),
    new Among2("aram", 20, 1),
    new Among2("eram", 20, 1),
    new Among2("iram", 20, 1),
    new Among2("avam", 20, 1),
    new Among2("em", -1, 1),
    new Among2("arem", 29, 1),
    new Among2("erem", 29, 1),
    new Among2("irem", 29, 1),
    new Among2("assem", 29, 1),
    new Among2("essem", 29, 1),
    new Among2("issem", 29, 1),
    new Among2("ado", -1, 1),
    new Among2("ido", -1, 1),
    new Among2("ando", -1, 1),
    new Among2("endo", -1, 1),
    new Among2("indo", -1, 1),
    new Among2("ara~o", -1, 1),
    new Among2("era~o", -1, 1),
    new Among2("ira~o", -1, 1),
    new Among2("ar", -1, 1),
    new Among2("er", -1, 1),
    new Among2("ir", -1, 1),
    new Among2("as", -1, 1),
    new Among2("adas", 47, 1),
    new Among2("idas", 47, 1),
    new Among2("ias", 47, 1),
    new Among2("arias", 50, 1),
    new Among2("erias", 50, 1),
    new Among2("irias", 50, 1),
    new Among2("aras", 47, 1),
    new Among2("eras", 47, 1),
    new Among2("iras", 47, 1),
    new Among2("avas", 47, 1),
    new Among2("es", -1, 1),
    new Among2("ardes", 58, 1),
    new Among2("erdes", 58, 1),
    new Among2("irdes", 58, 1),
    new Among2("ares", 58, 1),
    new Among2("eres", 58, 1),
    new Among2("ires", 58, 1),
    new Among2("asses", 58, 1),
    new Among2("esses", 58, 1),
    new Among2("isses", 58, 1),
    new Among2("astes", 58, 1),
    new Among2("estes", 58, 1),
    new Among2("istes", 58, 1),
    new Among2("is", -1, 1),
    new Among2("ais", 71, 1),
    new Among2("eis", 71, 1),
    new Among2("areis", 73, 1),
    new Among2("ereis", 73, 1),
    new Among2("ireis", 73, 1),
    new Among2("\u00E1reis", 73, 1),
    new Among2("\u00E9reis", 73, 1),
    new Among2("\u00EDreis", 73, 1),
    new Among2("\u00E1sseis", 73, 1),
    new Among2("\u00E9sseis", 73, 1),
    new Among2("\u00EDsseis", 73, 1),
    new Among2("\u00E1veis", 73, 1),
    new Among2("\u00EDeis", 73, 1),
    new Among2("ar\u00EDeis", 84, 1),
    new Among2("er\u00EDeis", 84, 1),
    new Among2("ir\u00EDeis", 84, 1),
    new Among2("ados", -1, 1),
    new Among2("idos", -1, 1),
    new Among2("amos", -1, 1),
    new Among2("\u00E1ramos", 90, 1),
    new Among2("\u00E9ramos", 90, 1),
    new Among2("\u00EDramos", 90, 1),
    new Among2("\u00E1vamos", 90, 1),
    new Among2("\u00EDamos", 90, 1),
    new Among2("ar\u00EDamos", 95, 1),
    new Among2("er\u00EDamos", 95, 1),
    new Among2("ir\u00EDamos", 95, 1),
    new Among2("emos", -1, 1),
    new Among2("aremos", 99, 1),
    new Among2("eremos", 99, 1),
    new Among2("iremos", 99, 1),
    new Among2("\u00E1ssemos", 99, 1),
    new Among2("\u00EAssemos", 99, 1),
    new Among2("\u00EDssemos", 99, 1),
    new Among2("imos", -1, 1),
    new Among2("armos", -1, 1),
    new Among2("ermos", -1, 1),
    new Among2("irmos", -1, 1),
    new Among2("\u00E1mos", -1, 1),
    new Among2("ar\u00E1s", -1, 1),
    new Among2("er\u00E1s", -1, 1),
    new Among2("ir\u00E1s", -1, 1),
    new Among2("eu", -1, 1),
    new Among2("iu", -1, 1),
    new Among2("ou", -1, 1),
    new Among2("ar\u00E1", -1, 1),
    new Among2("er\u00E1", -1, 1),
    new Among2("ir\u00E1", -1, 1)
};

private final static Among2 a_7[] = {
    new Among2("a", -1, 1),
    new Among2("i", -1, 1),
    new Among2("o", -1, 1),
    new Among2("os", -1, 1),
    new Among2("\u00E1", -1, 1),
    new Among2("\u00ED", -1, 1),
    new Among2("\u00F3", -1, 1)
};

private final static Among2 a_8[] = {
    new Among2("e", -1, 1),
    new Among2("\u00E7", -1, 2),
    new Among2("\u00E9", -1, 1),
    new Among2("\u00EA", -1, 1)
};

private static final char g_v[] = {17, 65, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 19, 12, 2 };

private int I_p2;
private int I_p1;
private int I_pV;


private boolean r_prelude() {
    int among_var;
    // repeat, line 36
    while(true)
    {
        int v_1 = cursor;
        lab0: {
            // (, line 36
            // [, line 37
            bra = cursor;
            // substring, line 37
            among_var = find_among(a_0);
            if (among_var == 0)
            {
                break lab0;
            }
            // ], line 37
            ket = cursor;
            switch (among_var) {
                case 1:
                    // (, line 38
                    // <-, line 38
                    slice_from("a~");
                    break;
                case 2:
                    // (, line 39
                    // <-, line 39
                    slice_from("o~");
                    break;
                case 3:
                    // (, line 40
                    // next, line 40
                    if (cursor >= limit)
                    {
                        break lab0;
                    }
                    cursor++;
                    break;
            }
            continue;
        }
        cursor = v_1;
        break;
    }
    return true;
}

private boolean r_mark_regions() {
    // (, line 44
    I_pV = limit;
    I_p1 = limit;
    I_p2 = limit;
    // do, line 50
    int v_1 = cursor;
    lab0: {
        // (, line 50
        // or, line 52
        lab1: {
            int v_2 = cursor;
            lab2: {
                // (, line 51
                if (!(in_grouping(g_v, 97, 250)))
                {
                    break lab2;
                }
                // or, line 51
                lab3: {
                    int v_3 = cursor;
                    lab4: {
                        // (, line 51
                        if (!(out_grouping(g_v, 97, 250)))
                        {
                            break lab4;
                        }
                        // gopast, line 51
                        golab5: while(true)
                        {
                            lab6: {
                                if (!(in_grouping(g_v, 97, 250)))
                                {
                                    break lab6;
                                }
                                break golab5;
                            }
                            if (cursor >= limit)
                            {
                                break lab4;
                            }
                            cursor++;
                        }
                        break lab3;
                    }
                    cursor = v_3;
                    // (, line 51
                    if (!(in_grouping(g_v, 97, 250)))
                    {
                        break lab2;
                    }
                    // gopast, line 51
                    golab7: while(true)
                    {
                        lab8: {
                            if (!(out_grouping(g_v, 97, 250)))
                            {
                                break lab8;
                            }
                            break golab7;
                        }
                        if (cursor >= limit)
                        {
                            break lab2;
                        }
                        cursor++;
                    }
                }
                break lab1;
            }
            cursor = v_2;
            // (, line 53
            if (!(out_grouping(g_v, 97, 250)))
            {
                break lab0;
            }
            // or, line 53
            lab9: {
                int v_6 = cursor;
                lab10: {
                    // (, line 53
                    if (!(out_grouping(g_v, 97, 250)))
                    {
                        break lab10;
                    }
                    // gopast, line 53
                    golab11: while(true)
                    {
                        lab12: {
                            if (!(in_grouping(g_v, 97, 250)))
                            {
                                break lab12;
                            }
                            break golab11;
                        }
                        if (cursor >= limit)
                        {
                            break lab10;
                        }
                        cursor++;
                    }
                    break lab9;
                }
                cursor = v_6;
                // (, line 53
                if (!(in_grouping(g_v, 97, 250)))
                {
                    break lab0;
                }
                // next, line 53
                if (cursor >= limit)
                {
                    break lab0;
                }
                cursor++;
            }
        }
        // setmark pV, line 54
        I_pV = cursor;
    }
    cursor = v_1;
    // do, line 56
    int v_8 = cursor;
    lab13: {
        // (, line 56
        // gopast, line 57
        golab14: while(true)
        {
            lab15: {
                if (!(in_grouping(g_v, 97, 250)))
                {
                    break lab15;
                }
                break golab14;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        // gopast, line 57
        golab16: while(true)
        {
            lab17: {
                if (!(out_grouping(g_v, 97, 250)))
                {
                    break lab17;
                }
                break golab16;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        // setmark p1, line 57
        I_p1 = cursor;
        // gopast, line 58
        golab18: while(true)
        {
            lab19: {
                if (!(in_grouping(g_v, 97, 250)))
                {
                    break lab19;
                }
                break golab18;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        // gopast, line 58
        golab20: while(true)
        {
            lab21: {
                if (!(out_grouping(g_v, 97, 250)))
                {
                    break lab21;
                }
                break golab20;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        // setmark p2, line 58
        I_p2 = cursor;
    }
    cursor = v_8;
    return true;
}

private boolean r_postlude() {
    int among_var;
    // repeat, line 62
    while(true)
    {
        int v_1 = cursor;
        lab0: {
            // (, line 62
            // [, line 63
            bra = cursor;
            // substring, line 63
            among_var = find_among(a_1);
            if (among_var == 0)
            {
                break lab0;
            }
            // ], line 63
            ket = cursor;
            switch (among_var) {
                case 1:
                    // (, line 64
                    // <-, line 64
                    slice_from("\u00E3");
                    break;
                case 2:
                    // (, line 65
                    // <-, line 65
                    slice_from("\u00F5");
                    break;
                case 3:
                    // (, line 66
                    // next, line 66
                    if (cursor >= limit)
                    {
                        break lab0;
                    }
                    cursor++;
                    break;
            }
            continue;
        }
        cursor = v_1;
        break;
    }
    return true;
}

private boolean r_RV() {
    if (!(I_pV <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_R1() {
    if (!(I_p1 <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_R2() {
    if (!(I_p2 <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_standard_suffix() {
    int among_var;
    // (, line 76
    // [, line 77
    ket = cursor;
    // substring, line 77
    among_var = find_among_b(a_5);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 77
    bra = cursor;
    switch (among_var) {
        case 1:
            // (, line 92
            // call R2, line 93
            if (!r_R2())
            {
                return false;
            }
            // delete, line 93
            slice_del();
            break;
        case 2:
            // (, line 97
            // call R2, line 98
            if (!r_R2())
            {
                return false;
            }
            // <-, line 98
            slice_from("log");
            break;
        case 3:
            // (, line 101
            // call R2, line 102
            if (!r_R2())
            {
                return false;
            }
            // <-, line 102
            slice_from("u");
            break;
        case 4:
            // (, line 105
            // call R2, line 106
            if (!r_R2())
            {
                return false;
            }
            // <-, line 106
            slice_from("ente");
            break;
        case 5:
            // (, line 109
            // call R1, line 110
            if (!r_R1())
            {
                return false;
            }
            // delete, line 110
            slice_del();
            // try, line 111
            int v_1 = limit - cursor;
            lab0: {
                // (, line 111
                // [, line 112
                ket = cursor;
                // substring, line 112
                among_var = find_among_b(a_2);
                if (among_var == 0)
                {
                    cursor = limit - v_1;
                    break lab0;
                }
                // ], line 112
                bra = cursor;
                // call R2, line 112
                if (!r_R2())
                {
                    cursor = limit - v_1;
                    break lab0;
                }
                // delete, line 112
                slice_del();
                switch (among_var) {
                    case 1:
                        // (, line 113
                        // [, line 113
                        ket = cursor;
                        // literal, line 113
                        if (!(eq_s_b("at")))
                        {
                            cursor = limit - v_1;
                            break lab0;
                        }
                        // ], line 113
                        bra = cursor;
                        // call R2, line 113
                        if (!r_R2())
                        {
                            cursor = limit - v_1;
                            break lab0;
                        }
                        // delete, line 113
                        slice_del();
                        break;
                }
            }
            break;
        case 6:
            // (, line 121
            // call R2, line 122
            if (!r_R2())
            {
                return false;
            }
            // delete, line 122
            slice_del();
            // try, line 123
            int v_2 = limit - cursor;
            lab1: {
                // (, line 123
                // [, line 124
                ket = cursor;
                // substring, line 124
                if (find_among_b(a_3) == 0)
                {
                    cursor = limit - v_2;
                    break lab1;
                }
                // ], line 124
                bra = cursor;
                // (, line 127
                // call R2, line 127
                if (!r_R2())
                {
                    cursor = limit - v_2;
                    break lab1;
                }
                // delete, line 127
                slice_del();
            }
            break;
        case 7:
            // (, line 133
            // call R2, line 134
            if (!r_R2())
            {
                return false;
            }
            // delete, line 134
            slice_del();
            // try, line 135
            int v_3 = limit - cursor;
            lab2: {
                // (, line 135
                // [, line 136
                ket = cursor;
                // substring, line 136
                if (find_among_b(a_4) == 0)
                {
                    cursor = limit - v_3;
                    break lab2;
                }
                // ], line 136
                bra = cursor;
                // (, line 139
                // call R2, line 139
                if (!r_R2())
                {
                    cursor = limit - v_3;
                    break lab2;
                }
                // delete, line 139
                slice_del();
            }
            break;
        case 8:
            // (, line 145
            // call R2, line 146
            if (!r_R2())
            {
                return false;
            }
            // delete, line 146
            slice_del();
            // try, line 147
            int v_4 = limit - cursor;
            lab3: {
                // (, line 147
                // [, line 148
                ket = cursor;
                // literal, line 148
                if (!(eq_s_b("at")))
                {
                    cursor = limit - v_4;
                    break lab3;
                }
                // ], line 148
                bra = cursor;
                // call R2, line 148
                if (!r_R2())
                {
                    cursor = limit - v_4;
                    break lab3;
                }
                // delete, line 148
                slice_del();
            }
            break;
        case 9:
            // (, line 152
            // call RV, line 153
            if (!r_RV())
            {
                return false;
            }
            // literal, line 153
            if (!(eq_s_b("e")))
            {
                return false;
            }
            // <-, line 154
            slice_from("ir");
            break;
    }
    return true;
}

private boolean r_verb_suffix() {
    // setlimit, line 159
    if (cursor < I_pV)
    {
        return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_pV;
    // (, line 159
    // [, line 160
    ket = cursor;
    // substring, line 160
    if (find_among_b(a_6) == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 160
    bra = cursor;
    // (, line 179
    // delete, line 179
    slice_del();
    limit_backward = v_2;
    return true;
}

private boolean r_residual_suffix() {
    // (, line 183
    // [, line 184
    ket = cursor;
    // substring, line 184
    if (find_among_b(a_7) == 0)
    {
        return false;
    }
    // ], line 184
    bra = cursor;
    // (, line 187
    // call RV, line 187
    if (!r_RV())
    {
        return false;
    }
    // delete, line 187
    slice_del();
    return true;
}

private boolean r_residual_form() {
    int among_var;
    // (, line 191
    // [, line 192
    ket = cursor;
    // substring, line 192
    among_var = find_among_b(a_8);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 192
    bra = cursor;
    switch (among_var) {
        case 1:
            // (, line 194
            // call RV, line 194
            if (!r_RV())
            {
                return false;
            }
            // delete, line 194
            slice_del();
            // [, line 194
            ket = cursor;
            // or, line 194
            lab0: {
                int v_1 = limit - cursor;
                lab1: {
                    // (, line 194
                    // literal, line 194
                    if (!(eq_s_b("u")))
                    {
                        break lab1;
                    }
                    // ], line 194
                    bra = cursor;
                    // test, line 194
                    int v_2 = limit - cursor;
                    // literal, line 194
                    if (!(eq_s_b("g")))
                    {
                        break lab1;
                    }
                    cursor = limit - v_2;
                    break lab0;
                }
                cursor = limit - v_1;
                // (, line 195
                // literal, line 195
                if (!(eq_s_b("i")))
                {
                    return false;
                }
                // ], line 195
                bra = cursor;
                // test, line 195
                int v_3 = limit - cursor;
                // literal, line 195
                if (!(eq_s_b("c")))
                {
                    return false;
                }
                cursor = limit - v_3;
            }
            // call RV, line 195
            if (!r_RV())
            {
                return false;
            }
            // delete, line 195
            slice_del();
            break;
        case 2:
            // (, line 196
            // <-, line 196
            slice_from("c");
            break;
    }
    return true;
}

public boolean stem() {
    // (, line 201
    // do, line 202
    int v_1 = cursor;
    // call prelude, line 202
    r_prelude();
    cursor = v_1;
    // do, line 203
    // call mark_regions, line 203
    r_mark_regions();
    // backwards, line 204
    limit_backward = cursor;
    cursor = limit;
    // (, line 204
    // do, line 205
    int v_3 = limit - cursor;
    lab0: {
        // (, line 205
        // or, line 209
        lab1: {
            int v_4 = limit - cursor;
            lab2: {
                // (, line 206
                // and, line 207
                int v_5 = limit - cursor;
                // (, line 206
                // or, line 206
                lab3: {
                    int v_6 = limit - cursor;
                    lab4: {
                        // call standard_suffix, line 206
                        if (!r_standard_suffix())
                        {
                            break lab4;
                        }
                        break lab3;
                    }
                    cursor = limit - v_6;
                    // call verb_suffix, line 206
                    if (!r_verb_suffix())
                    {
                        break lab2;
                    }
                }
                cursor = limit - v_5;
                // do, line 207
                int v_7 = limit - cursor;
                lab5: {
                    // (, line 207
                    // [, line 207
                    ket = cursor;
                    // literal, line 207
                    if (!(eq_s_b("i")))
                    {
                        break lab5;
                    }
                    // ], line 207
                    bra = cursor;
                    // test, line 207
                    int v_8 = limit - cursor;
                    // literal, line 207
                    if (!(eq_s_b("c")))
                    {
                        break lab5;
                    }
                    cursor = limit - v_8;
                    // call RV, line 207
                    if (!r_RV())
                    {
                        break lab5;
                    }
                    // delete, line 207
                    slice_del();
                }
                cursor = limit - v_7;
                break lab1;
            }
            cursor = limit - v_4;
            // call residual_suffix, line 209
            if (!r_residual_suffix())
            {
                break lab0;
            }
        }
    }
    cursor = limit - v_3;
    // do, line 211
    int v_9 = limit - cursor;
    // call residual_form, line 211
    r_residual_form();
    cursor = limit - v_9;
    cursor = limit_backward;
    // do, line 213
    int v_10 = cursor;
    // call postlude, line 213
    r_postlude();
    cursor = v_10;
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof portugueseStemmer;
}

@Override
public int hashCode() {
    return portugueseStemmer.class.getName().hashCode();
}



}

