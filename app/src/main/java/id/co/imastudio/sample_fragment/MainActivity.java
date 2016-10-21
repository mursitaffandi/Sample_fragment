package id.co.imastudio.sample_fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import id.co.imastudio.sample_fragment.adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewpager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sett toolbar
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Tab");

        // inisialisasion tab and viewpager
        viewpager = (ViewPager)findViewById(R.id.pager);
        tabLayout = (TabLayout)findViewById(R.id.tabs);

        //set object adapter into viewpager
        viewpager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //manipulation text color on title tab
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),
                getResources().getColor(android.R.color.white));


        // set tab to viewpager
        tabLayout.setupWithViewPager(viewpager);

        //gravity fill for propostional between tab
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }


}
