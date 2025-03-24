# Golf Club Tournament and Membership API

This project is a RESTful API for managing golf club members and tournaments. It allows you to add and retrieve members and tournaments, associate members with tournaments, and perform various searches. The project is built using Spring Boot and uses MySQL as the database. Docker support is included for easy setup.

---

## Features

### Members
- Add new members.
- Search members by:
  - Name
  - Membership type
  - Phone number
  - Tournament start date.

### Tournaments
- Add new tournaments.
- Search tournaments by:
  - Start date.
  - Location.
  - Retrieve all members in a tournament.

### Additional Features
- Associate members with tournaments.

---

## API Endpoints

### Members
1. **Add Member**
   - **URL**: `POST /api/members`
   - **Request Body**:
     ```json
     {
       "name": "John Doe",
       "address": "123 Main St",
       "email": "john.doe@example.com",
       "phoneNumber": "123-456-7890",
       "startDate": "2025-03-01",
       "duration": 12
     }
     ```
   - **Response**: Returns the created member.

2. **Search Members by Name**
   - **URL**: `GET /api/members/search?name=<name>`
   - **Response**: Returns a list of members matching the name.

### Tournaments
1. **Add Tournament**
   - **URL**: `POST /api/tournaments`
   - **Request Body**:
     ```json
     {
       "startDate": "2025-04-01",
       "endDate": "2025-04-05",
       "location": "Golf Club A",
       "entryFee": 100,
       "cashPrize": 5000
     }
     ```
   - **Response**: Returns the created tournament.

2. **Search Tournaments by Location**
   - **URL**: `GET /api/tournaments/search?location=<location>`
   - **Response**: Returns a list of tournaments at the specified location.

3. **Add Member to Tournament**
   - **URL**: `POST /api/tournaments/{tournamentId}/add-member/{memberId}`
   - **Response**: Returns the updated tournament with the added member.

---

## Running the Project with Docker

### Prerequisites
- Install [Docker](https://www.docker.com/) and [Docker Compose](https://docs.docker.com/compose/).

### Steps
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>