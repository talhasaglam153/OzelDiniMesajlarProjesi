package com.TCoding.zelmesajlarprojesi;

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

public class KadirGecesiFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> mesaj ;
    public KadirGecesiFragment() {
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
        mesaj.add("Cennet bahçelerinin gülleri üzerine,Bülbüllerin nağmeleri diline,Allah sevgisi gönlüne,Kadir gecesi bereketi üzerine olsun. Hayırlı Kandiller.");
        mesaj.add("Ağaçlardan dökülen her bir yaprak duacınız; Kur'an-ı Kerim yoldaşınız olsun. Kadir Geceniz mübarek olsun.");
        mesaj.add("Bin aydan daha hayırlı olan Kadir Gecesi’nde, kainatın yaratıcısı ve alemlerin Rabbi bağışlayıcı ve acıyıcı yüce Allah tüm dualarınızı kabul etsin.");
        mesaj.add("Kuran’ın nazil olduğu bin aydan daha hayırlı bu gecenin size efradı ailenize ve bütün İslam alemine hayır bereket ve huzur getirmesini diliyor ve dua ediyorum Kadir geceniz mübarek olsun.");
        mesaj.add("Semanın kapılarının açılıp rahmetin sağanak, sağanak yağdığı bu günde düşen damlaların sizi ailece sırılsıklam etmesi dileğiyle. Kadir geceniz kutlu olsun.");
        mesaj.add("Bu mübarek gecenin bereketinden nasiplenmek umuduyla...Kadir Geceniz mübarek olsun");
        mesaj.add("Bin aydan daha hayırlı olan Kadir Gece'nizi tebrik eder, hayır ve bereketinden nasiplenebilmeyi dilerim.");
        mesaj.add("Kadir Gecemizin hayırlara vesile olmasını, İslam alemine barış; insanlık alemine ise hidayet getirmesini yüce Rabbimden niyaz ediyorum.");
        mesaj.add("Birçok hayır ve bereketi içinde barındıran, manevi hazzın yükseldiği bu mübarek gecede, yüce Rabbimizin bizleri affetmesi ve güzellikler vermesi için dua edelim. Kadir Geceniz mübarek olsun.");
        mesaj.add("Bin aydan daha hayırlı olan Kadir Gecesi'nin İslam âlemi ve tüm insanlık için hayırlara vesile olmasını Yüce Rabbimden diliyorum.");
        mesaj.add("Rahmet ve bereket kapılarının açıldığı, Cenab-ı Allah’ın kendisine açılan elleri geri çevirmediği, Kur’an-ı Kerim’in bu gecede indirildiği Kadir Geceniz mübarek olsun.");
        mesaj.add("Bugün ellerini semaya gönlünü Mevla’ya aç. Bugün günahlardan olabildiğince kaç. Bugün en gizli incilerini onun için saç. Kadir Geceniz mübarek olsun.");

        mesaj.add("Dertlerimiz kum tanesi kadar küçük, sevinçlerimiz Nisan yağmuru kadar bol olsun. Bu mübarek geceniz sevapla dolsun. Kadir Geceniz mübarek olsun.");
        mesaj.add("Duanız kabul, ameliniz makbul hizmetiniz daim olsun. Saadetiniz kaim olsun. Kadir Geceniz kutlu olsun.");
        mesaj.add(" Kim Kadir gecesini, faziletine inanarak ve alacağı sevabı Allah'tan bekleyerek ibadet ve taatla geçirirse geçmiş günahları bağışlanır. (Buhârî, Kadir, 1) Kadir geceniz mübarek olsun.");
        mesaj.add("Allah'ım rızkımıza bolluk, kalbimize ferahlık, ömrümüze bereket ver! Kadir geceniz mübarek olsun.");
        mesaj.add("Mübarek Kadir Gecenizi kutlar, her şeyin gönlünüzden geçtiği gibi olmasını temenni ederim. Kandiliniz mübarek olsun.");
        mesaj.add("Kulun Rabbine yakın olduğu gecelerin en önemlisi? Kendisine dua edenleri geri çevirmeyen, günahları bağışlayan, her şeyi bilen, gören ve duyan Yüce Allah tüm dualarımızı kabul etsin.");
        mesaj.add("Bugün ettiğiniz bütün dualar göklere yükselip, tek tek kabul olup üzerinize sağanak gibi yağsın inşallah. Kadir Geceniz mübarek olsun.");
        mesaj.add("Hayırlı Kandiller... Yüce Rabbim bu güzel gecede bizlere onun rızasını kazanacak ameli versin, Kadir geceniz hayırlı olsun.");
        mesaj.add("Yüreğine bin damla serpilsin ki yüreğin ferahlasın, günlerine bin tatlı mutluluk dolsun ki huzur dolu bir yaşamın olsun, bu mübarek Kadir gecesinde tüm dualarınız kabul olunsun.");
        mesaj.add("Bugün elleriniz her zamankinden daha çok açın , Avucunuza melekler gül koysun, yüreğiniz coşsun, Kadir geceniz hayırlara vesile olsun.");

        mesaj.add("Ya Rab, kusurumuzu affet. Bizi kendine kul kabul et. Emanetini kabzetmek zamanına kadar bizi emanette emin kıl. Kadir geceniz mübarek olsun.");
        mesaj.add("Gün vardır, bin yıldan uzun gelir bize, bir yıl vardır bir günden kısa gelir bize. Bire bin yazılan bu gecede dua edelim Rabbimize. Kadir geceniz mübarek olsun.");
        mesaj.add("Bin aydan daha hayırlı olan Kadir Gecesi'nde, kainatın yaratıcısı ve alemlerin Rabbi dualarınızı kabul etsin.");
        mesaj.add("Bin aydan daha hayırlı olan Kadir Gecesi'nde, kainatın yaratıcısı ve alemlerin Rabbi dualarınızı kabul etsin.Hayırlı Kandiller");
        mesaj.add("Bir damla umut serpilsin yüreğine, bin tatlı umut dolsun günlerine, hayallerin gerçekleri bulsun, bütün duaların kabul, Kadir geceniz mübarek olsun!");
        mesaj.add("Meleklerin yeryüzüne indiği bu gecede tüm dualarınız kabul olsun. Kadir gecceniz mübarek olsun...");
        mesaj.add("Bin aydan faziletli,kadri gayet yüce ,bir senenin içinde en kıymetli gece... Kadir gecceniz mübarek olsun");
        mesaj.add("Allah bu gecede yapacağımız dualarımızı kabul eylesin,günahlarımızı affetsin , maddi ve manevi sıkıntılarımızı güzelliklere çevirsin.Kadir gecemiz mübarek olsun..");

    }
}
