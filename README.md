# Praktikum_CRUD_NIM

Project Spring Boot CRUD User dengan MySQL, Lombok, Validation, Spring Data JPA, Spring Web, dan MapStruct.

## Cara menjalankan

1. Buat database MySQL bernama `spring`, atau jalankan query di `database.sql`.
2. Salin `.env.example` menjadi `.env`.
3. Sesuaikan username dan password MySQL di file `.env`.
4. Jalankan project:

```bash
mvn spring-boot:run
```

5. Buka halaman frontend:

```text
http://localhost:8080/
```

## Endpoint API

```text
GET    /api/users
GET    /api/users/{id}
POST   /api/users
PUT    /api/users/{id}
DELETE /api/users/{id}
```

## Contoh body JSON

```json
{
  "name": "Jessica",
  "age": 20
}
```
