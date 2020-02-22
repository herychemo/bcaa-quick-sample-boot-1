pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                 script {
                    try {
                     sh 'chmod 777 -R gradlew'
                     sh './gradlew clean buildImage --no-daemon' //run a gradle task
                    } finally {
                    echo 'Building OK'
                    }
                }       
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
