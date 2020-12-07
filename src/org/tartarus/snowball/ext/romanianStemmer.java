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
public class romanianStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among2 a_0[] = {
    new Among2("", -1, 3),
    new Among2("I", 0, 1),
    new Among2("U", 0, 2)
};

private final static Among2 a_1[] = {
    new Among2("ea", -1, 3),
    new Among2("a\u0163ia", -1, 7),
    new Among2("aua", -1, 2),
    new Among2("iua", -1, 4),
    new Among2("a\u0163ie", -1, 7),
    new Among2("ele", -1, 3),
    new Among2("ile", -1, 5),
    new Among2("iile", 6, 4),
    new Among2("iei", -1, 4),
    new Among2("atei", -1, 6),
    new Among2("ii", -1, 4),
    new Among2("ului", -1, 1),
    new Among2("ul", -1, 1),
    new Among2("elor", -1, 3),
    new Among2("ilor", -1, 4),
    new Among2("iilor", 14, 4)
};

private final static Among2 a_2[] = {
    new Among2("icala", -1, 4),
    new Among2("iciva", -1, 4),
    new Among2("ativa", -1, 5),
    new Among2("itiva", -1, 6),
    new Among2("icale", -1, 4),
    new Among2("a\u0163iune", -1, 5),
    new Among2("i\u0163iune", -1, 6),
    new Among2("atoare", -1, 5),
    new Among2("itoare", -1, 6),
    new Among2("\u0103toare", -1, 5),
    new Among2("icitate", -1, 4),
    new Among2("abilitate", -1, 1),
    new Among2("ibilitate", -1, 2),
    new Among2("ivitate", -1, 3),
    new Among2("icive", -1, 4),
    new Among2("ative", -1, 5),
    new Among2("itive", -1, 6),
    new Among2("icali", -1, 4),
    new Among2("atori", -1, 5),
    new Among2("icatori", 18, 4),
    new Among2("itori", -1, 6),
    new Among2("\u0103tori", -1, 5),
    new Among2("icitati", -1, 4),
    new Among2("abilitati", -1, 1),
    new Among2("ivitati", -1, 3),
    new Among2("icivi", -1, 4),
    new Among2("ativi", -1, 5),
    new Among2("itivi", -1, 6),
    new Among2("icit\u0103i", -1, 4),
    new Among2("abilit\u0103i", -1, 1),
    new Among2("ivit\u0103i", -1, 3),
    new Among2("icit\u0103\u0163i", -1, 4),
    new Among2("abilit\u0103\u0163i", -1, 1),
    new Among2("ivit\u0103\u0163i", -1, 3),
    new Among2("ical", -1, 4),
    new Among2("ator", -1, 5),
    new Among2("icator", 35, 4),
    new Among2("itor", -1, 6),
    new Among2("\u0103tor", -1, 5),
    new Among2("iciv", -1, 4),
    new Among2("ativ", -1, 5),
    new Among2("itiv", -1, 6),
    new Among2("ical\u0103", -1, 4),
    new Among2("iciv\u0103", -1, 4),
    new Among2("ativ\u0103", -1, 5),
    new Among2("itiv\u0103", -1, 6)
};

