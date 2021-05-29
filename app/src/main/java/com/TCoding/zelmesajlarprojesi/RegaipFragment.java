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

public class RegaipFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> mesaj ;
    public RegaipFragment() {
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
        mesaj.add("Ey Rabbim bu gece şu sonsuz merhamet ve rahmet deryasından bir damlada olsa nasiplenmeyi kısmet eyle.Regaip Kandiliniz Mübarek olsun");
        mesaj.add("Semanın kapılarının sonuna kadar açılıp rahmetin sağanak sağanak yağdığı böyle bir gecede düşen damlaların seni sırılsıklam etmesi dileğiyle kandilin mübarek olsun.");
        mesaj.add("Yağmur yüklü bulutlar gibi gelen, eteğindeki hayır cevherlerini başımıza boşaltan ve bizlere mutluluk veren kandilin, büyüsüne kapılmanız dileğiyle. Regaip Kandiliniz Mübarek olsun");
        mesaj.add("Bin damla serpilsin yüreğine, bin tatlı mutluluk dolsun günlerine, binbir hayalin gerçekleri bulsun, her türlü duaların kabul olsun, kandilin mübarek olsun..");
        mesaj.add("Ya Rabbi! Sesimizi duyansın, hallerimiz bilensin. Açtık gönlümüzü sana, Sen Sen imdat eyle, Sen affeyle, sen yollarımızı hayır eyle. Melekler daima duacınız olsun. Yüreğiniz ferah, imanının bol olsun. Sevgili Peygamberimiz Şefaatçimiz olsun. Regaib Kandilimiz Mübarek olsun");
        mesaj.add("Resulullah (sav) şöyle buyuruyor; Beş gece vardır ki, o gecelerde yapılan dua reddolunmaz; Cuma gecesi, Recep ayının ilk gecesi, Şabanın yarısındaki gece (Berat gecesi), Ramazan ve Kurban Bayramı geceleri.Regaip Kandiliniz mübarek olsun.");
        mesaj.add("De ki; Rabbim! Bağışla, merhamet et. Çünkü sen merhamet edenlerin en hayırlısısın. Kandiliniz mübarek olsun.");
        mesaj.add("Sofranız afiyetli, paranız bereketli, kararlarınız isabetli, yuvanız muhabbetli, kalbiniz merhametli, bedeniniz sıhhatli, dualarınız kabul olsun, kandiliniz kutlu olsun.");
        mesaj.add("Varlığı ebedi olan, merhamet sahibi, adaletli Yüce Allah kendisine dua edenleri geri çevirmez. Dualarımızın Rabbimizin yüce katına iletilmesine vesile olan bu mübarek kandil gecesinde dualarda buluşmak ümidiyle Kandilinizi kutlarım.");
        mesaj.add("Yağmurun toprağa hayat verdiği gibi dualarında hayat bulacağı bu gecede dua bahçesinde yeşeren fidan olmak dileğiyle kandiliniz mübarek olsun.");
        mesaj.add("Gecenin güzel yüzü yüreğine dokunsun, şeytan senden uzakta, melekler başucunda olsun, güneş öyle bir geceye doğsun ki duaların kabul Regaip Kandiliniz mübarek olsun!");
        mesaj.add("Bu gece kulun yalvarış ve yakarışlarını Yüce Mevla'ya sunacağı ve O'nun sonsuz affından, merhametinden, iyiliğinden bol bol yararlanacağı umut, huzur ve müjde gecesidir. Regaip kandiliniz hayırlı olsun!");
        mesaj.add("Ellerin semaya, dillerin duaya, gönüllerin Mevla’ya yöneldiği bu mübarek geceni kutlar, hayırlara vesile olmasını dilerim.");
        mesaj.add("Duanız kabul, ameliniz makbul, saadetiniz daim olsun. Kandiliniz kutlu olsun.");
        mesaj.add("Üç aylar olarak bilinen Recep, Şaban, Ramazan ayları manevi yönden daha önemli ve hayırlıdır. Recep ayının ilk Cuma gecesi Regaip kandilidir. Yani bu gece ALLAH'ın rahmet ve bağışlamasının bol olduğu gecedir. Edilen dualar, tövbeler bu gece kabul olunur. Yürekler binbir nurla doludur. Kandiliniz kutlu olsun.");
        mesaj.add("Bu gece Regaip Kandili. Dua edelim.. Yürekler bir atsın bu gece, günahlarımız affolsun. Hayırlı kandiller.");
        mesaj.add("Bin damla serpilsin yüreğine, bin tatlı mutluluk dolsun günlerine, binbir hayalin gerçekleri bulsun, her türlü duaların kabul olsun, Regaip kandilin mübarek olsun...");
        mesaj.add("Geçmişin bugünle, ışığın gölgeyle umudun gerçekle, ışığın gölgeyle, üzüntünün neşeyle, öfkenin sevgiyle barıştığı hayırlı kandillere.");
        mesaj.add("Ellerin duaya uzandığı, sinelerin dostlara açıldığı, gözlerin masumiyet aradığı bu mübarek günde tüm dualarınız kabul olması dileğiyle iyi kandiller.");
        mesaj.add("Binlerce çiçek var, ama gül başka. Milyonlarca insan var, ama dost başka. Milyarlarca gün var, ama bugün başka, Regaip Kandiliniz mübarek olsun.");
        mesaj.add("Kardeşliğin daimi olduğu, sevgilerin birleştiği dostlukların hiç bitmediği, belki durgun, belki yorgun, yine de mutlu, yine de sevgi dolu nice kandillere.");
        mesaj.add("Her Sabah güneşle doğan umutlar, her yeni baharla tazelenen mutluluklar ve açan her yeni çiçekte gizlenen güzellikler sizinle olsun. Regaip Kandiliniz Mübarek olsun. Kaynak: Resimli Regaib Kandili mesajları 2020 ");
        mesaj.add("Ya Rab! Bizi dos doğru bir yola ilet; senin çizmiş olduğun istikamette ilerlet, niyetlerimizi ihlaslı eyle, ve bize lütfettiğin güzelliklerde bereket ihsan eyle, bu mübarek kandil gününde dualarımızı kabul eyle . Hayırlı Kandiller.");
        mesaj.add("Üç Aylar; Müslümanın ruh şöleninin başlangıcıdır. Recep ve Şaban kurulacak gök sofrasının habercisidirReceb-i şerifin bir gün başında, bir gün ortasında ve bir gün de sonunda oruç tutana, Receb’in hepsini tutmuş gibi sevap verilir. Hayırlı Kandiller");
        mesaj.add("Rahmet, mağfiret ve bereketi bol üç ayların manevi iklimine girildiğinin habercisi bu günün hayırlara vesile olmasını dilerim. Regaip Kandiliniz mübarek olsun.");
        mesaj.add("Bu gecenin feyiz ve nimetlerinden tüm insanlığın faydalanmasını temenni ediyor, Üç Aylar ve Regaib Kandilinin bolluk, bereket, huzur, barış ve kardeşlik getirmesini diliyorum.");
        mesaj.add("Bu değerli Regaip Kandili gecesinde kainatın yaratıcısı ve alemlerin rabbi olan bağışlayıcı ve merhamet edici yüce Allah'ım tüm dualarımızı kabul etsin.Regaip kandiliniz mübarek olsun.");
        mesaj.add("Allah ile olan bağımızı yeniden gözden geçirme ve bu manevi iklimden yararlanmak için büyük fırsatlar sunan bu günde her şeyin gönlünüzce olmasını dilerim. Regaip Kandiliniz mübarek olsun.");
        mesaj.add("Rabbim Recep ayının ilk gecesi hürmetine; Duası kabul olmuş bir kul sevinci yaşat bize. Sabrımızın mükafatı olarak,'Çok şükür' diyebilmeyi de nasip et cümlemize.Hayırlı Kandiller.");
        mesaj.add("Bu günlerin feyzi üzerinize,rahmeti geçmişinize , bereketi evinize dolsun, Regaip Kandiliniz mubarek olsun.");
        mesaj.add("Bu anlamlı gecenin birliğimize, beraberliğimize ve hayra vesile olmasını dilerim. Regaip Kandiliniz mübarek olsun.");
        mesaj.add("Bu gece ahdimizi yenilemeye , misakımızı kuvetlendirmeye vesile olsun.Regaip Kandilimiz Mübarek olsun.");
        mesaj.add("Avuçların açıldığı , gözlerin yaşardığı her anın bir ömüre bedel olduğu bu gecede dualarınızın kabul olması dileğiyle.. Kandiliniz Mübarek Olsun.");
        mesaj.add("Ellerin duaya uzandığı , sinelerin dostlara açıldığı bu mübarek günde tüm dualarınızın kabul olması dileğiyle. Regaip Kandiliniz Mübarek olsun..");

    }
}
