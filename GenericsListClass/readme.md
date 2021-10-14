<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="Generics_0"></a>Generics</h1>
<h2 class="code-line" data-line-start=1 data-line-end=2 ><a id="_Kendi_Liste_Snfmz_Yazmak__1"></a><em>Kendi Liste Sınıfımızı Yazmak</em></h2>
<p class="has-line-data" data-line-start="3" data-line-end="4">Java’da generic yapısını kullanarak verileri tuttuğumuz bir sınıf tasarlıyoruz.</p>
<p class="has-line-data" data-line-start="5" data-line-end="6">Sınıfın amacı içerisinde dinamik bir Array (Dizi) tutması ve veri tipini dinamik olarak alması. Bunun için generic bir sınıf oluşturulması gerekli.</p>
<p class="has-line-data" data-line-start="7" data-line-end="8">✨NOT : COLLECTION SINIFI KULLANILMAYACAKTIR ! KENDİ LİSTE SINIFIMIZI OLUŞTURMALIYIZ.</p>
<h2 class="code-line" data-line-start=8 data-line-end=9 ><a id="Features_8"></a>Features</h2>
<ul>
<li class="has-line-data" data-line-start="10" data-line-end="11">Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.</li>
<li class="has-line-data" data-line-start="11" data-line-end="12">Sınıfa ait iki tür constructor metot bulunmalı</li>
<li class="has-line-data" data-line-start="12" data-line-end="13">MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.</li>
<li class="has-line-data" data-line-start="13" data-line-end="14">MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.</li>
<li class="has-line-data" data-line-start="14" data-line-end="15">size() : dizideki eleman sayısını verir.</li>
<li class="has-line-data" data-line-start="15" data-line-end="16">getCapacity() : dizinin kapasite değerini verir.</li>
<li class="has-line-data" data-line-start="16" data-line-end="17">add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.</li>
</ul>
<h2 class="code-line" data-line-start=19 data-line-end=20 ><a id="rnek_19"></a>Örnek</h2>
<pre><code class="has-line-data" data-line-start="23" data-line-end="45">public static void main(String[] args) {
    MyList&lt;Integer&gt; liste = new MyList&lt;&gt;();
    System.out.println(&quot;Dizideki Eleman Sayısı : &quot; + liste.size());
    System.out.println(&quot;Dizinin Kapasitesi : &quot; + liste.getCapacity());
    liste.add(10);
    liste.add(20);
    liste.add(30);
    liste.add(40);
    System.out.println(&quot;Dizideki Eleman Sayısı : &quot; + liste.size());
    System.out.println(&quot;Dizinin Kapasitesi : &quot; + liste.getCapacity());
    liste.add(50);
    liste.add(60);
    liste.add(70);
    liste.add(80);
    liste.add(90);
    liste.add(100);
    liste.add(110);
    System.out.println(&quot;Dizideki Eleman Sayısı : &quot; + liste.size());
    System.out.println(&quot;Dizinin Kapasitesi : &quot; + liste.getCapacity());
}

</code></pre>
<p class="has-line-data" data-line-start="46" data-line-end="47">Çıktısı…</p>
<pre><code class="has-line-data" data-line-start="49" data-line-end="57">Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 0
Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 4
Dizinin Kapasitesi : 20
Dizideki Eleman Sayısı : 11

</code></pre>
<ul>
<li class="has-line-data" data-line-start="57" data-line-end="58">get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.</li>
<li class="has-line-data" data-line-start="58" data-line-end="59">remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.</li>
<li class="has-line-data" data-line-start="59" data-line-end="60">set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.</li>
<li class="has-line-data" data-line-start="60" data-line-end="61">String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.</li>
</ul>
<h2 class="code-line" data-line-start=64 data-line-end=65 ><a id="rnek_64"></a>Örnek</h2>
<pre><code class="has-line-data" data-line-start="68" data-line-end="83">public static void main(String[] args) {
    MyList&lt;Integer&gt; liste = new MyList&lt;&gt;();
    liste.add(10);
    liste.add(20);
    liste.add(30);
    System.out.println(&quot;2. indisteki değer : &quot; + liste.get(2));
    liste.remove(2);
    liste.add(40);
    liste.set(0, 100);
    System.out.println(&quot;2. indisteki değer : &quot; + liste.get(2));
    System.out.println(liste.toString());
}


</code></pre>
<p class="has-line-data" data-line-start="83" data-line-end="84">Çıktısı…</p>
<pre><code class="has-line-data" data-line-start="85" data-line-end="91">
2. indisteki değer : 30
2. indisteki değer : 40
[100,20,40]

</code></pre>
<ul>
<li class="has-line-data" data-line-start="91" data-line-end="92">int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.</li>
<li class="has-line-data" data-line-start="92" data-line-end="93">int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.</li>
<li class="has-line-data" data-line-start="93" data-line-end="94">boolean isEmpty() : Listenin boş olup olmadığını söyler.</li>
<li class="has-line-data" data-line-start="94" data-line-end="95">T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.</li>
<li class="has-line-data" data-line-start="95" data-line-end="96">clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.</li>
<li class="has-line-data" data-line-start="96" data-line-end="97">MyList&lt;T&gt; sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.</li>
<li class="has-line-data" data-line-start="97" data-line-end="99">boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.</li>
</ul>
<h2 class="code-line" data-line-start=99 data-line-end=100 ><a id="rnek_99"></a>Örnek</h2>
<pre><code class="has-line-data" data-line-start="103" data-line-end="145">public static void main(String[] args) {
    MyList&lt;Integer&gt; liste = new MyList&lt;&gt;();
    System.out.println(&quot;Liste Durumu : &quot; + (liste.isEmpty() ? &quot;Boş&quot; : &quot;Dolu&quot;));
    liste.add(10);
    liste.add(20);
    liste.add(30);
    liste.add(40);
    liste.add(20);
    liste.add(50);
    liste.add(60);
    liste.add(70);

    System.out.println(&quot;Liste Durumu : &quot; + (liste.isEmpty() ? &quot;Boş&quot; : &quot;Dolu&quot;));

    // Bulduğu ilk indeksi verir
    System.out.println(&quot;Indeks : &quot; + liste.indexOf(20));

    // Bulamazsa -1 döndürür
    System.out.println(&quot;Indeks :&quot; + liste.indexOf(100));

    // Bulduğu son indeksi verir
    System.out.println(&quot;Indeks : &quot; + liste.lastIndexOf(20));

    // Listeyi Object[] dizisi olarak geri verir.
    Object[] dizi = liste.toArray();
    System.out.println(&quot;Object dizisinin ilk elemanı :&quot; + dizi[0]);

    // Liste veri türünde alt bir liste oluşturdu
    MyList&lt;Integer&gt; altListem = liste.subList(0, 3);
    System.out.println(altListem.toString());

    // Değerim listedeki olup olmadığını sorguladı
    System.out.println(&quot;Listemde 20 değeri : &quot; + liste.contains(20));
    System.out.println(&quot;Listemde 120 değeri : &quot; + liste.contains(120));

    // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
    liste.clear();
    System.out.println(liste.toString());
    
}

</code></pre>
<p class="has-line-data" data-line-start="145" data-line-end="146">Çıktısı…</p>
<pre><code class="has-line-data" data-line-start="147" data-line-end="161">
Liste Durumu : Boş
Liste Durumu : Dolu
Indeks : 1
Indeks :-1
Indeks : 4
Object dizisinin ilk elemanı :10
[10,20,30,40]
Listemde 20 değeri : true
Listemde 120 değeri : false
[]


</code></pre>
