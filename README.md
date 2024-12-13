# demoQAWebOtomation
 Bu proje demoqa.com için hazırlanmış bir yazılım test otomasyodur. Web sitesindeki bütün web sayfaları için yazılmış otomasyon testlerinden oluşmaktadır. Ağırlıklı olarak kara kutu test tekniği ile hazırlanmış fonksiyonel testlerden oluşmaktadır. Ayrıca sayfa yüklenme sürelerine ilişkin performans testlerini içermektedir. Java, Selenium Web Driver,
 Cucumber, TestNG ve JUnit kullanılarak hazırlanmıştır. Geliştirme aşamasında Behavior Driven Development, Object Orianted Programming ve SOLID yaklaşımlarına bağlı kalınmışıtr. Bağımlılıkların yönetimi Maven ile sağlanmıştır. Proje yapısı yeni test senaryolarının eklenmesi için uygundur.

Teknoloji  | Kullanıldığı Yer
------------- | -------------
Java | Test senaryolarının yazıldığı programlama dili
Selenium Web Driver | Tarayıcı otomasyonu için kullanılan framework
Cucumber | BDD yaklaşımıyla test senaryolarının yazılması
TestNG | Testlerin Düzenlenmesi, Ek Test yapıları, Assertions
JUnit | Ek test yapıları

### Proje Yapısı

Proje reposu içerisinde otomasyon testlerine ait herşey src dizininde yer almaktadır.  src > main > java > Runner  classı Cucumber tarafından 
sağlanan raporlama özelliğine yönelik ayarlamaların yapılmasını sağlar. Cucumber'ın TestNG'nin test suite özellikleri ile entegre çalışabilmesi için gerekli ayarlamalar burada yapılmıştır.
tags değeri çalıştırılmak istenen testlere ilişkin tagların yapıştırıldığı alandır. Bu değer boş bırakıldığında testler çalıştırılırsa proje içerisindeki tüm testler çalıştırılacaktır.

src > main > java > util paketi projede her test senaryosu için ortak olarak kullanılan metotları içeren classlardan oluşmaktadır. Bunlar Driver ayarları ve tarayıcı ayarları için kullanılan DriverFactory sınıfı, sayfa bekleme süreleri ve url tanımlamalarını almak  için kullanılan ConfigReader sınıfı, her test öncesinde ve sonrasında çalıştırılması gereken metotların yazıldığı Hooks sınıfı, ve test adımlarında alınması gereken aksiyonlara ilişkin ortak metotların tanımlandığı ElementHelper sınıflarından oluşmaktadır.

src > test > java dizini altında testler yer almaktadır. Testler Gherkin grammer yapısı kullanılarak hazırlanmış feature dosyaları, testlere ait adımların yer aldığı stepDefinitions classları ve testlerin uygulanması için gerekli aksiyonların alındığı pages classlarından oluşmaktadır. DemoQA web sitesinin sayfası baz alınarak hazırlanmış test senaryolarında her bir menü bir classı temsil edecek şekilde gruplandırılmıştır. Ayrıca bu yapı test geliştirmede oldukça sık kullanılan POM (Page Object Model) yapısı için de uygundur. Her bir test adımı bir metottan oluşmaktadır. Ve bu yapı sayesinde farklı test senaryoların yer alan ortak adımlar istenildiği kadar kullanılabilmekte ve bu vesile ile kod tekrarı engellenmiş olmaktadır.

src > test >resources dizininde proje testlerinin koşulduğu test suite ve ayrıca web sayfası için bekleme süreleri ve url gibi özelliklerin belirlendiği config.properties dosyası yer almaktadır. Testler test suite üzerinden koşulur. 

### Kurulum

* Projeye ait repository clonelanır.

* src > test > resources > config.properties dosyasına gelinerek web sitesine ilişkin url, bekleme süreleri, browser bilgileri kontrol edilir. Proje Chrome, Firefox, Safari ile çalıştırılabilmektedir. Tavsiye edilen tarayıcı Chrome'dur. Diğer tarayıcılarla bazı test senoryoları uyumsuz olabilir. Bu da test senaryolarının doğru çalışmamasına sebep olacak ve testler fail olacaktır.

  ### configProperties buraya ekle


* Local kurulumda bazı test senaryoları için upload ve download işlemleri yer almaktadır. Bu işlemlerin yer aldığı test senaryolarının başarılı bir şekilde test edilebilmesi için uygun formatta örnek niteliğinde dosyalar eklenmeli ve bu dosyaların pathleri proje içerisinde ilgili kod bloğunda bildirilmelidir. Proje içerisinde path eklenmesi gereken yerler aşağıda belirtilmiştir.

  ### path1 buraya ekle


  ### path2 buraya ekle


  ### Testlerin Koşulması

  Test koşumunda mevcut senaryolarda karşımıza çıkan üç durum vardır:

  1. Bütün testlerin koşulması
  2. Belirli bir testin veya aynı gruptaki testlerin koşulması
  3. Bazı testler hariç geri kalan testlerin koşturulması

