package com.laligadecider.tabswithswipe;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements android.support.v7.app.ActionBar.TabListener {

    int bPos,aPos,rPos;
    int counterB,counterA,counterR;
    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private android.app.ActionBar actionBar;

    private String[] tabs = { "Table", "Fixtures" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for (String tab_name : tabs) {
            getSupportActionBar().addTab(getSupportActionBar().newTab().setText(tab_name)
                    .setTabListener(this));
        }

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                getSupportActionBar().setSelectedNavigationItem(position);


            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }




    @Override
    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
    }

}

