
pipeline {
    agent any
    environment {
        PATH = "C:/Users/bsiddalinges/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin:$PATH"
    }
    stages {
        stage("clone code"){
            steps{
               git credentialsId: 'git_credentials', url: 'https://github.com/Bhumika89/maven-jenkin-repo.git'
            }
        }
        stage("build code"){
            steps{
              sh "mvn clean install"
            }
        }
}
}
