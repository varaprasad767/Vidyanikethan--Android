package com.example.tabsnavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    private int[] image={R.drawable.message,R.drawable.message,
            R.drawable.message};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.pager);
        tabLayout=findViewById(R.id.tab);

        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);

        seticons();
    }

    private void seticons()
    {
        tabLayout.getTabAt(0).setIcon(image[0]);
        tabLayout.getTabAt(1).setIcon(image[1]);
        tabLayout.getTabAt(2).setIcon(image[2]);
    }

    public class MyAdapter extends FragmentStatePagerAdapter
    {

        public MyAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:return new Chats();
                case 1:return new Status();
                case 2:return new Calls();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position)
            {
                case 0:return "Chats";
                case 1:return "Status";
                case 2:return "Calls";
            }
            return super.getPageTitle(position);
        }
    }


}
