package com.TCoding.zelmesajlarprojesi.Bayramlar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.TCoding.zelmesajlarprojesi.Adapters.Bayram_mesaj_adapter;
import com.TCoding.zelmesajlarprojesi.Adapters.CumeMesajlariAdapter;
import com.TCoding.zelmesajlarprojesi.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import java.util.ArrayList;

public class RamazanFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> bayram ;
    public RamazanFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cuma,container,false);
        rv = v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new Bayram_mesaj_adapter(getContext(),bayram);
        rv.setAdapter(adapter);
        mAdView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bayram = new ArrayList<>();
        bayram.add("Bu mübarek günde yüreğinizin huzur ve mutlulukla dolması niyetiyle Ramazan bayramınız mübarek olsun.");
        bayram.add("Bu bayramda gönlünüz dertlerinden arınmış, tüm gözyaşlarınız dinmiş olsun. Yüzünüz de hep gülümseme, kalbiniz huzurla dolsun. Ramazan Bayramı'nız kutlu olsun.");
        bayram.add("Dua Kapılarının Ağzına Kadar Açık, bela Ve Kötülüklerin Arındırıldığı Bu Güzel Günde Bayramınızı Tüm Sevdiklerinizle Birlikte Hayırlı ve Mutlu geçirmeniz Dileğiyle Mübarek ramazan Bayramınızı Kutlarım.");
        bayram.add("İslam'ın nurlu güneşi kalbine dolsun, makamın cennet Hz. Muhammed komşun olsun, günlerin mutluluk, gönlün saadetle dolsun bayramın mübarek olsun.");
        bayram.add("Benim ömrümde ırmaklar vardır sularında hayallerimi yüzdürdüğüm, benim ömrümde sevdiklerim vardır bayramlar ayrı geçince üzüldüğüm. Bayramınız mübarek olsun!");
        bayram.add("Güzel Düşünceler Nefeslere Dolarsa Güzel Dualar Olur, Dua ise Yüce ALLAH'a Gider Nur Olur, Gökyüzünde Buluşan Dualarımızın NurLanması ümidiyle Bayramınızı Kutlarım..");
        bayram.add("Dünya'da ve ahirette hakiki bayramları yapabilmek temennisiyle Ramazan Bayramınızı kutlar, hayırlara vesile olmasını temenni ederim.");
        bayram.add("Dostluğu, sevgiyi ve geleceği… Aşımızı, ekmeğimizi, soframızı… Hüznümüzü, acımızı, yalnızlığımızı paylaştığımız; birlik ve beraberliğimizi, kardeşlik ve dostluğumuzu en sıcak şekilde hissedeceğimiz mübarek Ramazan Bayramınızı tebrik eder, mutluluklar dilerim.");
        bayram.add("Çılgınca Esen Rüzgar, Kavurucu Güneşli terleten günler, Yıldızlarla Dolu Bir Dünyadır Bayramlar, Ramazan Bayramınız Mübarek olsun herşey istediğiniz Gibi Olsun inşallah.");
        bayram.add("Yürekten bir dua, tatlı bir tebessüm, sıcak bir mesaj, kapatır mesafeleri, birleştirir gönülleri. Kalbiniz nur, eviniz huzur dolsun, Ramazan Bayramınız mübarek olsun.");

        bayram.add("Yüreğine damla damla umut, günlerine bin tatlı mutluluk dolsun. Sevdiklerin hep yanında olsun, yüzün ve gülün hiç solmasın. Bayramın kutlu olsun...");
        bayram.add("Gecenin güzel yüzü yüreğine dokunsun, kabuslar senden uzakta melekler başucunda olsun, güneş öyle bir geceye doğsun ki, duaların kabul ve Ramazan Bayramın mübarek olsun!");
        bayram.add("Şu beş gecede yapılan dua geri çevrilmez. Regaib gecesi, Berat gecesi, Cuma gecesi, Ramazan ve Kurban bayramı gecesi. (Hadis-i Şerif) Selam ve dua ile hayırlı bayramlar.");
        bayram.add("Küskünlerin barıştığı, sevenlerin biraraya geldiği, rahmetle ve şefkatle dolu günlerin en değerlilerinden olan Ramazan Bayramınız kutlu olsun.");
        bayram.add("Güzellik, birlik, beraberlik dolu, her zaman bir öncekinden daha güzel ve mutlu bir Bayram diliyoruz. Büyüklerimizin ellerinden küçüklerimizin gözlerinden öpüyoruz.");
        bayram.add("Bu bayramda gönlünüz dertlerinden arınmış, tüm gözyaşlarınız dinmiş olsun. Yüzünüz de hep gülümseme, kalbiniz huzurla dolsun. Ramazan Bayramı'nız kutlu olsun.");
        bayram.add("Kalpler vardır sevgiyi yaşatmak için, insanlar vardır dostluğu paylaşmak için ve bayramlar vardır sevgi ile kucaklaşmak için. Ramazan Bayramınızı kutlarım.");
        bayram.add("Vesile olalım kardeşliğe ve barışa. Yorulalım hepimiz yarınki uğraşa. Erişelim birlikte nice bayramlara. Mübarek ramazan bayramınızı en içten dileklerimle kutlarım.");
        bayram.add("Mübarek Ramazan Bayramının size ve sevdiklerinize mutluluk, huzur ve refah getirmesi dileğiyle. Ramazan bayramınız mübarek olsun.. .");
        bayram.add("Rabbim nefsimize celaliyle, kalbimize cemaliyle, hayatımıza hikmetiyle, hatalarımıza rahmetiyle, mahşerde Muhammediyle yardım etsin inşallah. Hayırlı Bayramlar");


        bayram.add("Ümmetin birlik ve beraberliğinin daim olmasına, kanın durmasına; sevgi, hoşgörü ve barışın hakim olmasına vesile olması dileğiyle Ramazan Bayramınız Mübarek Olsun");
        bayram.add("En güzel günler sizin olsun. Yüzünüzde hep gülücük hayatınız da yüzünüz kadar güzel olsun. Ramazan Bayramınız mutlu olsun…");
        bayram.add("Şeker tadında bir Ramazan Bayramı diler her şeyin kalbiniz kadar güzel olmasını temenni ederiz iyi bayramlar");
        bayram.add("En kötü gününüz bu Ramazan Bayramı'ndaki gibi güzel olsun… Bayramınız kutlu olsun…");
        bayram.add("Sofranız afiyetli, paranız bereketli, kararlarınız isabetli, yuvanız muhabbetli, Kalbiniz merhametli, bedeniniz sıhhatli, yüzünüz mutlu, bayramınız kutlu olsun.");
        bayram.add("En delice esen seher yeli, en güneşli günler, en parlak gecedir bayramlar. Ramazan Bayramınız kutlu, her şey gönlünüzce olsun.");
        bayram.add("Adaletin terazisi, Varlığın Yaratıcısı, merhametin tek göstergesi Olan Yüce Yaratan ALLAH Hayırlı Dualarda Bulunan Muminlerinin Dualarını Kabul Eder, Bu hayırlı bayramda Dualarımız Yüce ALLAH a Mübarek Ramazan Bayramınız Hayırlara Vesile Olur inşallah.");
        bayram.add("Bizi yataran ALLAH a şükürler Olsun, Bütün müslümanlara Hayırlı Olsun, Ramazan Bayramınız Mübarek Olsun.");
        bayram.add("Damağınızı, ruhunuzu ve çevrenizi tadlandıran, mutlu, umutlu, bereketli bir bayram dileriz.");
        bayram.add("11 Ayın Sultanı Ramazanın Soframıza Getirdiği Bolluk Gibi Bu Bayramda Bol bol içinizde Huzur Olsun, Bayramınız Mübarek Olsun.");


        bayram.add("Karnın şekerle dolsun yanakların öpülmekten solsun cüzdanını bücürler soysun bayramın kutlu olsun.");
        bayram.add("Bu gün yüzün öpülmekten solsun, miden 5 kg şekerle dolsun, cüzdanını bücürler soysun, gönlün huzura doysun, bayramınız kutlu ve mutlu olsun.");

    }
}
