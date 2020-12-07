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
public class basqueStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among2 a_0[] = {
    new Among2("idea", -1, 1),
    new Among2("bidea", 0, 1),
    new Among2("kidea", 0, 1),
    new Among2("pidea", 0, 1),
    new Among2("kundea", -1, 1),
    new Among2("galea", -1, 1),
    new Among2("tailea", -1, 1),
    new Among2("tzailea", -1, 1),
    new Among2("gunea", -1, 1),
    new Among2("kunea", -1, 1),
    new Among2("tzaga", -1, 1),
    new Among2("gaia", -1, 1),
    new Among2("aldia", -1, 1),
    new Among2("taldia", 12, 1),
    new Among2("karia", -1, 1),
    new Among2("garria", -1, 2),
    new Among2("karria", -1, 1),
    new Among2("ka", -1, 1),
    new Among2("tzaka", 17, 1),
    new Among2("la", -1, 1),
    new Among2("mena", -1, 1),
    new Among2("pena", -1, 1),
    new Among2("kina", -1, 1),
    new Among2("ezina", -1, 1),
    new Among2("tezina", 23, 1),
    new Among2("kuna", -1, 1),
    new Among2("tuna", -1, 1),
    new Among2("kizuna", -1, 1),
    new Among2("era", -1, 1),
    new Among2("bera", 28, 1),
    new Among2("arabera", 29, 4),
    new Among2("kera", 28, 1),
    new Among2("pera", 28, 1),
    new Among2("orra", -1, 1),
    new Among2("korra", 33, 1),
    new Among2("dura", -1, 1),
    new Among2("gura", -1, 1),
    new Among2("kura", -1, 1),
    new Among2("tura", -1, 1),
    new Among2("eta", -1, 1),
    new Among2("keta", 39, 1),
    new Among2("gailua", -1, 1),
    new Among2("eza", -1, 1),
    new Among2("erreza", 42, 1),
    new Among2("tza", -1, 2),
    new Among2("gaitza", 44, 1),
    new Among2("kaitza", 44, 1),
    new Among2("kuntza", 44, 1),
    new Among2("ide", -1, 1),
    new Among2("bide", 48, 1),
    new Among2("kide", 48, 1),
    new Among2("pide", 48, 1),
    new Among2("kunde", -1, 1),
    new Among2("tzake", -1, 1),
    new Among2("tzeke", -1, 1),
    new Among2("le", -1, 1),
    new Among2("gale", 55, 1),
    new Among2("taile", 55, 1),
    new Among2("tzaile", 55, 1),
    new Among2("gune", -1, 1),
    new Among2("kune", -1, 1),
    new Among2("tze", -1, 1),
    new Among2("atze", 61, 1),
    new Among2("gai", -1, 1),
    new Among2("aldi", -1, 1),
    new Among2("taldi", 64, 1),
    new Among2("ki", -1, 1),
    new Among2("ari", -1, 1),
    new Among2("kari", 67, 1),
    new Among2("lari", 67, 1),
    new Among2("tari", 67, 1),
    new Among2("etari", 70, 1),
    new Among2("garri", -1, 2),
    new Among2("karri", -1, 1),
    new Among2("arazi", -1, 1),
    new Among2("tarazi", 74, 1),
    new Among2("an", -1, 1),
    new Among2("ean", 76, 1),
    new Among2("rean", 77, 1),
    new Among2("kan", 76, 1),
    new Among2("etan", 76, 1),
    new Among2("atseden", -1, 3),
    new Among2("men", -1, 1),
    new Among2("pen", -1, 1),
    new Among2("kin", -1, 1),
    new Among2("rekin", 84, 1),
    new Among2("ezin", -1, 1),
    new Among2("tezin", 86, 1),
    new Among2("tun", -1, 1),
    new Among2("kizun", -1, 1),
    new Among2("go", -1, 1),
    new Among2("ago", 90, 1),
    new Among2("tio", -1, 1),
    new Among2("dako", -1, 1),
    new Among2("or", -1, 1),
    new Among2("kor", 94, 1),
    new Among2("tzat", -1, 1),
    new Among2("du", -1, 1),
    new Among2("gailu", -1, 1),
    new Among2("tu", -1, 1),
    new Among2("atu", 99, 1),
    new Among2("aldatu", 100, 1),
    new Among2("tatu", 100, 1),
    new Among2("baditu", 99, 5),
    new Among2("ez", -1, 1),
    new Among2("errez", 104, 1),
    new Among2("tzez", 104, 1),
    new Among2("gaitz", -1, 1),
    new Among2("kaitz", -1, 1)
};