private final static Among2 a_3[] = {
    new Among2("ica", -1, 1),
    new Among2("abila", -1, 1),
    new Among2("ibila", -1, 1),
    new Among2("oasa", -1, 1),
    new Among2("ata", -1, 1),
    new Among2("ita", -1, 1),
    new Among2("anta", -1, 1),
    new Among2("ista", -1, 3),
    new Among2("uta", -1, 1),
    new Among2("iva", -1, 1),
    new Among2("ic", -1, 1),
    new Among2("ice", -1, 1),
    new Among2("abile", -1, 1),
    new Among2("ibile", -1, 1),
    new Among2("isme", -1, 3),
    new Among2("iune", -1, 2),
    new Among2("oase", -1, 1),
    new Among2("ate", -1, 1),
    new Among2("itate", 17, 1),
    new Among2("ite", -1, 1),
    new Among2("ante", -1, 1),
    new Among2("iste", -1, 3),
    new Among2("ute", -1, 1),
    new Among2("ive", -1, 1),
    new Among2("ici", -1, 1),
    new Among2("abili", -1, 1),
    new Among2("ibili", -1, 1),
    new Among2("iuni", -1, 2),
    new Among2("atori", -1, 1),
    new Among2("osi", -1, 1),
    new Among2("ati", -1, 1),
    new Among2("itati", 30, 1),
    new Among2("iti", -1, 1),
    new Among2("anti", -1, 1),
    new Among2("isti", -1, 3),
    new Among2("uti", -1, 1),
    new Among2("i\u015Fti", -1, 3),
    new Among2("ivi", -1, 1),
    new Among2("it\u0103i", -1, 1),
    new Among2("o\u015Fi", -1, 1),
    new Among2("it\u0103\u0163i", -1, 1),
    new Among2("abil", -1, 1),
    new Among2("ibil", -1, 1),
    new Among2("ism", -1, 3),
    new Among2("ator", -1, 1),
    new Among2("os", -1, 1),
    new Among2("at", -1, 1),
    new Among2("it", -1, 1),
    new Among2("ant", -1, 1),
    new Among2("ist", -1, 3),
    new Among2("ut", -1, 1),
    new Among2("iv", -1, 1),
    new Among2("ic\u0103", -1, 1),
    new Among2("abil\u0103", -1, 1),
    new Among2("ibil\u0103", -1, 1),
    new Among2("oas\u0103", -1, 1),
    new Among2("at\u0103", -1, 1),
    new Among2("it\u0103", -1, 1),
    new Among2("ant\u0103", -1, 1),
    new Among2("ist\u0103", -1, 3),
    new Among2("ut\u0103", -1, 1),
    new Among2("iv\u0103", -1, 1)
};

private final static Among2 a_4[] = {
    new Among2("ea", -1, 1),
    new Among2("ia", -1, 1),
    new Among2("esc", -1, 1),
    new Among2("\u0103sc", -1, 1),
    new Among2("ind", -1, 1),
    new Among2("\u00E2nd", -1, 1),
    new Among2("are", -1, 1),
    new Among2("ere", -1, 1),
    new Among2("ire", -1, 1),
    new Among2("\u00E2re", -1, 1),
    new Among2("se", -1, 2),
    new Among2("ase", 10, 1),
    new Among2("sese", 10, 2),
    new Among2("ise", 10, 1),
    new Among2("use", 10, 1),
    new Among2("\u00E2se", 10, 1),
    new Among2("e\u015Fte", -1, 1),
    new Among2("\u0103\u015Fte", -1, 1),
    new Among2("eze", -1, 1),
    new Among2("ai", -1, 1),
    new Among2("eai", 19, 1),
    new Among2("iai", 19, 1),
    new Among2("sei", -1, 2),
    new Among2("e\u015Fti", -1, 1),
    new Among2("\u0103\u015Fti", -1, 1),
    new Among2("ui", -1, 1),
    new Among2("ezi", -1, 1),
    new Among2("\u00E2i", -1, 1),
    new Among2("a\u015Fi", -1, 1),
    new Among2("se\u015Fi", -1, 2),
    new Among2("ase\u015Fi", 29, 1),
    new Among2("sese\u015Fi", 29, 2),
    new Among2("ise\u015Fi", 29, 1),
    new Among2("use\u015Fi", 29, 1),
    new Among2("\u00E2se\u015Fi", 29, 1),
    new Among2("i\u015Fi", -1, 1),
    new Among2("u\u015Fi", -1, 1),
    new Among2("\u00E2\u015Fi", -1, 1),
    new Among2("a\u0163i", -1, 2),
    new Among2("ea\u0163i", 38, 1),
    new Among2("ia\u0163i", 38, 1),
    new Among2("e\u0163i", -1, 2),
    new Among2("i\u0163i", -1, 2),
    new Among2("\u00E2\u0163i", -1, 2),
    new Among2("ar\u0103\u0163i", -1, 1),
    new Among2("ser\u0103\u0163i", -1, 2),
    new Among2("aser\u0103\u0163i", 45, 1),
    new Among2("seser\u0103\u0163i", 45, 2),
    new Among2("iser\u0103\u0163i", 45, 1),
    new Among2("user\u0103\u0163i", 45, 1),
    new Among2("\u00E2ser\u0103\u0163i", 45, 1),
    new Among2("ir\u0103\u0163i", -1, 1),
    new Among2("ur\u0103\u0163i", -1, 1),
    new Among2("\u00E2r\u0103\u0163i", -1, 1),
    new Among2("am", -1, 1),
    new Among2("eam", 54, 1),
    new Among2("iam", 54, 1),
    new Among2("em", -1, 2),
    new Among2("asem", 57, 1),
    new Among2("sesem", 57, 2),
    new Among2("isem", 57, 1),
    new Among2("usem", 57, 1),
    new Among2("\u00E2sem", 57, 1),
    new Among2("im", -1, 2),
    new Among2("\u00E2m", -1, 2),
    new Among2("\u0103m", -1, 2),
    new Among2("ar\u0103m", 65, 1),
    new Among2("ser\u0103m", 65, 2),
    new Among2("aser\u0103m", 67, 1),
    new Among2("seser\u0103m", 67, 2),
    new Among2("iser\u0103m", 67, 1),
    new Among2("user\u0103m", 67, 1),
    new Among2("\u00E2ser\u0103m", 67, 1),
    new Among2("ir\u0103m", 65, 1),
    new Among2("ur\u0103m", 65, 1),
    new Among2("\u00E2r\u0103m", 65, 1),
    new Among2("au", -1, 1),
    new Among2("eau", 76, 1),
    new Among2("iau", 76, 1),
    new Among2("indu", -1, 1),
    new Among2("\u00E2ndu", -1, 1),
    new Among2("ez", -1, 1),
    new Among2("easc\u0103", -1, 1),
    new Among2("ar\u0103", -1, 1),
    new Among2("ser\u0103", -1, 2),
    new Among2("aser\u0103", 84, 1),
    new Among2("seser\u0103", 84, 2),
    new Among2("iser\u0103", 84, 1),
    new Among2("user\u0103", 84, 1),
    new Among2("\u00E2ser\u0103", 84, 1),
    new Among2("ir\u0103", -1, 1),
    new Among2("ur\u0103", -1, 1),
    new Among2("\u00E2r\u0103", -1, 1),
    new Among2("eaz\u0103", -1, 1)
};

