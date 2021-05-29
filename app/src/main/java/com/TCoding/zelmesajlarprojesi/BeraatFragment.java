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

public class BeraatFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> mesaj ;
    public BeraatFragment() {
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
        mesaj.add("Güneşin güzel yüzü, yüreğine dokunsun, kabuslar senden uzakta, melekler baş ucunda dursun. Güneş öyle bir geceye doğsun ki, duaların kabul, Beraat Kandiliniz Mübarek Olsun.");
        mesaj.add("Bu mübarek gecede dualarınızın kabul ve makbul olması dileklerimle. Beraat kandilinizi kutlar, size ve sevdiklerinize hayırlara vesile olmasını dilerim.");
        mesaj.add("Borçlarımızdan, ceza ve günahlarımızdan kurtulmak için bu gece dua edelim.. Allah affeden ve bağışlayandır, unutmayalım.. Eller semaya kalkıp, yürekler bir atınca bu gece, gözler sevinç yaşlarıyla dolacak.. Kandiliniz mübarek, dualarınız kabul olsun!");
        mesaj.add("Bu gece beraat kandili.. Günahtan kurtuluş gecesi.. Haydi dua edelim.. Temizlensin günah defterleri.. İyi kandiller…");
        mesaj.add("Dualarımızın Rabbimizin yüce katına iletilmisine vesile olan bu mübarak kandil gecesinde dualarda buluşmak ümidiyle Kandilinizi kutlarım.");
        mesaj.add("Ellerin duaya uzandığı, sinelerin dostlara açıldığı, gözlerin masumiyet aradığı bu mübarek günde tüm dualarınız kabul olması dileğiyle iyi kandiller.");
        mesaj.add("Berat kandilin mübarek olsun. Allah sana sevdiklerinle beraber mutlu ve huzurlu bir şekilde yaşamayı nasip etsin.");
        mesaj.add("Bugün ellerini semaya gönlünü Mevla'ya aç, bugün günahlardan olabildigince kaç, bugün en gizli incilerini onun için saç. Çünkü bugün kandil, kandilin mübarek olsun.");
        mesaj.add("Allah'ın aşkıyla yan bu gece, Mevlana gibi dön bu gece, secdeye varıp huzura erince, şu fakiri de an bu gece. Hayırlı kandiller!");
        mesaj.add("Bu gece beraat gecesi. Dua edelim… Yürekler bir atsın bu gece, günahlarımız af folsun. İyi kandiller.");

        mesaj.add("Sana karanfilin sadakatini, sümbülün bağlılığını, menekşenin tevazusunu, çiğdemin neşesini, lalenin gururunu, İslam'ın nurunu buket olarak gönderiyorum. Berat Kandilin mübarek olsun…");
        mesaj.add("Mevla çekirdeğe orman gizlemiş, yılanın zehrine derman gizlemiş, tahıl tanesine harman gizlemiş, mübarek gecelere cennet gizlemiş, Berat Kandiliniz hayırlı olsun…");
        mesaj.add("Sema kapılarının sonuna kadar açılıp rahmetin sağanak sağanak yağdığı böyle bir gecede düşen damlaların seni sırılsıklam etmesi dileğiyle Berat Kandiliniz hayırlı olsun…");
        mesaj.add("Bu gece Cenab-ı Hakkın, kendisine yönelip af dileyen müminleri bağışlayarak kurtuluş beratı verdiği bir gecedir. Hepimiz için hayırlı olsun!");
        mesaj.add("Günler bize dostların güzelliği ile, geceler onların duaları ile mübarek oluyor. Umudumuz dostların hediyesi, duamız sizlerin sevgisi. Kandiliniz mübarek olsun..");
        mesaj.add("Kardeşliğin daimi olduğu, sevgilerin birleştiği, dostlukların bitmediği yine de mutlu, umutlu ve sevgi dolu,rahmetlerin yağmur gibi yağdığı nice kandillere…");
        mesaj.add("Mübarek Beraat kandilinizi kutlar, herşeyin gönlünüzden geçtiği gibi olmasını temenni ederim. Kandiliniz mübarek olsun.");
        mesaj.add("Bugün ellerinizi her zamankinden daha çok açın. Avucunuza melekler gül koysun, yüreğiniz coşsun. Berat Kandilin mübarek olsun…");
        mesaj.add("Ümit ederiz ki bu mübarek gece, zor günler geçirdiğimiz; fakat gelecek adına umutla dolu olduğumuz şu dönemlerde yeniden bir uyanışa vesile olur. Beraat kandiliniz mübarek olsun..");
        mesaj.add("Yağmurun toprağa hayat verdiği gibi dualarında hayat bulacağı bu gecede dua bahçesinde yeşeren fidan olmak dileğiyle kandiliniz mübarek olsun.");

        mesaj.add("Tüm dualarınızın kabul olması dileğiyle. Berat Kandiliniz hayırlı olsun…");
        mesaj.add("Gelişiyle kalbimizi aydınlatan, gönlümüze nur saçan, bütün insanlığa güneş gibi doğan, sevgili peygamberimizin şefaatine nail olmanızı temenni ederim. Berat Kandilin mübarek olsun…");
        mesaj.add("Avuçların açıldığı, gözlerin yaşardığı, ilahi esintilerin kalpleri okşadığı anın bir asra bedel olduğu bu gece dualarda birleşmek dileğiyle kandilinizi kutlarım. Berat Kandiliniz hayırlı olsun…");
        mesaj.add("Gül sevginin tacıdır, her bahar bir gül taçlanır. O gül ki Hz. Muhammed (s.a.v)'i hatırlatır. Onu hatırlayana gül koklatır. Gül kokulu sevgi dolu nice kandiller. Berat Kandiliniz hayırlı olsun…");
        mesaj.add("Kardeşliğin daimi olduğu, sevgilerin birleştiği dostlukların hiç bitmediği, belki durgun, belki yorgun, yine de mutlu, yine de sevgi dolu nice kandillere. Berat Kandilin mübarek olsun…");
        mesaj.add("Affımıza vesile olması dileklerimle Berat kandilinizi tebrik ederim. İyi kandiller…");
        mesaj.add("Güneşi yüreğinde gözleri ufuklarda muhabbet yolcuları arasında cennet hesabı yapmayan cennetlikler arasında olmanın duasıyla hayırlı kandiller diliyorum… Berat Kandilin mübarek olsun…");
        mesaj.add("Yitirilmiş ve özlemle beklenen umutlara elçilik edecek bu gecede, en ulaşılmaz gördüğün hayallerine, parlak güneşin doğması dileğiyle. İyi kandiller. Berat Kandilin mübarek olsun…");
        mesaj.add("Kandiller berekettir, umuttur, gözyaşıdır, yakarıştır, özlemdir. Dualarınız kabul, Berat kandiliniz mübarek olsun.");
        mesaj.add("Bu Kandil Gecesi'nin, hayatımıza yeni ufukların açılmasına ve vesile olması dileğiyle. Berat Kandilin mübarek olsun…");

        mesaj.add("Bu günlerin feyzi üzerinize, rahmeti geçmişinize, bereketi evinize, Nur'u ahiretinize, sıcaklığı yuvanıza dolsun. Berat Kandilin mübarek olsun…");
        mesaj.add("Allah'ın rahmeti, bereketi sizinle olsun, gönül güneşiniz hiç solmasın, yüzünüz aydın olsun, kabriniz nur dolsun, makamınız Firdevs, dualarınız kabul olsun. Berat Kandiliniz hayırlı olsun…");
        mesaj.add("Kandilin mübarek olsun. Allah sana sevdiklerinle beraber mutlu ve huzurlu bir şekilde yaşamayı nasip etsin. Berat Kandiliniz hayırlı olsun…");
        mesaj.add("Günler bize dostların güzelliği ile, geceler onların duaları ile mübarek oluyor. Umudumuz dostların hediyesi, duamız sizlerin sevgisi. Kandiliniz mübarek olsun..");
        mesaj.add("Bugün ellerini semaya gönlünü Mevla'ya aç, bugün günahlardan olabildiğince kaç, bugün en gizli incilerini onun için saç çünkü bugün kandil, Berat Kandilin mübarek olsun…");
        mesaj.add("İslam'ın nurlu yüzü kalbine dolsun Makamınız cennet Hz. Muhammed komşunuz olsun Günlerinize mutluluk, gönlünüze saadet dolsun Kandiliniz mübarek olsun");
        mesaj.add("Sâde duygular yükselsin göklere, yükseklerde hafakan, gözlerde yaşlar, ona susamış dudaklar kadar, açılan eller var. Kandiliniz mübarek olsun.");
        mesaj.add("Allah'ın rahmeti, bereketi sizinle olsun, gönül güneşiniz hiç solmasın, yüzünüz aydın olsun, kabriniz nur dolsun, makamınız Firdevs, dualarınız kabul olsun. Kandiliniz kutlu olsun..");
        mesaj.add("Yükü sevgi özü saygı gücü barış süsü hoşgörü olan mübarek Beraat kandilini kutlarım Allah'a emanet olun");
        mesaj.add("Bu gece hayırlı bir gece, yüreklerimiz ibadetle çarpsın, gönüllerimiz bir olsun.. Kandiliniz mübarek olsun!");

        mesaj.add("Gecenin güzel yüzü yüreğine dokunsun, şeytan senden uzakta, melekler başucunda olsun, güneş öyle bir geceye doğsun ki duaların kabul kandilin mübarek olsun.");
        mesaj.add("Gün vardır, bin yıldan uzun gelir bize, bir yıl vardır bir günden kısa gelir bize. Bire bin yazılan bu gecede dua edelim Rabbimiz'e. Hayırlı kandiller…");
        mesaj.add("Ellerin semaya, dillerin duaya, gönüllerin mevlaya yöneldiği bu mübarek geceni kutlar, hayırlara vesile olmasını dilerim.Beraat Kandiliniz Mübarek Olsun...");
        mesaj.add(" Gün vardır, bin yıldan uzun gelir bize, bir yıl vardır bir günden kısa gelir bize. Bire bin yazılan bu gecede dua edelim Rabbimiz'e. Beraat Kandiliniz Mübarek Olsun...");
        mesaj.add("Kardeşliğin daimi olduğu, sevgilerin birleştiği, dostlukların bitmediği yine de mutlu, umutlu ve sevgi dolu,rahmetlerin yağmur gibi yağdığı nice kandillere. Beraat Kandiliniz Mübarek Olsun...");
        mesaj.add("Allah'ın rahmeti, bereketi sizinle olsun, gönül güneşiniz hiç solmasın, yüzünüz Aydın olsun, kabriniz nur dolsun, makamınız Firdevs, dualarınız kabul olsun. Kandiliniz kutlu olsun.");
        mesaj.add("Bir damla umut serpilsin yüreğine, bin tatlı umut dolsun günlerine, hayallerin gerçekleri bulsun, bütün duaların kabul, Berat kandilin mübarek olsun.");

    }
}
