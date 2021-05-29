package com.TCoding.zelmesajlarprojesi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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

public class MevlanaFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> mesaj ;
    public MevlanaFragment() {
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
        mesaj.add("Sevgide güneş gibi ol, dostluk ve kardeşlikte akarsu gibi ol, hataları örtmede gece gibi ol, tevazuda toprak gibi ol, öfkede ölü gibi ol, her ne olursan ol, ya olduğun gibi görün, ya göründüğün gibi ol.");
        mesaj.add("Kötülük etme kötü düşersin,kuyu kazma kendin düşersin.");
        mesaj.add("Bir günah işlediğinde hemen tövbe et insan suya düştüğü içim değil sudan çıkamadığı için boğulur.");
        mesaj.add("Deniz derindir durulmaz dostluk edebidir unutulmaz");
        mesaj.add("Cahille girme münakaşaya ya sinirini zıplatır tavana yada yazık olur adabına");
        mesaj.add("Odun yanınca kül olur insan yanınca kul olur.");
        mesaj.add("Aşk kalpten vurur , dost sırttan ; kalp iyileşir ama sırt hep kambur kalır");
        mesaj.add("Güzeli güzel yapan edeptir edep ise güzeli sevmeye sebeptir");
        mesaj.add("Aynalar türlü türlüdür yüzünü görmek isteyen cama bakar özünü görmek isteyen cana bakar");
        mesaj.add("Kiminle gezdiğinize kiminle arkadaşlık yaptığınıza dikkat edin bülbül güle karga çöplüğe götürür.");
        mesaj.add("Sanmasınlar yıkıldık sanmasınlar çöktük bir başka bahaar için sadece  yaprak döktük");
        mesaj.add("Minareden düşenin parçası bulunur da gönülden düşenin parçası bulunmaz");

        mesaj.add("İnsanı ateş değil,kendi gafleti yakar ; herkes de kusur görür,kendisine kör bakar , neye nasıl bakarsan,o sana öyle bakar.");
        mesaj.add("Geveze birisine sır söylemek,kırık testiye su koymaya benzer.");
        mesaj.add("Demir gibi cahili,altın gibi bilginden daha kıymetli yapan şey,ahlaktır.");
        mesaj.add("Güzelliğin bir damlası olan Leyla için uykuyu haram etmek çok değilse, güzelliğin kaynağı Mevla için bir ömrü feda etmek az bile. ");
        mesaj.add("Nasibinde varsa alırsın karıncadan bile ders. Nasibinde yoksa bütün cihan önüne serilse sana ters. ");
        mesaj.add("İnsan gözden ibarettir aslında, geri kalan cesettir. Göz ise ancak gerçek dostu görendir.");
        mesaj.add("İnsanları iyi tanıyın, her insani fena bilip kötülemeyin, her insanı da iyi bilip övmeyin.  ");
        mesaj.add("Birini seviyorsanız O'nu Allahtan isteyin. Kalpler Allah'ın Elindedir.");
        mesaj.add("Bilmeyen ne bilsin seni gamlanma deli gönül, gönülden anlamayana bağlanma deli gönül.");
        mesaj.add("Olgun bir adamı dost edinmek isterseniz eleştirin , basit bir adamı dost edinmek isterseniz övün.  ");
        mesaj.add("Dostun yanına hediyesiz gitmek buğdaysız değirmene gitmek gibidir.");
        mesaj.add("Dost ise hiç düşünme ver ömrünü gitsin , dost değilse hiç bekletme yol ver gitsin.");
        mesaj.add("Gеrеk yok hеr sözü laf ilе bеyana, bir bakış bin söz еdеr bakıştan anlayana.  ");
        mesaj.add("Kimle gezdiğinize kimle arkadaşlık ettiğinize dikkat edin. Çünkü bülbül güle karga çöplüğe götürür.");
        mesaj.add("Gönül gözüyle gören hiçbir insanı kandıramazsın.Sizi açık bir kitap gibi okur.");
        mesaj.add("Gönül han değil dergahtır,Paldır küldür girilip çıkılmaz,günahtır.");

        mesaj.add("Sesini değil sözünü yükselt! Yağmurlardır yaprakları büyüten gök gürültüleri değil.  ");
        mesaj.add("Acı su da tatlı su da berraktır. Sakın görünüşe aldanma. Görünüşte herkes insandır ama gerçek insan hal ehli olandır.  ");
        mesaj.add("Ey gönül bir sürü dostlarının yanında elbet ki düşmanlarında olacak : Ama imtihan ya bu onca düşmanın varken seni düşmanın vuracak");
        mesaj.add("Olmaz dediğin ne varsa olur. DÜşmez dersin düşersin , şaşmam dersin şaşarsın , Öldüm der durur yine de yaşarsın...");
        mesaj.add("İnsanı gördüklerinden ibaret satma , göremediklerinde ara. İçidir hakikatin resmi , dışı sadece bir manzara...");
        mesaj.add("Dün akıllıydım dünyayi değiştirmek istedim , bugün ise bilgeyim kendimi değiştirdim.");
        mesaj.add("Cahil kişi gülün güzelliğini görmez , gider dikenine takılır.");
        mesaj.add("Edep aklın tercümanıdır.Herkes Edebi kadar akıllı , aklı kadar şerefli,şerefi kadar değerlidir.");
        mesaj.add("Hayat beni istediğin kadar üz,şükrümden bir parça bile eksiltemeyeceksin.Nasılsa üzüntüm gibi birgün sende biteceksin.");
        mesaj.add("Küsmek ve darılmak için bahaneler aramak yerine,sevmek ve sevilmek için çareler arayın.");
        mesaj.add("Dost acı söyleyen değil acıyı tatlı söyleyebilendir");
        mesaj.add("Gönül han değil dergahtır paldır küldür girip çıkılmaz günahtır.");
        mesaj.add("Dua kapı çalmaktır.Gerisine karışmak haddi aşmaktır.");
        mesaj.add("Unutma senin için başkasından vazgeçen,birgün mutlaka başkası için senden vazgeçer.");
        mesaj.add("Acı suda tatlı suda berraktır.Sakın görünüşe aldanma.Görünüşte herkes insandır ama gerçek insan hal ehli olandır.");
        mesaj.add("Herşey neye layıksa ona dönüşür.  ");
        mesaj.add("Kalp deniz  kıyısdır denizde ne varsa kıyıya o vurur.");
        mesaj.add("Seni seveni zehir olsa da yut seni sevmeyeni bal olsa da unut.");
        mesaj.add("İyiyi ara,güzeli ara,doğruyu ara.Ama kusura arama...");
        mesaj.add("Eğri ayağın gölgesi de eğridir.  ");
        mesaj.add("Gülü gülene ver,kalbini sevener ver , sevmek güzel şeydir. Kıymet bilene ver... ");
        mesaj.add("Ey Nefsim,Seni sen yapan benim,beni de ben yapan da sensin. Ya yola gel beraber gidelim ya da yoldan çekil ben Hakk'a gideyim. ");
        mesaj.add("Herkesin anlayış derecesi farklıdır.Benim sana anlatacaklarım ancak senin anlayacağın kadardır.");
        mesaj.add("Yarın yaparım deme,bugünde dünün yarınıydı ne yapabildin...");
        mesaj.add("Sustuysak saf olduğumuzdan değil,Allah'a bıraktığımızdan...");
        mesaj.add("Bu dünyada neyi çok istersen o senin imtihanındır.");


    }
}
