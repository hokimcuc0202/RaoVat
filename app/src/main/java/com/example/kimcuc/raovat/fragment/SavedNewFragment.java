// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.example.kimcuc.raovat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.kimcuc.raovat.R;


public class SavedNewFragment extends Fragment
{

    ImageView imageView_icon_1;
    ImageView imageView_icon_2;
    ImageView imageView_icon_3;
    int img;
    String nameFragment;

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View v = layoutinflater.inflate(R.layout.fragment_savednew, viewgroup, false);
        return v;
    }
}
