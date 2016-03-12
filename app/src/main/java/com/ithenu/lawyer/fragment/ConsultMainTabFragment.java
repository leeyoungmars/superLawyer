package com.ithenu.lawyer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.ithenu.lawyer.R;
import com.ithenu.lawyer.bean.ItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mars on 2016/3/10.
 */
public class ConsultMainTabFragment extends Fragment {
    private ListView listView;
    public static ConsultMainTabFragment instance = null;//编写单例模式
    public static ConsultMainTabFragment getInstance(){
        if (instance == null){
            instance = new ConsultMainTabFragment();
        }
        return instance;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.consultfragment,container,false);
    }
}
