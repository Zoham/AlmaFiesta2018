package iitbbs.almafiesta;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

@SuppressLint("ValidFragment")
public class dataFragment extends Fragment {
    View view;
    ViewPager viewPager;
    TabLayout tabLayout;

    List<Fragment> frags;

    char menu;

    @SuppressLint("ValidFragment")
    public dataFragment(char menuNo)
    {
        menu = menuNo;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.sample, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new sliderAdapter(getChildFragmentManager()));
        tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs);
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        frags = new Vector<Fragment>();
        setFrags();

        return view;
    }

    void setFrags()
    {
        frags = new Vector<Fragment>();
        switch(menu)
        {
            case 'n':
                for(int i=0; i<2; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'p':
                break;
            case 't':
                for(int i=0; i<12; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'm':
                for(int i=0; i<5; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'c':
                for(int i=0; i<3; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'd':
                for(int i=0; i<3; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'l':
                for(int i=0; i<5; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'a':
                for(int i=0; i<2; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'q':
                for(int i=0; i<2; i++)
                    frags.add(new contentFragment(menu,i));
                break;
            case 'f':
                for(int i=0; i<4; i++)
                    frags.add(new contentFragment(menu,i));
                break;
        }
    }

    private class sliderAdapter extends FragmentPagerAdapter{

        String tabs[]={"Chief", "G-Sec Socio Cultural", "Public Relations", "Media and Marketing", "Hospitality", "MUN", "Pronites", "Sponsorship", "Events", "Transportation","Web Development", "Design and Decor"};
        public sliderAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return frags.get(position);
        }

        @Override
        public int getCount() {
            int count=0;
            switch(menu)
            {
                case 'n':
                    count=2;
                    break;
                case 'p':
                    break;
                case 't':
                    count=12;
                    break;
                case 'm':
                    count=5;
                    break;
                case 'c':
                    count=3;
                    break;
                case 'd':
                    count=3;
                    break;
                case 'l':
                    count=5;
                    break;
                case 'a':
                    count=2;
                    break;
                case 'q':
                    count=2;
                    break;
                case 'f':
                    count=4;
                    break;
            }
            return count;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            switch(menu)
            {
                case 'n':
                    tabs = new String[]{"News", "Gallery"};
                    break;
                case 'p':
                    break;
                case 't':
                    tabs = new String[]{"Chief", "G-Sec Socio Cultural", "Public Relations", "Media and Marketing", "Hospitality", "MUN", "Pronites", "Sponsorship", "Events", "Transportation","Web Development", "Design and Decor"};
                    break;
                case 'm':
                    tabs = new String[]{"Euphony", "Upbeat", "Track The Track", "Duetto", "Unplugged"};
                    break;
                case 'c':
                    tabs = new String[]{"Rip-Out", "Topsy Turvy", "Rab Ne Bana Di Jodi"};
                    break;
                case 'd':
                    tabs = new String[]{"Face Off", "N Circled", "Spot-Light"};
                    break;
                case 'l':
                    tabs = new String[]{"Litspree","IIT BBSR MUN", "Parliamentary Debate", "Seedha Samvad", "Drishtikon"};
                    break;
                case 'a':
                    tabs = new String[]{"Shaedz", "Rangoli"};
                    break;
                case 'q':
                    tabs = new String[]{"Biz Quiz", "Youth Quiz"};
                    break;
                case 'f':
                    tabs = new String[]{"Ad Making", "Pic Of The Day", "Short Film Making", "Documentary Making"};
                    break;
            }

            return tabs[position];
        }
    }
}