private final static Among2 a_1[] = {
    new Among2("ada", -1, 1),
    new Among2("kada", 0, 1),
    new Among2("anda", -1, 1),
    new Among2("denda", -1, 1),
    new Among2("gabea", -1, 1),
    new Among2("kabea", -1, 1),
    new Among2("aldea", -1, 1),
    new Among2("kaldea", 6, 1),
    new Among2("taldea", 6, 1),
    new Among2("ordea", -1, 1),
    new Among2("zalea", -1, 1),
    new Among2("tzalea", 10, 1),
    new Among2("gilea", -1, 1),
    new Among2("emea", -1, 1),
    new Among2("kumea", -1, 1),
    new Among2("nea", -1, 1),
    new Among2("enea", 15, 1),
    new Among2("zionea", 15, 1),
    new Among2("unea", 15, 1),
    new Among2("gunea", 18, 1),
    new Among2("pea", -1, 1),
    new Among2("aurrea", -1, 1),
    new Among2("tea", -1, 1),
    new Among2("kotea", 22, 1),
    new Among2("artea", 22, 1),
    new Among2("ostea", 22, 1),
    new Among2("etxea", -1, 1),
    new Among2("ga", -1, 1),
    new Among2("anga", 27, 1),
    new Among2("gaia", -1, 1),
    new Among2("aldia", -1, 1),
    new Among2("taldia", 30, 1),
    new Among2("handia", -1, 1),
    new Among2("mendia", -1, 1),
    new Among2("geia", -1, 1),
    new Among2("egia", -1, 1),
    new Among2("degia", 35, 1),
    new Among2("tegia", 35, 1),
    new Among2("nahia", -1, 1),
    new Among2("ohia", -1, 1),
    new Among2("kia", -1, 1),
    new Among2("tokia", 40, 1),
    new Among2("oia", -1, 1),
    new Among2("koia", 42, 1),
    new Among2("aria", -1, 1),
    new Among2("karia", 44, 1),
    new Among2("laria", 44, 1),
    new Among2("taria", 44, 1),
    new Among2("eria", -1, 1),
    new Among2("keria", 48, 1),
    new Among2("teria", 48, 1),
    new Among2("garria", -1, 2),
    new Among2("larria", -1, 1),
    new Among2("kirria", -1, 1),
    new Among2("duria", -1, 1),
    new Among2("asia", -1, 1),
    new Among2("tia", -1, 1),
    new Among2("ezia", -1, 1),
    new Among2("bizia", -1, 1),
    new Among2("ontzia", -1, 1),
    new Among2("ka", -1, 1),
    new Among2("joka", 60, 3),
    new Among2("aurka", 60, 10),
    new Among2("ska", 60, 1),
    new Among2("xka", 60, 1),
    new Among2("zka", 60, 1),
    new Among2("gibela", -1, 1),
    new Among2("gela", -1, 1),
    new Among2("kaila", -1, 1),
    new Among2("skila", -1, 1),
    new Among2("tila", -1, 1),
    new Among2("ola", -1, 1),
    new Among2("na", -1, 1),
    new Among2("kana", 72, 1),
    new Among2("ena", 72, 1),
    new Among2("garrena", 74, 1),
    new Among2("gerrena", 74, 1),
    new Among2("urrena", 74, 1),
    new Among2("zaina", 72, 1),
    new Among2("tzaina", 78, 1),
    new Among2("kina", 72, 1),
    new Among2("mina", 72, 1),
    new Among2("garna", 72, 1),
    new Among2("una", 72, 1),
    new Among2("duna", 83, 1),
    new Among2("asuna", 83, 1),
    new Among2("tasuna", 85, 1),
    new Among2("ondoa", -1, 1),
    new Among2("kondoa", 87, 1),
    new Among2("ngoa", -1, 1),
    new Among2("zioa", -1, 1),
    new Among2("koa", -1, 1),
    new Among2("takoa", 91, 1),
    new Among2("zkoa", 91, 1),
    new Among2("noa", -1, 1),
    new Among2("zinoa", 94, 1),
    new Among2("aroa", -1, 1),
    new Among2("taroa", 96, 1),
    new Among2("zaroa", 96, 1),
    new Among2("eroa", -1, 1),
    new Among2("oroa", -1, 1),
    new Among2("osoa", -1, 1),
    new Among2("toa", -1, 1),
    new Among2("ttoa", 102, 1),
    new Among2("ztoa", 102, 1),
    new Among2("txoa", -1, 1),
    new Among2("tzoa", -1, 1),
    new Among2("\u00F1oa", -1, 1),
    new Among2("ra", -1, 1),
    new Among2("ara", 108, 1),
    new Among2("dara", 109, 1),
    new Among2("liara", 109, 1),
    new Among2("tiara", 109, 1),
    new Among2("tara", 109, 1),
    new Among2("etara", 113, 1),
    new Among2("tzara", 109, 1),
    new Among2("bera", 108, 1),
    new Among2("kera", 108, 1),
    new Among2("pera", 108, 1),
    new Among2("ora", 108, 2),
    new Among2("tzarra", 108, 1),
    new Among2("korra", 108, 1),
    new Among2("tra", 108, 1),
    new Among2("sa", -1, 1),
    new Among2("osa", 123, 1),
    new Among2("ta", -1, 1),
    new Among2("eta", 125, 1),
    new Among2("keta", 126, 1),
    new Among2("sta", 125, 1),
    new Among2("dua", -1, 1),
    new Among2("mendua", 129, 1),
    new Among2("ordua", 129, 1),
    new Among2("lekua", -1, 1),
    new Among2("burua", -1, 1),
    new Among2("durua", -1, 1),
    new Among2("tsua", -1, 1),
    new Among2("tua", -1, 1),
    new Among2("mentua", 136, 1),
    new Among2("estua", 136, 1),
    new Among2("txua", -1, 1),
    new Among2("zua", -1, 1),
    new Among2("tzua", 140, 1),
    new Among2("za", -1, 1),
    new Among2("eza", 142, 1),
    new Among2("eroza", 142, 1),
    new Among2("tza", 142, 2),
    new Among2("koitza", 145, 1),
    new Among2("antza", 145, 1),
    new Among2("gintza", 145, 1),
    new Among2("kintza", 145, 1),
    new Among2("kuntza", 145, 1),
    new Among2("gabe", -1, 1),
    new Among2("kabe", -1, 1),
    new Among2("kide", -1, 1),
    new Among2("alde", -1, 1),
    new Among2("kalde", 154, 1),
    new Among2("talde", 154, 1),
    new Among2("orde", -1, 1),
    new Among2("ge", -1, 1),
    new Among2("zale", -1, 1),
    new Among2("tzale", 159, 1),
    new Among2("gile", -1, 1),
    new Among2("eme", -1, 1),
    new Among2("kume", -1, 1),
    new Among2("ne", -1, 1),
    new Among2("zione", 164, 1),
    new Among2("une", 164, 1),
    new Among2("gune", 166, 1),
    new Among2("pe", -1, 1),
    new Among2("aurre", -1, 1),
    new Among2("te", -1, 1),
    new Among2("kote", 170, 1),
    new Among2("arte", 170, 1),
    new Among2("oste", 170, 1),
    new Among2("etxe", -1, 1),
    new Among2("gai", -1, 1),
    new Among2("di", -1, 1),
    new Among2("aldi", 176, 1),
    new Among2("taldi", 177, 1),
    new Among2("geldi", 176, 8),
    new Among2("handi", 176, 1),
    new Among2("mendi", 176, 1),
    new Among2("gei", -1, 1),
    new Among2("egi", -1, 1),
    new Among2("degi", 183, 1),
    new Among2("tegi", 183, 1),
    new Among2("nahi", -1, 1),
    new Among2("ohi", -1, 1),
    new Among2("ki", -1, 1),
    new Among2("toki", 188, 1),
    new Among2("oi", -1, 1),
    new Among2("goi", 190, 1),
    new Among2("koi", 190, 1),
    new Among2("ari", -1, 1),
    new Among2("kari", 193, 1),
    new Among2("lari", 193, 1),
    new Among2("tari", 193, 1),
    new Among2("garri", -1, 2),
    new Among2("larri", -1, 1),
    new Among2("kirri", -1, 1),
    new Among2("duri", -1, 1),
    new Among2("asi", -1, 1),
    new Among2("ti", -1, 1),
    new Among2("ontzi", -1, 1),
    new Among2("\u00F1i", -1, 1),
    new Among2("ak", -1, 1),
    new Among2("ek", -1, 1),
    new Among2("tarik", -1, 1),
    new Among2("gibel", -1, 1),
    new Among2("ail", -1, 1),
    new Among2("kail", 209, 1),
    new Among2("kan", -1, 1),
    new Among2("tan", -1, 1),
    new Among2("etan", 212, 1),
    new Among2("en", -1, 4),
    new Among2("ren", 214, 2),
    new Among2("garren", 215, 1),
    new Among2("gerren", 215, 1),
    new Among2("urren", 215, 1),
    new Among2("ten", 214, 4),
    new Among2("tzen", 214, 4),
    new Among2("zain", -1, 1),
    new Among2("tzain", 221, 1),
    new Among2("kin", -1, 1),
    new Among2("min", -1, 1),
    new Among2("dun", -1, 1),
    new Among2("asun", -1, 1),
    new Among2("tasun", 226, 1),
    new Among2("aizun", -1, 1),
    new Among2("ondo", -1, 1),
    new Among2("kondo", 229, 1),
    new Among2("go", -1, 1),
    new Among2("ngo", 231, 1),
    new Among2("zio", -1, 1),
    new Among2("ko", -1, 1),
    new Among2("trako", 234, 5),
    new Among2("tako", 234, 1),
    new Among2("etako", 236, 1),
    new Among2("eko", 234, 1),
    new Among2("tariko", 234, 1),
    new Among2("sko", 234, 1),
    new Among2("tuko", 234, 1),
    new Among2("minutuko", 241, 6),
    new Among2("zko", 234, 1),
    new Among2("no", -1, 1),
    new Among2("zino", 244, 1),
    new Among2("ro", -1, 1),
    new Among2("aro", 246, 1),
    new Among2("igaro", 247, 9),
    new Among2("taro", 247, 1),
    new Among2("zaro", 247, 1),
    new Among2("ero", 246, 1),
    new Among2("giro", 246, 1),
    new Among2("oro", 246, 1),
    new Among2("oso", -1, 1),
    new Among2("to", -1, 1),
    new Among2("tto", 255, 1),
    new Among2("zto", 255, 1),
    new Among2("txo", -1, 1),
    new Among2("tzo", -1, 1),
    new Among2("gintzo", 259, 1),
    new Among2("\u00F1o", -1, 1),
    new Among2("zp", -1, 1),
    new Among2("ar", -1, 1),
    new Among2("dar", 263, 1),
    new Among2("behar", 263, 1),
    new Among2("zehar", 263, 7),
    new Among2("liar", 263, 1),
    new Among2("tiar", 263, 1),
    new Among2("tar", 263, 1),
    new Among2("tzar", 263, 1),
    new Among2("or", -1, 2),
    new Among2("kor", 271, 1),
    new Among2("os", -1, 1),
    new Among2("ket", -1, 1),
    new Among2("du", -1, 1),
    new Among2("mendu", 275, 1),
    new Among2("ordu", 275, 1),
    new Among2("leku", -1, 1),
    new Among2("buru", -1, 2),
    new Among2("duru", -1, 1),
    new Among2("tsu", -1, 1),
    new Among2("tu", -1, 1),
    new Among2("tatu", 282, 4),
    new Among2("mentu", 282, 1),
    new Among2("estu", 282, 1),
    new Among2("txu", -1, 1),
    new Among2("zu", -1, 1),
    new Among2("tzu", 287, 1),
    new Among2("gintzu", 288, 1),
    new Among2("z", -1, 1),
    new Among2("ez", 290, 1),
    new Among2("eroz", 290, 1),
    new Among2("tz", 290, 1),
    new Among2("koitz", 293, 1)
};

