pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
               git branch:'master', url: 'https://github.com/LDangDev/W7_inclass_assignment.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage("Test & Coverage"){
            steps{
                bat 'mvn test jacoco:report'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    jacoco execPattern: '**/target/jacoco.exec',
                            classPattern: '**/target/classes',
                            sourcePattern: '**/src/main/java',
                            exclusionPattern: '**/test/**'

                }
            }
        }


        stage('Deploy') {
            steps {
                echo 'Deploy stage completed'
            }
        }
    }
}