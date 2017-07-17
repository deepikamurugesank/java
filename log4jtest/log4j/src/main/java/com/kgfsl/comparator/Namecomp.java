package com.kgfsl.comparator;

import java.util.Comparator;

public class Namecomp implements Comparator<Studentpojo>
{
    public int compare(Studentpojo s1,Studentpojo s2)
    {
        return s1.name.compareTo(s2.name);

    }
}