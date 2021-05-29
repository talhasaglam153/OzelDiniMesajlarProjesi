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

public class KurbanBayramiFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> bayram ;
    public KurbanBayramiFragment() {
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
        bayram.add("Dünyada Ve Ahirette hakiki bayramları yaşayabilmek temennisi ile Kurban Bayramınız Kutlu olsun...");
        bayram.add("Her bayramda hatırlatmak ve hatırlanmak dileğiyle Kurban Bayramınız Mübarek Olsun...");
        bayram.add("Kalpler vardır sevgiyi yaşatmak için , İnsanlar vardır dostluğu payalaşmak için ve Bayramlar vardır sevgiyle kucaklaşmak için. Kurabn Bayramınız Kutlu olsun..");
        bayram.add("Kalplerde sevgi olsun gözlerinize ışık dolsun Kurban Bayramınız Kutlu olsun...");
        bayram.add("Herkesin Kurban Bayramını kutlar sağlık esenlik ve huzur dolu bica bayramlar dilerim...");
        bayram.add("Mübarek kurban bayramınızı tebrik eder hayırlara vesile olmasını dilerim.");
        bayram.add("Rabbimin sevdiği , sevdirdiği , sevindirdiği ve razı olduğu kullardan olabilmek ümidiyle kurban bayramınız mübarek olsun...");
        bayram.add("Sema kapılarının açık olduğu bu günde heybenizde tohum tohum dua menekşeleri saçmanız temennisiyle . Hayırlı Bayramlar.");
        bayram.add("Tüm yüreklere sevinç dolsun. Umutlar gerçek olsun. Acılar unutulsun. Dualarınız Kabul , Bayramınız Mübarek Olsun..");
        bayram.add("Kurabn Bayramınızı kutlar bu mübarek günlerib Allah'a ve Efendimize biraz daha yaklaşmak için vesile olmasını Rabbimizden niyaz ederim.");
        bayram.add("Herşeye kadir olan yüce Allah bizleri doğru yoldan ve sevdiklerimizden ayırmasın. Kurban Bayramınız mübarek olsun...");
        bayram.add("Hayırlı ve güzel bir bayram geçirmeniz dileğiyle... Kurban Bayramınız Mübarek olsun");
        bayram.add("Allah bizi İbrahim(A.S) gibi itaatkar , İsmail(A.S) gibi teslimiyet gösterenlerden eylesin. Kurban Bayramınız Mübarek olsun...");
        bayram.add("Sağlıklu , Huzurlu , Mutlu ve umutlu bir gelecek dileğiyle... Kurban Bayramınız Mübarek Olsun...");

        bayram.add("Kurban Bayramı tüm İslam Alemine kutlu olsun. Allah(c.c) tüm inananlara nice huzurlu, bereketli bayramlar nasip etsin.Kurban Bayramınız hayırlara vesile olsun. İyi Bayramlar.. ");
        bayram.add("Bin damla serilsin yüreğine, bin mutluluk dolsun gönlüne, bütün hayallerin gerçek olsun, duaların kabul olsun... Kurban Bayramınız mübarek olsun!");
        bayram.add("Güzellik, birlik beraberlik dolu, her zaman bir öncekinden daha güzel ve mutlu bir Kurban bayramı dileğiyle.Kurban Bayramınız Kutlu olsun.");
        bayram.add("Melekler her zaman sizinle olsun bu mübarek ayda  bayramınız Hayır Olsun Kurban bayramınız Kutlu Olsun. ");
        bayram.add("Kurban Bayramını sevdiklerinizle beraber sağlıklı ve huzur içinde geçirmenizi dilerim. Hayırlı Bayramlar…");
        bayram.add("Bir avuç dua, bir kucak sevgi, sıcak bir mesaj mesafeleri kapatır, gönülleri birleştirir. Kalbiniz nur, eviniz huzur dolsun. Kurban Bayramınız bereketli olsun!");
        bayram.add("Gecenin güzel yüzü yüreğine dokunsun, kabuslar senden uzakta melekler başucunda olsun, güneş öyle bir geceye doğsun ki, duaların kabul ve Kurban Bayramınız mübarek olsun!");
        bayram.add("Bu bayramda tüm yürekler sevinç dolsun, umutlar gerçek olsun. Her daim birlik ve beraberlik içinde, huzur ve sevgi dolu bayramlar geçirmek ümidiyle.Hayırlı Bayramlar...");

        bayram.add("Kurban Bayramını sevdiklerinizle beraber sağlıklı ve huzur içinde geçirmenizi dilerim. Sevgi dolu ve huzurlu nice bayramlar geçirmek dileğiyle...");
        bayram.add("Küslerin barıştığı, sevenlerin bir araya geldiği, rahmet ve şefkat dolu günlerin en değerlilerinden olan Kurban Bayramınız kutlu olsun.");
        bayram.add("Bu bayramda tüm yürekler sevinç dolsun, umutlar gerçek olsun. Her daim birlik ve beraberlik içinde, huzur ve sevgi dolu bayramlar geçirmek ümidiyle.İyi bayramlar... ");
        bayram.add("Kurban Rabbimizden gelip yine ona gideceğimizi bizlere anlatan bir güzelliktir. Bu güzelliği yaşamımıza yansıtmak dileğiyle, hayırlı bayramlar dilerim.");
        bayram.add("Kurban Bayramı vesilesiyle tüm samimi dualarınızın rabbimize ulaşmasını diliyorum , Hayırlı Bayramlar.");
        bayram.add("Hayır kapılarının sonuna kadar açık, kaza ve belaların bertaraf olduğu Kurban Bayramınız yaşadığınız tüm sorunları alıp götürmesi dileğiyle.. Kurban Bayramınız mübarek olsun, tüm dertleriniz deva bulsun!");
        bayram.add("Kurban Bayramınız kutlu, yüreğiniz umutlu, umutlarınız atlı, sevdanız kanatlı, mutluluğunuz katlı, sofranız tatlı, mekânınız tahtlı, ömrünüz bahtlı, yuvanız bereketli olsun...");
        bayram.add("Damağınızı, ruhunuzu ve çevrenizi tatlandıran, mutlu, umutlu, bereketli bir bayram dileriz.");


        bayram.add("“O halde Rabbin için namaz kıl ve kurban kes.” emri ilahisi ile kesmiş olduğunuz kurbanları Rabbim kabul etsin. Bayramınız mübarek olsun. ");
        bayram.add("“Hesap gününde, Kulum Ben senden razıyım, gir cennetime” denildiği o gerçek  bayrama kavuşmanızı diler, Kurban Bayramınızı kutlarım. Bayramınız mübarek olsun ");
        bayram.add("Mübarek Kurban Bayramınızı kutlar, hayırlı günlere haberci olmasını temenni ederim.Hayırlı Kurban Bayramlarına...");
        bayram.add("Güzellik, birlik, beraberlik dolu, daha güzel ve mutlu bir Kurban Bayramı diliyoruz. Büyüklerimizin ellerinden küçüklerimizin gözlerinden öpüyoruz.");
        bayram.add("Yüce Mevlam, Kurban Bayramının hürmetine bizlere Hz. İbrahim’in sadakatinden, Hz. İsmail’in teslimiyetinden bir nebze de olsa nasip eyle. Bayramınız mübarek olsun ");
        bayram.add("Bizi yaratan Allah’a şükürler olsun. Bütün Müslümanlara hayırlı olsun. Kurban Bayramınız mübarek olsun.");
        bayram.add("Sema kapılarının açık olduğu bugünde heybenizde tohum tohum dua menekşeleri saçmanız temennisiyle hayırlı bayramlar. Kurban bayramınız mübarek olsun ");


    }
}
