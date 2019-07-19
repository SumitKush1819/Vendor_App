package com.example.vendor_app.Sp_Technical_Support;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Technical_Support_Adapter extends FragmentPagerAdapter {

    public Technical_Support_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                New_calls_fragment newCallsFragment = new New_calls_fragment();
                return newCallsFragment;

            case 1:
                Call_Summary_Fragment callSummaryFragment = new Call_Summary_Fragment();
                return callSummaryFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){

            case 0:
                return "New Calls";

            case 1:
                return "Call Summary";

            default:
                return null;
        }
    }

}