private final static Among2 a_2[] = {
    new Among2("zlea", -1, 2),
    new Among2("keria", -1, 1),
    new Among2("la", -1, 1),
    new Among2("era", -1, 1),
    new Among2("dade", -1, 1),
    new Among2("tade", -1, 1),
    new Among2("date", -1, 1),
    new Among2("tate", -1, 1),
    new Among2("gi", -1, 1),
    new Among2("ki", -1, 1),
    new Among2("ik", -1, 1),
    new Among2("lanik", 10, 1),
    new Among2("rik", 10, 1),
    new Among2("larik", 12, 1),
    new Among2("ztik", 10, 1),
    new Among2("go", -1, 1),
    new Among2("ro", -1, 1),
    new Among2("ero", 16, 1),
    new Among2("to", -1, 1)
};

private static final char g_v[] = {17, 65, 16 };

private int I_p2;
private int I_p1;
private int I_pV;


private boolean r_mark_regions() {
    // (, line 23
    I_pV = limit;
    I_p1 = limit;
    I_p2 = limit;
    // do, line 29
    int v_1 = cursor;
    lab0: {
        // (, line 29
        // or, line 31
        lab1: {
            int v_2 = cursor;
            lab2: {
                // (, line 30
                if (!(in_grouping(g_v, 97, 117)))
                {
                    break lab2;
                }
                // or, line 30
                lab3: {
                    int v_3 = cursor;
                    lab4: {
                        // (, line 30
                        if (!(out_grouping(g_v, 97, 117)))
                        {
                            break lab4;
                        }
                        // gopast, line 30
                        golab5: while(true)
                        {
                            lab6: {
                                if (!(in_grouping(g_v, 97, 117)))
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
                    // (, line 30
                    if (!(in_grouping(g_v, 97, 117)))
                    {
                        break lab2;
                    }
                    // gopast, line 30
                    golab7: while(true)
                    {
                        lab8: {
                            if (!(out_grouping(g_v, 97, 117)))
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
            // (, line 32
            if (!(out_grouping(g_v, 97, 117)))
            {
                break lab0;
            }
            // or, line 32
            lab9: {
                int v_6 = cursor;
                lab10: {
                    // (, line 32
                    if (!(out_grouping(g_v, 97, 117)))
                    {
                        break lab10;
                    }
                    // gopast, line 32
                    golab11: while(true)
                    {
                        lab12: {
                            if (!(in_grouping(g_v, 97, 117)))
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
                // (, line 32
                if (!(in_grouping(g_v, 97, 117)))
                {
                    break lab0;
                }
                // next, line 32
                if (cursor >= limit)
                {
                    break lab0;
                }
                cursor++;
            }
        }
        // setmark pV, line 33
        I_pV = cursor;
    }
    cursor = v_1;
    // do, line 35
    int v_8 = cursor;
    lab13: {
        // (, line 35
        // gopast, line 36
        golab14: while(true)
        {
            lab15: {
                if (!(in_grouping(g_v, 97, 117)))
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
        // gopast, line 36
        golab16: while(true)
        {
            lab17: {
                if (!(out_grouping(g_v, 97, 117)))
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
        // setmark p1, line 36
        I_p1 = cursor;
        // gopast, line 37
        golab18: while(true)
        {
            lab19: {
                if (!(in_grouping(g_v, 97, 117)))
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
        // gopast, line 37
        golab20: while(true)
        {
            lab21: {
                if (!(out_grouping(g_v, 97, 117)))
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
        // setmark p2, line 37
        I_p2 = cursor;
    }
    cursor = v_8;
    return true;
}

private boolean r_RV() {
    if (!(I_pV <= cursor))
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

private boolean r_R1() {
    if (!(I_p1 <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_aditzak() {
    int among_var;
    // (, line 47
    // [, line 48
    ket = cursor;
    // substring, line 48
    among_var = find_among_b(a_0);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 48
    bra = cursor;
    switch (among_var) {
        case 1:
            // (, line 59
            // call RV, line 59
            if (!r_RV())
            {
                return false;
            }
            // delete, line 59
            slice_del();
            break;
        case 2:
            // (, line 61
            // call R2, line 61
            if (!r_R2())
            {
                return false;
            }
            // delete, line 61
            slice_del();
            break;
        case 3:
            // (, line 63
            // <-, line 63
            slice_from("atseden");
            break;
        case 4:
            // (, line 65
            // <-, line 65
            slice_from("arabera");
            break;
        case 5:
            // (, line 67
            // <-, line 67
            slice_from("baditu");
            break;
    }
    return true;
}

private boolean r_izenak() {
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
    switch (among_var) {
        case 1:
            // (, line 103
            // call RV, line 103
            if (!r_RV())
            {
                return false;
            }
            // delete, line 103
            slice_del();
            break;
        case 2:
            // (, line 105
            // call R2, line 105
            if (!r_R2())
            {
                return false;
            }
            // delete, line 105
            slice_del();
            break;
        case 3:
            // (, line 107
            // <-, line 107
            slice_from("jok");
            break;
        case 4:
            // (, line 109
            // call R1, line 109
            if (!r_R1())
            {
                return false;
            }
            // delete, line 109
            slice_del();
            break;
        case 5:
            // (, line 111
            // <-, line 111
            slice_from("tra");
            break;
        case 6:
            // (, line 113
            // <-, line 113
            slice_from("minutu");
            break;
        case 7:
            // (, line 115
            // <-, line 115
            slice_from("zehar");
            break;
        case 8:
            // (, line 117
            // <-, line 117
            slice_from("geldi");
            break;
        case 9:
            // (, line 119
            // <-, line 119
            slice_from("igaro");
            break;
        case 10:
            // (, line 121
            // <-, line 121
            slice_from("aurka");
            break;
    }
    return true;
}

private boolean r_adjetiboak() {
    int among_var;
    // (, line 125
    // [, line 126
    ket = cursor;
    // substring, line 126
    among_var = find_among_b(a_2);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 126
    bra = cursor;
    switch (among_var) {
        case 1:
            // (, line 129
            // call RV, line 129
            if (!r_RV())
            {
                return false;
            }
            // delete, line 129
            slice_del();
            break;
        case 2:
            // (, line 131
            // <-, line 131
            slice_from("z");
            break;
    }
    return true;
}

public boolean stem() {
    // (, line 137
    // do, line 138
    // call mark_regions, line 138
    r_mark_regions();
    // backwards, line 139
    limit_backward = cursor;
    cursor = limit;
    // (, line 139
    // repeat, line 140
    while(true)
    {
        int v_2 = limit - cursor;
        lab0: {
            // call aditzak, line 140
            if (!r_aditzak())
            {
                break lab0;
            }
            continue;
        }
        cursor = limit - v_2;
        break;
    }
    // repeat, line 141
    while(true)
    {
        int v_3 = limit - cursor;
        lab1: {
            // call izenak, line 141
            if (!r_izenak())
            {
                break lab1;
            }
            continue;
        }
        cursor = limit - v_3;
        break;
    }
    // do, line 142
    int v_4 = limit - cursor;
    // call adjetiboak, line 142
    r_adjetiboak();
    cursor = limit - v_4;
    cursor = limit_backward;
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof basqueStemmer;
}

@Override
public int hashCode() {
    return basqueStemmer.class.getName().hashCode();
}



}

