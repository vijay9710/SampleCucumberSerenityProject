pipeline {
    agent any
    stages {
        stage('Show inputs'){
            steps{
                echo "Environment: ${env}"
            }
        }
        stage('Checkout from Github'){
                    steps{
                        checkout scm
             }
        }
            stages {
                stage('Test') {
                    steps {
                        bat "gradle clean test"
                    }
    }
 }
 }