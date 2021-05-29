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

public class FragmentMevlud extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> mesaj ;
    public FragmentMevlud() {
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
        mesaj.add("Sofranız afiyetli, paranız bereketli, kararlarınız isabetli, yuvanız muhabbetli, kalbiniz merhametli, bedeniniz sıhhatli, yüzünüz mutlu, Mevlid Kandiliniz Mübarek Olsun.");
        mesaj.add("Bir kandil gülü savur sevdiklerine, size onlardan gülücükler getirsin öyle içten öyle samimi ol ki göz yaşlarını bile tebessüme çevirsin. Mevlid Kandiliniz mübarek olsun.");
        mesaj.add("Talihiniz gözleriniz kadar berrak, kaderiniz bakışınız kadar güzel, umudunuz yarın kadar yakın, yarınınız aşkınız kadar mutlu, aşkınız Mevlid kadar mukaddes, dualarınız istediğiniz gibi makbul olsun.");
        mesaj.add("Bakiler sevgiler adına nice dilekler vardır. Ölümü bile ayırır saymayan gönüller vardır. Mesafeler araya set çekmişse ne çıkar, dualarda birleşen gönüller vardır. Mevlid Kandiliniz Mübarek Olsun");
        mesaj.add("Ruhu Aşk ve muhabbet mührüyle damgalı, kalbi kutsi dava ile sevdalı, sinesi heyecan, coşku tufanı ve şükür notaları ile örülmüş güzel insan, kandilin mübarek olsun.");
        mesaj.add("Bir damla umut serpilsin yüregine, bin tatlı umut dolsun günlerine, hayallerin gerçekleri bulsun, bütün dualarin kabul, kandilin mubarek olsun.");
        mesaj.add("İslam'ın nurlu yüzü kalbine dolsun Makamınız cennet Hz. Muhammed komşunuz olsun Günlerinize mutluluk, gönlünüze saadet dolsun Mevlid Kandiliniz mübarek olsun.");
        mesaj.add("Allah'ın rahmeti, bereketi sizinle olsun, gönül güneşiniz hiç solmasın, yüzünüz aydın olsun, kabriniz nur dolsun, makamınız Firdevs, dualarınız kabul olsun. Kandiliniz kutlu olsun..");
        mesaj.add("Dualarımız bu gece eksik olmasın, kalplerimiz imanla dolsun, kandiliniz mübarek olsun!");
        mesaj.add("Semanın kapılarının sonuna kadar açılıp rahmetin sağanak sağanak yağdığı böyle bir gecede düşen damlaların seni sırılsıklam etmesi dileğiyle kandilin mübarek olsun. Söz ola kese savaşı, Söz ola kestire başı");

        mesaj.add("Allah hepimize Efendimiz’in (S.A.V.) şefkatiyle dünyaya bakabilmeyi nasip etsin.Mevlid Kandiliniz Mübarek Olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Bu mübarek günlerimizde mümin kullara, özel ve vazgeçilmez dostlara ailecek dualarımızı ve sevgilerimizi gönderiyoruz. Kandiliniz kutlu olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Yağmurun toprağa hayat verdiği gibi dualarında hayat bulacağı bu gecede dua bahçesinde yeşeren fidan olmak dileğiyle kandiliniz mübarek olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Yağmurun toprağa hayat verdiği gibi dualarında hayat bulacağı bu gecede dua bahçesinde yeşeren fidan olmak dileğiyle kandiliniz mübarek olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Yakınlık ne mekanda ne zamandadır sadece eller yukarı kalktığında aklına gelenler yakın olduklarındır kandiliniz mübarek olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Gül bahçesine girenler gül olmasa da gül kokarlar, kainatın en güzel gülünün kokusu üzerinizde olsun. Kandiliniz mübarek olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Mevla çekirdeğe orman gizlemiş, yılanın zehrine derman gizlemiş, tahıl tanesine harman gizlemiş, mübarek gecelere cennet gizlemiş, hayırlı kandiller. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Fani Dünyanın padişahı değilim. Gönül hırkalarını yamar giyerim. Dostlarla ağlar, dostlarla gülerim. Siz sevdiklerime, iyi kandiller dilerim. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Bu mübarek gecede dualarınızın kabul ve makbul olması dileklerimle kandilinizi kutlar size ve sevdiklerinize hayırlara vesile olmasını dilerim. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Güneşin güzel yüzü, yüreğine dokunsun, kabuslar senden uzakta, melekler baş ucunda dursun. Güneş öyle bir geceye doğsun ki, duaların kabul, kandilin mübarek olsun. Söz ola kese savaşı, Söz ola kestire başı");

        mesaj.add("Varlığı ebedi olan, merhamet sahibi, adaletli Yüce Allah kendisine dua edenleri geri çevirmez. Dualarınızın Rabbin yüce katına iletilmesine vesile olan Mevlit Kandiliniz mübarek olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Ey yüce peygamber senin hürmetine yaratıldı tüm alemler. Bizleri şefaatinden mahrum etme. Amin! Mevlit Kandiliniz Mübarek, dualarınız kabul olsun. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Kandiliniz mübarek olsun. Yüce Rabbim bütün dualarınızı kabul etsin. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Mevlit Kandilin mübarek olsun. Allah sana sevdiklerinle beraber mutlu ve huzurlu bir şekilde yaşamayı nasip etsin. Söz ola kese savaşı, Söz ola kestire başı");
        mesaj.add("Güzeller güzelinin doğum günü kutlu olsun. Mevlid Kandiliniz kutlu olsun.");
        mesaj.add("Gel ey Muhammed (SAV) bahardır, dualar ardında saklı, âminlerimiz vardır. Hacdan döner gibi, mevlitten iner gibi gel gel. Bekliyoruz yıllardır. Mevlit Kandilin Mübarek Olsun…");
        mesaj.add("Bu kutlu kandil gecesinin sizlere hayırlar getirmesini dilerim. Kandiliniz kutlu olsun.");
        mesaj.add("Avuçların açıldığı, gözlerin yaşardığı, ilahi esintilerin kalpleri okşadığı anın bir asra bedel olduğu bu gece dualarda birleşmek dileğiyle kandilinizi kutlarım.");
        mesaj.add("Rabbim bizi özünden iman edip gözünden düşmeyen kullarından eylemesin. Hayırlı kandiller.");
        mesaj.add("Bugün kalbinize huzur sofranıza bereket üzerinize sıhhat serpilsin. Kandiliniz mübarek olsun.");

        mesaj.add("Bu gece Mevlit Kandili günahtan kurtuluş gecesi. Haydi dua edelim temizlensin günah defterleri iyi kandiller...");
        mesaj.add("Duanız kabul, ameliniz makbul hizmetiniz daim olsun. Saadetiniz kaim olsun. Kandiliniz kutlu olsun.");
        mesaj.add("Avuç içlerinizde sakladığınız bütün duaların kabul olması dileğiyle. Mevlid kandiliniz mübarek olsun.");
        mesaj.add("Rabbim bizi özünden iman edip, gözünden düşmeyen kullarından eylesin. Mevlid kandiliniz mübarek olsun.");
        mesaj.add("Baki sevgiler adına nice dilekler vardır. Ölümü bile ayırır saymayan gönüller vardır. Mesafeler araya set çekmişse ne çıkar, dualarda birleşen gönüller vardır. Hayırlı kandiller.");
        mesaj.add("Kalpler vardır, sevgiyi yaşatmak için, insanlar vardır, dostluğu paylaşmak için, mübarek günler vardır, beraberce kutlamak için. Mevlid Kandiliniz mübarek olsun.");
        mesaj.add("Mübarek Mevlid kandilinde ettiğiniz tüm duaları Allah kabul etsin. Hayırlı kandiller!");
        mesaj.add("Bugün ellerini semaya gönlünü Mevlaya aç, bugün günahlardan olabildiğince kaç, bugün en gizli incilerini onun için saç çünkü bugün kandil, kandilin mübarek olsun");
        mesaj.add("Rabbimden çiçek istedik kırları verdi, ağaç istedik ormanları verdi, su istedik denizleri verdi, dost istedik bu numarayı verdi. Kandiliniz mübarek olsun.");
        mesaj.add("Bu gecenin feyzi üzerinize rahmeti geçmişinize bereketi evinize nuru ahiretinize sıcaklığı yuvanıza dolsun kandiliniz mübarek olsun.");
    }
}
