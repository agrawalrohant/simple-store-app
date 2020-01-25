pipeline{
	agent any
	stages {
		stage ('Build'){
			steps {
				echo "Running test"
				bat 'mvn clean test'
			}
		}
		stage ('Sonar'){
			steps {
				echo "Running Sonar"
				bat 'mvn sonar:sonar'
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