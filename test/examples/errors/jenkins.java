node {

    def build_ok = true

    stage('one') {
        sh 'exit 0'
    }

    try{
        stage('two') {
            sh 'exit 1'   // failure
        }
    } catch(e) {
        build_ok = false
        echo e.toString()  
    }

    stage('three') {
        sh 'exit 0'
    }

    ....

    if(build_ok) {
        currentBuild.result = "SUCCESS"
    } else {
        currentBuild.result = "FAILURE"
    }
}