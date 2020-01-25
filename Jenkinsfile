pipeline{
	agent any
	stages {
		stage ('Build'){
			steps {
				echo "Running test and sonar"
				bat 'mvn clean test sonar:sonar'
			}
		}
	}
	post {
		always {
			echo "Scanning Test Results for # ${env.BUILD_ID} on URL ${env.JENKINS_URL}"
		    junit '**/target/surefire-reports/*.xml'
		}
		failure {
		    echo 'Oh.. no! The Pipeline failed :('
		}
    }
}