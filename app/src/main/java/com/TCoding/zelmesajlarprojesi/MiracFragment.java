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

public class MiracFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> mesaj ;
    public MiracFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_beraat,container,false);
        rv = v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new Bayram_mesaj_adapter(getContext(),mesaj);
        rv.setAdapter(adapter);
        mAdView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mesaj = new ArrayList<>();
        mesaj.add("Ellerin duaya uzandığı, sinelerin dostlara açıldığı, gözlerin masumiyet aradığı bu mübarek günde tüm dualarınız kabul olması dileğiyle iyi kandiller!");

        mesaj.add("Yağmur yüklü bulutlar gibi gelen, eteğindeki hayır cevherlerini basımıza boşaltan ve bizlere mutluluk veren kandilin, büyüsüne kapılmanız dileğiyle Nice kandiller.");
        mesaj.add("Güneşin güzel yüzü, yüreğine dokunsun, kabuslar senden uzakta, melekler baş ucunda dursun. Güneş öyle bir geceye doğsun ki, duaların kabul, kandilin mübarek olsun.");
        mesaj.add("Bugün ellerini semaya gönlünü Mevla’ya aç, bugün günahlardan olabildiğince kaç, bugün en gizli incilerini onun için saç. Çünkü bugün Miraç kandili, kandilin mübarek olsun.");
        mesaj.add("Ey Allahım bana verdiğin şeyin sonunda senin rızan ve cennetin olsun.Miraç kandiliniz mübarek olsun.");
        mesaj.add("Bin damla serpilsin yüreğine, bin tatlı mutluluk dolsun günlerine, bin bir hayalin gerçekleri bulsun, her türlü duaların kabul olsun, kandilin mübarek olsun");
        mesaj.add("Bu güzel gecelerin feyzi üzerinize, rahmeti geçmişinize, bereketi evinize, nuru ahiretinize, sıcaklığı yuvanıza dolsun. Kandiliniz mübarek olsun.");
        mesaj.add("İlahi esintilerin kalpleri okşadığı, bir anın bir asra bedel olduğu bu gece dualarda birleşmek dileğiyle… Kandilinizi en içten dileklerimle kutlarım.");
        mesaj.add("Af ve namazın müjdeleyicisi Miraç Kandili'miz mübarek olsun. Allah dualarımızı kabul etsin İnşaallah. Hayırlı kandiller.");
        mesaj.add("Alemlere rahmet olarak gönderilen Hz. Peygamberimizin miraca çıkmasıyla bize verilen müjdeye nail olan ümmetin Miraç Kandili mübarek olsun.");
        mesaj.add("Allah'ım! Recep ve Şaban'ı hakkımızda mübarek eyle, bize Ramazan'a ulaştır. Miraç Kandiliniz mübarek olsun.");

        mesaj.add("Tüm Müslüman aleminin mübarek Miraç Kandili'ni kutluyorum… Bu hayırlı günde Allah 'Barış, Huzur, Sağlık' nasip etsin.");
        mesaj.add("Allah'ım! Lütfundan bize rızk ver, bizi rızkından mahrum etme, bize verdiğin rızıkları bizim için bereketli yap, katında bulunan nimetlere rağbetimizi arttır ve bizi gönül zengini eyle. (İbn Ebi Şeybe, Dua, 42) Kandiliniz mübarek olsun.");
        mesaj.add("Miraç Kandilimiz mübarek olsun bu mirac gecemizin ülkemiz ve İslam aleminin miracı olması dileği ile… Hayırlı kandiller diliyorum.");
        mesaj.add("Rabbim sen affedicisin, affetmesini seven ve bilensin. Sen bizleri mübarek Miraç kandili hatırına affı mağfiret eyle. Hayırlı Kandiller.");
        mesaj.add("Bu gece hayırlı bir gece, yüreklerimiz ibadetle çarpsın, gönüllerimiz bir olsun. Miraç Kandiliniz mübarek olsun...");
        mesaj.add("'Ben, beni seven ümmetimi almadan cennete girmem' diyen Sevgilinin (s.a.s.) ümmeti olmanın hakkını verebilmek duası ile… Miraç Kandiliniz mübarek olsun.");
        mesaj.add("Bir kandil gülü savur sevdiklerine, size onlardan gülücükler getirsin öyle içten öyle samimi ol ki gözyaşlarını bile tebessüme çevirsin. Kandiliniz mübarek olsun.");
        mesaj.add("Allah gönlünüzden geçen her duayı hakkınızda hayırlı ise kabul etsin… Miraç Kandiliniz mübarek olsun.");
        mesaj.add("Bedeniniz sıhhatli, yüzünüz mutlu, Miraç Kandiliniz mübarek olsun.");
        mesaj.add("Tüm İslam aleminin Miraç Kandili kutlu olsun. Böyle mübarek bir günde tüm dualarımızın kabul olması dileğiyle. Herkese hayırlı günler.");

        mesaj.add("Dertlerimiz kum tanesi kadar küçük, sevinçlerimiz Nisan yağmuru kadar bol olsun. Bu mübarek geceniz sevapla dolsun. Kandiliniz mübarek olsun.");
        mesaj.add("Gül sevginin tacıdır, her bahar bir gül taçlanır. O gül ki Muhammed'i (s.a.s.) hatırlatır. Onu hatırlayana gül koklatır. Gül kokulu sevgi dolu nice gecelere. Kandiliniz mübarek olsun.");
        mesaj.add("Yağmurun toprağa hayat verdiği gibi dualarında hayat bulacağı bu gecede dua bahçesinde yeşeren fidan olmak dileğiyle kandiliniz mübarek olsun.");
        mesaj.add("Ey Rabbim! Yalvarışım rahmetine güvenimden, her şey kudretinden, içimdeki kırık kalp Allah derken, rahmetini esirgeme üzerimizden! Miraç Kandiliniz mübarek olsun.");
        mesaj.add("Allah'ın rahmeti, bereketi sizinle olsun, gönül güneşiniz hiç solmasın, yüzünüz aydın olsun, kabriniz nur dolsun, makamınız Firdevs, dualarınız kabul olsun. Kandiliniz kutlu olsun...");
        mesaj.add("Avuçların açıldığı, gözlerin yaşardığı, ilahi esintilerin kalpleri okşadığı anın bir asra bedel olduğu bu gece dualarda birleşmek dileğiyle kandilinizi kutlarım.");
        mesaj.add("Dualarımız bu gece eksik olmasın, kalplerimiz imanla dolsun, kandiliniz mübarek olsun!");
    }
}
