pipeline {
    agent any
    stages  {
        stage('run'){
            steps   {
                echo "Welcome to jenkins enviroment"
                sh  'echo using shell within jenkinsfile'
                echo 'welcome to jenkns world'
                sh 'java --version'
                sh "mvn exec:java -Dexec.mainClass='src/test/java/runner/Runner.java'"

            }
        }
    }
}