# Practo-Health Management System

This Health Management System is a Java-based web application that allows users to interact with doctors, book appointments, manage patient information, and provide reviews. The system consists of several modules, including medicine buying, clinic search, and surgery booking.

## Table of Contents

- [Introduction](#health-management-system)
- [Features](#features)
- [Technologies](#technologies)
- [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

### Doctor Module

- **Add Doctor**: Users can add new doctors to the system, including details such as name, qualifications, specializations, experience, and descriptions.

- **Search Doctors**: A search functionality allows users to find doctors based on keywords matching their name or specializations.

### Patient Module

- **Add Patient**: Users can add patient information, including name, disease, and age.

- **View All Patients**: View a list of all patients in the system.

### Booking Module

- **Book Appointments**: Users can book appointments with doctors, providing the doctor's ID, patient ID, and booking time.

### Review Module

- **Create Reviews**: Users can leave reviews for doctors, including ratings.

- **Retrieve Reviews**: Retrieve reviews for a specific doctor and calculate the average rating percentage.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- MySQL Database
- Lombok
- Maven

## Setup

1. Clone the repository to your local machine.

```bash
git clone https://github.com/yourusername/health-management-system.git
```

2. Create a MySQL database named `practo` and update the database configuration in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/practo?useSSL=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
```

3. Build the project using Maven.

```bash
mvn clean install
```

4. Run the application.

```bash
mvn spring-boot:run
```

The application should now be accessible at `http://localhost:8080`.

## Usage

### Doctor Module

- To add a new doctor, make a POST request to `/api/doctors/add` with the doctor details in the request body.

- To view all doctors, make a GET request to `/api/doctors/all`.

- To search for doctors, make a GET request to `/api/doctors/search?keyword=yourkeyword`.

### Patient Module

- To add a new patient, make a POST request to `/api/patients` with the patient details in the request body.

- To view all patients, make a GET request to `/api/patients`.

### Booking Module

- To book an appointment, make a POST request to `/api/bookings` with the booking details in the request body.

### Review Module

- To create a review, make a POST request to `/api/reviews` with the review details in the request body.

- To retrieve reviews for a specific doctor and calculate the average rating percentage, make a GET request to `/api/reviews/{doctorId}`.

## Contributing

If you would like to contribute to this project, please follow these steps:

1. Fork the repository.

2. Create a new branch for your feature or bug fix.

3. Make your changes and commit them.

4. Push your changes to your fork.

5. Create a pull request to the main repository.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
