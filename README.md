# MERN Stack Chat Application

## Overview

This project is a real-time chat application built using the MERN stack (MongoDB, Express.js, React.js, and Node.js). It features user authentication, live chat rooms, and real-time messaging capabilities. The application allows users to sign up, create chat rooms, and communicate in real time with others in the room.

## Features

- User Authentication: Secure login and signup functionality using JWT (JSON Web Tokens).
- Real-time Messaging: Users can join chat rooms and send messages instantly with real-time updates using Socket.io.
- Create and Manage Rooms: Users can create new chat rooms and join existing ones.
- Responsive Design: The UI is responsive and user-friendly, making it accessible on various devices, including mobile phones and tablets.

## Built With

- Frontend: React.js, Redux for state management, and Bootstrap for styling.
- Backend: Node.js with Express.js framework.
- Database: MongoDB with Mongoose ORM to model the application data.
- Real-Time Engine: Socket.io for handling real-time web socket connections.
- Authentication: JSON Web Tokens (JWT) and bcrypt for securing passwords.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
- Node.js
- npm or yarn
- MongoDB

### Installation
- Clone the repository:
 
**git clone https://github.com/yourusername/mern-chat-app.git**

- Install NPM packages for the server:
**cd mern-chat-app**

**npm install**

- Install NPM packages for the client:

**cd client**

**npm install**

- Create a .env file in the root directory and add the following:
  
**MONGO_URI=your_mongodb_uri**

**JWT_SECRET=your_jwt_secret**

- Start the server:
**npm run dev**

## Usage

After starting the server, open your browser and go to http://localhost:3000 to start using the chat application. Sign up to create an account, or log in if you already have one, and begin chatting!

## Screenshots 
![image](https://github.com/soundaryalaharivalipe/Quiz-Application/assets/169948476/f4be5cba-c7f8-4dfe-9bf5-90501b926e2e)

**User login**


