package com.fouad.chf.materialdesign;

import android.os.Build;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
   // FrameLayout simpleFrameLayout;
ViewPager simpleFrameLayout ;

    TabItem tabChats;
    TabItem tabStatus;
    TabItem tabCalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.justbit_layout);
        //simpleFrameLayout = (FrameLayout) findViewById(R.id.simpleFrameLayout);
        simpleFrameLayout = (ViewPager) findViewById(R.id.viewPager);
        TabLayout   tabLayout = (TabLayout) findViewById(R.id.simpleTabLayout);


        tabChats = findViewById(R.id.tabChats);
        tabStatus = findViewById(R.id.tabStatus);
        tabCalls = findViewById(R.id.tabCalls);
       /* adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Tab 1");
        adapter.addFragment(new SecondFragment(), "Tab 2");
        adapter.addFragment(new ThirdFragment(), "Tab 3");
        simpleFrameLayout.setAdapter(adapter);
        tabLayout.setupWithViewPager(simpleFrameLayout);*/





        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("First Tab");
        firstTab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(firstTab);


        TabLayout.Tab seconddTab = tabLayout.newTab();
        seconddTab.setText("Second Tab");
        seconddTab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(seconddTab);

        TabLayout.Tab thirdTab = tabLayout.newTab();
        thirdTab.setText("Third Tab");
        thirdTab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(thirdTab);










       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                simpleFrameLayout.setCurrentItem(tab.getPosition());
               /* Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new FirstFragment();
                        break;
                    case 1:
                        fragment = new SecondFragment();
                        break;
                    case 2:
                        fragment = new ThirdFragment();
                        break;
                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.simpleFrameLayout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();*/

                if (tab.getPosition() == 1) {

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                              R.color.colorAccent));
                        Toast.makeText(MainActivity.this, "You clicked on the " +tab.getText().toString() + " at Position -> " + tab.getPosition() + "!", Toast.LENGTH_SHORT).show();

                    }
                } else if (tab.getPosition() == 2) {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                android.R.color.darker_gray));
                        Toast.makeText(MainActivity.this, "You clicked on the " +tab.getText().toString() + " at Position -> " + tab.getPosition() + "!", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                R.color.colorPrimaryDark));
                        Toast.makeText(MainActivity.this, "You clicked on the " +tab.getText().toString() + " at Position -> " + tab.getPosition() + "!", Toast.LENGTH_SHORT).show();
                    }
                }



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        simpleFrameLayout.setAdapter(pageAdapter);
        simpleFrameLayout.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));




    }
}
