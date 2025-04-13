# Patient Management Microservices

A comprehensive healthcare management system built with Spring Boot microservices, featuring authentication, patient data management, billing, and analytics capabilities with AWS-ready infrastructure.

## Project Structure

This project implements a microservice architecture for patient management with the following components:

- **API Gateway**: Routes and secures all requests through token validation
- **Auth Service**: Handles user authentication and token generation/validation
- **Patient Service**: Manages patient information and records
- **Billing Service**: Processes billing operations through gRPC communication
- **Analytics Service**: Collects and processes usage data via Kafka
- **Infrastructure**: Contains AWS CDK configurations and deployment scripts

## Key Features

- Token-based authentication
- RESTful API for patient management
- Service-to-service communication via gRPC
- Event-driven analytics using Kafka
- AWS-ready with CDK infrastructure as code
- Local development environment with Docker Compose
- Integration tests with Localstack

## API Endpoints

### Authentication
- `POST /auth/login` - Authenticate and retrieve token
- `GET /auth/validate` - Validate authentication token

### Patient Management
- `GET /api/patients` - Retrieve all patients
- `POST /api/patients` - Create a new patient
- `PUT /api/patients/{id}` - Update an existing patient
- `DELETE /api/patients/{id}` - Delete a patient

## Getting Started

1. Clone the repository
2. Run `docker-compose up` to start all services
3. Access the API through the gateway at `http://localhost:4004`
