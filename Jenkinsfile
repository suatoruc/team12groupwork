pipeline {
    agent any
    stages  {
        stage('run'){
            steps   {
                echo "Welcome to jenkins enviroment"
                sh  'echo using shell within jenkinsfile'
                echo 'welcome to jenkns world'
                sh 'python --version'
                sh 'python hello-world.py'

            }
        }
    }
}