private final static Among2 a_5[] = {
    new Among2("a", -1, 1),
    new Among2("e", -1, 1),
    new Among2("ie", 1, 1),
    new Among2("i", -1, 1),
    new Among2("\u0103", -1, 1)
};

private static final char g_v[] = {17, 65, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 32, 0, 0, 4 };

private boolean B_standard_suffix_removed;
private int I_p2;
private int I_p1;
private int I_pV;


private boolean r_prelude() {
    // (, line 31
    // repeat, line 32
    while(true)
    {
        int v_1 = cursor;
        lab0: {
            // goto, line 32
            golab1: while(true)
            {
                int v_2 = cursor;
                lab2: {
                    // (, line 32
                    if (!(in_grouping(g_v, 97, 259)))
                    {
                        break lab2;
                    }
                    // [, line 33
                    bra = cursor;
                    // or, line 33
                    lab3: {
                        int v_3 = cursor;
                        lab4: {
                            // (, line 33
                            // literal, line 33
                            if (!(eq_s("u")))
                            {
                                break lab4;
                            }
                            // ], line 33
                            ket = cursor;
                            if (!(in_grouping(g_v, 97, 259)))
                            {
                                break lab4;
                            }
                            // <-, line 33
                            slice_from("U");
                            break lab3;
                        }
                        cursor = v_3;
                        // (, line 34
                        // literal, line 34
                        if (!(eq_s("i")))
                        {
                            break lab2;
                        }
                        // ], line 34
                        ket = cursor;
                        if (!(in_grouping(g_v, 97, 259)))
                        {
                            break lab2;
                        }
                        // <-, line 34
                        slice_from("I");
                    }
                    cursor = v_2;
                    break golab1;
                }
                cursor = v_2;
                if (cursor >= limit)
                {
                    break lab0;
                }
                cursor++;
            }
            continue;
        }
        cursor = v_1;
        break;
    }
    return true;
}

