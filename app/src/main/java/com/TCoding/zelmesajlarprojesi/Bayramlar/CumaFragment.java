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

import com.TCoding.zelmesajlarprojesi.Adapters.CumeMesajlariAdapter;
import com.TCoding.zelmesajlarprojesi.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import java.util.ArrayList;

public class CumaFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private CumeMesajlariAdapter adapter;
    private ArrayList<String> mesajlar ;
    public CumaFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cuma,container,false);
        rv = v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new CumeMesajlariAdapter(getContext(),mesajlar);
        rv.setAdapter(adapter);
        mAdView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mesajlar = new ArrayList<>();
        mesajlar.add("Ne yaprağınız kurusun ,ne gülünüz solsun , avuçlarınız semada dudaklarınız duada olsun bu mübarek günde dualarınız kabul olsun .");
        mesajlar.add("Yere inen her melek duacınız olsun, okuduğunuz her ayet ilacınız olsun , evine nur kalbine iman dolsun cumamız mübarek olsun.");
        mesajlar.add("Allahım 99 Adının Hürmetine Kalbimizden Geçenleri Ömrümüze Nasip Et Cumanız Mübarek Olsun .");
        mesajlar.add("Ey benim rabbim benim senden istediklerimi değil bende görmek istediklerini ver Hayırlı Cumalar.");
        mesajlar.add("Allahım evlerimizi aşsız kalplerimizi sevgisiz dillerimizi duasız bırakma.Hayırlı Cumalar.");
        mesajlar.add("Bugün ettiğiniz bütün dualar göklere yükselip tek tek kabul olup üzerinize sağanak gibi yağsın inşallah .Hayırlı Cumalar.\n");
        mesajlar.add("Allah'ım! Dillere destan, yüreklere ferahlık olan merhametin ile günahlarımızı affeyle. Amin tüm Müslümanların cuması mübarek olsun. Hayırlı, bereketli, huzurlu ve sağlık dolu günler dilerim.");
        mesajlar.add("Günaydınlar, hayırlı cumalar. Ettiğiniz her dua derdinize deva, sağlığınıza şifa, gözünüze nur, gönlünüze huzur, ailenize ve sevdiklerinize huzur getirsin. Hayırlı cumalar dilerim.");
        mesajlar.add("Her yerde haddini bilen, gönül aynasını silen, mahşerde beraat edip yüzü gülen kullarından eyle bizleri. Amin. Cumamız Mübarek Olsun.");
        mesajlar.add("Ömrümüzün hikayesini yazan en büyük ve en güzel yazıcı olan Rabbim, gönlünüzden geçen güzellikleri alnımıza kader diye yazsın. Amin, hayırlı cumalar dilerim.");
        mesajlar.add("Mübarek Cuma günü yeniden camilerde bir arada saf tutabilmek dileğiyle.İslam aleminin Cuma günü hayırlara vesile olsun.");
        mesajlar.add("Allah’ım musibetin yaşandığı bu günlerde tüm insanlara şifa ve sabır ihsan eyle. Bizleri yeniden Cuma saflarında bir araya getirmeyi nasip eyle. Tüm İslam alemine hayırlı cumalar.");
        mesajlar.add("Zor günler geçirdiğimiz şu dönemde mübarek Cuma gününün hürmetine bizlere dayanma gücü ver Ya Rab. Cümlemize hayırlı cumalar olsun.");
        mesajlar.add("Dua damlaları gönlünüze dolsun, dualarınız kabul cumanız hayır olsun. Selam ve dua ile...");
        mesajlar.add("Öyle bir dua et ki günahın tövbenin büyüklüğünden ağIasın. Şeytandan yaradana sığın ki nefsin seni değil; sen nefsini yakasın. Hayırlı Cumalar…");
        mesajlar.add("Bu cuma mesajı benden sana dua ile gelsin. Senden tüm sevdiklerine dua ile gitsin. Hayırlı cumalar...");
        mesajlar.add("Melekler daima duacınız olsun. Yüreğiniz ferah, ilhamınız bol olsun. Sevgili peygamberimiz, şefaatçimiz olsun. Cumamız mübarek olsun.");
        mesajlar.add("Allahım! Bilerek veya bilmeyerek isledigimiz hatalarimizi, günahlarimizi affet. Bizlere merhamet buyur. süphesiz Sen merhametlilerin en merhametlisisin.");
        mesajlar.add("Çıkarsa kalbinde yara, Yaradan dönüştürür bunu bir gün hayra, sen sabretmesini bilirsen; Yaradan düşürmez seni dara. Kaldır başını semaya, aç ellerini mevlaya. Sen istemesini bilirsen, mevla cevap verir duaya. Cuma günümüz mübarek olsun.”");
        mesajlar.add("Sağanak sağanak rahmet yağsın yuvanıza, melekler amin desin dualarınıza! Dualarda buluşmak dileğiyle, hayırlı Cumalar.");
        mesajlar.add("Ey Rabbim, bize Cennetin kokusunu duyur ve onun nimetlerinden nasiplendir. Bize ateşin kokusunu duyurma. Amin, hayırlı cumalar dilerim.");
        mesajlar.add("Rabbim, sevginle dopdolu yüreklerle sana kavuşmayı ve sevdiklerimizle sonsuzlukta buluşmayı nasip eyle, amin. Hayırlı Cumalar.");
        mesajlar.add("Ey Rabbim! Evimizden bereketi, dilimizden duayı, kalbimizden senin ve Resulünün aleyhisselam sevgisini eksik etme. Dualarımızı kabul, ömrümüzü nurlu kıl. Amin. Hayırlı cumalar.");
        mesajlar.add("Güzellikler içinizi aydınlatsın, yüzünüzden ve yüreğinizden tebessüm eksilmesin. Rabbim, sevdiği kullarından eylesin sizleri ve tabi ki bizleri. Hayırlı cumalar dilerim.");
        mesajlar.add("Bizi dostlarına dost, düşmanlarına düşman olanlardan ve sabreden ve şükredenlerden eyle! İşinde sebat eden, nimetine şükreden, ibadetini güzel yapan, doğru konuşanlardan eyle Ya Rabbim. Amin. Hayırlı Cumalar dilerim.");
        mesajlar.add("Allah`ım! Dillere destan, yüreklere ferahlık olan merhametin ile günahlarımızı affeyle. Amin tüm Müslümanların cuması mübarek olsun. Hayırlı, bereketli, huzurlu ve sağlık dolu günler dilerim. \"");
        mesajlar.add("Çıkarsa kalbinde yara, Yaradan dönüştürür bunu bir gün hayra, sen sabretmesini bilirsen; Yaradan düşürmez seni dara. Kaldır başını semaya, aç ellerini mevlaya. Sen istemesini bilirsen, mevla cevap verir duaya. Cuma günümüz mübarek olsun");
        mesajlar.add("Duaların geri çevrilmeyeceği bugünde rabbim dualarımızı kabul etsin. Bizleri rahmetinden mahrum bırakmasın güzel Mevlam");
        mesajlar.add("Allahım! Bilerek veya bilmeyerek isledigimiz hatalarimizi, günahlarimizi affet. Bizlere merhamet buyur. süphesiz Sen merhametlilerin en merhametlisisin");
        mesajlar.add("Dua ve tövbelerimizi kabul, sağlığımızı daim, kazancımızı bereketli, kalplerimizi ve evlerimizi huzurla doldursun İnşallah. Hayırlı cumalar dilerim.");
        mesajlar.add("Ey büyük Allah'ım, kalbleri iyiden kötüye, kötüden iyiye çeviren, ancak sensin. Kalbimi, dininde sâbit kıl, dininden döndürme, Müslümanlıktan ayırma! Hayırlı cumalar dilerim.");
        mesajlar.add("Allah`ım! Akşama ulaştığımız gibi sabaha, sabah ulaştığımız gibi de akşama ulaşmayı nasip eyle. Sağlımızı koru ve hastalara şifa ver. Hayırlı bereketli cumalar dilerim.");
        mesajlar.add("Ömrüne ömür katılsın, Gönlüne meltem saçılsın. Bu mübarek günde melekler dört yanını sarsın…Derdine derman, gönlüne iman dolsun..! Hayırlı Cumalar.");
        mesajlar.add("Ey Rabbim! Dinimizden dolayı bizi zillete düşürmeye çaba sarf edenlere fırsat verme. Bizleri İslamın yolundan ayırma. Amin..Hayırlı cumalar");
        mesajlar.add(" Bütün güzeliklerin kilidini kendinde bulunduran “Rabbim Hakkımızda en hayırlı kilitleri aç… Amin. Cumamız bayram tadında olsun inşallah…");
        mesajlar.add("Kalpler imanla, gönüller huzurla dolsun. saadetler hepimizin olsun. ne kurulan bağlar bozulsun, nede dostlar unutulsun. cumanız mübarek olsun.");
        mesajlar.add("Allah`ım, habibin Muhammed Mustafa`ya (aleyhisselam), ailesine ve dostlarına rahmet eyle ve onların katındaki hürmeti için dualarımıza icabet et. Amin, cumamız mübarek olsun.");
        mesajlar.add("Bazı müminler cennete hasret yaşar. Bazı müminler de vardır ki cennet onları hasretle bekler. Cennetin hasretle beklediği müminlerden olmak duasıyla, hayırlı cumalar.");
        mesajlar.add("Allahım, Seni umuyor ve Sana dua ediyorum. Beni hayırlı umutlarıma kavuştur. Günahlarımı bağışla. Senin her şeye gücün yeter.. (amin) Hayırlı Nurlu Cumalar.");
        mesajlar.add("Allah’tan bir dua gibi Peygamber’den bir amağan gibi sevabınız bol olsun! Hayırlı Cumalar…");
        mesajlar.add("Güneşin güzel yüzü, yüreğine dokunsun, kâbuslar senden uzakta, melekler başucunda dursun. Güneş öyle bir geceye doğsun ki, duaların kabul, Cuma günün mübarek olsun.");
        mesajlar.add("Rabbim nefsimize ‘celaliyle', kalbimize ‘cemaliyle', hayatımıza ‘hikmetiyle', hatalarımıza ‘rahmetiyle', mahşerde ‘Muhammedîyle' yardım etsin inşallah. Hayırlı cumalar.");
        mesajlar.add("Tüm islam aleminin Cuması mübarek olsun. Rahman ve rahim olan Rabbime daim şükürler olsun.Hz.PEYGAMBERİMİZİN (S.A.V) nurundan,şefaatinden ayırmasın yapılan dualarımızı kabul eylesin");
        mesajlar.add("Anlatmaya dilde lisan yetmiyor, utancından durdu kalem gitmiyor, ne yapsak da bizde kusur bitmiyor; olmuşuz bir kere isyana tabi, kurtar bizi Yarabbi… Cumanız hayırlı ve mübarek olsun…");
        mesajlar.add("Ey Rabbim, Şu sonsuz merhamet ve rahmet deryasından, Bir damla da olsa nasiplenmeyi, Hak eden kullarından eyle bizi… Hayırlı Cumalar!");
        mesajlar.add("Allah'ım! İmanlı bir ömür, bereketli kazanç, sağlıklı bir beden, salih bir eş, hayırlı evlat, güzel ahlak, iyi komşu nasip et. Hayırlı Cumalar.");
        mesajlar.add("Ben, beni seven ümmetimi almadan cennete girmem.' Diyen Sevgilinin (S.A.V) ümmeti olmanın hakkını verebilmek duası ile hayırlı cumalar dilerim.");
        mesajlar.add("Yerin, göğün, mülkün ve her türlü iyiliğin sahibi, Yüce Mevlam’ın ümidinizi kaybettiğinizde sizin için yazdığı kaderin, hayallerinizden daha güzel olduğunu hatırlatacağı, gönlünüzce bir gün olsun inşallah. Hayırlı cumalar.");
        mesajlar.add("Ettiğiniz her dua derdinize deva, sağlığınıza şifa, gözünüze nur, gönlünüze huzur, Ailenize ve sevdiklerinize huzur getirsin. Hayırlı cumalar…");
        mesajlar.add("Cennet bahçelerinin gülleri yüzünüze, bülbüllerin nameleri dilinize, Allah'ın sevgisi gönlünüze ve bu güzel günün bereketi üzerinize olsun.");
        mesajlar.add("Rabbim, sevginle dopdolu yüreklerle sana kavuşmayı ve sevdiklerimizle sonsuzlukta buluşmayı nasip eyle, amin. Hayırlı Cumalar.");
        mesajlar.add("Allah’ım dilimizden ve gönlümüzden adını eksik etme Bizlere senin sevdiklerinin arasında olmayı ve cemalini görebilmeyi nasip et. Hayırlı Cumalar…\n");
        mesajlar.add("Rızkımız bereketli, Ömrümüz sağlıklı,  İmanımız Kâmil olsun.Hayırlı Cumalar.");
        mesajlar.add("Ey Rabbim! Evimizden bereketi, dilimizden duayı, kalbimizden senin ve Resulünün aleyhisselam sevgisini eksik etme. Dualarımızı kabul, ömrümüzü nurlu kıl. Amin. Hayırlı cumalar.");
        mesajlar.add("Bizi dostlarına dost, düşmanlarına düşman olanlardan ve sabreden ve şükredenlerden eyle! İşinde sebat eden, nimetine şükreden, ibadetini güzel yapan, doğru konuşanlardan eyle Ya Rabbim. Amin. Hayırlı Cumalar dilerim.");
        mesajlar.add("Rabbim bizi özünden iman edip , gözünden düşmeyen kullarından eylesin... Hayırlı Cumalar");
        mesajlar.add("Yarabbi sana açılan elleri,sana yönelen gönülleri , sana bükülen boyunları , sana yalvaran dilleri boş çevirme.  Hayırlı Cumalar");
        mesajlar.add("Allahım rızkımıza bolluk,kalbimize ferahlık,ömrümüze bereket ver .Cumanız Mübarek Olsun");
        mesajlar.add("Allahın rahmeti ve bereketi üzerimize olsun,günümüz aydın cumamız mübarek olsun.");
        mesajlar.add("Dünyada bir olan sizde bin olsun, kainatta damla olan sizde okyanus olsun ,dualarımız kabul cumamız mübarek olsun.");

    }
}
