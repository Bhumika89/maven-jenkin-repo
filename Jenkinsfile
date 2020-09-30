
pipeline {
    agent any
   
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
         stage("build code"){
            steps{
              sh "mvn clean install"
            }
        }
}
}
