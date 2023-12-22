pipeline {
    agent any

    tools {
        maven "Maven 3.9.6"
    }

    stages {
        stage('Hello') {
            steps {
                script {
                    echo 'Hello World !'
                }
            }
        }

        stage('Maven Build') {
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                archiveArtifacts 'target/*.jar'
                }
            }
        }




        stage('Build Docker Image') {
                    steps {
                        script {
                            bat "docker image prune"
                            dockerImage = docker.build('trivianprojet:latest')
                       }
                    }
                }

        stage('Start Docker Container') {
            steps {
                script {
                     try {
                        bat "docker stop trivianprojet"
                        bat "docker rm trivianprojet"
                     } catch (exception e) {
                        echo '404 Not Found : trivianprojet'
                     }

                     bat "docker run --name trivianprojet -d -p 9075:8080 trivianprojet:latest MyAwesomeProject.jar"

                }
            }
        }
    }
}