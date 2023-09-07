pipeline {
    agent any
    parameters{
        choice(name: 'env', choice: ['integ', 'uat', 'prepod'])
    }
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
         stage('Test') {
               steps {
                  bat "gradle clean test"
               }
         }
    }
 }