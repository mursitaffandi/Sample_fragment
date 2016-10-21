package id.co.imastudio.sample_fragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.co.imastudio.sample_fragment.fragment.Tab1Fragment;
import id.co.imastudio.sample_fragment.fragment.Tab2Fragment;

/**
 * Created by imastudio on 10/21/16.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    // name of tab
    String[] title = new String[]{"Tab1", "Tab2"};

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // method manipulator flagment from class
    @Override
    public Fragment getItem(int position) {
        Fragment fra = null;
        switch (position) {
            case 0:
                fra = new Tab1Fragment();
                break;
            case 1:
                fra = new Tab2Fragment();
                break;

            default:
                fra = null;
                break;
        }
        return fra;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

}
