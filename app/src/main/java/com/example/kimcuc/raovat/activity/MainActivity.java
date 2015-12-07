package com.example.kimcuc.raovat.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.kimcuc.raovat.DTO.list_menu;
import com.example.kimcuc.raovat.R;
import com.example.kimcuc.raovat.adapter.ListMenuAdapter;
import com.example.kimcuc.raovat.fragment.HomeFragment;
import com.example.kimcuc.raovat.fragment.SavedNewFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DrawerLayout mDrawerLayout;
    ImageView mBtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        HomeFragment home = new HomeFragment();
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(R.id.container, home);
        fragmenttransaction.commit();
        initView();
        addlist();
        control();
        attachMenu();
    }

    public void control()
    {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mBtnMenu = (ImageView) findViewById(R.id.btn_menubar);
        mBtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ds=new ListMenuAdapter(getBaseContext(),R.layout.menu_list_menu,list);
                lv.setAdapter(ds);
                mDrawerLayout.openDrawer(Gravity.START);
               // mBtnMenu.setVisibility(View.INVISIBLE);
            }
        });
    }
    com.example.kimcuc.raovat.DTO.list_menu list_menu;
    List<list_menu> list  = new ArrayList<>();;
    ListMenuAdapter ds;
    ListView lv;
    String name[] = {"Tin đã lưu","Khuyến mãi","Trợ giúp"};
    int image[] = {R.drawable.icon_heart,R.drawable.icon_discount,R.drawable.icon_help};

    public void addlist()
    {

        for(int i=0;i<name.length;i++)
        {
            list_menu = new list_menu();
            list_menu.setImage(image[i]);
            list_menu.setName(name[i]);
            list.add(list_menu);
        }

    }

    public  void initView()
    {
        lv               = (ListView) findViewById(R.id.menu_listview);
    }


    public void attachMenu()
    {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        SavedNewFragment savedNew = new SavedNewFragment();
                        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.replace(R.id.container, savedNew);
                        fragmenttransaction.commit();
                        mDrawerLayout.closeDrawers();
                        break;
                    case 1:

                        break;
                    case 2:

                    break;

                }
            }
        });
    }

}
