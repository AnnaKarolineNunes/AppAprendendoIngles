package com.cursoandroid.appaprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.cursoandroid.appaprendaingles.Fragment.BichosFragment;
import com.cursoandroid.appaprendaingles.Fragment.NumerosFragment;
import com.cursoandroid.appaprendaingles.Fragment.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {
    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.viewpagertab);
        viewPager = findViewById(R.id.viewpager);

        // remove a marcação da action bar
        getSupportActionBar().setElevation(0);

        // configurar o adapter para as abas
        FragmentPagerAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), // recupera o fragment manager
                FragmentPagerItems.with(this)
                        .add("Bichos", BichosFragment.class)
                        .add("números", NumerosFragment.class)
                        .add("vogais", VogaisFragment.class)// adiciona as abas
                        .create()
        );
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