private boolean r_mark_regions() {
    // (, line 38
    I_pV = limit;
    I_p1 = limit;
    I_p2 = limit;
    // do, line 44
    int v_1 = cursor;
    lab0: {
        // (, line 44
        // or, line 46
        lab1: {
            int v_2 = cursor;
            lab2: {
                // (, line 45
                if (!(in_grouping(g_v, 97, 259)))
                {
                    break lab2;
                }
                // or, line 45
                lab3: {
                    int v_3 = cursor;
                    lab4: {
                        // (, line 45
                        if (!(out_grouping(g_v, 97, 259)))
                        {
                            break lab4;
                        }
                        // gopast, line 45
                        golab5: while(true)
                        {
                            lab6: {
                                if (!(in_grouping(g_v, 97, 259)))
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
                    // (, line 45
                    if (!(in_grouping(g_v, 97, 259)))
                    {
                        break lab2;
                    }
                    // gopast, line 45
                    golab7: while(true)
                    {
                        lab8: {
                            if (!(out_grouping(g_v, 97, 259)))
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
            // (, line 47
            if (!(out_grouping(g_v, 97, 259)))
            {
                break lab0;
            }
            // or, line 47
            lab9: {
                int v_6 = cursor;
                lab10: {
                    // (, line 47
                    if (!(out_grouping(g_v, 97, 259)))
                    {
                        break lab10;
                    }
                    // gopast, line 47
                    golab11: while(true)
                    {
                        lab12: {
                            if (!(in_grouping(g_v, 97, 259)))
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
                // (, line 47
                if (!(in_grouping(g_v, 97, 259)))
                {
                    break lab0;
                }
                // next, line 47
                if (cursor >= limit)
                {
                    break lab0;
                }
                cursor++;
            }
        }
        // setmark pV, line 48
        I_pV = cursor;
    }
    cursor = v_1;
    // do, line 50
    int v_8 = cursor;
    lab13: {
        // (, line 50
        // gopast, line 51
        golab14: while(true)
        {
            lab15: {
                if (!(in_grouping(g_v, 97, 259)))
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
        // gopast, line 51
        golab16: while(true)
        {
            lab17: {
                if (!(out_grouping(g_v, 97, 259)))
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
        // setmark p1, line 51
        I_p1 = cursor;
        // gopast, line 52
        golab18: while(true)
        {
            lab19: {
                if (!(in_grouping(g_v, 97, 259)))
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
        // gopast, line 52
        golab20: while(true)
        {
            lab21: {
                if (!(out_grouping(g_v, 97, 259)))
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
        // setmark p2, line 52
        I_p2 = cursor;
    }
    cursor = v_8;
    return true;
}

private boolean r_postlude() {
    int among_var;
    // repeat, line 56
    while(true)
    {
        int v_1 = cursor;
        lab0: {
            // (, line 56
            // [, line 58
            bra = cursor;
            // substring, line 58
            among_var = find_among(a_0);
            if (among_var == 0)
            {
                break lab0;
            }
            // ], line 58
            ket = cursor;
            switch (among_var) {
                case 1:
                    // (, line 59
                    // <-, line 59
                    slice_from("i");
                    break;
                case 2:
                    // (, line 60
                    // <-, line 60
                    slice_from("u");
                    break;
                case 3:
                    // (, line 61
                    // next, line 61
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

private boolean r_step_0() {
    int among_var;
    // (, line 72
    // [, line 73
    ket = cursor;
    // substring, line 73
    among_var = find_among_b(a_1);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 73
    bra = cursor;
    // call R1, line 73
    if (!r_R1())
    {
        return false;
    }
    switch (among_var) {
        case 1:
            // (, line 75
            // delete, line 75
            slice_del();
            break;
        case 2:
            // (, line 77
            // <-, line 77
            slice_from("a");
            break;
        case 3:
            // (, line 79
            // <-, line 79
            slice_from("e");
            break;
        case 4:
            // (, line 81
            // <-, line 81
            slice_from("i");
            break;
        case 5:
            // (, line 83
            // not, line 83
            {
                int v_1 = limit - cursor;
                lab0: {
                    // literal, line 83
                    if (!(eq_s_b("ab")))
                    {
                        break lab0;
                    }
                    return false;
                }
                cursor = limit - v_1;
            }
            // <-, line 83
            slice_from("i");
            break;
        case 6:
            // (, line 85
            // <-, line 85
            slice_from("at");
            break;
        case 7:
            // (, line 87
            // <-, line 87
            slice_from("a\u0163i");
            break;
    }
    return true;
}

private boolean r_combo_suffix() {
    int among_var;
    // test, line 91
    int v_1 = limit - cursor;
    // (, line 91
    // [, line 92
    ket = cursor;
    // substring, line 92
    among_var = find_among_b(a_2);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 92
    bra = cursor;
    // call R1, line 92
    if (!r_R1())
    {
        return false;
    }
    // (, line 92
    switch (among_var) {
        case 1:
            // (, line 100
            // <-, line 101
            slice_from("abil");
            break;
        case 2:
            // (, line 103
            // <-, line 104
            slice_from("ibil");
            break;
        case 3:
            // (, line 106
            // <-, line 107
            slice_from("iv");
            break;
        case 4:
            // (, line 112
            // <-, line 113
            slice_from("ic");
            break;
        case 5:
            // (, line 117
            // <-, line 118
            slice_from("at");
            break;
        case 6:
            // (, line 121
            // <-, line 122
            slice_from("it");
            break;
    }
    // set standard_suffix_removed, line 125
    B_standard_suffix_removed = true;
    cursor = limit - v_1;
    return true;
}

private boolean r_standard_suffix() {
    int among_var;
    // (, line 129
    // unset standard_suffix_removed, line 130
    B_standard_suffix_removed = false;
    // repeat, line 131
    while(true)
    {
        int v_1 = limit - cursor;
        lab0: {
            // call combo_suffix, line 131
            if (!r_combo_suffix())
            {
                break lab0;
            }
            continue;
        }
        cursor = limit - v_1;
        break;
    }
    // [, line 132
    ket = cursor;
    // substring, line 132
    among_var = find_among_b(a_3);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 132
    bra = cursor;
    // call R2, line 132
    if (!r_R2())
    {
        return false;
    }
    // (, line 132
    switch (among_var) {
        case 1:
            // (, line 148
            // delete, line 149
            slice_del();
            break;
        case 2:
            // (, line 151
            // literal, line 152
            if (!(eq_s_b("\u0163")))
            {
                return false;
            }
            // ], line 152
            bra = cursor;
            // <-, line 152
            slice_from("t");
            break;
        case 3:
            // (, line 155
            // <-, line 156
            slice_from("ist");
            break;
    }
    // set standard_suffix_removed, line 160
    B_standard_suffix_removed = true;
    return true;
}

private boolean r_verb_suffix() {
    int among_var;
    // setlimit, line 164
    if (cursor < I_pV)
    {
        return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_pV;
    // (, line 164
    // [, line 165
    ket = cursor;
    // substring, line 165
    among_var = find_among_b(a_4);
    if (among_var == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 165
    bra = cursor;
    switch (among_var) {
        case 1:
            // (, line 200
            // or, line 200
            lab0: {
                int v_3 = limit - cursor;
                lab1: {
                    if (!(out_grouping_b(g_v, 97, 259)))
                    {
                        break lab1;
                    }
                    break lab0;
                }
                cursor = limit - v_3;
                // literal, line 200
                if (!(eq_s_b("u")))
                {
                    limit_backward = v_2;
                    return false;
                }
            }
            // delete, line 200
            slice_del();
            break;
        case 2:
            // (, line 214
            // delete, line 214
            slice_del();
            break;
    }
    limit_backward = v_2;
    return true;
}

private boolean r_vowel_suffix() {
    // (, line 218
    // [, line 219
    ket = cursor;
    // substring, line 219
    if (find_among_b(a_5) == 0)
    {
        return false;
    }
    // ], line 219
    bra = cursor;
    // call RV, line 219
    if (!r_RV())
    {
        return false;
    }
    // (, line 220
    // delete, line 220
    slice_del();
    return true;
}

public boolean stem() {
    // (, line 225
    // do, line 226
    int v_1 = cursor;
    // call prelude, line 226
    r_prelude();
    cursor = v_1;
    // do, line 227
    // call mark_regions, line 227
    r_mark_regions();
    // backwards, line 228
    limit_backward = cursor;
    cursor = limit;
    // (, line 228
    // do, line 229
    int v_3 = limit - cursor;
    // call step_0, line 229
    r_step_0();
    cursor = limit - v_3;
    // do, line 230
    int v_4 = limit - cursor;
    // call standard_suffix, line 230
    r_standard_suffix();
    cursor = limit - v_4;
    // do, line 231
    int v_5 = limit - cursor;
    lab0: {
        // (, line 231
        // or, line 231
        lab1: {
            int v_6 = limit - cursor;
            lab2: {
                // Boolean test standard_suffix_removed, line 231
                if (!(B_standard_suffix_removed))
                {
                    break lab2;
                }
                break lab1;
            }
            cursor = limit - v_6;
            // call verb_suffix, line 231
            if (!r_verb_suffix())
            {
                break lab0;
            }
        }
    }
    cursor = limit - v_5;
    // do, line 232
    int v_7 = limit - cursor;
    // call vowel_suffix, line 232
    r_vowel_suffix();
    cursor = limit - v_7;
    cursor = limit_backward;
    // do, line 234
    int v_8 = cursor;
    // call postlude, line 234
    r_postlude();
    cursor = v_8;
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof romanianStemmer;
}

@Override
public int hashCode() {
    return romanianStemmer.class.getName().hashCode();
}



}

