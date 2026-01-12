pipeline {
    agent any

    tools {
        maven 'Maven'  // Name of Maven in Jenkins
        jdk 'JDK'      // Name of JDK in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

       stage('Build & Test') {
    steps {
        bat 'mvn clean test'
    }
}

    }
}
