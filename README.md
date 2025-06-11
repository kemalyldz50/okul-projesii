# Okul Yönetim Sistemi (Spring Boot)

Bu proje, Java Spring Boot kullanılarak geliştirilmiş basit bir Okul Yönetim Sistemi uygulamasıdır.

## Özellikler

- Öğrenci ve Ders kayıtları
- RESTful API ile veri işlemleri (ekleme, listeleme)
- H2 veritabanı (hafızada çalışır)
- Basit HTML form arayüzü (isteğe bağlı)
- Railway ile kolay deploy

## Kullanılan Teknolojiler

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Başlatma

bash
./mvnw spring-boot:run
Endpointler
GET /students → Öğrenci listesi

POST /students → Yeni öğrenci ekle

GET /courses → Ders listesi

POST /courses → Yeni ders ekle

Deployment
Railway kullanılarak yayına alınmıştır.

Geliştirici: kemalyldz50

