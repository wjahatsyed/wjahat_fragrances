# Wjahat Fragrances - Perfume Collection API

## Overview
Wjahat Fragrances is a Java Spring Boot application that provides a backend API for managing a perfume collection. Users can store perfume details, categorize them as part of their **wishlist** (to buy later) or **collection** (already owned), and store actual images.

---

## Features
✅ Add, update, delete perfumes  
✅ Store actual perfume images instead of URLs  
✅ Categorize perfumes as "Wishlist" or "Collection"  
✅ Fetch all perfumes, wishlist items, and owned collection  
✅ RESTful API for easy frontend integration  

---

## Tech Stack
- **Backend:** Java 17, Spring Boot, Spring Data JPA, Hibernate  
- **Database:** MySQL  
- **Storage:** Local file storage for images  
- **Build Tool:** Maven  
- **Version Control:** GitHub ([Repository Link](https://github.com/wjahatsyed/wjahat_fragrances))  

---

## Project Setup

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/wjahatsyed/wjahat_fragrances.git
cd wjahat_fragrances

2️⃣ Configure MySQL Database
Create a database in MySQL:

sql
Copy
Edit
CREATE DATABASE wjahat_fragrances;
Update src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/wjahat_fragrances
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
3️⃣ Build and Run
sh
Copy
Edit
mvn clean install
mvn spring-boot:run
API Endpoints
1️⃣ Perfume Management
Method	Endpoint	Description
GET	/api/perfumes	Get all perfumes
GET	/api/perfumes/wishlist	Get wishlist perfumes
GET	/api/perfumes/collection	Get owned perfumes
POST	/api/perfumes	Add a new perfume
PUT	/api/perfumes/{id}	Update perfume details
DELETE	/api/perfumes/{id}	Remove a perfume
2️⃣ Upload and Retrieve Images
Method	Endpoint	Description
POST	/api/perfumes/{id}/upload	Upload a perfume image
GET	/api/perfumes/{id}/image	Fetch perfume image
Folder Structure
bash
Copy
Edit
wjahat_fragrances/
│── src/
│   ├── main/
│   │   ├── java/com/wjahat/fragrances/
│   │   │   ├── controller/    # REST Controllers
│   │   │   ├── entity/        # JPA Entities
│   │   │   ├── repository/    # Spring Data JPA Repos
│   │   │   ├── service/       # Business Logic
│   │── resources/
│   │   ├── application.properties   # Database Config
└── README.md
Contributing
Fork the repository

Create a new branch:

sh
Copy
Edit
git checkout -b feature-branch
Commit your changes:

sh
Copy
Edit
git commit -m "Add new feature"
Push the changes:

sh
Copy
Edit
git push origin feature-branch
Open a Pull Request

License
This project is MIT licensed. Feel free to modify and use it.

🔥 Enjoy coding your fragrance collection app! Let me know if you need any modifications. 🚀
