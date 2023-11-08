# 👨‍🌾 FarmConnect: Connecting Farmers with Innovation

Welcome to **FarmConnect**, where innovation meets agriculture in the heart of India! Our Android application is not just another farming assistant; it's a revolutionary solution designed to address societal challenges in the Indian context, aligned with the United Nations' Sustainable Development Goals (SDGs). With India's vast population, cultural diversity, and multilingual landscape, our app strives to create meaningful and impactful solutions for farmers.

## 🌱 Problem Statement

Designing innovative Android applications to support agriculture in India is both challenging and rewarding. With the country's vast population, diverse cultures, and multilingual environment, creating impactful solutions aligned with the Sustainable Development Goals (SDGs) is crucial.

## ✨ Key Features

- **Multilingual Support**: Our app understands and responds in popular regional languages, including Hinglish and regional languages written in Roman scripts.
- **Semantic Search**: Enjoy accurate search results by understanding the user's intent and contextual meaning of terms, ensuring relevant outcomes.
- **Vector Embeddings**: We employ advanced data representation techniques that carry semantic information for a better understanding of user queries.
- **Adaptability**: Easily update the app with new information, government schemes, techniques, etc., through various formats like PDF, text, or HTML.

## 🚀 Technologies Used

- **Frontend**: Java
- **Backend**: FastAPI (Python)
- **IDE**: VS Code, Android Studio
- **Design**: Figma, Canva
- **Version Control**: Git and GitHub

## 📂 GitHub Repository Structure

| S.No. | Branch Name                                      | Purpose                   |
| ----- | ------------------------------------------------- | ------------------------- |
| 1.    | [frontend](https://github.com/rudrakshi99/Farmer-Call-Center/tree/master) | Frontend code             |
| 2.    | [backend](https://github.com/rudrakshi99/Farmer-Call-Center/tree/backend) | Backend code              |

## 🌐 Deployment and Usage

### Deploying Backend API Endpoints
- Developed using FastAPI (Python)
- Navigate to the backend folder
  ```bash
  cd backend
  ```
- Install requirements
  ```bash
  pip install -r requirements.txt
  ```
- Run the server (default port: http://127.0.0.1:8000)
  ```bash
  uvicorn main:app
  ```
- Hosted server: [FarmConnect Backend](https://farmconnectback.onrender.com/docs)
- Use Dockerfile for containerization to avoid dependency issues.

### Generating and Testing APK (Frontend)
- Developed using Android Studio
- Update the endpoint URL to your backend URL.
- Use `10.0.2.2:8000` to access localhost.
- Generate the .apk file from Android Studio.

## 💡 Want to Contribute?

We welcome contributions from passionate individuals who share our vision of revolutionizing agriculture support in India. If you're eager to make a positive impact and have expertise in areas such as app development, agriculture, or technology, we'd love to have you on board!

Here's how you can get involved:

1. **Fork the Repository**: Start by forking our GitHub repository to your own account.

2. **Clone the Repository**: Clone the forked repository to your local development environment.

3. **Contribute**: Make your contributions, whether it's improving code, adding features, or fixing issues.

4. **Submit a Pull Request**: Once you've made your changes, submit a pull request to our repository. We'll review your contributions and merge them if they align with our goals.

5. **Spread the Word**: Help us spread the word about FarmConnect and its mission to support Indian farmers through technology.

Let's work together to create a brighter future for farmers in India! 🌾🤝
