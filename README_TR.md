# Soyo Mesaj Yardimcisi v1.1

Android Accessibility tabanli otomasyon aracidir.

## Calisma akisi

1. SOYO `Onerilen` ekranindaki gorunur `Sohbet` kartlarini yukaridan asagi tarar.
2. Son ayarlanan sure icinde mesaj gonderilmemis profile girer. Varsayilan sure 60 dakikadir.
3. Uygulamada ayarladiginiz mesaji mesaj kutusuna yazar ve gonderir.
4. Profile ait zaman damgasini kaydeder.
5. Listeye geri doner ve siradaki gorunur profili isler.
6. Gorunur adaylar bittiginde kisa/ortusmeli swipe yaparak yeni profilleri tarar.
7. Ayni profil sure dolmadan yeniden gorunurse atlanir. Sure dolduktan sonra tekrar islenebilir.

## Hedef uygulama

Varsayilan paket adi: `com.haflla.soulu`

SOYO paket adi farkliysa uygulamadaki `Hedef SOYO paket adi` alanindan degistirebilirsiniz. Debug/staging eki zorunlulugu kaldirilmistir.

## Kurulum

- APK'yi kurun.
- Uygulamayi acin, mesaji ve hedef paket adini girin.
- `ERISILEBILIRLIK AYARLARINI AC` ile `Soyo Mesaj Yardimcisi` servisini etkinlestirin.
- SOYO uygulamasini acip `Onerilen` ekranina gelin.
- Yardimci uygulamaya donup `OTOMASYONU BASLAT` deyin ve tekrar SOYO'ya gecin.

## Derleme

GitHub Actions workflow'u dahildir. Push sonrasi Actions > Build APK icinden APK artifact'ini indirebilirsiniz.

Codespaces'te Gradle kuruluysa:

```bash
gradle assembleDebug
```

APK:

`app/build/outputs/apk/debug/app-debug.apk`
