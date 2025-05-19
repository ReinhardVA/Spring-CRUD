# Spring-CRUD

**Spring ile veritabanı işlemlerini öğrenmek için yapılan proje.**
Bu proje, **Spring Boot** ve **MongoDB** kullanılarak geliştirilmiş basit bir **CRUD (Create, Read, Delete)** uygulamasıdır. Uygulama üzerinden `Departman` verileri eklenebilir, listelenebilir ve silinebilir.

## Kullanılan Teknolojiler

- Java 17+
- Spring Boot
- Spring Web
- Spring Data MongoDB
- MongoDB (Atlas ile uzak bağlantı)
- Maven

- `POST /addDepartment?departmentId=1&departmentName=Muhasebe&departmentAddress=Bursa&departmentCode=1` – Yeni departman oluşturur.
![Department Added](https://github.com/user-attachments/assets/5f1e476f-a2b7-4bb7-8571-5e562122fde3)
- `GET /departments` – Tüm departmanları listeler
- `GET /getDepartmentById?departmentId=1` – Belirli bir departmanı ID ile getirir  
![Get Departments](https://github.com/user-attachments/assets/086df83e-fde0-4b68-80fa-ddaa6d18ba7f)
- `DELETE /deleteDepartments?departmentId=1` – ID ile departmanı siler
![Deleted](https://github.com/user-attachments/assets/f51fb577-c957-4fc6-81ad-7bf2abe683d4)
