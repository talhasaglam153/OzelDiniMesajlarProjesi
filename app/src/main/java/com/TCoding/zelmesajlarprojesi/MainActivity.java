package com.TCoding.zelmesajlarprojesi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.TCoding.zelmesajlarprojesi.Bayramlar.BeraatFragment;
import com.TCoding.zelmesajlarprojesi.Bayramlar.CumaFragment;
import com.TCoding.zelmesajlarprojesi.Bayramlar.FragmentMevlud;
import com.TCoding.zelmesajlarprojesi.KadirGecesiFragment;
import com.TCoding.zelmesajlarprojesi.Bayramlar.KurbanBayramiFragment;
import com.TCoding.zelmesajlarprojesi.Bayramlar.MiracFragment;
import com.TCoding.zelmesajlarprojesi.Bayramlar.RamazanFragment;
import com.TCoding.zelmesajlarprojesi.Bayramlar.RegaipFragment;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  implements  NavigationView.OnNavigationItemSelectedListener{
    private Toolbar toolbar2;
    private NavigationView nav;
    private DrawerLayout drawer;
    private Fragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar2 = findViewById(R.id.toolbar2);
        toolbar2.setTitle("Özel Mesajlar Uygulaması");
        toolbar2.setTitleTextColor(Color.WHITE);
        nav = findViewById(R.id.nav);
        drawer = findViewById(R.id.drawer);
        fragment = new CumaFragment();
        setSupportActionBar(toolbar2);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentTutucu,fragment).commit();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar2,0,0);

        drawer.addDrawerListener(toggle);
        toggle.syncState();
        View v = nav.inflateHeaderView(R.layout.nav_drawer);

        nav.setNavigationItemSelectedListener(this);

        }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START))
            drawer.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
      if(item.getItemId()==R.id.item_cuma){
          fragment = new CumaFragment();
          toolbar2.setTitle("Cuma Mesajları");
      }
      if(item.getItemId()==R.id.item_kurban){
          fragment = new KurbanBayramiFragment();
          toolbar2.setTitle("Kurban Bayramı Mesajları");
      }
      if(item.getItemId()==R.id.item_ramazan){
          fragment = new RamazanFragment();
          toolbar2.setTitle("Ramazan Bayramı Mesajları");
      }
      if(item.getItemId()==R.id.item_beraat){
          fragment = new BeraatFragment();
          toolbar2.setTitle("Beraat Kandili Mesajları");
      }
      if(item.getItemId()==R.id.item_mevlud){
          fragment = new FragmentMevlud();
          toolbar2.setTitle("Mevlid Kandili Mesajları");
      }
      if(item.getItemId()==R.id.item_mirac){
          fragment = new MiracFragment();
          toolbar2.setTitle("Miraç Kandili Mesajları");
      }
      if(item.getItemId()==R.id.item_regaip){
            fragment = new RegaipFragment();
            toolbar2.setTitle("Regaip Kandili Mesajları");
      }
      if(item.getItemId()==R.id.item_kadir_gecesi){
          fragment = new KadirGecesiFragment();
          toolbar2.setTitle("Kadir Gecesi Mesajları");
      }
      if(item.getItemId()==R.id.item_mevlana){
          fragment = new MevlanaFragment();
          toolbar2.setTitle("Mevlana Sözleri");
      }

        if(item.getItemId()==R.id.item_siirler){
            fragment = new SiirlerFragment();
            toolbar2.setTitle("Şiirler");
        }

      getSupportFragmentManager().beginTransaction().replace(R.id.fragmentTutucu,fragment).commit();
      drawer.closeDrawer(GravityCompat.START);
      return true;

    }
}

